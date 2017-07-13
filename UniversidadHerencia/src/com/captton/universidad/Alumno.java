package com.captton.universidad;
import java.util.ArrayList;

public class Alumno {
	
	
	    public int dni;
	    private String nombre;
	    private String apellido;
	    private ArrayList<Curso> cursos;

	    public Alumno (int dni, String nombre, String apellido){
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        cursos = new ArrayList<Curso>();
	    }    
	    
	    
	    public void InscribirCurso(Curso curso){
	        this.cursos.add(curso);
	      //  curso.inscriboAlumno(this);
	    }
	    
	    public void ListarCursosInscriptos()
	    {
	        System.out.println("Listado de Cursos Inscriptos");
	        System.out.println("");
	        for (Curso cur : cursos)
	        {
	            System.out.println("Alumno: "+ this.nombre + " " + this.apellido);
	            System.out.println("Codigo: "+cur.getCodigo()+ " Nombre: "+cur.getNombre()+" Carga Horaria: "+ cur.getCargaHoraria()+ "Horas");
	            System.out.println("");
	            System.out.println("Profesor DNI: "+cur.getProfesor().getDni() + " Profesor Nombre: "+cur.getProfesor().getNombre());
	            System.out.println("");
	            System.out.println("");
	        }
	        
	        
	    }
	    
	}


