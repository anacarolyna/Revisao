package IntroPOO;
//objeto
public class Caneta {
	String  cor, modelo;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	void rabiscar() { //void = sem retorno
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		}
		else {
			System.out.println("Estou Rabiscando");
		}
	}
	
	void tampar() { // this = referência ao próprio objt que chamou, sempre que quiser modificar o atributo dentro da própria classe coloque a palavra this 
		this.tampada = true; //this = nome do objeto que chamou o método que no caso é o c1
		
	}
	void destampar() {
		this.tampada = false;
	}
	

	

}
