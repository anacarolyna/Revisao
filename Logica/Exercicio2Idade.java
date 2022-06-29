package Logica;

import java.util.Scanner;

/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
 * mostre-a expressa em anos, meses e dias. 
 */

public class Exercicio2Idade {
	public static void main(String[] args) {
		int anos=0, dias, meses;
	
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe sua idade em dias:");
		dias = leia.nextInt();
		
		
		anos = (dias / 365); 
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		
		System.out.println("\n\nA sua idade em anos, meses, dias é: " +anos+", "+dias+", "+meses);
	}

}
