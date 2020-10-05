programa
{
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		
	inteiro i, total = 0
	
	para (i = 1; i<=500; i++){
		
		se(i%2 == 1 e i%3 == 0){
			
			total = total + i
			escreva(total,"\n")
		}
	}
		escreva("A soma total de todos os número ímpares, multiplos de 3 até 500 é ", total)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */