
package com.alta.rest.restandpoint.controller;
import java.util.List;

import com.alta.rest.restandpoint.model.foodModel;
import com.alta.rest.restandpoint.service.foodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food")
public class foodPathConfig {
    public foodPathConfig()
    {
        System.out.println("here");
    }
    @Autowired
    foodService foodService;
   
    @GetMapping("/getall")
    public List<foodModel> getFood()
    {
        System.out.println(
            "Calling get all uri"
        );
        return foodService.getAll();
    }
    @GetMapping("/detail/{id}")
    public foodModel getFoodDetail(@PathVariable("id") Integer  id)
    {   System.out.println(id);
        return foodService.getDetail(id);
    }

    @PostMapping("/add")
    public foodModel create(@RequestBody foodModel p)
    {
        return p;
    }
}
