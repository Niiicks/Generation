programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{

		inteiro L1, L2, L3, valido
		
		escreva("--------------------------------")
		br()
		escreva("## CALCULADORA DE TRIÂNGULOS ##")
		br()
		escreva("--------------------------------")
		br()
		
		escreva("Digite os 3 lados de um suposto triângulo, e com os valores informados \nte darei informações sobre seu triângulo!")
		br()
		escreva("LADO 1: ")
		leia(L1)
		escreva("LADO 2: ")
		leia(L2)
		escreva("BASE: ")
		leia(L3)

		se( L1 <= L2+L3 e L2 <= L1 + L3 e L3 <= L1+L2 e L1 != 0 e L2 != 0 e L3 != 0){
			valido = 1	// UM TRIANGULO VALIDO NÃO PODE TER UM LADO MAIOR QUE A SOMA DOS OUTROS DOIS
		} senao {
			valido = 0
			escreva("Com os dados informados, infelizmente não é possivel formar um Triângulo!")
		}

		se(valido == 1){
			se(L1 == L2 e L2 == L3){				
				escreva("Ótimo! Formamos um Triângulo Equilátero !")
			} senao se(L1 == L2  ou L2 == L3){
				escreva("Ótimo! Formamos um Triângulo Isóceles!")
			} senao{
				escreva("Ótimo! Formamos um Triângulo Escaleno!")
			}
		}

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1059; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */