/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters),
 *  e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme sua percep��o. Atributos: String nome; 
 *  String endere�o; String telefone; */
package TreinoPoo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Pessoa(String nome, String endereco, String telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String entereco) {
		this.endereco = entereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void info() {
		System.out.printf("%s ------ %s ------ Tel: %s \n", nome, endereco, telefone);
	}
	
	public void addSobrenome(String sobrenome) {
		this.nome= nome+" "+sobrenome;
	}
	
}
