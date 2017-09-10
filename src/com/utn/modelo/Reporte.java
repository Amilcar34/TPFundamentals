package com.utn.modelo;

public final class Reporte {

	private static int cantidadAnimales;
	
	//public Reporte() {}

	public static void setCantidadAnimales(int cantidadDeAnimales){
		cantidadAnimales = cantidadDeAnimales;
	}
	
	public static void reporteTotal(){
		System.out.println("Cantidad de animales atendidos hoy: " + cantidadAnimales );
	
	}
}
