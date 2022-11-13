package com.medicsoft.app.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medicsoft.app.entidades.Medico;
//anotacion de jpa para que spring sepa que es un repositorio
@Repository
public interface MedicoRepository extends CrudRepository<Medico,Long>{

}
