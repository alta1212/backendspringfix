package com.alta.rest.restandpoint.respository;
import java.util.List;

import com.alta.rest.restandpoint.model.billDetailModel;

import org.springframework.data.jpa.repository.JpaRepository;





import org.springframework.stereotype.Repository;
@Repository
public interface billDetailRep extends JpaRepository<billDetailModel, Integer> {

   
    List<billDetailModel> findBybillId(int id);
}