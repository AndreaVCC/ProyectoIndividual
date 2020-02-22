package Electrodomesticos;

/**
 * Clase que define atributos y metodos de Lavadora, clase hija de
 * Electrodomestico
 * 
 * @author Alumno
 * @version 1.0
 */
public class Lavadora extends Electrodomestico {

	// CONSTANTES

	private final int CARGA = 5;

	// ATRIBUTOS

	private int carga;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	/**
	 * Constrcutor con parametro preciobase y peso
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	// METODO GETT

	/**
	 * Metodo que retorna la carga de las lavadoras
	 * 
	 * @return carga de las lavadoras
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo define la carga de las lavadoras
	 * 
	 * @param carga
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	// OTROS METODOS

	/**
	 * Metodo retorna precio final de lavadora si tiene una carga mayor de 30 kg,
	 * aumentara el precio 50 €, sino es así no se incrementara el precio.
	 * 
	 * @return precio final de las lavadoras
	 */
	public double precioFinal() {

		double valorAdicionalLavadora = super.precioFinal();

		if (carga > 30) {
			valorAdicionalLavadora = valorAdicionalLavadora + 50;
		} else {
			valorAdicionalLavadora = super.precioFinal();
		}

		return valorAdicionalLavadora;
	}

	/**
	 * Metodo toString
	 * 
	 * @return informacion de los atributos de Lavadora
	 */
	@Override
	public String toString() {
		return super.toString() + "Lavadora [carga=" + carga + "]";
	}

}
