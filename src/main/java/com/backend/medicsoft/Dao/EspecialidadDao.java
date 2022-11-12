package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Especialidad;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.data.jpa.repository.Query;


public interface EspecialidadDao extends CrudRepository <Especialidad,Integer>{
    
}
