package com.sinfloo.demo.service;

import java.util.List;

import com.sinfloo.demo.model.Alumno;

public interface AlumnoService {

	public Alumno saveal(Alumno alumno);
	public void deleteal(int idAlumno);
	public Alumno findById(int idAlumno);
	public List<Alumno> findAll();
	
}
