programa
{
	inclua biblioteca Matematica -->mat
	
	funcao br(){
		escreva("\n")
	}
	
	
	funcao inicio()
	{
		
		real inicial, imposto, dist, final
		
		escreva("Essa aplicação vai calcular o preço final de um carro, somando o percentual do distribuidor + impostos")
		br()
		escreva("Insira o valor de custo da fábrica: ")
		leia(inicial)
		
		imposto = (inicial/100)*45
		dist = (inicial/100)*28
		final = mat.arredondar(inicial + dist + imposto, 3)
		
		escreva("O valor final do veículo será de R$ ",final)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 509; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */