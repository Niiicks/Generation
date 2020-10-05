programa
{
	funcao br(){
		escreva("\n")
		
	}
	funcao inicio()
	{
		inteiro triz[5], maior = 0, i

		para(i=0;i<5;i++){
			
			escreva("Entre com ",i+1,"º valor: ")
			leia(triz[i])
			se(triz[i] > maior){
				maior = triz[i]
			}
			limpa()
		}
				para(i=0;i<5;i++){
			
			escreva("Valor da posição ", i+1,": ", triz[i])
			br()

		}

	escreva("O maior valor é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */