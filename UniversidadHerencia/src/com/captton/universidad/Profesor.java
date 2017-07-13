package com.captton.universidad;

public class Profesor {
	
	 private int dni;
	    private String nombre;
	    private String apellido;
	    
	    public Profesor()
	    {
	            
	    }
	    
	    
	    
	    public Profesor(int dni, String nombre, String apellido) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
		}



		public void setProfesor (int dni, String nombre, String apellido)
	    {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        
	        
	    }
	    
	    public void getProfesor ()
	    {
	        
	        System.out.println("Datos de Profesor: DNI :" + this.dni + " nombre: " + this.nombre
	                + "apellido: " + this.apellido);
	    
	        
	    }



		public int getDni() {
			return dni;
		}



		public void setDni(int dni) {
			this.dni = dni;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellido() {
			return apellido;
		}



		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	    
	    
	    
	    
	    

}
