package IntroPOO;

public class CanetaObjt {

	public static void main(String[] args) {
	 Caneta c1 = new Caneta();
	 c1.cor = "Azul";
	 c1.ponta = 0.5f;// refência a atributo
	 c1.tampar(); //referência a método
	 
     c1.status(); 
     c1.rabiscar();
     
     Caneta c2 = new Caneta();
     c2.modelo = "Hostnet";
     c2.cor = "Preta";
     c2.destampar();
     c2.status();
     c2.rabiscar();
     
     //duas instâncias c1 e c2
     
	}

}
