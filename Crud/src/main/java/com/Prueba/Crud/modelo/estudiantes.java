package com.Prueba.Crud.modelo; // 

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class estudiantes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	// generar el autoincrementable para idEstudiante
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// variables segun los campos creados en la tabla estudiantes
	private long idEstudiante;
	private String nombreEstudiante;
	private String apellidoEstudiante;
	
	
	// constructor vacio
	
	public estudiantes() {
		
	}

	// crear get and set para los atributos
	public long getIdEstudiante() {
		return idEstudiante;
	}


	public void setIdEstudiante(long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}


	public String getNombreEstudiante() {
		return nombreEstudiante;
	}


	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}


	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}


	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	};
	
	
}
