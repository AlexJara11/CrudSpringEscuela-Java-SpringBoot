package com.sinfloo.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.model.Maestro;

@Repository
public interface MaestroDao extends CrudRepository<Maestro, Integer>{




}
