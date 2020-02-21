package Electrodomesticos;

/**
 * 
 * @author Alumno
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

	//METODO GETTERS
	
	/**
	 * 
	 * @return
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * 
	 * @return
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//OTROS METODOS
	
	/**
	 * si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un 
	 * sintonizador TDT incorporado, aumentara 50 €.Recuerda que las condiciones que hemos visto en 
	 * la clase Electrodoméstico también deben afectar al precio.
	 */
	public void precioFinal() {
		
	}

	@Override
	public String toString() {
		return super.toString() + "Television [pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}
	
	

}
