package com.sinfloo.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.model.Alumno;
@Repository
public interface AlumnoDao extends CrudRepository<Alumno, Integer>{

	//List<Alumno> findByDeletedFalse();
	//List<Alumno> findByDeletedTrue();

}
