// interfaz para almacenar los 4 metodos para interactuar con la informacion
package com.Prueba.Crud.servicios;

import java.util.List;

import com.Prueba.Crud.modelo.estudiantes;

public interface estudianteServicio {
	
	/*crear los metodos obtener, guardar, eliminar*/

	public List<estudiantes> obtener();
	
	public estudiantes guardar(estudiantes estudiante);
	
	// usamos este metodo para actualizar si es necesario algun registro
	public estudiantes obtenerId(long idEstudiante);
	
	public void eliminar (long idEstudiante);
	
}
