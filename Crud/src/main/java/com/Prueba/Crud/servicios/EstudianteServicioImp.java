// implementa la interfaz de estudianteServicio
package com.Prueba.Crud.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Prueba.Crud.modelo.estudiantes;
import com.Prueba.Crud.repositorio.estudianteRepositorio;


@Service
public class EstudianteServicioImp implements estudianteServicio {
	
	@Autowired // con esta etiqueta no es necesario instanciar
	estudianteRepositorio estudianterepositorio;
	
	@Override
	public List<estudiantes> obtener() {
	
		return estudianterepositorio.findAll(); // usamos findAll - findById - deleteById - save para acceder a la info
	}

	@Override
	public estudiantes guardar(estudiantes estudiante) {
		
		return estudianterepositorio.save(estudiante);
	}

	@Override
	public estudiantes obtenerId(long idEstudiante) {
		
		return estudianterepositorio.findById(idEstudiante).orElse(null);
	}

	@Override
	public void eliminar(long idEstudiante) {
		estudianterepositorio.deleteById(idEstudiante);
		
	}

	
	
}
