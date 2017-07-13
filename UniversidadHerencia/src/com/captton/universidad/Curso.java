package com.captton.universidad;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nombre;
    private int cargaHoraria;
    private Profesor profesor;
//    private ArrayList<Alumno> alumnosInscriptos;
    

    public Curso() {};
    
	public Curso(int codigo, String nombre, int cargaHoraria)
	{ 
   this.codigo = codigo;
   this.nombre = nombre;
   this.cargaHoraria = cargaHoraria;
//   this.alumnosInscriptos = new ArrayList<Alumno>();
  
   	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

/*	public void inscriboAlumno(Alumno alumno)
	{
		this.alumnosInscriptos.add(alumno);
	}
*/
	
	
}
