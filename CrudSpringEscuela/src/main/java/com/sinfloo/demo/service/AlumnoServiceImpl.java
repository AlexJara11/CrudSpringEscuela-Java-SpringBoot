package com.sinfloo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinfloo.demo.dao.AlumnoDao;
import com.sinfloo.demo.model.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoDao alumnodao;
	
	
	@Override
	@Transactional(readOnly = false)
	public Alumno saveal(Alumno alumno) {
		
		return alumnodao.save(alumno);
	}

	@Override
	public void deleteal(int idAlumno) {
		alumnodao.deleteById(idAlumno);
		// Alumno alumnos = alumnodao.findById(idAlumno).orElse(null);
	      //  if (alumnos != null) {
	        //    alumnos.setDeleted(true);
	          //  alumnodao.save(alumnos);
	        //}
		
	}
	//
	//public List<Alumno>listarEliminados(){
		//return alumnodao.findByDeletedTrue();
	//}
	

	@Override
	@Transactional(readOnly = true)
	public Alumno findById(int idAlumno) {
		
		return alumnodao.findById(idAlumno).orElse(null);
		//return alumnodao.findByIdAndDeletedFalse(idAlumno).orElse(null);
	}

	@Override
	public List<Alumno> findAll() {
	
		return (List<Alumno>)alumnodao.findAll();
		//return (List<Alumno>).findAllByDeleted(false);
	}
	

	
}
