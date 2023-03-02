package com.example.proyecto_pa_u4_dll_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyecto_pa_u4_dll_2.repository.modelo.Persona;
import com.example.proyecto_pa_u4_dll_2.service.IPersonaService;

@Controller
@RequestMapping("/personas") //siempre en plural
public class PersonaController {
	
	@Autowired
	private IPersonaService iPersonaService;
	
	@GetMapping("/nuevaPersona")
	public String paginaNuevaPersona(Persona persona) { //Persona persona es el modelo, necesito por parte
														//del diseño asi no lo use, le digo vas a trabajar con
														//un modelo tipo person
		
		return "vistaNuevaPersona";
	}
	
	@PostMapping("/insertar")
	public String insertarPersona(Persona persona) {
		this.iPersonaService.guardar(persona);
		
		
		return "guardado";//retorneme a mi misma vista
	}
	
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		
		List<Persona> lista=this.iPersonaService.buscarTodos();
		modelo.addAttribute("personas", lista);
		return "vistaListaPersonas";
	}
	
	@DeleteMapping("/borrar/{id}")
	public String borrarPersona(@PathVariable("id") Integer id) {
		this.iPersonaService.eliminar(id);
		
		return "redirect:/personas/buscar";
	}
	
	@GetMapping("/buscarPorId/{id}")
	public String buscarPorId(@PathVariable("id") Integer id,Model modelo) {
		Persona persona=this.iPersonaService.buscarPorId(id);
		modelo.addAttribute("persona", persona);
		
		return "vistaPersona";
		
	}
	
	@PutMapping("/actualizar/{id}")
	public String actualizarPorId(@PathVariable("id") Integer id, Persona persona) {
		persona.setId(id);
		
		this.iPersonaService.actualizar(persona);
		
		
		return "redirect:/personas/buscar";
	}
	
}
