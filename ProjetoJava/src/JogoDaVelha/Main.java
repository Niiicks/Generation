package JogoDaVelha;

import java.util.Scanner;

public class Main {
	static boolean Venceu(String matriz[][]) { 
		return  (matriz[0][0]).equals(matriz[0][1]) && (matriz[0][0]).equals(matriz[0][2]) ||
				(matriz[1][0]).equals(matriz[1][1]) && (matriz[1][0]).equals(matriz[1][2]) ||
				(matriz[2][0]).equals(matriz[2][1]) && (matriz[2][0]).equals(matriz[2][2]) ||
				(matriz[0][0]).equals(matriz[1][0]) && (matriz[0][0]).equals(matriz[2][0]) ||
				(matriz[0][1]).equals(matriz[1][1]) && (matriz[0][1]).equals(matriz[2][1]) ||
				(matriz[0][2]).equals(matriz[1][2]) && (matriz[0][2]).equals(matriz[2][2]) ||
				(matriz[0][0]).equals(matriz[1][1]) && (matriz[0][0]).equals(matriz[2][2]) ||
				(matriz[0][2]).equals(matriz[1][1]) && (matriz[0][2]).equals(matriz[2][0]);
	}
	
	public static void Mostrar(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("["+ matriz[i][j]+"]");
    		}
			System.out.println("");
		}
	}
	
	public  static void main(String args[]) {
		String[][] matriz = {  
	              { "1", "2", "3"},  
	              { "4", "5", "6"}, 
	              { "7", "8", "9"}
	    };
		int opc, cont, partida = 0;
	    Scanner ler = new Scanner(System.in);
	    String[] jogador = { "X","O"};
		
	    do {
	    	Mostrar(matriz);
	    	System.out.println("\nO jogador '"+jogador[partida%2]+"', digite qual posição deseja:");
	    	opc = ler.nextInt();
		    
	    	cont = 0;
	    	for(int l = 0; l<3; l++ ) {
	    		for(int c = 0; c<3; c++ ) {
	    			cont++;
	    			if(opc == cont) {
	    				if( (matriz[l][c] == "X") || (matriz[l][c] == "O")){
	    					System.out.println("Já foi escolhido");
	    				}
	    				else {
	    					matriz[l][c]  = jogador[partida%2];
	    					partida++;		
	    					break;	
	    				}  
	    			}
	    		}
	    	}
	    	
	    }while( partida<9 && !Venceu(matriz)); 

	    Mostrar(matriz);
	  	
	    if(partida<9){
	       System.out.println("\nO jogador '"+jogador[(partida-1)%2] +"' venceu o jogo.");
	     }
	     else{
	    	System.out.println("\nDeu velha!");
	     }
	    
	}
}