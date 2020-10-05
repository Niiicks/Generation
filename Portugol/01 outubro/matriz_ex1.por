programa
{
	
	funcao inicio()
	{
		const inteiro limiteL=3, limiteC=3
		inteiro valores[limiteL][limiteC]
		inteiro l=0, c=0, somatriz=0, somadig=0

		//laço da linha, vai repetir até o resultado ser falso
		para(l= 0; l<limiteL; l++)
		{
		
			//laço da coluna, vai repetir até o resultado ser falso
			para (c= 0; c<limiteC; c++)
		{

			escreva("Digite o valor para a posição (", l+1, ",", c+1,"): ")
			leia(valores[l][c])
			limpa()
			

			/*Condicional para identificar se o numero da linha e coluna é igual
			e fazer o calculo do total da diagonal da matriz*/
			se (l==c)
			{
				//soma da diagonal da matriz
				somadig = somadig + valores[l][c]
				//soma total da matriz
			  }
				somatriz = somatriz + valores[l][c]
	      }
	}
			para(l= 0; l<limiteL; l++)
		{
		
			//laço da coluna, vai repetir até o resultado ser falso
			para (c= 0; c<limiteC; c++)
		{
			escreva("[",valores[l][c],"]")
		}
			escreva("\n")
		}
				
				//saida da informação
				escreva("\nO resultado total da matriz é: ", somatriz)
				escreva("\nA soma da diagonal da matriz é: ", somadig)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 890; 
 * @PONTOS-DE-PARADA = 40, 42;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */