package com.example.proyecto_pa_u4_dll_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto_pa_u4_dll_2.repository.modelo.Persona;
import com.example.proyecto_pa_u4_dll_2.respositoy.IPersonaIRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaIRepo iPersonaIRepo;
	
	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return iPersonaIRepo.selectTodosCriteriaAPUquery();
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return iPersonaIRepo.selectPorId(id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaIRepo.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iPersonaIRepo.eliminar(id);
	}

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaIRepo.guardar(persona);
	}

}
