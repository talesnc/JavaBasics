package ExercisesClassObjectsImmobile;

public class Immobile {
	
	//Questão 2
	//Criar uma classe para representar um Imóvel, e instanciar vários Imóveis
	
	String type, realEstate;
	int floorCount, floor, bedrooms, suites, bathrooms, sqrMeters;
	boolean elevator, pool, court;
	
	
	//Um construtor que servirá para instanciarmos casa que tem como argumentos:
	//imobiliária, número de quartos, número de suítes, número de banheiros, área em metros quadrados, a existência de piscina, e a existência de quadra.
	//Nesse construtor, a variável tipo sempre receberá a String “casa”.
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
	
	
	//Um construtor que servirá para instanciarmos apartamentos que tem como argumentos:
	//imobiliária, número de pavimentos, pavimento, número de quartos, número de suítes, número de banheiros
	//área em metros quadrados, a existência de elevador, a existência de piscina, e a existência de quadra.
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
	
	
	//A classe imóvel deve ter uma função chamada calculaPreco
	double priceCalc() {
		
		//Cada metro quadrado custa R$ 5000
		double price = sqrMeters * 5000;
		
		//Se for apartamento, quanto mais alto for o pavimento, mais caro será: a partir do quinto andar, R$2000 é adicionado por pavimento
		if(type.equals("Apartamento")) {
			if(floorCount > 5) {
				price += (floorCount - 5) * 2000;
			}
		}
		
		//A existência de elevador, piscina e quadra adiciona R$ 2500, cada uma, ao preço final.
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
		
		details += "Imobiliária: " + realEstate + "\n";		
		details += "Tipo de imóvel: " + type + "\n";
		
		if(type.equals("Apartamento")) {
			details += "Número de pavimentos: " + floorCount + " - Pavimento: " + floor + "\n";
		}
		
		details += "Quartos: " + bedrooms + " - Suítes: " + suites + " - Banheiros: " + bathrooms + "\n";
		details += "Área do imóvel: " + sqrMeters + "m²" + "\n";
		details += "Tem elevador: " + (elevator? "SIM":"NÃO") + "\n";
		details += "Tem piscina: " + (pool? "SIM":"NÃO") + "\n";
		details += "Tem quadra: " + (court? "SIM":"NÃO") + "\n";
		details += "Preço do imóvel: " + priceCalc() + "\n\n";
		
		return details;
	}
	
}
