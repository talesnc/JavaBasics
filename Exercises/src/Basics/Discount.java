package Basics;

import java.util.Locale;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		//Terceira Quest�o
		//Escreva um programa que recebe do usu�rio o nome do produto, e seu pre�o(Ganha desconto de acordo com pre�o).
		//Ao final, seu programa deve imprimir o nome do produto e pre�o com desconto.
		
		System.out.println("Input the product name:");
		Scanner reader = new Scanner(System.in);
		String productName = reader.nextLine();
		
		System.out.println("Input the " + productName + " price:");
		reader.useLocale(Locale.US);
		double productPrice = reader.nextDouble();
		
		reader.close();
		
		if(productPrice < 0.0) {
			System.out.println("Pre�o incorreto");
		}else if(productPrice < 100.0) {
			double discountedPrice = productPrice * 0.95;
			System.out.println("Congratulation, you received a 5% discount on your purchase!");
			System.out.println(productName + " - " + discountedPrice);
		}else if(productPrice < 500.0) {
			double discountedPrice = productPrice * 0.90;
			System.out.println("Congratulation, you received a 10% discount on your purchase!");
			System.out.println(productName + " - " + discountedPrice);
		}else {
			double discountedPrice = productPrice * 0.85;
			System.out.println("Congratulation, you received a 15% discount on your purchase!");
			System.out.println(productName + " - " + discountedPrice);
		}
	}

}
