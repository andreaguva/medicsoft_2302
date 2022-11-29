package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Personas;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

public interface PersonasDao extends CrudRepository <Personas,String>{
    //Operación de Autentiiicación (SELECT)
    @Transactional(readOnly=true)//No afecta integridad base de datos
    @Query(value="SELECT * FROM personas WHERE documento = :documento AND clave = :clave " , nativeQuery=true)
    public Personas login(@Param("documento") String documento, @Param("clave") String clave); 
        
}
