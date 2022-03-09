package com.alta.rest.restandpoint.controller;

import com.alta.rest.restandpoint.config.JwtTokenUtil;
import com.alta.rest.restandpoint.model.userModel;
import com.alta.rest.restandpoint.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class userPathConfig {
    @Autowired
    userService rep;

    @Autowired
	private JwtTokenUtil jwtTokenUtil;

    @PostMapping("login")
    public userModel login(@RequestBody userModel p) {
        userModel user;
        user=rep.login(p);
        if(user!=null)
        {   
            user.setRole("user");
            user.setToken(jwtTokenUtil.generateToken(user));
            System.out.println(user.getToken());
        }
        return user;
    }
}
