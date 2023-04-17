package com.sinfloo.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.model.Materia;
@Repository
public interface MateriaDao extends CrudRepository<Materia, Integer>{

	
}
