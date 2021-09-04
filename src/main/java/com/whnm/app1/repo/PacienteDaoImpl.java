package com.whnm.app1.repo;

import org.springframework.stereotype.Repository;

import com.whnm.app1.model.Paciente;

@Repository
public class PacienteDaoImpl implements PacienteDao {

	@Override
	public String saludar(Paciente paciente) {
		return "hola " + paciente.getNombre();
	}

}
