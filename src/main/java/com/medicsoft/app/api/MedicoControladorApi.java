package com.medicsoft.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicsoft.app.entidades.Medico;
import com.medicsoft.app.servicio.MedicoService;

@RestController
@RequestMapping("/api/medico")
public class MedicoControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	MedicoService medicoService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<Medico> listar(){
		return medicoService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public Medico obtenerPorId(@PathVariable("id") Long id) {
		return medicoService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody Medico medico) {
		medicoService.agregar(medico);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody Medico medico) {
		medicoService.actualizar(medico);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		medicoService.eliminar(id);
	}

}
