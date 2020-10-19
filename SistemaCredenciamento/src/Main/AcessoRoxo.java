//Com esse acesso o colaborador vai ter acesso fora do horário de evento, para montagem, organização e etc.
package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AcessoRoxo extends AcessoGeral{

	Scanner ler= new Scanner(System.in);
	Collection<String> conjuntoRoxo = new ArrayList<String>();
	
	public AcessoRoxo(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Roxo");
		super.setTipoDeAcesso("Infraestrutura");
		conjuntoRoxo.add(nome);
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
