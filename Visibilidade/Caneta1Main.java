package Visibilidade;

import IntroPOO.Caneta;

public class Caneta1Main {

	public static void main(String[] args) {
		Caneta1 c1 = new Caneta1();
		 c1.modelo = "BIC";
		 c1.cor = "Azul";
		 //c1.ponta = 0.5;// referência a atributo
		 c1.carga = 80; //referência a método
		 //c1.tampada = true;
		 c1.destampar();
	     c1.status(); 
	     c1.rabiscar();
	    

	}

}
