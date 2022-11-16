package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Citamedica;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.data.jpa.repository.Query;

public interface CitamedicaDao extends CrudRepository <Citamedica,Integer>{
    
}
