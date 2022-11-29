package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Hora_atencion;
import com.backend.medicsoft.Dao.Hora_atencionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Hora_atencionService {

    @Autowired
    private Hora_atencionDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Hora_atencion save(Hora_atencion objeto){
        return dao.save(objeto);
    }
    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }
    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Hora_atencion findById(Integer id) {
        return dao.findById(id).orElse(null);
    }
    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Hora_atencion> findAll() {
        return (List<Hora_atencion>) dao.findAll();
    }    
}
