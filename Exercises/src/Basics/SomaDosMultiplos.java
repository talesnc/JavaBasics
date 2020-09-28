package Basics;

import java.util.Scanner;

public class SomaDosMultiplos {

	public static void main(String[] args) {
		//Sexta quest�o
		//Escreva um programa que receba como entrada 50 n�meros e exiba a soma dos que s�o m�ltiplos de 3.
		
		Scanner reader = new Scanner(System.in);
		
		int sumMultiples = 0;
		
		for(int i = 0; i < 50; i++) {
			int number = reader.nextInt();
			
			if (number % 3 == 0) {
				sumMultiples += number;
			}
		}
		
		reader.close();
		
		System.out.println("A soma dos m�ltiplos de 3 � igual a " + sumMultiples);

	}

}
