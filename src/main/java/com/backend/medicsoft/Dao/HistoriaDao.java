package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Historiaclinica;

import java.util.List;

//import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;




import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
public interface HistoriaDao  extends CrudRepository <Historiaclinica,Integer>{
    //Operación para seleccionar cuentas de un cliente en particular (SELECT)
   @Transactional(readOnly=true)//No afecta integridad base de datos
   @Query(value="SELECT * FROM cuenta WHERE id_cliente= :idc", nativeQuery=true)
   public List<Historiaclinica> consulta_cuenta(@Param("idc") String idc); 
}
