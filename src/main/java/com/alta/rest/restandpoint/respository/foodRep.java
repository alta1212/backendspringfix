package com.alta.rest.restandpoint.respository;

import java.util.List;

import com.alta.rest.restandpoint.model.foodModel;

import org.springframework.data.jpa.repository.JpaRepository;





import org.springframework.stereotype.Repository;


@Repository
public interface foodRep  extends JpaRepository<foodModel, Integer> {

    List<foodModel> findByfoodNameContainingIgnoreCase(String key);

   
    
}

