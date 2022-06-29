package Logica;

import java.util.Scanner;

public class Exercicio5Notas {
	
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

	public static void main(String[] args) {
		//Entrada
		double n1,n2,n3, media, mediapond;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite a nota 3:");
		n3 = leia.nextDouble();
		
		//Conta
		
		media = (n1*2)+(n2*3)+(n3*5) ;
		mediapond = media/10;
		
	   //Saída
		
		System.out.println("A média ponderada é: "+ mediapond);
		
		
	
		
	}

}
