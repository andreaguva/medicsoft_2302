package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Consultorio;
import com.medicsoft.app.repositorio.ConsultorioRepository;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class ConsultorioService {
	
	//se agrega la anotacion del repositorio con anotaacion de autowired//
	@Autowired
	ConsultorioRepository consultorioRepository;
	
	public List<Consultorio> listar(){
		return (List<Consultorio>)consultorioRepository.findAll();
	}
	
	public Consultorio obtenerPorId(Long id) {
		return consultorioRepository.findById(id).get();
	}
	
	public void agregar(Consultorio consultorio) {
		consultorioRepository.save(consultorio);
	}
	
	public void actualizar(Consultorio consultorio) {
		consultorioRepository.save(consultorio);
	}
	
	public void eliminar(Long id) {
		consultorioRepository.delete(obtenerPorId(id));
	}
	

}
