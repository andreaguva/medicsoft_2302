package com.medicsoft.app.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medicsoft.app.entidades.Medico;

//anotacion de jpa de un servicio que va a manejar un crud que viene del html de los controladores que son los formularios creados//
@Service
public class MedicoService {
	
	public List<Medico> listar(){
		return null;
	}
	
	public Medico obtenerPorId(Long id) {
		return null;
	}
	
	public void agregar(Medico medico) {
		
	}
	
	public void actualizar(Medico medico) {
		
	}
	
	public void eliminar(Long id) {
		
	}

}
