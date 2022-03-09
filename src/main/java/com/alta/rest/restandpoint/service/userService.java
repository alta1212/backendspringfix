package com.alta.rest.restandpoint.service;

import com.alta.rest.restandpoint.respository.userRep;

import java.util.List;

import com.alta.rest.restandpoint.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class userService {
    @Autowired
    userRep rep;

    public List<userModel> getAll() {

       return rep.findAll();
    }

    public userModel login(userModel u) {
       System.out.println(u.getUser());
       
       return rep.findByuserAndPass(u.getUser(), u.getPass());
    }
}

