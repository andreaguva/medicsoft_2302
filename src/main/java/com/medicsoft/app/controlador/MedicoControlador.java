package com.medicsoft.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class MedicoControlador {

	@GetMapping("/Admin/admin_medico/regMedico_agre")
	
	public String index() {
		return "/views/Admin/admin_medico/regMedico_agre";
	}
	
}
