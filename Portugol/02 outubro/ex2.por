programa
{
	inclua biblioteca Matematica --> m
	funcao br(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		real altura, peso, i
		cadeia res
		
		escreva("Nessa aplicação iremos fazer o calculo do IMC.")
		br()
		escreva("Digite a altura: ")
		leia(altura)
		
		escreva("Digite o peso: ")
		leia(peso)
		limpa()

		i = peso/ (altura*2)

		se(i <= 18.5){
			res = "abaixo do peso."
		} senao se (i > 18.5  e i <= 25){
			res = "com o peso normal." 
		} senao se(i > 25  e  i <= 30){
			res = "acima do peso. "
		}senao se(i > 30) {
			res = "obesa"
		} senao{
			escreva("Verifique os valores digitados.")
			res = ""
		}




		se (res != ""){
		escreva("Com os parâmetros informados e pessoa está ", res, " IMC = ", m.arredondar(i, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */