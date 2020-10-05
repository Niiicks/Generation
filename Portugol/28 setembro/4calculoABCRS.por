programa
{	
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		real A, B, C, R, S, D
		
		escreva("Nessa complexa aplicação, preciso que você digite 3 números inteiros e positivos para meu cálculo")
		br()
		escreva("Digite o primeiro valor: ")
		leia(A)
		escreva("Digite aqui o segundo valor: ")
		leia(B)
		escreva("E agora o terceiro e ultimo valor: ")
		leia(C)
		S = (B*B) + (2*(B*C)) + (C*C)
		R = (A*A) + (2*(A*B)) + (B*B)
		D = (R+S)/2

		escreva("O resultado do meu cálculo misterioso é: ", D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */