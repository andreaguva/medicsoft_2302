package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Paciente;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
/*import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;*/

public interface PacienteDao extends CrudRepository <Paciente,Integer>{
    //Operación de Autentiiicación (SELECT)
    /*@Transactional(readOnly=true)//No afecta integridad base de datos
    @Query(value="SELECT * FROM paciente WHERE documento_paciente= :documento AND clave_paciente = :clave AND rol = :rol", nativeQuery=true)
    public Paciente login(@Param("documento") String documento, @Param("clave") String clave, @Param("rol") String rol);  */  
        
}
