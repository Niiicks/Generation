package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) 
	{
		Scanner ler= new Scanner(System.in);
		
		String nome;
		String telefone;
		String cpf;
		int opcao;
		int opc;
		int sair = 1 ;
		int op = 0, adm = 0;
		
		Collection<String> conjuntoRoxo = new ArrayList<String>();
		Collection<String> conjuntoVerde = new ArrayList<String>();
		Collection<String> conjuntoAzul = new ArrayList<String>();
		
		conjuntoRoxo.add("Joao");
		conjuntoRoxo.add("Estela");
		conjuntoRoxo.add("Felipe");
		
		conjuntoVerde.add("Jussara");
		conjuntoVerde.add("Winderson");
		
		conjuntoAzul.add("Elisete");
		
		System.out.println("Seja bem vindo!");
		do {
		System.out.println("\n[1] Página de cadastro");
		System.out.println("[2] Página de Admin");
		opc = ler.nextInt();
		if(opc ==1) {
		do {
			
			System.out.println(" ");
			System.out.println("Primeiramente, nos diga sua profissăo: ");
			System.out.println("[1] Artista");
			System.out.println("[2] Maquiador");
			System.out.println("[3] Produçăo");
			System.out.println("[4] Suporte Técnico");
			System.out.println("[5] Segurança");
			System.out.println("[6] Manutençăo");
			System.out.println("[7] Comerciante/Vendedor");
			System.out.print("Digite aqui:");
			opcao = ler.nextInt();
			
		
		System.out.println(" ");
		System.out.print("Insira seu nome: ");
		nome = ler.next();
		System.out.print("Insira seu CPF: ");
		cpf = ler.next();
		System.out.print("Insira seu telefone: ");
		telefone = ler.next();
		
		switch (opcao) {
			case 1: {
				cadastrarAzul(nome,cpf,telefone);
				conjuntoAzul.add(nome);
				break;
			}
			case 2: {
				cadastrarAzul(nome,cpf,telefone);
				conjuntoAzul.add(nome);
				break;
			}
			case 3: {
				cadastrarAzul(nome,cpf,telefone);
				conjuntoAzul.add(nome);
				break;
			}
			case 4: {
				cadastrarRoxo(nome,cpf,telefone);
				conjuntoRoxo.add(nome);
				break;
			}
			case 5: {
				cadastrarRoxo(nome,cpf,telefone);
				conjuntoRoxo.add(nome);
				break;
			}
			case 6: {
				cadastrarRoxo(nome,cpf,telefone);
				conjuntoRoxo.add(nome);
				break;
			}
			case 7: {
				cadastrarVerde(nome,cpf,telefone);
				conjuntoVerde.add(nome);
				break;
			}
			
		}
		System.out.println("\n Deseja realizar outro cadastro?[1 - sim/2 - nao]");
		sair = ler.nextInt();
		}while(sair == 1);
		
		}else {
			System.out.println("Bem vindo[a] ao sistema de administração de acessos!");
			System.out.println("Digite a opção desejada: ");
			System.out.println("[1] Consultar todas credenciais.");
			System.out.println("[2] Consultar credencial específica.");
			System.out.println("[3] Zerar uma lista de acessos.");
			System.out.println("[4] Zerar todas credenciais de acessos.");
			
			adm = ler.nextInt();
			switch(adm) {
			case 1:
				System.out.println("Acesso Azul: "+conjuntoAzul);
				System.out.println("Acesso Roxo: "+conjuntoRoxo);
				System.out.println("Acesso Verde: "+conjuntoVerde);
			break;
			case 2:	
					System.out.println("[1] Azul");
					System.out.println("[2] Roxo");
					System.out.println("[3] Verde");
					int op1 = ler.nextInt();
					switch(op1) {
					case 1: System.out.println("Acesso Azul: "+conjuntoAzul); break;
					case 2: System.out.println("Acesso Roxo: "+ conjuntoRoxo); break;
					case 3: System.out.println("Acesso Verde: "+ conjuntoVerde);break;					
					}
			break;
			
			case 3: System.out.println("[1] Azul");
					System.out.println("[2] Roxo");
					System.out.println("[3] Verde");
					
					int op2 = ler.nextInt();
					
					switch(op2) {
					case 1: conjuntoAzul.clear(); 
					System.out.println("Acesso Azul: "+conjuntoAzul); 
					System.out.println("Acesso Roxo: "+ conjuntoRoxo); 
					System.out.println("Acesso Verde: "+ conjuntoVerde); break; 
					case 2: conjuntoRoxo.clear(); 
					System.out.println("Acesso Azul: "+conjuntoAzul); 
					System.out.println("Acesso Roxo: "+ conjuntoRoxo); 
					System.out.println("Acesso Verde: "+ conjuntoVerde);break;
					case 3: conjuntoVerde.clear(); 
					System.out.println("Acesso Azul: "+conjuntoAzul); 
					System.out.println("Acesso Roxo: "+ conjuntoRoxo); 
					System.out.println("Acesso Verde: "+ conjuntoVerde);break;
					}
			break;
			case 4: conjuntoAzul.clear(); conjuntoRoxo.clear(); conjuntoVerde.clear(); System.out.println("Acessos Zerados.");
			System.out.println("Acesso Azul: "+conjuntoAzul); 
			System.out.println("Acesso Roxo: "+ conjuntoRoxo); 
			System.out.println("Acesso Verde: "+ conjuntoVerde);break;
			}
		}
		System.out.println("\nDigite [1] para encerrar");
		System.out.println("Digite [2] para página inicial.");
		op = ler.nextInt();
	}while(op != 1);
		
			System.out.println("Fim aplicação ........");
		ler.close();
			
	}
	
	public static void cadastrarAzul(String nome, String cpf, String telefone) {
		AcessoAzul acessoAzul = new AcessoAzul(nome,cpf,telefone);
		
		acessoAzul.imprimeInfo();
		
	}
	
	public static void cadastrarRoxo(String nome, String cpf, String telefone) {
		
		AcessoRoxo acessoRoxo = new AcessoRoxo(nome,cpf,telefone);		
		acessoRoxo.imprimeInfo();
		
	}
	
	public static void cadastrarVerde(String nome, String cpf, String telefone) {
		
		AcessoVerde acessoVerde = new AcessoVerde(nome,cpf,telefone);		
		acessoVerde.imprimeInfo();
		
	}


	}
