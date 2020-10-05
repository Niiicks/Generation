programa
{
	
	funcao inicio()
	{
		real valor[5]
		inteiro i, codigo
		caracter sinao = 'x'
		
		escreva("Entre com 5 números: \n")

		para(i=0; i < 5; i++){	
		escreva("> ")
		leia(valor[i])
		}

		enquanto(sinao != 'S' e sinao != 's'){
		limpa()
		
		escreva("[1] Para ver o vetor      [2] Para inverter o vetor\n")
		leia(codigo)
		escolha(codigo){

			caso 1:
					para(i=0; i < 5; i++){	
					escreva("[", valor[i],"]")
					}
			pare			

			caso 2: 
					para(i=4; i >= 0; i--){	
					escreva("[", valor[i],"]")
					}
			pare

			caso contrario : escreva("Código inválido")
		}
		
		escreva("\nDeseja sair? [S/N] -> ")
		leia(sinao) 
		escreva("> ")
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */