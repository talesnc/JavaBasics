package Basics;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		//Sétima questão
		//Escreva um programa que receba como entrada vários números, até que seja informado o valor 100, e exiba a média dos números pares.
		
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		int countEvens = 0;
		int number = 0;
		
		while (number != 100){
			System.out.println("Digite um número (100 para sair)");
			number = reader.nextInt();

			if (number % 2 == 0 && number != 100) {
				sum += number;
				countEvens ++;
				} 
			
		}
		
		double average = sum / countEvens;
		
		reader.close();
		
		System.out.println("A média dos números pares é iagual a " + average);

	}

}
