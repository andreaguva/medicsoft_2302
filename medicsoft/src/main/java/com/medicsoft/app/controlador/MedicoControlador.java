package com.medicsoft.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("medico")
public class MedicoControlador {

	@GetMapping("/index")
	
	public String index() {
		return "http://localhost/Medicsoft/views/medico/medico.html";
	}
	
}
