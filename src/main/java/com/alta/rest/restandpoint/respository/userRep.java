package com.alta.rest.restandpoint.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alta.rest.restandpoint.model.userModel;

import org.springframework.stereotype.Repository;


@Repository
public interface userRep  extends JpaRepository<userModel, Integer> {
    public userModel findByuserAndPass(String user, String pass);
 
}
