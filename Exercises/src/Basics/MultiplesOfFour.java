package Basics;

import java.util.Locale;
import java.util.Scanner;

public class MultiplesOfFour {

	public static void main(String[] args) {
		
		// Quarta quest�o
		//Escreva um programa para receber como entrada dois n�meros e exibir a quantidade de m�ltiplos de 4 entre eles
		//(os extremos do intervalo n�o devem ser considerados).
		
		System.out.println("Input the first number: ");
		Scanner reader = new Scanner(System.in);
		int firstNumber = reader.nextInt();
		
		System.out.println("Input the second number: ");
		int secondNumber = reader.nextInt();
		
		int bigger = 0;
		int smaller = 0;
		
		if(firstNumber > secondNumber) {
			bigger = firstNumber;
			smaller = secondNumber;
		}else {
			bigger = secondNumber;
			smaller = firstNumber;
		}
		
		int multiples = 0;
		int i = smaller + 1;
		
		while(i < bigger) {
			if(i % 4 == 0) {
				multiples += 1;
			}
			i ++;
			
		}
		
		System.out.println("There are " + multiples + " multiples of 4 between " + smaller + " and " + bigger);

	}

}
