package com.alta.rest.restandpoint.service;
import java.util.List;


import com.alta.rest.restandpoint.model.foodModel;
import com.alta.rest.restandpoint.respository.foodRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class systemService {
    @Autowired
    foodRep rep;
    
   public List<foodModel> search(String key) {

    return rep.findByfoodNameContainingIgnoreCase(key);
    }
    public foodModel add(foodModel food)
    {
        return rep.save(food);
    }
}
