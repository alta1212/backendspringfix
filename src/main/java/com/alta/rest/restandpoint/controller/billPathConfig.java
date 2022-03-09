package com.alta.rest.restandpoint.controller;
import java.util.List;

import com.alta.rest.restandpoint.config.JwtTokenUtil;
import com.alta.rest.restandpoint.model.billDetailModel;
import com.alta.rest.restandpoint.model.billModel;
import com.alta.rest.restandpoint.service.billService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/bill/")

public class billPathConfig {
    @Autowired
    billService billService;

    @Autowired
    JwtTokenUtil jwt;
    @GetMapping("/get")
    public List<billModel> getUserBill(@RequestParam("token") String token)
    {   
        String id =jwt.getIdFromToken(token);
        System.out.println(id);
        return billService.getUserBill(Integer.parseInt(id));
    }
    @GetMapping("/detail/{id}")
    public List<billDetailModel> getBillDetail(@PathVariable("id") Integer  id)
    {  
         System.out.println(id);
        return billService.getDetail(id);
    }
    @PostMapping(value="/create")
    public billModel createBill(
        @RequestParam("token") String token,
        @RequestParam("detail") String detail,
        @RequestBody billModel bill
    ) 
    {
        //TO DO: make a create bill function
        System.out.println(token);
        System.out.println(detail);
        String id =jwt.getIdFromToken(token);
        return bill;
    }
    

}