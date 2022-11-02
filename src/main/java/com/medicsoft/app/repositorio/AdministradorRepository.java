package com.medicsoft.app.repositorio;
//el repositorio manipula la informacion que esta creda en las tablas inserta, modific, muestra, elimina//
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.medicsoft.app.entidades.Administrador;
@Repository
public interface AdministradorRepository extends CrudRepository<Administrador,Long>{

}
