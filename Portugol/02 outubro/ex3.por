programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		//[0-25], [26-50], [51-75] e [76-100].
		real num=0
		inteiro intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0
		
		escreva("Digite números positivos!")
		br()

		enquanto(num >= 0){
			escreva("## Número ##: ")
			leia(num)
			se(num >= 0 e num <= 25){
				intervalo1++
			}senao se(num > 25 e num <= 50){
				intervalo2++
			}senao se(num > 50 e num <75){
				intervalo3++
			}senao se(num > 75 e num <=100){
				intervalo4++
			}
		}
		escreva("Quantidade de números entre [0 - 25] -> ", intervalo1)
		br()
		escreva("Quantidade de números entre [26 - 50] -> ", intervalo2)
		br()
		escreva("Quantidade de números entre [51 - 75] ->" , intervalo3)
		br()
		escreva("Quantidade de números entre [76 - 100] ->" , intervalo4)
		br()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */