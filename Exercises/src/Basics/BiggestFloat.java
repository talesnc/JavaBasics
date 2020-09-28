package Basics;

import java.util.Locale;
import java.util.Scanner;

public class BiggestFloat {

	public static void main(String[] args) {
		
		//Primeira questão
		//Escreva um programa que recebe do usuário dois valores do tipo ponto flutuante
		//e imprime na tela qual dos dois é maior.
		
		System.out.println("Input the first float number: ");
		Scanner reader = new Scanner(System.in);
		reader.useLocale(Locale.US);
		float firstNumber = reader.nextFloat();
		
		System.out.println("Input the second float number: ");
		float secondNumber = reader.nextFloat();
		
		reader.close();
		
		if(firstNumber > secondNumber) {
			System.out.println("The number " + firstNumber + " is the biggest one");
		} else if(secondNumber > firstNumber) {
			System.out.println("The number " + secondNumber + " is the biggest one");
		} else {
			System.out.println("The numbers are the same");
		}

	}

}
