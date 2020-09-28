package exercisesClassObjectsCars;

public class CarStore {
	
	public static void main(String[]args) {
		
		//Fiat P�lio b�sico, de pre�o b�sico R$ 35000
		Car palio1 = new Car("P�lio", "Fiat", 35000.0);
		
		//Fiat P�lio b�sico com cor prateada, de pre�o b�sico R$ 35000
		Car palio2 = new Car("P�lio", "Fiat", Color.PRATA, 2, false, false, false, false, 35000.0);
		
		//Honda Civic completo, de pre�o b�sico R$110000
		Car civic = new Car("Civic", "Honda", Color.PRATA, 4, true, true, true, true, 110000);
		
		//Toyota Corolla com vidro, dire��o e ar, de pre�o b�sico R$110000
		Car corolla = new Car("Corolla", "Toyota", Color.VERMELHA, 4, true, true, false, true, 110000.0);
		
		//Volkswagen Gol completo, de pre�o b�sico R$ 55000 (use o construtor vazio)
		Car gol = new Car();
		
		gol.name = "Gol";
		gol.brand = "Volkswagen";
		gol.color = Color.VERMELHA;
		gol.doors = 4;
		gol.electricWindows = true;
		gol.airConditioner = true;
		gol.automaticTransmission = true;
		gol.electricSteeringWheel = true;
		gol.basePrice = 55000.0;
		
		System.out.println(palio1);
		System.out.println(palio2);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
		
	}

}
