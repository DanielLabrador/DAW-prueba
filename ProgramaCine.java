package entradas;

import java.util.Random;

public class ProgramaCine {

	public static void main(String[] args) {
		// Crear una instancia del sistema de ventas de entradas
		SistemaVentaEntradas sistema = new SistemaVentaEntradas(); // Suponiendo que hay 5 salas

		// Añadir salas con películas de actualidad
		System.out.println("Añadida sala 1: " + sistema.anyadirSala(1, "Dune"));
		System.out.println("Añadida sala 2 " + sistema.anyadirSala(2, "Spider-Man: No Way Home"));
		System.out.println("Añadida sala 3: " + sistema.anyadirSala(3, "The Batman"));
		System.out.println("Añadida sala 4: " + sistema.anyadirSala(4, "Avatar 2"));
		System.out.println("Añadida sala 5: " + sistema.anyadirSala(5, "Black Widow"));
		System.out.println("Añadida sala 6: " + sistema.anyadirSala(6, "Torrente"));

		int numSalasTotales = 5;

		// Simular la venta de entradas
		Random rand = new Random();
		System.out.println();
		System.out.println("*** COMPRANDO ENTRADAS ***");
		for (int sala = 1; sala <= numSalasTotales; sala++) {

			// Se generan 10 entradas por sala
			int totalEntradasComprar = rand.nextInt(10);
			for (int butaca = 1; butaca <= totalEntradasComprar; butaca++) {
				// Simular la venta de la entrada con un número aleatorio de butacas para
				// generar diversidad en datos
				int numButaca = rand.nextInt(50);
				System.out.println("Comprando entrada para sala " + sala + ", butaca " + numButaca + ". Resultado: "
						+ sistema.comprarEntrada(sala, numButaca + 1));

			}
		}


	// System.out.println();
	// 	System.out.println("*** MOSTRANDO CARTELERA ***");
	// 	// Mostrar cartelera actual
	// 	sistema.mostrarCartelera();

	// nuestros cambios
	

		System.out.println();
		System.out.println("*** MOSTRANDO CARTELERA ***");
		// Mostrar cartelera actual
		sistema.mostrarCartelera();

		System.out.println();
		System.out.println("*** MOSTRANDO ENTRADAS VENDIDAS ***");
		sistema.mostrarEntradas();

		// Imprimir el total de recaudación
		System.out.println();
		System.out.println("*** MOSTRANDO RECAUDACION ***");		
		System.out.println("Total recaudación: " + sistema.totalRecaudacion());

		// Imprimir entradas vendidas por cada sala
		System.out.println();
		System.out.println("*** ENTRADAS VENDIDAS POR SALA ***");
		for (int numSala = 1; numSala <= numSalasTotales; numSala++) {
			System.out.println("Entradas vendidas para la sala " + numSala + ": " + sistema.getEntradasVendidasPorSala(numSala));
		}

		// Ejemplo de calcular el precio de algunas butacas
		System.out.println();
		System.out.println("*** EJEMPLO CALCULO DE PRECIOS ***");
		System.out.println("Precio de entrada para butaca 5: " + sistema.calcularPrecioEntrada(5));
		System.out.println("Precio de entrada para butaca 15: " + sistema.calcularPrecioEntrada(15));
		System.out.println("Precio de entrada para butaca 25: " + sistema.calcularPrecioEntrada(25));
	}
}
