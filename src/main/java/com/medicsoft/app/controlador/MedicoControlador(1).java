package com.medicsoft.app.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicsoft.app.entidades.Medico;

@RestController
@RequestMapping("/api/medicos")
public class MedicoControlador {

	@GetMapping("/listar")
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
