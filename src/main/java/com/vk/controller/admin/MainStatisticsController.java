package com.vk.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KIP-PC99 on 25.07.2018.
 */
@Controller
@RequestMapping(value = "/admin")
public class MainStatisticsController {

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    public String getAdminPanel(){
        return "admin";
    }
}
