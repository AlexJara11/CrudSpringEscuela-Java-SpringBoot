package com.sinfloo.demo.service;

import java.util.List;


import com.sinfloo.demo.model.Materia;

public interface MateriaService {

	public Materia savemat(Materia materia);
	public void deletemat(int idMateria);
	public Materia findById(int idMateria);
	public List<Materia> findAll();
}
