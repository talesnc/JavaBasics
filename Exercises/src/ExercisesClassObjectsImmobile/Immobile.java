package ExercisesClassObjectsImmobile;

public class Immobile {
	
	//Quest�o 2
	//Criar uma classe para representar um Im�vel, e instanciar v�rios Im�veis
	
	String type, realEstate;
	int floorCount, floor, bedrooms, suites, bathrooms, sqrMeters;
	boolean elevator, pool, court;
	
	
	//Um construtor que servir� para instanciarmos casa que tem como argumentos:
	//imobili�ria, n�mero de quartos, n�mero de su�tes, n�mero de banheiros, �rea em metros quadrados, a exist�ncia de piscina, e a exist�ncia de quadra.
	//Nesse construtor, a vari�vel tipo sempre receber� a String �casa�.
	Immobile(String realEstate, int bedrooms, int suites, int bathrooms, int sqrMeters, boolean pool, boolean court) {
		
		this.type = "Casa";
		this.realEstate = realEstate;
		this.floorCount = 1;
		this.floor = 1;
		this.bedrooms = bedrooms;
		this.suites = suites;
		this.bathrooms = bathrooms;
		this.sqrMeters = sqrMeters;
		this.elevator = false;
		this.pool = pool;
		this.court = court;
	}
	
	
	//Um construtor que servir� para instanciarmos apartamentos que tem como argumentos:
	//imobili�ria, n�mero de pavimentos, pavimento, n�mero de quartos, n�mero de su�tes, n�mero de banheiros
	//�rea em metros quadrados, a exist�ncia de elevador, a exist�ncia de piscina, e a exist�ncia de quadra.
	Immobile(String type, String realEstate, int floorCount, int floor, int bedrooms, int suites, int bathrooms, int sqrMeters, boolean elevator, boolean pool, boolean court) {
		this.type = type;
		this.realEstate = realEstate;
		this.floorCount = floorCount;
		this.floor = floor;
		this.bedrooms = bedrooms;
		this.suites = suites;
		this.bathrooms = bathrooms;
		this.sqrMeters = sqrMeters;
		this.elevator = elevator;
		this.pool = pool;
		this.court = court;
	}
	
	
	//A classe im�vel deve ter uma fun��o chamada calculaPreco
	double priceCalc() {
		
		//Cada metro quadrado custa R$ 5000
		double price = sqrMeters * 5000;
		
		//Se for apartamento, quanto mais alto for o pavimento, mais caro ser�: a partir do quinto andar, R$2000 � adicionado por pavimento
		if(type.equals("Apartamento")) {
			if(floorCount > 5) {
				price += (floorCount - 5) * 2000;
			}
		}
		
		//A exist�ncia de elevador, piscina e quadra adiciona R$ 2500, cada uma, ao pre�o final.
		if(elevator) {
			price += 2500;
		}
		if(pool) {
			price += 2500;
		}
		if(court) {
			price += 2500;
		}
		
		return price;
	}
	
	public String toString() {
		
		String details = "";
		
		details += "Imobili�ria: " + realEstate + "\n";		
		details += "Tipo de im�vel: " + type + "\n";
		
		if(type.equals("Apartamento")) {
			details += "N�mero de pavimentos: " + floorCount + " - Pavimento: " + floor + "\n";
		}
		
		details += "Quartos: " + bedrooms + " - Su�tes: " + suites + " - Banheiros: " + bathrooms + "\n";
		details += "�rea do im�vel: " + sqrMeters + "m�" + "\n";
		details += "Tem elevador: " + (elevator? "SIM":"N�O") + "\n";
		details += "Tem piscina: " + (pool? "SIM":"N�O") + "\n";
		details += "Tem quadra: " + (court? "SIM":"N�O") + "\n";
		details += "Pre�o do im�vel: " + priceCalc() + "\n\n";
		
		return details;
	}
	
}
