package com.backend.medicsoft.Dao;

import com.backend.medicsoft.Models.Paciente;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
/*import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;*/
public interface PacienteDao extends CrudRepository <Paciente,Integer>{
    
        
}
