package com.sinfloo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinfloo.demo.dao.MaestroDao;
import com.sinfloo.demo.model.Maestro;


@Service
public class MaestroServiceImpl implements MaestroService{

	@Autowired
	private MaestroDao maestrodao;
	@Override
	@Transactional(readOnly = false)
	public Maestro savem(Maestro maestro) {
		return maestrodao.save(maestro);
	}

	@Override
	
	public void delete(int idMaestro) {
		maestrodao.deleteById(idMaestro);
	}

	@Override
	@Transactional(readOnly = true)
	public Maestro findById(int idMaestro) {
		
		return maestrodao.findById(idMaestro).orElse(null);
	}

	@Override
	public List<Maestro> findAll() {
		return (List<Maestro>)maestrodao.findAll();
	
	}

}
