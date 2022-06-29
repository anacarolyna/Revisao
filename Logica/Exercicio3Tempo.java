package Logica;

import java.util.Scanner;

public class Exercicio3Tempo {

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
* em segundos e mostre-o expresso em horas, minutos e segundos. */
	
	public static void main(String[] args) {
	double segundos, horas, minutos;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Informe a duração do evento em segundos:");
	segundos = leia.nextDouble();
	
	horas = (segundos / 3600); // segundos em uma hora(3600)
	minutos = (segundos % 3600) / 60; //resto da divisão para saber os min
	segundos =  (segundos % 3600) % 60;
	
	System.out.println("A duração do evento foi de: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
	

	
	

	}

}
