package Electrodomesticos;

/**
 * Clase que define los atributos principales de los electrodomesticos
 * 
 * @author Andrea Carre�o
 * @version 1.0
 */
public class Electrodomestico {

	// CONSTANTES

	private static final double PRECIO_BASE = 100000;
	private static final String COLOR = "BLANCO";
	private static final char CONSUMO_ENERGETICO = 'F';
	private static final double PESO = 5;

	// ATRIBUTOS

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	// CONSTRCUTORES

	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	/**
	 * Constructor con dos parametros
	 * 
	 * @param precioBase Precio base de Electrodomestico
	 * @param peso Peso de Electrodomestico
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
	}

	/**
	 * Constructor con todos lo atributos
	 * 
	 * @param precioBase Precio base de Electrodomestico
	 * @param color Color de Electrodomestico
	 * @param consumoEnergetico Consumo energetico de Electrodomestico
	 * @param peso Peso de Electrodomestico
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// METODOS GETTERS

	/**
	 * Metodo retorna precio base del electrodomestico
	 * 
	 * @return precio base de electrodomestico
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Metodo retorna color del electrodomestico
	 * 
	 * @return color del electrodomestico
	 */
	protected String getColor() {
		return color;
	}

	/**
	 * Metodo retorna consumo energetico del electrodomestico
	 * 
	 * @return consumo energetico del electrodomestico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Metodo retorna el peso del electrodomestico
	 * 
	 * @return peso de electrodomestico
	 */
	public double getPeso() {
		return peso;
	}

	// OTROS METODOS

	/**
	 * Comprueba que la letra es correcta, sino es correcta usara la letra por
	 * defecto
	 * 
	 * @param letra del consumo energetico
	 * @return la letra del consumo energetico
	 */

	@SuppressWarnings("unused")
	private void comprobarConsumoEnergetico(char letra) {
		this.consumoEnergetico = letra;

		switch (letra) {
		case 'A': {
			this.consumoEnergetico = letra;
		}
		case 'B': {
			this.consumoEnergetico = letra;
		}
		case 'C': {
			this.consumoEnergetico = letra;
		}
		case 'D': {
			this.consumoEnergetico = letra;
		}
		case 'E': {
			this.consumoEnergetico = letra;
		}
		case 'F': {
			this.consumoEnergetico = letra;
		}
		default:
			this.consumoEnergetico = CONSUMO_ENERGETICO;
		}
	}

	/**
	 * Comprueba que el color es correcto, sino lo es usa el color por defecto
	 * 
	 * @param color del electrodomestico
	 */
	public void comprobarColor(String color) {

		String listaColores[] = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };

		for (String indiceColor : listaColores) {
			if (indiceColor.equals(color)) {
				this.color = color;
			} else {
				this.color = COLOR;
			}
		}

	}

	/**
	 * Metodo retorna aumento de precio seg�n el consumo energ�tico y tama�o
	 * 
	 * @return la suma del precio base con el valor adicional del electrodomestico
	 */
	public double precioFinal() {
		double valorAdicional = 0;

		switch (consumoEnergetico) {
		case 'A': {
			valorAdicional = valorAdicional + 100;
		}
		case 'B': {
			valorAdicional = valorAdicional + 80;
		}
		case 'C': {
			valorAdicional = valorAdicional + 60;
		}
		case 'D': {
			valorAdicional = valorAdicional + 50;
		}
		case 'E': {
			valorAdicional = valorAdicional + 30;
		}
		case 'F': {
			valorAdicional = valorAdicional + 10;
		}
		}

		if (peso > 0 && peso <= 19) {
			valorAdicional = valorAdicional + 10;
		} else if (peso >= 20 && peso <= 49) {
			valorAdicional = valorAdicional + 50;
		} else if (peso >= 50 && peso <= 79) {
			valorAdicional = valorAdicional + 80;
		} else if (peso >= 80) {
			valorAdicional = valorAdicional + 100;
		} else {
			valorAdicional = 0;
		}
		return valorAdicional + precioBase;
	}

	/**
	 * Metodo toString
	 * 
	 * @return informacion de los atributos de electrodomesticos
	 */
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
