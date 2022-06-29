package Logica;

//import java.util.Mat

public class Exercicio4NumerosInt {
	
/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:*/

	public static void main(String[] args) {
       int A=5, B=2, C=7, R, S, D;
       
       R = (A + B)* Math.getExponent(2);
       S= (B + C) * Math.getExponent(2);
       
       D = (R + S) / 2;
       
       System.out.println(D);
		
	}

}
