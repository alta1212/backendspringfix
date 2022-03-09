package com.alta.rest.restandpoint.service;


import java.util.List;

import com.alta.rest.restandpoint.model.foodModel;
import com.alta.rest.restandpoint.respository.foodRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class foodService {
    @Autowired
    foodRep rep;

    public List<foodModel> getAll() {
System.out.println("In service Layer");
       return rep.findAll();
    }

    public foodModel getDetail(int id)
    {
        return rep.findById(id).get();
    }
}
