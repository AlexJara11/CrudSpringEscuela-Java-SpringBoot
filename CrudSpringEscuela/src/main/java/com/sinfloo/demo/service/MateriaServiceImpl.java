package com.sinfloo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinfloo.demo.dao.MateriaDao;
import com.sinfloo.demo.model.Materia;

@Service
public class MateriaServiceImpl implements MateriaService{

	@Autowired
	private MateriaDao materiadao;
	
	@Override
	@Transactional(readOnly = false)
	public Materia savemat(Materia materia) {
		return materiadao.save(materia);
	}

	@Override
	public void deletemat(int idMateria) {
		materiadao.deleteById(idMateria);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Materia findById(int idMateria) {
		
		return materiadao.findById(idMateria).orElse(null);
	}

	@Override
	public List<Materia> findAll() {
		return (List<Materia>)materiadao.findAll();
	}

}
