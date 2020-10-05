programa
{
	inclua biblioteca Matematica --> mat
	
	funcao br(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		real kgs, E, M
		
		E = 0	
		M = 0
		
		escreva("Essa aplicação irá calcular o peso excedente dos tomate de João, e a multa a ser paga!")
		br()
		escreva("Quantos kilos de tomate João está trazendo pra SP? ->")
		leia(kgs)

		se(kgs>50){
			E = mat.arredondar(kgs - 50, 3) 
		}

		M = 4 * E

		escreva("Com um total de ", kgs, " kilos de tomate João pagará R$", M," de multa pelos ", E," kg's de excedente" )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */