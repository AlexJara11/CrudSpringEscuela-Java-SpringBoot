package com.sinfloo.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.demo.model.Materia;
import com.sinfloo.demo.service.MateriaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/listarmat")
public class ControlerMateria {

	@Autowired
	private MateriaService materiaservice;
	
	@PostMapping("/savemat")
	public Materia savemat(@RequestBody Materia materia) {
		return materiaservice.savemat(materia);
		}
	@GetMapping("/savemat")
	public List<Materia> materias(){
		return materiaservice.findAll();
	}
	@GetMapping("/savemat/{idMateria}")
	public Materia mostrarmat(@PathVariable int idMateria) {
		return materiaservice.findById(idMateria);
	}
	@PutMapping("/savemat/{idMateria}")
	public Materia update(@RequestBody Materia materia, @PathVariable int idMateria) {
		Materia materiaactual = materiaservice.findById(idMateria);
		materiaactual.setDescripcion(materia.getDescripcion());
		materiaactual.setPuntos(materia.getPuntos());
		return materiaservice.savemat(materiaactual);
	}
	@DeleteMapping("/savemat/{idMateria}")
	public void deletemat(@PathVariable int idMateria) {
		materiaservice.deletemat(idMateria);
	}
	
}
