package exercisesClassObjectsCars;

public class Car {
	
	//Quest�o 1
	//Criar uma classe para representar um Carro, e instanciar v�rios Carros
	String name, brand;
	Color color;
	int doors;
	boolean electricWindows, airConditioner, automaticTransmission, electricSteeringWheel;
	double basePrice;
	
	
	//Um construtor que tem como argumento nome, marca, e precoBase. Esse construtor nos dar� uma inst�ncia b�sica de carro: 2 portas, cor branca, sem vidros el�tricos, sem ar-condicionado, sem c�mbio autom�tico, e sem dire��o el�trica.
	Car(String name, String brand, double basePrice){
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
	
	
	//Um construtor que tem todos os atributos da classe como argumento.
	Car(String name, String brand, Color color, int doors, boolean electricWindows, boolean airConditioner, boolean automaticTransmission, boolean electricSteeringWheel, double basePrice){
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
	
	
	//Um construtor vazio, sem argumentos (como � o default).
	Car(){
		
	}
	

	double priceCalc () {
		
		double price = basePrice;
		
		
		// Cores b�sicas como �branco�, �azul�, �vermelho�, �preto�, n�o adicionam custo
		//Qualquer outra cor adiciona R$ 1000 ao pre�o total do carro
		switch (color) {
		case BRANCA:
		case AZUL:
		case VERMELHA:
		case PRETA:
			break;
		default: price += 1000;
		}
		
		
		//cada opcional (vidro el�trico, ar-condicionado, c�mbio autom�tico e dire��o el�trica) adiciona R$ 1250 ao custo total do carro.
		if(this.electricWindows == true) {
			price += 1250;
		}
		if(this.airConditioner == true) {
			price += 1250;
		}
		if(this.electricSteeringWheel == true) {
			price += 1250;
		}
		if(this.automaticTransmission == true) {
			price += 1250;
		}
		
		return price;
	}
	
	
	
	public String toString() {
		
		//fun��o toString, que nos d� todos os detalhes do carro
		
		String details = "";
		
		details += "Nome: " + name + " - Marca: " + brand + " - Cor: " + color + "\n";
		details += "Quantidade de portas: " + doors + "\n";
		details += "Opcionais: \n";
		details += "Vidros el�tricos: " + (electricWindows? "SIM":"N�O") + "\n";
		details += "Ar condicionado: " + (airConditioner? "SIM":"N�O") + "\n";
		details += "C�mbio el�trico: " + (electricSteeringWheel? "SIM":"N�O") + "\n";
		details += "Transmiss�o autom�tica: " + (automaticTransmission? "SIM":"N�O") + "\n";

		// inclusive o pre�o total, atrav�s da fun��o calculaPreco (priceCalc)
		details += "Pre�o final do carro: " + priceCalc() + "\n\n";
		
		return details;
	}

}
