package com.Prueba.Crud.modelo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class profesores {
	

	private static final long serialVersionUID = 1L;
	
	// generar el autoincrementable para idProfesor
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idProfesor;
	private String nombreProfesor;
	private String apellidoProfesor;
	
	
	// crear un constructor
	
	public profesores() {
		
	}


	public int getIdProfesor() {
		return idProfesor;
	}


	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}


	public String getNombreProfesor() {
		return nombreProfesor;
	}


	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}


	public String getApellidoProfesor() {
		return apellidoProfesor;
	}


	public void setApellidoProfesor(String apellidoProfesor) {
		this.apellidoProfesor = apellidoProfesor;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
