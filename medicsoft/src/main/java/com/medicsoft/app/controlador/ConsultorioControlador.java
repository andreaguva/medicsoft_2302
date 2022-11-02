package com.medicsoft.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioControlador {
	
@GetMapping("/index")
	
	public String index() {
		return "medico/index";
	}

}
