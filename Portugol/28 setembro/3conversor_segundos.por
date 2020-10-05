programa
{
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		inteiro entrada,horas,minutos,segundos

		escreva("Nessa aplicação vamos converter um total de segundos em horas, minutos e segundos!")
		
		br()
		escreva("Digite aqui a quantidade total de segundos: ")
		leia(entrada)

		horas = entrada/3600
		minutos = (entrada%3600)/60
		segundos = (entrada%3600)%60	
		
		escreva(entrada, " segundos é equivalente a ", horas, " horas ", minutos," minutos ",segundos, " segundos ")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */