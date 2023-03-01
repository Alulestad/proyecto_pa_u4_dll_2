package com.example.proyecto_pa_u4_dll_2.pers.modelo;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	/*
	id
	nombre
	cedula
	apellido
	genero
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_pers")
	@SequenceGenerator(name = "seq_pers",sequenceName = "seq_pers",allocationSize = 1)
	@Column(name = "pers_id")
	private Integer id;
	@Column(name = "pers_nombre")
	private String nombre;
	@Column(name = "pers_apellido")
	private String apellido;
	@Column(name = "pers_genero")
	private String genero;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + "]";
	}
	
	
}
