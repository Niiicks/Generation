programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro indice

		escreva("-----------------------------------------")
		br()
		escreva("######## CONTROLE DE POULUIÇÃO! ########")
		br()
		escreva("-----------------------------------------")
		br()
		escreva("Para devida protração ambientas siga as orientações. Digite:")
		br()
		escreva("1 - Se o índice medido estiver entre 0,05 e 0,25")
		br()
		escreva("2 - Se o índice medido for maior que 0,25")
		br()
		escreva("3 - se o índice medido for maior que 0,4")
		br()
		escreva("4 - se o índice medido for maior que 0,5")	
		br()
		escreva("##OPÇÃO: ")			
		leia(indice)

		escolha(indice){
			caso 1: escreva("Segundo os dados informados, níveis de puluição dentro do aceitável.")
			pare
			
			caso 2: escreva("Segundo os dados informados, indústrias do 1º grupo serão intimidas!")
			pare
			
			caso 3: escreva ("Segundo os dados informados, indústrias do 1º e 2º grupos serão intimadas!")
			pare

			caso 4: escreva ("Segundo os dados informados, TODAS as indústrias devem suspender atividades!!")
			pare

			caso contrario: escreva("Escolha uma opção válida!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1024; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */