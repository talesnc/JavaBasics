package ExercisesClassObjectsImmobile;

public class RealEstateClassifieds {

	public static void main(String[] args) {
		//Crie uma classe chamada Classificados. Instancie os seguintes imóveis:
		
		//Casa, Imobiliária Falcão, 3 quartos, 1 suíte, 2 banheiros, 120 m², com piscina.
		Immobile house1 = new Immobile("Falcão", 3, 1, 2, 120, true, false);
		
		//Apartamento, Imobiliária Falcão, 15 andares, apartamento no pavimento 8, 3 quartos, 2 suítes, 3 banheiros, 82 m², com elevador.
		Immobile apt1 = new Immobile("Apartamento", "Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		
		//Casa, Imobiliária Altaman, 4 quartos, 2 suítes, 3 banheiros, 240 m², com piscina, quadra e elevador.
		Immobile house2 = new Immobile("Casa", "Altaman", 1, 1, 4, 2, 3, 240, true, true, true);
		
		//Casa, Imobiliária Leblon, 6 quartos, 3 suítes, 5 banheiros, 540 m², com piscina, quadra e elevador.
		Immobile house3 = new Immobile("Casa", "Leblon", 1, 1, 6, 3, 5, 540, true, true, true);
		
		//Apartamento, Imobiliária Alto Branco, 3 andares, apartamento no pavimento 2, 2 quartos, 1 suítes, 2 banheiros, 60 m², sem elevador.
		Immobile apt2 = new Immobile("Apartamento", "Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		
		
		System.out.println(house1);
		System.out.println(apt1);
		System.out.println(house2);
		System.out.println(house3);
		System.out.println(apt2);

	}
	
	

}
