package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Especialidad;
import com.backend.medicsoft.Dao.EspecialidadDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspecialidadService {
    
    @Autowired
    private EspecialidadDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Especialidad save(Especialidad objeto){
        return dao.save(objeto);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Especialidad findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Especialidad> findAll() {
        return (List<Especialidad>) dao.findAll();
    }
}
