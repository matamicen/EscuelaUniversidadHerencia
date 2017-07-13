package com.captton.universidad;

import java.util.ArrayList;

public class Universidad {
	
	 private String nombre;
	    private boolean estado;
	    private String tipo;
	    private ArrayList<Alumno> alumnos;
	    
	    public Universidad(String nombre, boolean estado, String tipo)
	    {
	        this.nombre = nombre;
	        this.estado = estado;
	        this.tipo = tipo;
	        alumnos = new ArrayList<Alumno>();
	        
	                
	    }
	    
	    public void InscribirAlumno(Alumno alumno){
	        
	        this.alumnos.add(alumno);
	        
	    }

	public void BuscarAlumoXDni(int dni){
	    
	    Boolean encontro = false;
	    
	    for (Alumno al : alumnos) {
	      if (al.dni == dni) {
	          encontro = true;
	          System.out.println("Encontro el DNI: " + al.dni);
	           
	      }
	        
	    }
	    if (!encontro){ System.out.println("Noooo lo Encontro al DNI: " + dni); }
	    
	        
	    }

}
