package Basics;

import java.util.Scanner;

public class QntParesPositivos {

	public static void main(String[] args) {
		//Quinta questão
		//Escreva um programa que receba como entrada 25 números e exiba a quantidade de números que são pares e positivos .
		
		Scanner reader = new Scanner(System.in);
		
		int evenPositives = 0;
		
		for(int i = 0; i < 25; i++) {
			int number = reader.nextInt();
			
			if (number > 0 && number % 2 == 0) {
				evenPositives ++;
			}
		}
		
		reader.close();
		
		System.out.println("A quantidade de números pares e positivos foi de: " + evenPositives);

	}

}
