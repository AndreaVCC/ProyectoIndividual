package Electrodomesticos;

/**
 * Clase que ejecuta el proyecto
 * 
 * @author Andrea Carreño
 * @version 1.0
 */
public class Main {
	
	/**
	 * Metodo que ejecuta la prueba de la clase Tablero
	 * 
	 * @param args es un arreglo de tipo String de la linea de comandos
	 */
	public static void main(String[] args) {

		Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[10];
		arrayElectrodomesticos[0] = new Electrodomestico();
		arrayElectrodomesticos[1] = new Electrodomestico(200000, 10);
		arrayElectrodomesticos[2] = new Electrodomestico(200000, "GRIS", 'A', 10);
		arrayElectrodomesticos[3] = new Lavadora();
		arrayElectrodomesticos[4] = new Lavadora(200000, 10);
		arrayElectrodomesticos[5] = new Lavadora(200000, "GRIS", 'A', 10, 70);
		arrayElectrodomesticos[6] = new Television();
		arrayElectrodomesticos[7] = new Television(200000, 15);
		arrayElectrodomesticos[8] = new Television(200000, "GRIS", 'A', 10, 10, true);
		arrayElectrodomesticos[9] = new Television(200000, "VERDE", 'G', 10, 10, true);

		System.out.println(" ");
		System.out.println("------------------PRECIO FINAL------------------");
		System.out.println(" ");

		for (Electrodomestico i : arrayElectrodomesticos) {
			// System.out.println( i);

			System.out.println(i.getClass().getSimpleName() + " Precio final: $" + i.precioFinal());

		}

		double totalLavadora = 0;
		double totalTelevisores = 0;
		double totalElectrodomesticos = 0;

		for (Electrodomestico j : arrayElectrodomesticos) {
			if (j instanceof Lavadora) {
				totalLavadora = totalLavadora + j.precioFinal();
			} else if (j instanceof Television) {
				totalTelevisores = totalTelevisores + j.precioFinal();
			} else if (j instanceof Electrodomestico) {
				totalElectrodomesticos = totalElectrodomesticos + j.precioFinal();
			}
		}

		double total = totalElectrodomesticos + totalLavadora + totalTelevisores;
		System.out.println(" ");
		System.out.println("----------------------SUMAS----------------------");
		System.out.println(" ");
		System.out.println("Precio de todas las Lavadoras: $" + totalLavadora);
		System.out.println("Precio de todos los Televisores: $" + totalTelevisores);
		System.out.println("Precio de todos los Electrodomesticos: $" + totalElectrodomesticos);

		System.out.println("TOTAL: $" + total);

		/*
		 * 
		 * Lavadora lavadora3 = new Lavadora(); //Por defecto Lavadora lavadora2 = new
		 * Lavadora(30000, 20); Lavadora lavadora1 = new Lavadora(200000, "ROJO", 'A',
		 * 40, 7);
		 * 
		 * Television television1 = new Television(); //Por defecto Television
		 * television2 = new Television(2342, 89); Television television3 = new
		 * Television(355, "VERDE", 'D', 678, 22, true);
		 * 
		 * System.out.println(lavadora1); System.out.println(lavadora2);
		 * System.out.println(lavadora3);
		 * 
		 * System.out.println(television1); System.out.println(television2);
		 * System.out.println(television3);
		 * 
		 */
	}

}
