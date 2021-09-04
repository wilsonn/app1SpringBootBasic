package com.whnm.app1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whnm.app1.model.Paciente;
import com.whnm.app1.repo.PacienteDao;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteDao pacienteDao;
	
	@Override
	public String saludar(Paciente paciente) {
		return pacienteDao.saludar(paciente);
	}

}
