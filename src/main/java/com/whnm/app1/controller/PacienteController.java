package com.whnm.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whnm.app1.model.Paciente;
import com.whnm.app1.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public String saludar() {
		Paciente p = new Paciente(1, "Wilson Neira");
		return pacienteService.saludar(p);
	}
}
