package testete;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
			String carac, caracOponente;
			String nome1;
			int x=1, opc;
			
			String[][] matriz = {  
                  { "1", "2", "3"},  
                  { "4", "5", "6"}, 
                  {"7", "8", "9"}
               } ; 
		  
		  Scanner ler = new Scanner(System.in);

		  //impresão docabeçalho
		  System.out.println("##################################");
		  System.out.println("~Bem vindo ao nosso jogo da Velha~");
		  System.out.println("##################################");
		  
		  //captura donome do player
		  System.out.println("Digite o nome do primeiro jogador: ");
		  nome1 = ler.next();
		  
		  //captura do cartere que ele usará
		
		  System.out.println(nome1+",você gostaria de usar X ou O para preencher?");
		  carac = ler.next();
		 
		  if(carac == "X"){
		    caracOponente = "O";		  
		  }else {
			  
				    caracOponente = "X";
		  }

		  	
		  	for (int i = 0; i < matriz.length; i++) {
				  for (int j = 0; j < matriz.length; j++) {
					
					System.out.print("["+ matriz[i][j]+"]");
					
				  }
		    		System.out.println("");
		  	}
		  
		    System.out.println(nome1+",Qual quadrante você deseja preencher?");
		    opc = ler.nextInt();
		    
		    switch(opc){
		    case 1:
		    matriz[0][0] = carac;
		    break;

		    case 2:
		    matriz[0][1] = carac;
		    break;

		    case 3:
		    matriz[0][2] = carac;
		    break;

		    case 4:
		    matriz[1][0] = carac;
		    break;

		    case 5:
		    matriz[1][1] = carac;
		    break;

		    case 6:
		    matriz[1][2] = carac;
		    break;
		    
		    case 7:
		    matriz[2][0] = carac;
		    break;
		    
		    case 8:
		    matriz[2][1] = carac;
		    break;

		    case 9:
		    matriz[2][2] = carac;
		    break;
		  };
		  
		  for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz.length; j++) {
				
				System.out.print("["+ matriz[i][j]+"]");
				
			  }
	    		System.out.println("");
	  	}


		   
	}
}

