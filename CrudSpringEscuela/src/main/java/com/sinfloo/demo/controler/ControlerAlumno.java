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

import com.sinfloo.demo.model.Alumno;
import com.sinfloo.demo.model.Materia;
import com.sinfloo.demo.service.AlumnoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/listaral")
public class ControlerAlumno {

	@Autowired
	private AlumnoService alumnoservice;
	@PostMapping("/saveal")
	public Alumno saveal(@RequestBody Alumno alumno) {
	return alumnoservice.saveal(alumno);
	}
	@GetMapping("/saveal")
	public List<Alumno> alumnos(){
		return alumnoservice.findAll();
	}
	@GetMapping("/saveal/{idAlumno}")
	public Alumno mostraral(@PathVariable int idAlumno) {
		return alumnoservice.findById(idAlumno);
	}
	
	@PutMapping("/saveal/{idAlumno}")
	public Alumno update(@RequestBody Alumno alumno, @PathVariable int idAlumno) {
		Alumno alumnoactual = alumnoservice.findById(idAlumno);
		alumnoactual.setNombre(alumno.getNombre());
		alumnoactual.setApellido(alumno.getApellido());
		alumnoactual.setMaestros(alumno.getMaestros());
		alumnoactual.setMaterias(alumno.getMaterias());

		return alumnoservice.saveal(alumnoactual);
	}
	@DeleteMapping("/saveal/{idAlumno}")
	public void deleteal(@PathVariable int idAlumno) {
		alumnoservice.deleteal(idAlumno);
		
	}
	
	//@GetMapping("/alumnoseli")
	//public List<Alumno>listarEliminados(){
		//return alumnoservice.deleteal(int idAlumno);
	//}
	
	
}
