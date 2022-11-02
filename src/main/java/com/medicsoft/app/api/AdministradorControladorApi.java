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
import com.medicsoft.app.entidades.Administrador;
import com.medicsoft.app.servicio.AdministradorService;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorControladorApi {
	
	@Autowired
	AdministradorService administradorService;
	@GetMapping("/listar")//HTTP:GET//
	public List<Administrador>listar(){
		return administradorService.listar();
	}
	
	@GetMapping("/obtenerPorId/(id)")//HTTP:GET//
	public Administrador obtenerPorId(@PathVariable("id")Long id) {
		return administradorService.obtenerPorId(id);
	}
	
	@PostMapping("/agregar")//HTTP:POST//
	public void agregar(@RequestBody Administrador administrador) {
		administradorService.agregar(administrador);
	}
	
	@PutMapping("/actualizar")//HTTP:PUT//
	public void actualizarr(@RequestBody Administrador administrador) {
		administradorService.actualizar(administrador);
	}
	
	@DeleteMapping("/eliminar")//HTTP:PUT//
	public void eliminar(Long id) {
		administradorService.eliminar(id);
	}

}
