package IntroPOO;

public class Borracha {
	String marca, tamanho, espessura;
	boolean apagando;
	
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Espessura: " + this.espessura);
		System.out.println("Está apagando? " + this.apagando);
		
	}
	
	void apagar() {
		if (this.apagando == true ) {
			System.out.println("Estou apagando");
		}
		else {
			System.out.println("Não estou apagando");
		}
		
	}
	
	void emuso() {
		this.apagando = true;
		
	}
	
	void semusar() {
		this.apagando = false;
	}
	

}
