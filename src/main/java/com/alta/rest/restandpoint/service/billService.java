package com.alta.rest.restandpoint.service;

import java.util.List;

import com.alta.rest.restandpoint.model.billDetailModel;
import com.alta.rest.restandpoint.model.billModel;
import com.alta.rest.restandpoint.respository.billDetailRep;
import com.alta.rest.restandpoint.respository.billRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class billService {
    @Autowired
    billRep rep;
    @Autowired
    billDetailRep detailbill;
    public List<billModel> getUserBill(int id) {

       return rep.findByuserId(id);
    }
   
    public List<billDetailModel> getDetail(int id)
    {
        return detailbill.findBybillId(id);
    }
}
