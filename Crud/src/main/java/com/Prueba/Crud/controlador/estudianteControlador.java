package com.Prueba.Crud.controlador;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prueba.Crud.modelo.estudiantes;
import com.Prueba.Crud.servicios.EstudianteServicioImp;

@RestController //anotacion para controlador
@RequestMapping("/Api/v1") //url para completar con el localhost ####:


public class estudianteControlador {
	
	@Autowired
	EstudianteServicioImp estudianteServicio;
	// agregar esta parte a la URL para ver la data de todos los estudiantes
	
	@GetMapping("/estudiantes") 
	// metodo que usara GET para traer la data
	public List<estudiantes> obtenerEstudiantes(){
		return estudianteServicio.obtener();
	}
	
	// crear un nuevo estudiante con POST
	@PostMapping("/guardar")
	public ResponseEntity<estudiantes>guardarEstudiante(@RequestBody estudiantes estudiante){
		estudiantes nuevo_estudiante = estudianteServicio.guardar(estudiante);
		return new ResponseEntity<>(nuevo_estudiante, HttpStatus.CREATED);
	}
	
	@GetMapping("/estudiantes/{idEstudiante}")
	public ResponseEntity<estudiantes> obtenerEstudianteId(@PathVariable long idEstudiante){
			estudiantes estudiantePorId = estudianteServicio.obtenerId(idEstudiante);
			return ResponseEntity.ok(estudiantePorId);
	}
	
	// metodo para actualizar el estudiante con PUT
	
	@PutMapping("/estudiantes/{idEstudiante}")
	public ResponseEntity<estudiantes> actualizar(@PathVariable long idEstudiante, @RequestBody estudiantes estudiante){
		estudiantes estudiantePorId = estudianteServicio.obtenerId(idEstudiante);
		estudiantePorId.setNombreEstudiante(estudiante.getNombreEstudiante());
		estudiantePorId.setApellidoEstudiante(estudiante.getApellidoEstudiante());
		
		// estudiante actualizado
		
		estudiantes estudiante_actualizado = estudianteServicio.guardar(estudiantePorId);
		return new ResponseEntity<>(estudiante_actualizado, HttpStatus.CREATED);
		
		
	}
	
	// Metodo para eliminar el estudiante con DELETE

	@DeleteMapping("/estudiantes/{idEstudiantes}")
	public ResponseEntity<HashMap<String, Boolean>>eliminarEstudiante(@PathVariable long idEstudiante) {
		this.estudianteServicio.eliminar(idEstudiante);
		
		HashMap<String, Boolean> estadoEstudianteEliminado = new HashMap<>();
		estadoEstudianteEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoEstudianteEliminado);
	}
	


}
