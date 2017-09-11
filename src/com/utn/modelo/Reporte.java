package com.utn.modelo;

import java.util.*;

public final class Reporte {

	private static int cantidadAnimales;
	private static ArrayList<Mascota> resumenDelDia = new ArrayList<Mascota>();
	
	//public Reporte() {}

	public static void setCantidadAnimales(int cantidadDeAnimales){
		cantidadAnimales = cantidadDeAnimales;
	}
	
	public static void cantidadDeAnimalesAtendidos(){
		System.out.println("Cantidad de animales atendidos hoy: " + cantidadAnimales );
	
	}

	public static void cargaDoctorMascorta(Mascota mascota) {
		resumenDelDia.add(mascota);
	}

	public static ArrayList<Mascota> getResumenDelDia() {
		return resumenDelDia;
	}

	public static void setResumenDelDia(ArrayList<Mascota> resumenDelDia) {
		Reporte.resumenDelDia = resumenDelDia;
	}

	public static int getCantidadAnimales() {
		return cantidadAnimales;
	}
	
	public static void tabla(){
		for (int i = 0; i < resumenDelDia.size(); i++) {
			
	System.out.println(resumenDelDia.get(i).getDoctor() + " atendio a un " 
	+ resumenDelDia.get(i).getTipo() + " llamado " + resumenDelDia.get(i).getNombre());
		}
	}
	
}
