package com.sinfloo.demo.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	private String Nombre;
	private String Apellido;


	@ManyToOne
	@JoinColumn(name = "maestro_idMaestro")
	private Maestro Maestros;
	
	@ManyToMany
    @JoinTable(name = "alumno_has_materias", 
     joinColumns = @JoinColumn(name = "idAlumno"), 
     inverseJoinColumns = @JoinColumn(name = "idMateria"))
	private List<Materia> materias;
	
	//@JoinColumn(columnDefinition = "boolean default false")
    //private boolean deleted;
	
	//public boolean isDeleted() {
		//return deleted = false;
	//}


	//public void setDeleted(boolean deleted) {
		//this.deleted = deleted;
	//}


	//public Alumno(boolean deleted) {
		//super();
		//this.deleted = deleted;
	//}


	public Alumno() {
	}
	

	public Alumno(int idAlumno, String Nombre, String Apellido, Maestro Maestros, List<Materia> materias) {
		super();
		this.idAlumno = idAlumno;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Maestros = Maestros;
		this.materias = materias;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public Maestro getMaestros() {
		return Maestros;
	}

	public void setMaestros(Maestro Maestros) {
		this.Maestros = Maestros;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
}
