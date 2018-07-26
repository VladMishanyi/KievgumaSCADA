package com.vk.controller.authorization;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vk.service.data.UserService;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@ComponentScan(basePackages = "ua.com.ecoteh.service.fabrica")
public final class AuthorizationController {

    private static final Logger LOGGER = Logger.getLogger(AuthorizationController.class);

    private final UserService userService;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AuthorizationController(
            final UserService userService
    ) {
        this.userService = userService;
    }

    @RequestMapping(
            value = "/login",
            method = RequestMethod.GET
    )
    public ModelAndView loginPage() {
        ModelAndView modelAndView;
        if (this.userService.isAuthenticatedUser()) {
            modelAndView = new ModelAndView("redirect:/admin/");
        } else {
            modelAndView = new ModelAndView();
            modelAndView.setViewName("login/login");
        }
        return modelAndView;
    }

    @RequestMapping(
            value = "/logout",
            method = RequestMethod.GET
    )
    public String logoutPage(final HttpServletRequest request, final HttpServletResponse response) {
        final String viewName;
        if (this.userService.isAuthenticatedUser()) {
            logout(request, response);
            viewName = "redirect:/login?logout";
        } else {
            viewName = "redirect:/login";
        }
        return viewName;
    }

    private void logout(final HttpServletRequest request, final HttpServletResponse response) {
        final SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        logoutHandler.logout(request, response, authentication);
    }
}
