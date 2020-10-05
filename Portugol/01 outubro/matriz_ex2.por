/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 
 e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
 diagonal, ou seja, diagonal principal.	*/

programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro l, c, m[3][3], soma = 0, somad = 0


		
		para(l=0; l<3; l++){
			para(c=0; c<3; c++){
				escreva("Digite o valor (",l+1,",",c+1,"): ")
				leia(m[l][c])
				soma = soma + m[l][c]
			}
		}

		para(l=0; l<3; l++){
			para(c=0; c<3; c++){
				escreva("[ ",m[l][c]," ]")				
				
			}
			br()
		}
		para(l=0; l<3; l++){
			somad = somad + m[l][l]	
		}
		escreva("Soma dos elementos da matriz: ", soma)
		br()
		escreva("Soma da diagonal principal: ", somad)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 13, 16, 1}-{soma, 13, 25, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */