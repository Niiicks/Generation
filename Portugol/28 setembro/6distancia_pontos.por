programa
{	
	inclua biblioteca Matematica --> mat
	
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
	real x1, x2, y1, y2, d, radic

		
	escreva("Nessa aplicação calcularemos a distância entre 2 pontos distintos no plano cartesiano!")	
	
	br()
	
	escreva("Informe x1: ")
	leia(x1)
	escreva("Informe x2: ")
	leia(x2)
	escreva("Informe y1: ")
	leia(y1)
	escreva("Informe y2: ")
	leia(y2)

	radic = mat.potencia((x2-x1),2.0)+mat.potencia((y2-y1),2.0)
	d = mat.raiz(radic, 2)

	escreva("O resultado é: ", d) 
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */