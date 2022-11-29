package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Cita_paciente;
import com.backend.medicsoft.Dao.Cita_pacienteDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Cita_pacienteService {

    @Autowired
    private Cita_pacienteDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Cita_paciente save(Cita_paciente objeto){
        return dao.save(objeto);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Cita_paciente findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Cita_paciente> findAll() {
        return (List<Cita_paciente>) dao.findAll();
    }
    
}
