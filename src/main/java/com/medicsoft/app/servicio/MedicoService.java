package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Medico;
import com.medicsoft.app.repositorio.MedicoRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class MedicoService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	MedicoRepository medicoRepository;
	
	public List<Medico> listar(){
		return (List<Medico>)medicoRepository.findAll();
	}
	
	public Medico obtenerPorId(Long id) {
		return medicoRepository.findById(id).get();
	}
	
	public void agregar(Medico medico) {
		medicoRepository.save(medico);
	}
	
	public void actualizar(Medico medico) {
		medicoRepository.save(medico);
	}
	
	public void eliminar(Long id) {
		medicoRepository.delete(obtenerPorId(id));
	}

}
