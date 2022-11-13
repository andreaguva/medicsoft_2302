package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Medico;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

public interface MedicoDao extends CrudRepository <Medico,Integer>{
    //Operación de Autentiiicación (SELECT)
    @Transactional(readOnly=true)//No afecta integridad base de datos
    @Query(value="SELECT * FROM cliente WHERE id_usuario= :usmd ", nativeQuery=true)
    public List <Medico> consulta_medico(@Param("usmd") String usmd);
    
}
