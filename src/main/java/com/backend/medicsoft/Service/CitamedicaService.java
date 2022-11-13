package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Citamedica;
import com.backend.medicsoft.Dao.CitamedicaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitamedicaService {

    @Autowired
    private CitamedicaDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Citamedica save(Citamedica objeto){
        return dao.save(objeto);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Citamedica findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Citamedica> findAll() {
        return (List<Citamedica>) dao.findAll();
    }
    
}
