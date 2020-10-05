programa
{	

	inclua biblioteca Matematica --> mat
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		real n1, n2, n3, n4, r1, r2, r3, r4
		
		escreva("Programa misterioso ! ")
		br()
		escreva("Digite um número :")
		leia(n1)
		escreva("Digite outro número :")
		leia(n2)
		escreva("Digite outro número :")
		leia(n3)
		escreva("Digite outro número :")
		leia(n4)

		r1 = mat.arredondar(n1*n1, 0)
		r2 = mat.arredondar(n2*n2, 0)
		r3 = mat.arredondar(n3*n3, 0)
		r4 = mat.arredondar(n4*n4, 0)

		se(r3 >= 1000){
			escreva(r3)
		} senao {
			escreva(n1, "²", " = ", r1)
			br()
			escreva(n2, "²", " = ", r2)
			br()
			escreva(n3, "²", " = ", r3)
			br()
			escreva(n4, "²", " = ", r4)			

			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */