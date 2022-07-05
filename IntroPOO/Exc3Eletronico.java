package IntroPOO;

/*3 Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */

public class Exc3Eletronico {
	String celular = "Galaxy", modelo = "S22 5G", marca = "Samsung";
	
	public void cel() {
		System.out.println("Jogando jogos....");
	}

	public void estado() {
		System.out.println("Celular em uso....");
	}
	
	public String getcel1() {
		String cel = " "+celular+" Modelo: "+modelo+" Marca: "+marca;
		return  cel;
	}
	
	

}
