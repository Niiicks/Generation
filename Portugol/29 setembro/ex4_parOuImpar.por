programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro num
		cadeia parOuImpar, positivoNegativo
		
		escreva("Escreva um número e te darei mais informações sobre ele! --> ")
		leia(num)
		br()

		se(num%2 == 0){
			parOuImpar = " é par e "
		} senao {
			parOuImpar = " é impar e "
		}

		se(num < 0){
			positivoNegativo = "negativo."
		} senao {
			positivoNegativo = "positivo."
		}

		escreva("O número ", num, parOuImpar, positivoNegativo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */