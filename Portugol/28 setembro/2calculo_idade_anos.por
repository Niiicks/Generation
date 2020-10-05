programa
{
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		inteiro entrada, dias, anos, meses, teste
	

		
		escreva("**Olá, nessas complexa aplicação iremos converter para anos, meses e dias seu total de dias vividos** ")
		br()
		escreva("Informe quantos dias você tem de idade: ")
		leia(entrada)		

		anos = entrada/365
		meses = (entrada-anos*365)/30
		dias = entrada-anos*365-meses*30
		
		escreva("A sua idade é: ", anos, " anos ", meses, " meses e ", dias," dias.")	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */