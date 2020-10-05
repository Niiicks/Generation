programa
{
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		inteiro anos, meses, dias, res
	

		
		escreva("**Olá, nessa aplicação vamos calcular quantos dias você viveu, com base nos anos, meses e dias informados** ")
		
		br()
		
		escreva("Informe quantos anos você ja completou: ")
		leia(anos)		
		
		escreva("Informe quantos meses você ja completou: ")
		leia(meses)
		
		escreva("Informe agora os dias: ")
		leia(dias)

		res = (anos * 365) + (meses * 30) + dias
		escreva("Em dias, seu tempo de vida é: ",res)	


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */