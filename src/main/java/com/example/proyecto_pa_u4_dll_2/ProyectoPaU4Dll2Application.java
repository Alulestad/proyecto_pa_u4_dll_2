package com.example.proyecto_pa_u4_dll_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.proyecto_pa_u4_dll_2.repository.modelo.Persona;
import com.example.proyecto_pa_u4_dll_2.service.IPersonaService;

@SpringBootApplication
public class ProyectoPaU4Dll2Application {//implements CommandLineRunner{

	@Autowired
	private IPersonaService iPersonaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU4Dll2Application.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		
		Persona persona=new Persona();
		persona.setApellido("MM");
		persona.setGenero("M");
		persona.setNombre("DD");;
		Persona persona2=new Persona();
		persona2.setApellido("AA");
		persona2.setGenero("F");
		persona2.setNombre("NN");
		
		System.out.println("Agrego");
		iPersonaService.guardar(persona);
		iPersonaService.guardar(persona2);
		
		System.out.println("Actualizo");
		persona.setApellido("asdf");
		persona.setId(1);
		iPersonaService.actualizar(persona);
		
		System.out.println("Elimino");
		iPersonaService.eliminar(1);
		
		System.out.println("Buscar");
		iPersonaService.buscarPorId(2);
		
		System.out.println("Buscar Todos");
		iPersonaService.buscarTodos();
		
	}
	*/
}
