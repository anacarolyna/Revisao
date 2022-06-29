package Logica;

import java.util.Scanner;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */

public class Exercicio1Idade {
	public static void main(String[] args) {
	int anos, dias, meses;
	int dias_ano = 365, dias_mes= 30;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Informe sua idade em anos:");
	anos = leia.nextInt();
	
	System.out.println("Em meses:");
	meses = leia.nextInt();
	
	System.out.println("Em dias:");
	dias = leia.nextInt();
	
	dias += (anos * dias_ano) + (meses * dias_mes);
	
	System.out.println("\n\nA sua idade em dias é " + dias);
	}
	
	

}
