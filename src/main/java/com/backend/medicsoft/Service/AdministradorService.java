package com.backend.medicsoft.Service;

import com.backend.medicsoft.Models.Administrador;
import com.backend.medicsoft.Dao.AdministradorDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorDao dao;
    
    //Creamos el método para Guardar datos en la Tabla de la BD
    public Administrador save(Administrador objeto){
        return dao.save(objeto);
    }

    //Creamos el método para Eliminar datos en la Tabla de la BD
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    //Creamos el método para buscar un solo registro en la Tabla de la BD
    @Transactional(readOnly=true)
    public Administrador findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    //Creamos el método para buscar todos los registros en la Tabla de la BD
    @Transactional(readOnly=true)
    public List<Administrador> findAll() {
        return (List<Administrador>) dao.findAll();
    }
    
}
