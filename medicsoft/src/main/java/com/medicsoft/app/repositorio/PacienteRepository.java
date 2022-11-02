package com.medicsoft.app.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medicsoft.app.entidades.Paciente;

//anotacion de jpa para que spring sepa que es un repositorio
@Repository
public interface PacienteRepository extends CrudRepository<Paciente,Long>{
	
	

}
