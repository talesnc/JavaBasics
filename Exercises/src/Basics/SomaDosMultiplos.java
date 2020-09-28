package Basics;

import java.util.Scanner;

public class SomaDosMultiplos {

	public static void main(String[] args) {
		//Sexta questão
		//Escreva um programa que receba como entrada 50 números e exiba a soma dos que são múltiplos de 3.
		
		Scanner reader = new Scanner(System.in);
		
		int sumMultiples = 0;
		
		for(int i = 0; i < 50; i++) {
			int number = reader.nextInt();
			
			if (number % 3 == 0) {
				sumMultiples += number;
			}
		}
		
		reader.close();
		
		System.out.println("A soma dos múltiplos de 3 é igual a " + sumMultiples);

	}

}
