package com.utn.vista;

import java.util.*;

import com.utn.controlador.VeterinariaControlador;

public final class Test2 {

	public static void main(String[] args) {

		System.out.print("Estan trabajando los Dres/as: " );
		VeterinariaControlador.creoDoctores("Juan", "Felipe", "Nacho", "Luis", "Sofia");
		System.out.println();
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el nombre del animal");
		String nombreAnimal = entrada.nextLine();
		
		System.out.println("Intrudocue la opcion numerica al animal que se va a tender");
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
		
		//System.out.println(nombreAnimal + " "+ tipoAnimal + " "+ razaAnimal + " "+ edadAnimal + " "+ causaAnimal);
		
		VeterinariaControlador.llegadaAnimal(nombreAnimal, tipoAnimal, razaAnimal, edadAnimal, causaAnimal);
		
		
	}

}
