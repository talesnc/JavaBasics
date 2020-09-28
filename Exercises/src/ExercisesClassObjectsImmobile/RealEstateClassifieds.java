package ExercisesClassObjectsImmobile;

public class RealEstateClassifieds {

	public static void main(String[] args) {
		//Crie uma classe chamada Classificados. Instancie os seguintes im�veis:
		
		//Casa, Imobili�ria Falc�o, 3 quartos, 1 su�te, 2 banheiros, 120 m�, com piscina.
		Immobile house1 = new Immobile("Falc�o", 3, 1, 2, 120, true, false);
		
		//Apartamento, Imobili�ria Falc�o, 15 andares, apartamento no pavimento 8, 3 quartos, 2 su�tes, 3 banheiros, 82 m�, com elevador.
		Immobile apt1 = new Immobile("Apartamento", "Falc�o", 15, 8, 3, 2, 3, 82, true, false, false);
		
		//Casa, Imobili�ria Altaman, 4 quartos, 2 su�tes, 3 banheiros, 240 m�, com piscina, quadra e elevador.
		Immobile house2 = new Immobile("Casa", "Altaman", 1, 1, 4, 2, 3, 240, true, true, true);
		
		//Casa, Imobili�ria Leblon, 6 quartos, 3 su�tes, 5 banheiros, 540 m�, com piscina, quadra e elevador.
		Immobile house3 = new Immobile("Casa", "Leblon", 1, 1, 6, 3, 5, 540, true, true, true);
		
		//Apartamento, Imobili�ria Alto Branco, 3 andares, apartamento no pavimento 2, 2 quartos, 1 su�tes, 2 banheiros, 60 m�, sem elevador.
		Immobile apt2 = new Immobile("Apartamento", "Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		
		
		System.out.println(house1);
		System.out.println(apt1);
		System.out.println(house2);
		System.out.println(house3);
		System.out.println(apt2);

	}
	
	

}
