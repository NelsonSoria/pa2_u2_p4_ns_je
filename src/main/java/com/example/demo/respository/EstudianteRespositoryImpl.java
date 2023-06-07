package com.example.demo.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRespositoryImpl implements EstudianteRespository{
   private static List<Estudiante> baseEstudiante = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estu) {
		baseEstudiante.add(estu);
		
	}

}
