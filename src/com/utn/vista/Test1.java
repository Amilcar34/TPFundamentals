package com.utn.vista;

import com.utn.controlador.*;

public final class Test1 {

	public static void main(String[] args) {
		
		System.out.print("Estan trabajando los Dres/as: " );
		
		VeterinariaControlador.creoDoctores("Juan", "Felipe", "Nacho", "Luis", "Sofia");
		System.out.println();
		System.out.println();
		
		VeterinariaControlador.llegadaAnimal(1, "jacob", 1, "gran danes",  4, "se choca contra las paredes");
		VeterinariaControlador.llegadaAnimal(2, "fofo", 2, "desconosido", 2, "falta de animo");
		VeterinariaControlador.llegadaAnimal(5, "juni", 1, "Pitbull", 5, "Muerde a los pendejos");
		VeterinariaControlador.llegadaAnimal(3, "lulo", 2, "desconosido", 6, "No come nada");
		VeterinariaControlador.llegadaAnimal(4, "Esculapio", 3, "desconosido", 6, "Morfa zanahoria como un HDP!");
		VeterinariaControlador.llegadaAnimal(6, "leonel", 1, "gran danes",  4, "Esta deprimido");
		VeterinariaControlador.llegadaAnimal(7, "Firulais", 2, "desconosido", 2, "Lo llamo y ni bola");
		VeterinariaControlador.llegadaAnimal(8, "Enrrique", 1, "Pitbull", 5, "No juega");
		VeterinariaControlador.llegadaAnimal(9, "Asrrael", 2, "desconosido", 6, "En la familia creemos que esta sordo");
		VeterinariaControlador.llegadaAnimal(10, "yoni Calabria", 3, "desconosido", 6, "No coje con las conejas");
		VeterinariaControlador.llegadaAnimal(11, "Noe", 1, "gran danes",  4, "No le ladra a los que me vienen a robar pero si a mi");
		VeterinariaControlador.llegadaAnimal(12, "Dante", 2, "desconosido", 2, "falta de animo");
		VeterinariaControlador.llegadaAnimal(13, "Claudio", 1, "Pitbull", 5, "falta de animo");
		VeterinariaControlador.llegadaAnimal(14, "Gallito", 2, "desconosido", 6, "No come nada");
		VeterinariaControlador.llegadaAnimal(15, "Nautilus", 3, "desconosido", 6, "Morfa zanahoria como un HDP!");
		VeterinariaControlador.llegadaAnimal(16, "Yankie", 1, "gran danes",  4, "Esta deprimido");
		VeterinariaControlador.llegadaAnimal(17, "Argentina", 2, "desconosido", 2, "Lo llamo y ni bola");
		VeterinariaControlador.llegadaAnimal(18, "Griselda", 1, "Pitbull", 5, "No juega");
		VeterinariaControlador.llegadaAnimal(19, "Florencia", 2, "desconosido", 6, "falta de animo");
		VeterinariaControlador.llegadaAnimal(20, "Gerrudis", 3, "desconosido", 6, "No coje con las conejas");
		VeterinariaControlador.llegadaAnimal(22, "Menem", 1, "gran danes",  4, "se choca contra las paredes");
		VeterinariaControlador.llegadaAnimal(21, "Chapatin", 2, "desconosido", 2, "falta de animo");
		VeterinariaControlador.llegadaAnimal(23, "De la Vega", 1, "Pitbull", 5, "falta de animo");
		VeterinariaControlador.llegadaAnimal(25, "Batman", 2, "desconosido", 6, "No come nada");
		VeterinariaControlador.llegadaAnimal(24, "Superman", 3, "desconosido", 6, "Morfa zanahoria como un HDP!");
		VeterinariaControlador.llegadaAnimal(26, "Jesica Jones", 1, "gran danes",  4, "Esta deprimido");
		VeterinariaControlador.llegadaAnimal(27, "Kapanga", 2, "desconosido", 2, "Lo llamo y ni bola");
		VeterinariaControlador.llegadaAnimal(29, "Neuquen", 1, "Pitbull", 5, "No juega");
		VeterinariaControlador.llegadaAnimal(30, "Lucas", 2, "desconosido", 6, "falta de animo");
		VeterinariaControlador.llegadaAnimal(28, "Jose Marco Antoño Solis", 3, "desconosido", 6, "No coje con las conejas");
		
		
		VeterinariaControlador.luegoDeLaAtencion(resultado, causa, medicamento);
		
		System.out.println();
		System.out.println("Resumen del dia");
		System.out.println();
		VeterinariaControlador.reporteFinal();
	}


}
