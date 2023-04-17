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

import com.sinfloo.demo.model.Maestro;
import com.sinfloo.demo.service.MaestroService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/listarm")
public class ControlerMaestro {

	@Autowired
	private MaestroService maestroservice;
	
	@PostMapping("/savem")
	public Maestro savem(@RequestBody Maestro maestro) {
		return maestroservice.savem(maestro);
	}
	@GetMapping("/savem")
	public List<Maestro> maestros(){
		return maestroservice.findAll();
	}
	@GetMapping("/savem/{idMaestro}")
	public Maestro mostrarm(@PathVariable int idMaestro) {
		return maestroservice.findById(idMaestro);
	}
	@PutMapping("/savem/{idMaestro}")
	public Maestro update(@RequestBody Maestro maestro, @PathVariable int idMaestro) {
		Maestro maestroactual = maestroservice.findById(idMaestro);
		maestroactual.setNombre(maestro.getNombre());
		maestroactual.setApellido(maestro.getApellido());
		maestroactual.setTitulo(maestro.getTitulo());
		return maestroservice.savem(maestroactual);
	}
	@DeleteMapping("/savem/{idMaestro}")
		public void deletem(@PathVariable int idMaestro) {
			maestroservice.delete(idMaestro);
		}
	}

