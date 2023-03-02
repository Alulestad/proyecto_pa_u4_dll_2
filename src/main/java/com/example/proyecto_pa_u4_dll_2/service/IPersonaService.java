package com.example.proyecto_pa_u4_dll_2.service;

import java.util.List;

import com.example.proyecto_pa_u4_dll_2.repository.modelo.Persona;

public interface IPersonaService {
	/*
	buscarTodos()
	buscarPorId(Integer id)
	actualizar(Persona persona)
	eliminar(Integer id)
	guardar(Persona persona)
 	*/
	
	public List<Persona> buscarTodos();
	public Persona buscarPorId(Integer id);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public void guardar(Persona persona);
}
