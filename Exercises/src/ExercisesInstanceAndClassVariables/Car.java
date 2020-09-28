package ExercisesInstanceAndClassVariables;

public class Car {
	
	static boolean discount;
	
	String name, brand;
	Color color;
	int doors;
	boolean electricWindows, airConditioner, automaticTransmission, electricSteeringWheel;
	double basePrice;
	
	
	Car(String name, String brand, 
			double basePrice){
		this.name = name;
		this.brand = brand;
		this.basePrice = basePrice;
		this.doors = 2;
		this.color = Color.BRANCA;
		this.electricWindows = false;
		this.airConditioner = false;
		this.automaticTransmission = false;
		this.electricSteeringWheel = false;
	}

	Car(String name, String brand, Color color, int doors, 
			boolean electricWindows, boolean airConditioner, boolean automaticTransmission, boolean electricSteeringWheel, double basePrice){
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.doors = doors;
		this.electricWindows = electricWindows;
		this.airConditioner = airConditioner;
		this.automaticTransmission = automaticTransmission;
		this.electricSteeringWheel = electricSteeringWheel;
		this.basePrice = basePrice;
	}
	
	
	Car(){
		
	}
	

	double priceCalc () {
		
		double price = basePrice;
		
		switch (color) {
		case BRANCA:
		case AZUL:
		case VERMELHA:
		case PRETA:
			break;
		default: price += 1000;
		}
		

		if(this.electricWindows) {
			price += 1250;
		}
		if(this.airConditioner) {
			price += 1250;
		}
		if(this.electricSteeringWheel) {
			price += 1250;
		}
		if(this.automaticTransmission) {
			price += 1250;
		}
		
		if(Car.discount) {
			price = price * 0.9;
		}

		return price;
	}
	

	public String toString() {
		
		String details = "";
		
		details += "Nome: " + name + " - Marca: " + brand + " - Cor: " + color + "\n";
		details += "Quantidade de portas: " + doors + "\n";
		details += "Opcionais: \n";
		details += "Vidros el�tricos: " + (electricWindows? "SIM":"N�O") + "\n";
		details += "Ar condicionado: " + (airConditioner? "SIM":"N�O") + "\n";
		details += "C�mbio el�trico: " + (electricSteeringWheel? "SIM":"N�O") + "\n";
		details += "Transmiss�o autom�tica: " + (automaticTransmission? "SIM":"N�O") + "\n";
		details += "Pre�o final do carro: " + priceCalc() + " - Promo��o: " + (discount? "SIM":"N�O") + "\n\n";
		
		return details;
	}

}

