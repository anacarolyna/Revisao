package IntroPOO;

/*1 Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informaçõees deste objeto no console.
  */

public class Exc1Cliente {
	// ATRIBUTOS -> CARACTERISTICAS
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	
	//METODOS ACESSORES E MODIFICADORES
	//METODO CONSTRUTOR
	public Exc1Cliente (String primeiro, String meio, String ultimo)//o construtor sempre será o mesmo nome da classe
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	//METODOS -> COMPORTAMENTOS
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+""+nomesDoMeio+""+ultimoNome;
		return nomeCompleto;
	}
	
	
	

}
