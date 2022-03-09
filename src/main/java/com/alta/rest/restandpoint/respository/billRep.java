package com.alta.rest.restandpoint.respository;
import java.util.List;

import com.alta.rest.restandpoint.model.billModel;

import org.springframework.data.jpa.repository.JpaRepository;





import org.springframework.stereotype.Repository;
@Repository
public interface billRep extends JpaRepository<billModel, Integer> {

    List<billModel> findByuserId(int id);
    
}
