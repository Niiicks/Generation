programa
{
	inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		inteiro 	i, pMax=0, soma=0, dado[10]
		real media

		escreva("Nesse programa iremos jogar 10 vezes o dado e gerar um vetor com esses valores aleatórios! ")
		
		br()
		
		para(i=0;i<10;i++){
			
			dado[i] = util.sorteia(1, 6)

			soma = soma + dado[i]
			
			se(dado[i] == 6){
				pMax ++
			}



			escreva(i+1, "º número sorteado: ", dado[i])
			br()
		
		}
		media = soma/10.0
		
		escreva("A pontuação máxima (6) ocorreu ", pMax, " vezes.")		
		br()

		escreva("A média dos números é : ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {soma, 10, 22, 4}-{media, 11, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */