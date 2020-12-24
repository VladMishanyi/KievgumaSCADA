package com.vk.controller.admin;

import com.vk.configuration.SHA256PasswordEncoder;
import com.vk.entity.table.TableModelLogger;
import com.vk.entity.user.User;
import com.vk.enumeration.UserRole;
import com.vk.service.data.LoggerService;
import com.vk.service.data.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by KIP-PC99 on 25.07.2018.
 */
@Controller
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
@RequestMapping(value = "/admin")
public class MainStatisticsController {

    private Logger LOGGER = Logger.getLogger(this.getClass());

    private final UserService userService;

    private final SHA256PasswordEncoder sha256PasswordEncoder;

    private final LoggerService loggerService;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public MainStatisticsController(UserService userService,
                                    SHA256PasswordEncoder sha256PasswordEncoder,
                                    LoggerService loggerService,
                                    SimpleDateFormat simpleDateFormat){
        this.userService = userService;
        this.sha256PasswordEncoder = sha256PasswordEncoder;
        this.loggerService = loggerService;
        this.simpleDateFormat = simpleDateFormat;
    }

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public String getAdminPanel(Model model){
        model.addAttribute("users", userService.findAll());
        return "admin";
    }

    @RequestMapping(value = "/add_user", method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "role"/*, defaultValue = "ANOTHER"*/) String role,
                                 @RequestParam(value = "name"/*, defaultValue = "default_name"*/) String name,
                                 @RequestParam(value = "login"/*, defaultValue = "default_login"*/) String login,
                                 @RequestParam(value = "password_first"/*, defaultValue = "default_password"*/) String passwordFirst,
                                 @RequestParam(value = "confirm_password"/*, defaultValue = "default_password"*/) String confirmPassword,
                                 @RequestParam(value = "description"/*, defaultValue = "default_description"*/) String description,
                                 Model model){
        String info = "от 4 до 50 символов: ";
        boolean validator = true;

        if (!UserRole.containRole(role)){
            info = info + "Ошибка роль, ";
            validator = false;
        }

        if (!checkParameter(name)){
            info = info + "Ошибка имя, ";
            validator = false;
        }

        if (!checkParameter(login)){
            info = info + "Ошибка логин, ";
            validator = false;
        } else {
            UserDetails userBy = userService.loadUserByUsername(login);
            if (Objects.nonNull(userBy)){
                info = info + "Ошибка логин уже существует, ";
                validator = false;
            }
        }

        if (!checkParameter(passwordFirst) || !checkParameter(confirmPassword)){
            info = info + "Ошибка паоль, ";
            validator = false;
        }else if (!passwordFirst.equals(confirmPassword)){
            info = info + "Ошибка пароли не равны, ";
            validator = false;
        }

        if (!checkParameter(description)){
            info = info + "Ошибка описание, ";
            validator = false;
        }

        if (validator){
            String encodedPassword = sha256PasswordEncoder.encode(confirmPassword);
            User user = new User(LocalDateTime.now(), name, login, encodedPassword, description, UserRole.valueOf(role), false);
            userService.add(user);
            info = "ПОЗДРАВЛЯЕМ вы успешно зарегистрированы ";
        }

        model.addAttribute("users", userService.findAll());
        model.addAttribute("info", "<input type=\"text\" style=\"color: red\" value=\""+ info +"!\">");
        return "admin";
    }

    @RequestMapping(value = "/delete_user", method = RequestMethod.GET)
    public String deleteUser(@RequestParam(value = "login", defaultValue = "test") final String login, final Model model){
        userService.removeByLogin(login);
        model.addAttribute("users", userService.findAll());
        return "admin";
    }

    @RequestMapping(value = "/get_log", method = RequestMethod.POST)
    public String getLogger(@RequestParam(value = "startChart"/*, defaultValue = "ANOTHER"*/) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startChart,
                          @RequestParam(value = "endChart"/*, defaultValue = "default_name"*/) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endChart,
                          Model model){

        model.addAttribute("users", userService.findAll());
        model.addAttribute("loggers", parseDate(startChart, endChart, loggerService));
        return "admin";
    }

    private boolean checkParameter(String par){
        boolean v = false;
        if (Objects.nonNull(par)){
            if (par.length() >= 4 && par.length() <= 50)  v = true;
        }
        return v;
    }

    private List<TableModelLogger> parseDate(LocalDateTime start, LocalDateTime end, LoggerService loggerService){
        List<TableModelLogger> tableModel = null;
//        final String[] startTokens = start.split("T");
//        final String[] endTokens = end.split("T");
        try {
//            final Date startDate = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            final Date endDate = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModel = loggerService.findByDateBetween(start, end);
        }catch (Exception e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModel;
    }
}
