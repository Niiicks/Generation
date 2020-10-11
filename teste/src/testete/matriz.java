package testete;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		//declaração de var.
		String carac1 ="", carac2="";
		String nome1, nome2, caractere, caractere1, caractere2, vencedor = "";
		int x = 1, opc, cont, partida;
		
		//declaração da matriz já preenchida
		String[][] matriz = {
				{ "1", "2", "3"},
				{ "4", "5", "6"},
				{"7", "8", "9"}}; 
		
		//iniciação dos contadores
		partida = 0;
		
		//instanciação do Scanner
		Scanner ler = new Scanner(System.in);

		//impresão do cabeçalho
		System.out.println("##################################");
		System.out.println("~Bem vindo ao nosso jogo da Velha~");
		System.out.println("##################################");
		  
		//captura do nome dos players
		System.out.println("Digite o nome do primeiro jogador: ");
		nome1 = ler.next();
		System.out.println("Digite o nome do segundo jogador: ");
		nome2 = ler.next();
		  
		//captura do caractere do player 1
		System.out.println(nome1+", você gostaria de usar X ou O para preencher?");
		caractere = ler.next();
		
		//informa caractere do player 2
		if(caractere.equals("X")) {
			caractere1 = "X";
			caractere2 = "O";
			System.out.println(nome2+" você usará o caracte: O");
		}
		else {
			caractere1 = "O";
			caractere2 = "X";
			System.out.println(nome2+" você usará o caracte: X");
		}
		
		//primeira exibição da matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("["+ matriz[i][j]+"]");
			}
	    	System.out.println("");
	  	}
		
		//Execução das partidas
	    do {
	   // System.out.println(vencedor + partida);
	    
	    if(caractere.equals(caractere1)) {
	    	System.out.println(nome1 +" digite qual posição deseja:");
			opc = ler.nextInt();
	    }
	    else {
	    	System.out.println(nome2 +" digite qual posição deseja:");
			opc = ler.nextInt();
	    }
		
		//zera o contador responsavel por identificar a posição
	    cont = 0;
	    
	    //varre a matriz ate contador ser igual a posição(opc)
		for(int l = 0; l<3; l++ ) {
			for(int c = 0; c<3; c++ ) {
				cont++;
				
				//verifica se posição é igual a contador
				if(opc == cont) {
					//verifica se a posição já está preenchida 
					if(matriz[l][c] == "X" || matriz[l][c] == "O"){
						System.out.println("já foi escolhido");
					}
					//atribui valor a posições vazias
					else {
						matriz[l][c]  = caractere;
						partida++;
						
						//verificação linha e coluna de 0.0
						if(matriz[0][0].equals(matriz[0][1]) && matriz[0][1].equals(matriz[0][2])){
							if(matriz[0][0].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						else if(matriz[0][0].equals(matriz[1][0]) && matriz[1][0].equals(matriz[2][0])){
							if(matriz[0][0].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						//verificação linha e coluna de 1.1
						else if(matriz[1][1].equals(matriz[0][1]) && matriz[1][1].equals(matriz[2][1])){
							if(matriz[1][1].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						else if(matriz[1][1].equals(matriz[1][0]) && matriz[1][1].equals(matriz[1][2])){
							if(matriz[1][1].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						//verificação linha e coluna de 2.2
						else if(matriz[2][2].equals(matriz[2][1]) && matriz[2][2].equals(matriz[2][0])){
							if(matriz[2][2].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						else if(matriz[2][2].equals(matriz[1][2]) && matriz[2][2].equals(matriz[0][2])){
							if(matriz[2][2].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						//verificação da diagonal1
						else if(matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2])){
							if(matriz[0][0].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
						//verificação da diagonal2
						else if(matriz[0][2].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][0])){
							if(matriz[0][2].equals(caractere1)){
								vencedor = nome1;
							}else{
								vencedor = nome2;
							}
						}
					}
				}
			}
		}
		
		//alterna entre player 1 e 2
		if(caractere.equals("X")) {
			caractere="O";
		}
		else {
			caractere="X";
		}
		
		//imprime a matriz após cada alteração
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("["+ matriz[i][j]+"]");
			}
			System.out.println("");
	  	}
		
	    }while(vencedor.equals("") && partida<9); 
	    ler.close();
	    if(vencedor.equals("")) {
	    	System.out.println("\nDeu velha!");
	    }
	    else {
	    	System.out.println("\nO vencedor foi: "+vencedor);
	    }
	}  
}

