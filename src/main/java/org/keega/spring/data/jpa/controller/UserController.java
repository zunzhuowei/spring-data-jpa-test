package org.keega.spring.data.jpa.controller;

import org.keega.spring.data.jpa.model.User;
import org.keega.spring.data.jpa.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by zun.wei on 2016/10/6.
 * To change this template use File|Default Setting
 * |Editor|File and Code Templates|Includes|File Header
 */
@Controller
@RequestMapping("/marry")
public class UserController {

    @Inject
    private IUserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String init(Model model) {
        User user = userService.findOneUser((long) 61);
        System.out.println("user111================================================== " + user);
        model.addAttribute("user", userService.findOneUser((long) 61));
        return "/user/init";
    }

    @RequestMapping(value = "/you", method = RequestMethod.GET)
    public String initMarry() {

        return "/marry/index";
    }

    @RequestMapping(value = "/archive", method = RequestMethod.GET)
    public String archive() {

        return "/marry/archive";
    }

}
