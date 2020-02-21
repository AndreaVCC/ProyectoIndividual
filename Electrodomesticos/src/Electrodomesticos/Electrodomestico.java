package Electrodomesticos;

/**
 * Clase que define los atributos principales
 * @author Alumno
 * @version 1.0
 */
public class Electrodomestico {
	
	//CONSTANTES
	
	private static final double PRECIO_BASE = 100.000;
	private static final String COLOR = "BLANCO";
	private static final char CONSUMO_ENERGETICO = 'F';
	private static final double PESO = 5;

	//ATRIBUTOS

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	//CONSTRCUTORES
	
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
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
	}
	
	/**
	 * 	Constructor con todos lo atributos
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	
	//METODOS GETTERS
	
	/**
	 * 
	 * @return
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * 
	 * @return
	 */
	public double getPeso() {
		return peso;
	}
	
	//OTROS METODOS
	
	/**
	 * Comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
	 * @param letra
	 * @return 
	 */
	private void comprobarConsumoEnergetico(char letra) {
		this.consumoEnergetico = letra;
	}
	
	/**
	 * Comprueba que el color es correcto, sino lo es usa el color por defecto
	 * @param color
	 */
	private void comprobarColor(String color) {
		this.color =color;
	}
	
	/**
	 * según el consumo energético, aumentara su precio, y según su tamaño también.
	 */
	private void precioFinal() {
		
	}
}
