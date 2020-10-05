programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		real entrada = 0, total=0, i=0, media
	
		escreva("Essa aplicação irá somar todos os números POSITIVOS fornecidos pelo usuário")
		br()
		
		enquanto (entrada >= 0){
			
				
		escreva("Digite o valor: ")
		leia(entrada)

		i ++
		
		total = total + entrada
		media = total/i
		escreva("Soma: ", total)
		br()
		escreva("Entradas: ", i)
		br()
		escreva("Média: ", media)
		br()
		}
	
		escreva("Fim da aplicação.")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */