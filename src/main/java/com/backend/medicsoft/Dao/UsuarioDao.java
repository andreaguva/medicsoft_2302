package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Usuario;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.data.jpa.repository.Query;

public interface UsuarioDao extends CrudRepository <Usuario,Integer>{
    //Operación de Autentiiicación (SELECT)
    //@Transactional(readOnly=true)//No afecta integridad base de datos
    //@Query(value="SELECT * FROM cliente WHERE id_usuario= :usuario AND clave = :clave", nativeQuery=true)
    //public Usuario login(@Param("usuario") String usuario, @Param("clave") String clave);    
}
