package com.medicsoft.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("citamedica")
public class CitaMedicaControlador {	
	@GetMapping("paciente")
	public String paciente() {
		return "citamedica/paciente";
	}

}
