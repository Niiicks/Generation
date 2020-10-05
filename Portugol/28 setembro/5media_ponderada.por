programa
{	
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		real nota1, nota2, nota3, mp

		// peso das notas 2, 3 e 5 respectivamente
		
		escreva("**Nessa aplicação iremos calcular a média ponderada de 3 notas**")
		br()
		escreva("Digite a primeira nota: ")
		leia(nota1)
		escreva("Digite a segunda nota: ")
		leia(nota2)
		escreva("Digite a terceira nota: ")
		leia(nota3)
		
		mp = ((nota1 * 2) + (nota2*3) + (nota3*5)) / 10

		escreva("A média ponderada neste caso é: ", mp)
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */