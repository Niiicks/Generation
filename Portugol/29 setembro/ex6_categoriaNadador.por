programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro opc
		
		
		escreva("Selecione a idade do(a) nadador(a): \n(1) 5 a 7 anos    \t (2) 8 a 11 anos \n(3) 12 e 13 anos\t (4) 14 a 17 anos\n(5) +18 anos")
		br()
		escreva("#Escolha: ")
		leia(opc)

			escolha(opc){
			caso 1: escreva("Você está apto para a categoria INFANTIL A")
			pare
			caso 2: escreva("Você está apto para a categoria INFANTIL B")
			pare
			caso 3: escreva("Você está apto para a categoria JUVENIL A")
			pare
			caso 4: escreva("Você está apto para a categoria JUVENIL B")
			pare
			caso 5: escreva("Você está apto para a categoria ADULTO")
			pare
			caso contrario: escreva("Escolha uma opção válida!!!")		
			}
				
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */