package Basics;

import java.util.Locale;
import java.util.Scanner;

public class AverageFloats {

	public static void main(String[] args) {
		
		//Segunda Quest�o
		//Escreva um programa que recebe do usu�rio 3 valores do tipo ponto flutuante
		//e imprime na tela a m�dia aritm�tica destes n�meros.
		
		System.out.println("Input the first float number:");
		Scanner reader = new Scanner(System.in);
		reader.useLocale(Locale.US);
		float firstNumber = reader.nextFloat();
		
		System.out.println("Input the second float number:");
		float secondNumber = reader.nextFloat();
		
		System.out.println("Input the third float number:");
		float thirdNumber = reader.nextFloat();
		
		reader.close();
		
		float average = (firstNumber + secondNumber + thirdNumber) / 3;
		
		System.out.println("The average between " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is equal to " + average);

	}

}
