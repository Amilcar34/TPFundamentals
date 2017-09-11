package com.utn.modelo;

import java.util.ArrayList;

public final class Doctor {

	private Mascota mascota;
	private ArrayList<Mascota> mascotas;
	private String nombre;
	
	public Doctor(String nombre){
		mascotas = new ArrayList<Mascota>();
		
		this.nombre = nombre;
		System.out.print(nombre + " " );
	}
	
	
	//Metodos

	
	//Getter y Setter

	public Mascota getMascota() {
		return mascota;
	}
	
	public void setMascota(Mascota mascota) {
		System.out.println("Al Dr/a: " + nombre + " se le asigno un " + mascota.getTipo() + " de nombre " + mascota.getNombre() + ". Problema: " + mascota.getCausaDeAtencion());
		this.mascotas.add(mascota);
		
		mascota.setDoctor(this.nombre);
		Reporte.cargaDoctorMascorta(mascota);
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	

	
}
