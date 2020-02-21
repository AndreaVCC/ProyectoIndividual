package Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		
		Lavadora lavadora3 = new Lavadora(); //Por defecto
		Lavadora lavadora2 = new Lavadora(30000, 20);
		Lavadora lavadora1 = new Lavadora(200000, "ROJO", 'A', 40, 7);
		
		Television television1 = new Television(); //Por defecto
		Television television2 = new Television(2342, 89);
		Television television3 = new Television(355, "VERDE", 'D', 678, 22, true);
		
		System.out.println(lavadora1);
		System.out.println(lavadora2);
		System.out.println(lavadora3);

		System.out.println(television1);
		System.out.println(television2);
		System.out.println(television3);

	}

}
