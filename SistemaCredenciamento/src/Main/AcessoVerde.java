package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AcessoVerde extends AcessoGeral {


	Scanner ler= new Scanner(System.in);
	Collection<String> conjuntoVerde = new ArrayList<String>();
	public AcessoVerde(String nome, String cpf, String telefone) 
	{
		super(nome, cpf, telefone);
		super.setCor("Verde");
		super.setTipoDeAcesso("Área de Comércio");
		conjuntoVerde.add(nome);
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
