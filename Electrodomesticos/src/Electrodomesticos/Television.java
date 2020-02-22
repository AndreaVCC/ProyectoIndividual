package Electrodomesticos;

/**
 * Clase que define atributos y metodos de Television, clase hija de
 * Electrodomestico
 * 
 * @author Andrea Carreño
 * @version 1.0
 */
public class Television extends Electrodomestico {

	// CONSTANTES

	private final int PULGADAS = 20;
	private final boolean SINTONIZADOR_TDT = false;

	// ATRIBUTOS

	private int pulgadas;
	private boolean sintonizadorTDT;

	// CONSTRUCTORES

	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	/**
	 * Constructor con dos parametros
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param pulgadas
	 * @param sintonizadorTDT
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.pulgadas = pulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// METODO GETTERS

	/**
	 * Metodo retorna el numero de pulgadas del televisor
	 * 
	 * @return las pulgadas de la television
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * Metodo retorna true o false en caso de que posea o no sintonizadorTDT
	 * 
	 * @return sintonizadorTDT
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// OTROS METODOS

	/**
	 * Metodo retorna precio final de television, si tiene una resolución mayor de
	 * 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT
	 * incorporado, aumentara 50 €.
	 */
	public double precioFinal() {

		double valorAdicionalTv = super.precioFinal();

		if (pulgadas > 40) {
			valorAdicionalTv = (valorAdicionalTv * 30 / 100) + valorAdicionalTv;
		} else {
			valorAdicionalTv = super.precioFinal();
		}

		if (sintonizadorTDT = true) {
			valorAdicionalTv = valorAdicionalTv + 50;
		} else {
			valorAdicionalTv = super.precioFinal();
		}

		return valorAdicionalTv;
	}

	/**
	 * Metodo toString
	 * 
	 * @return informacion de los atributos de televisores
	 */
	@Override
	public String toString() {
		return super.toString() + "Television [pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}

}
