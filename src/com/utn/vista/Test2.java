package com.utn.vista;

import java.util.*;

import com.utn.controlador.VeterinariaControlador;

public final class Test2 {

	public static int turno = 1;

	public static void main(String[] args) {

		System.out.print("Estan trabajando los Dres/as: ");
		VeterinariaControlador.creoDoctores("Juan", "Felipe", "Nacho", "Luis", "Sofia");
		System.out.println();
		System.out.println();
		
		llegadaDeAnimal();
		
	}
	
	private static void inicio(){
		
		Scanner opciones = new Scanner(System.in);
		System.out.println("¿Que decea hacer?");
		System.out.println("1- Cargar otra Mascota");
		System.out.println("2- Se reviso un animal y se desea cargar observaciones");
		System.out.println("3- ¿Desea ver el reporte final?");
		int opcion = opciones.nextInt();
		
		switch (opcion) {
		case 1:
			llegadaDeAnimal();
			break;
			
		case 2:
			busquedaDeAnimalDiagnosticado();
			break;

		case 3:
			reporte();
			break;
		
		default:
			System.err.println("El dato ingresado es incorrecto");
			System.out.println();
			inicio();
			break;
		}
	}

	private static void llegadaDeAnimal() {
		int continuar = 1;
		while (continuar == 1) {

			try {
				Scanner entrada = new Scanner(System.in);

				System.out.println("Introduzca el nombre del animal");
				String nombreAnimal = entrada.nextLine();

				System.out.println("Intrudocue la opcion NUMERICA del animal que se va a atender");
				System.out.println("1- Perro");
				System.out.println("2- Gato");
				System.out.println("3- Conejo");
				int tipoAnimal = entrada.nextInt();

				Scanner entrada1 = new Scanner(System.in);

				System.out.println("Introduzca la raza del animal");
				String razaAnimal = entrada1.nextLine();

				System.out.println("Introduzca la edad del animal");
				int edadAnimal = entrada1.nextInt();

				Scanner entrada2 = new Scanner(System.in);
				System.out.println("¿Que sintoma tiene?");
				String causaAnimal = entrada2.nextLine();

				System.out.println(turno + " " + nombreAnimal + " " + tipoAnimal + " " + razaAnimal + " " + edadAnimal + " " + causaAnimal);

				VeterinariaControlador.llegadaAnimal(turno, nombreAnimal, tipoAnimal, razaAnimal, edadAnimal, causaAnimal);
				turno++;
				
				System.out.println();
				System.out.println("¿Que desea seguir haciendo?");
				System.out.println("1- Cargar otra Mascota");
				System.out.println("2- Se reviso un animal y se desea cargar observaciones");
				
				continuar = entrada2.nextInt();

			} catch (Exception e) {
				System.out.println();
				System.err.println("-------EL DATO INGRESADO ES INCORRECTO-------");
				System.err.println("-----RESPETE LOS VALORES QUE SE LE PIDE------");
				System.out.println(e.getMessage());
			}
		}
		busquedaDeAnimalDiagnosticado();
	}
	
	private static void busquedaDeAnimalDiagnosticado() {
		Scanner turno = new Scanner(System.in);
		System.out.println("Ingrese Numero de turno");
		int turnoEs = turno.nextInt();
		
		VeterinariaControlador.BusquedaMascota(turnoEs);
		
		animalDiagnosticado(turnoEs);
	}
	
	private static void animalDiagnosticado(int turnoEs) {
		Scanner resultado = new Scanner(System.in);
		System.out.print("Resultado de la revisación es: ");
		String resultadoEs = resultado.nextLine();
		
		Scanner causa = new Scanner(System.in);
		System.out.println("¿Cual es su diagnostico?");
		String causaEs = causa.nextLine();
		
		Scanner medicamentos = new Scanner(System.in);
		System.out.println("Ponga los medicamentos resetados separados por espacio");
		String medicamentosEs = medicamentos.nextLine();
		
		VeterinariaControlador.animalDiagnosticado(turnoEs, resultadoEs, causaEs, medicamentosEs);
		
		inicio();
	}
	
	private static void reporte(){
		System.out.println();
		VeterinariaControlador.reporteFinal();
	}
	
}
