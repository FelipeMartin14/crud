package com.Prueba.Crud.modelo;


import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class notas {

private static final long serialVersionUID = 1L;
	
	// generar el autoincrementable para idNota
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idNota;
	private String calificacion;
	public int getIdNota() {
		return idNota;
	}
	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
