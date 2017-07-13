package com.captton.universidad;

public class AlumnoPosgrado extends Alumno {
	
	private int costomensual;

	public AlumnoPosgrado(int dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	public int getCostomensual() {
		return costomensual;
	}

	public void setCostomensual(int costomensual) {
		this.costomensual = costomensual;
	}
	
	
	
	

}
