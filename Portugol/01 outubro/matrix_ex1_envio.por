/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/


programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], l=0, c=0, m1[4][6], m2[4][6]

		escreva("Vamos inserir dados na primeira matriz")
		br()
		para(l=0; l<4 ; l++){
			para (c=0 ; c<6; c++){	
				escreva("Digite o valor para a posição (", l+1, ",", c+1,"): ")
				leia(n1[l][c])
			}
		}	

		limpa()
		escreva("Vamos agora inserir dados na segunda matriz")
		br()
		para(l=0; l<4 ; l++){
			para (c=0 ; c<6; c++){	
				escreva("Digite o valor para a posição (", l+1, ",", c+1,"): ")
				leia(n2[l][c])
				m2[l][c] = n1[l][c] - n2[l][c]
				m1[l][c] = n1[l][c] + n2[l][c]
			}
		}	
		limpa()

		
		escreva("##################################################")
		br()
		escreva("Soma dos elementos das matrizes de mesma posição: ")
		br()
		escreva("##################################################")
		br()
		para(l=0; l<4 ; l++){
			para (c=0 ; c<6; c++){	
				
				escreva("[ ", m1[l][c], " ]")
			}
			br()
		}	

		escreva("##################################################")
		br()
		escreva("Subtração dos elementos das matrizes de mesma posição: ")
		br()
		escreva("##################################################")
		br()
		para(l=0; l<4 ; l++){
			para (c=0 ; c<6; c++){	
				
				escreva("[ ", m2[l][c], " ]")
			}
			br()
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 14, 10, 2}-{n2, 14, 20, 2}-{m1, 14, 40, 2}-{m2, 14, 50, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */