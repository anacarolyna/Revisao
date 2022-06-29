package IntroPOO;

/*2 Crie uma classe aviao e apresente os atributos e metodos referentes
esta classe, em seguida crie um objeto aviao, defina as instancias deste
objeto e apresente as informaçoes deste objeto no console.
*/

public class Exc2Aviao {
	// ATRIBUTOS -> CARACTERISTICAS
	String cor = "Azul";
	double tamanho = 70;
	int capacidade = 400;
	
	//METODOS
	public void entrada() {
		System.out.println("Viagem....");
	}
	public void estado() {
		System.out.println("Se preparando para a decolagem....");
	}
	
	public String getaviaoViajar() {
		String aviaoViajar = "Cor do avião: " + cor + " Tamanho:" + tamanho + " Capacidade: " + capacidade + " pessoas";
		return aviaoViajar;
	}

	
	

}
