package com.utn.controlador;

import java.util.*;

import com.utn.modelo.*;

public final class VeterinariaControlador {
	
	static Mascota m;
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
		
		if (tipo == 1){
			m = new Mascota(turno, nombre, "Perro", razaAnimal, edad, causaDeAtencion);
		
		}else if(tipo == 2){
			m = new Mascota(turno, nombre, "Gato", razaAnimal, edad, causaDeAtencion);
		
		}else if (tipo == 3 ){
			m = new Mascota(turno, nombre, "Conejo", razaAnimal, edad, causaDeAtencion);
		}		

		VeterinariaControlador.compruebaCupo(m);	
		
	}

	public static void compruebaCupo(Mascota m) {
				
		if(cantidadDeAnimales <= limiteDeAnimalesPorDia){

			VeterinariaControlador.asignaDoctor(m);
			Reporte.setCantidadAnimales(cantidadDeAnimales);
			
		}else{
			System.err.println("Se exedio el limite por el dia de hoy");
			reporteFinal();
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
			}	
}
	
	public static void BusquedaMascota(int turnoEs) {
		int index = turnoEs -1;
		System.out.print("La mascota se llama: ");
		System.out.println(Reporte.getResumenDelDia().get(index).getNombre());
		
		System.out.print("Atendida por razon/es: ");
		System.out.println(Reporte.getResumenDelDia().get(index).getCausaDeAtencion());
	
		m = new Mascota();

		m.setDoctor(Reporte.getResumenDelDia().get(index).getDoctor());
		m.setEdad(Reporte.getResumenDelDia().get(index).getEdad());
		m.setNombre(Reporte.getResumenDelDia().get(index).getNombre());
		m.setRaza(Reporte.getResumenDelDia().get(index).getRaza());
		m.setCausaDeAtencion(Reporte.getResumenDelDia().get(index).getCausaDeAtencion());
		m.setTipo(Reporte.getResumenDelDia().get(index).getTipo());
		
	}
	
	public static void animalDiagnosticado(int turnoEs, String resultadoEs, String causaEs, String medicamentosEs) {
		int index = turnoEs - 1;
		
		m.setCausas(causaEs);
		m.setMedicamentos(medicamentosEs);
		m.setResultado(resultadoEs);
		
		Reporte.setResumenDelDia(index, m);
	}

	public static void reporteFinal() {
		Reporte.cantidadDeAnimalesAtendidos();
		System.out.println();
		Reporte.tabla();
	}

}







