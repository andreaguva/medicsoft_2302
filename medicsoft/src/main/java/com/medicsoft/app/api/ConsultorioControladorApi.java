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

import com.medicsoft.app.entidades.Consultorio;
import com.medicsoft.app.servicio.ConsultorioService;

@RestController
@RequestMapping("/api/consultorio")
public class ConsultorioControladorApi {
	
	//se invoca el servicio que invoca la logica del negocio//
	@Autowired
	ConsultorioService consultorioService;
	
	@GetMapping("/Lista") //HTTP:GET
	public List<Consultorio> listar(){
		return consultorioService.listar();
	}
	
	@GetMapping("/obtenerPorId(id)") //HTTP:GET
	public Consultorio obtenerPorId(@PathVariable("id") Long id) {
		return consultorioService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar") //HTTP:POST
	public void agregar(@RequestBody Consultorio consultorio) {
		consultorioService.agregar(consultorio);
	}
	
	@PutMapping("/actualizar") //HTTP:PUT
	public void actualizar(@RequestBody Consultorio consultorio) {
		consultorioService.actualizar(consultorio);
	}
	
	@DeleteMapping("/eliminar") //HTTP:DELETE
	public void eliminar(Long id) {
		consultorioService.eliminar(id);
	}

}
