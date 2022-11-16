package com.backend.medicsoft.Service;
import com.backend.medicsoft.Models.Historiaclinica;
import com.backend.medicsoft.Dao.HistoriaDao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;


@Service
public class HistoriaService {
    @Autowired
    private HistoriaDao dao;

    //Creamos el método para Guardar datos en la Tabla de la BD
    public Historiaclinica save(Historiaclinica objeto) {
        return dao.save(objeto);
    }


    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }


    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Historiaclinica findById(Integer id) {
        return dao.findById(id).orElse(null);
    }


    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Historiaclinica> findAll() {
        return (List<Historiaclinica>) dao.findAll();
    }
}
