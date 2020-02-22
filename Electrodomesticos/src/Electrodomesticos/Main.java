package Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		
        Electrodomestico arrayElectrodomesticos[]=new Electrodomestico[10];
        arrayElectrodomesticos[0]= new Electrodomestico();
        arrayElectrodomesticos[1]= new Electrodomestico(200000, 10);
        arrayElectrodomesticos[2]= new Electrodomestico(200000, "GRIS", 'A', 10);
        arrayElectrodomesticos[3]= new Lavadora();
        arrayElectrodomesticos[4]= new Lavadora(200000, 10);
        arrayElectrodomesticos[5]= new Lavadora(200000, "GRIS", 'A', 10, 70);
        arrayElectrodomesticos[6]= new Television();
        arrayElectrodomesticos[7]= new Television(200000, 15);
        arrayElectrodomesticos[8]= new Television(200000, "GRIS", 'A', 10, 10, true);
        arrayElectrodomesticos[9]= new Television(200000, "VERDE", 'G', 10, 10, true);
        
        for (Electrodomestico i : arrayElectrodomesticos) {
			//System.out.println( i);


        	System.out.println( i.getClass().getSimpleName() + " Precio final es: " + i.precioFinal());
		}
        /*
		
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
		 
		 */
	}

}
