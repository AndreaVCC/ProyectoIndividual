package Electrodomesticos;

/**
 * Define atributos y metodos de Lavadora, clase hija de Electrodomestico 
 * @author Alumno
 * @version 1.0
 */
public class Lavadora extends Electrodomestico{
	
	//CONSTANTES
	
	private final int CARGA = 5;
	
	//ATRIBUTOS
	
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
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	/**
	 * Constructor con todos los parametros 
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

	//METODO GETT
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	//OTROS METODOS
	
	/**
	 *  si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. 
	 *  Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la 
	 *  clase Electrodoméstico también deben afectar al precio.
	 * @return 
	 */
	public double precioFinal() {
		return super.precioFinal();
	}

	@Override
	public String toString() {
		return super.toString() + "Lavadora [carga=" + carga + "]";
	}
	
	
}
