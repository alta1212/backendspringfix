package com.alta.rest.restandpoint.controller;
import java.util.List;

import com.alta.rest.restandpoint.model.foodModel;
import com.alta.rest.restandpoint.service.foodService;
import com.alta.rest.restandpoint.service.systemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/system/")
public class systemPathConfig {
    @Autowired
    systemService sysService;
    @Autowired
    foodService foodService;
    @GetMapping("search")
    public  List<foodModel> search(@RequestParam("key") String key)
    {
      return sysService.search(key);
    }
}
