package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Paciente;
import com.medicsoft.app.repositorio.PacienteRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class PacienteService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	
	PacienteRepository pacienteRepository;
	
	public List<Paciente> listar(){
		return (List<Paciente>)pacienteRepository.findAll();
	}
	
	public Paciente obtenerPorId(Long id) {
		return pacienteRepository.findById(id).get();
	}
	
	public void agregar(Paciente paciente) {
		pacienteRepository.save(paciente);
	}
	
	public void actualizar(Paciente paciente) {
		pacienteRepository.save(paciente);
	}
	
	public void eliminar(Long id) {
		pacienteRepository.delete(obtenerPorId(id));
	}

}
