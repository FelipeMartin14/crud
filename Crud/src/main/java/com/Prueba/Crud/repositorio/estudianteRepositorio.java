// crear la interfaz 
package com.Prueba.Crud.repositorio;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Prueba.Crud.modelo.estudiantes;


// accede directamente a la base de datos por el Jpa Repository
@Repository

public interface estudianteRepositorio extends JpaRepository <estudiantes,Long> {

	
}
