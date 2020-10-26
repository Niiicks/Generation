package Main;


import java.util.Scanner;

public class AcessoAzul extends AcessoGeral{

	Scanner ler= new Scanner(System.in);
	
	public AcessoAzul(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Azul");
		super.setTipoDeAcesso("Backstage");
		
	}
	
	public void imprimeInfo()
	{
		System.out.println(
				"\nNome: " + super.getNome() + 
				"\nCPF: " + super.getCpf() + 
				"\nTelefone: " + super.getTelefone() + 
				"\nCartão de acesso: " + super.getCor() +
				"\nTipo de acesso: " + super.getTipoDeAcesso()
				);			
	}

}
