programa
{	
	inclua biblioteca Matematica -->mat
	
	funcao br() {
		escreva ("\n")
	}
	
	funcao inicio()
	{
		real x,y,a,b,c,d,z,f

		escreva("Essa aplicação é um sistema para calculo de equações lineares!")
		br()
		escreva("Insira o valor de A: ")
		leia(a)
		escreva("Insira o valor de B: ")
		leia(b)
		escreva("Insira o valor de C: ")
		leia(c)
		escreva("Insira o valor de D: ")
		leia(d)
		escreva("Insira o valor de E: ")
		leia(z)
		escreva("Insira o valor de F: ")
		leia(f)

		x = (c*z - b*f) / (a*z- b*d)
		y = (a*f - c*d) / (a*z - b*d)

		escreva("Com os valores informados, X vale: ",mat.arredondar(x,2))
		br()
		escreva("Com os valores informados, Y vale: ",mat.arredondar(y,2))
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */