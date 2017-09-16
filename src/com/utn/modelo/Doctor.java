package com.utn.modelo;

import java.util.ArrayList;

public final class Doctor {

	private String nombre;
	
	public Doctor(String nombre){
		
		this.nombre = nombre;
		System.out.print(nombre + " " );
	}
	
	public void setMascota(Mascota mascota) {
		System.out.println("Al Dr/a: " + nombre + " se le asigno un " + 
		mascota.getTipo() + " de nombre " + mascota.getNombre());
		mascota.setDoctor(this.nombre);
		Reporte.cargaDoctorMascota(mascota);
	}
	
	public String getNombre() {
		return nombre;
	}






	

	
}
