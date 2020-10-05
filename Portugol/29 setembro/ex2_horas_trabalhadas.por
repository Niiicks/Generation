programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real N, E, sal
		inteiro C
		escreva("####### Calculadora de salário ####### \n")
		
		escreva("Digite o código de funcionário: ")
		leia(C)
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(N)

		se(N<50){
			sal = N*10
			E = 0
			escreva ("\n O colaborador de código #",C," tem um salário de R$", sal," reais. Não houve horas extras!")						
		} senao {
			E = N-50
			sal = mat.arredondar((50*10) + (E*20), 2)	
			escreva ("\n O colaborador de código #",C," tem um salário de R$", sal," reais. Total de horas extras: ", E)		 
		}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */