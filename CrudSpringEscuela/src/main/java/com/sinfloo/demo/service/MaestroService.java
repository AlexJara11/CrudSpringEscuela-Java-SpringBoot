package com.sinfloo.demo.service;

import java.util.List;

import com.sinfloo.demo.model.Maestro;

public interface MaestroService {

	public Maestro savem(Maestro maestro);
	public void delete(int idMaestro);
	public Maestro findById(int idMaestro);
	public List<Maestro> findAll();
	
	
}
