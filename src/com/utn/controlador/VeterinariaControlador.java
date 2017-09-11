package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.*;

public final class VeterinariaControlador {
	
	private static Doctor d1;
	private static Doctor d2;
	private static Doctor d3;
	private static Doctor d4;
	private static Doctor d5;
	
	private static int i = 1;
	
	private static int limiteDeAnimalesPorDia = 20;
	private static int cantidadDeAnimales = 0;
	
	public static void creoDoctores(String nombreD1, String nombreD2, String nombreD3, String nombreD4, String nombreD5) {
		 d1 = new Doctor(nombreD1);
		 d2 = new Doctor(nombreD2);
		 d3 = new Doctor(nombreD3);
		 d4 = new Doctor(nombreD4);
		 d5 = new Doctor(nombreD5);		
	}

	public static void llegadaAnimal(int turno, String nombre, int tipo, String razaAnimal, int edad, String causaDeAtencion){
		
		cantidadDeAnimales ++;

		Mascota m = null;
		
		if (tipo == 1 ){
			m = new Perro(turno, nombre, "Perro", razaAnimal, edad, causaDeAtencion);
		
		}else if(tipo == 2){
			m = new Gato (turno, nombre, "Gato", razaAnimal, edad, causaDeAtencion);
		
		}else if (tipo == 3 ){
			m = new Conejo (turno, nombre, "Conejo", razaAnimal, edad, causaDeAtencion);
		}		

		VeterinariaControlador.compruebaCupo(m);	
		
	}

	public static void compruebaCupo(Mascota m) {
				
		if(cantidadDeAnimales <= limiteDeAnimalesPorDia){

			VeterinariaControlador.asignaDoctor(m);
			Reporte.setCantidadAnimales(cantidadDeAnimales);
			
		}else{
			System.err.println("Se exedio el limite por el dia de hoy");
		}
	}
	
	public static void asignaDoctor(Mascota m) {
			
		switch (i) {
			
			case 1:
				d1.setMascota(m);
				i++;
				break;
				
			case 2:
				d2.setMascota(m);
				i++;
				break;
				
			case 3:
				d3.setMascota(m);
				i++;
				break;
				
			case 4:
				d4.setMascota(m);
				i++;
				break;
				
			case 5:
				d5.setMascota(m);
				i = 1;
				break;
				
			default:
				break;
			}	
}
	
	public static void reporteFinal() {
		Reporte.cantidadDeAnimalesAtendidos();
		System.out.println();
		Reporte.tabla();
		
	}
	
}
