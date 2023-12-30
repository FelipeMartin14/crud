package com.Prueba.Crud.modelo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class cursos {


	private static final long serialVersionUID = 1L;
	
	// generar el autoincrementable para idCursos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idCurso;
	private String nombreCurso;
	
	
	
	// crear un constructor
	
	public cursos() {
		
	}



	public int getIdCurso() {
		return idCurso;
	}



	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}



	public String getNombreCurso() {
		return nombreCurso;
	}



	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
