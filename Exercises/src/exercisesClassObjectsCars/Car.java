package exercisesClassObjectsCars;

public class Car {
	
	//Questão 1
	//Criar uma classe para representar um Carro, e instanciar vários Carros
	String name, brand;
	Color color;
	int doors;
	boolean electricWindows, airConditioner, automaticTransmission, electricSteeringWheel;
	double basePrice;
	
	
	//Um construtor que tem como argumento nome, marca, e precoBase. Esse construtor nos dará uma instância básica de carro: 2 portas, cor branca, sem vidros elétricos, sem ar-condicionado, sem câmbio automático, e sem direção elétrica.
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
	
	
	//Um construtor vazio, sem argumentos (como é o default).
	Car(){
		
	}
	

	double priceCalc () {
		
		double price = basePrice;
		
		
		// Cores básicas como “branco”, “azul”, “vermelho”, “preto”, não adicionam custo
		//Qualquer outra cor adiciona R$ 1000 ao preço total do carro
		switch (color) {
		case BRANCA:
		case AZUL:
		case VERMELHA:
		case PRETA:
			break;
		default: price += 1000;
		}
		
		
		//cada opcional (vidro elétrico, ar-condicionado, câmbio automático e direção elétrica) adiciona R$ 1250 ao custo total do carro.
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
		
		//função toString, que nos dê todos os detalhes do carro
		
		String details = "";
		
		details += "Nome: " + name + " - Marca: " + brand + " - Cor: " + color + "\n";
		details += "Quantidade de portas: " + doors + "\n";
		details += "Opcionais: \n";
		details += "Vidros elétricos: " + (electricWindows? "SIM":"NÃO") + "\n";
		details += "Ar condicionado: " + (airConditioner? "SIM":"NÃO") + "\n";
		details += "Câmbio elétrico: " + (electricSteeringWheel? "SIM":"NÃO") + "\n";
		details += "Transmissão automática: " + (automaticTransmission? "SIM":"NÃO") + "\n";

		// inclusive o preço total, através da função calculaPreco (priceCalc)
		details += "Preço final do carro: " + priceCalc() + "\n\n";
		
		return details;
	}

}
