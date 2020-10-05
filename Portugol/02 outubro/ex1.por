programa
{
	inclua biblioteca Matematica --> mat
	
	funcao br(){
		escreva("\n")
	}
	funcao inicio()
	{
		real etq, preco
		inteiro opc
		caracter sinao = 'x'
		
		escreva("Digite o valor do produto R$ ")
		leia(etq)		
			
		enquanto(sinao != 'N' e sinao != 'n'){
		limpa()
		escreva("############################")
		br()
		escreva("Escolha a forma de pagamento")
		br()
		escreva("############################")
		br()br()
		escreva("[1] À Vista (Dinheiro / Cheque)   ") 
		escreva(" [2] Crédito à vista")
		br()
		escreva("[3] Parcelado em 2x                ")
		escreva("[4] Parcelado em 3x  ")
		br()
			
		escreva("### Opção Selecionada-> ")
		leia(opc)
		limpa()
		  	escolha(opc){
			caso 1: preco = etq * 0.8 escreva("Na opção selecionada será aplicado 20% de desconto. Valor da compra: R$ ", mat.arredondar(preco, 2))
			pare

			caso 2: preco = etq * 0.85 escreva("Na opção selecionada será aplicado 15% de desconto. Valor da compra: R$ ", mat.arredondar(preco, 2))
			pare

			caso 3: preco = etq escreva("Na opção selecionada não há alteração de preço. Valor da compra: R$ ", mat.arredondar(preco, 2))
			pare

			caso 4: preco = etq * 1.1 escreva("Na opção selecionada um juros de 10% será aplicado. Valor da compra: R$ ", mat.arredondar(preco, 2))
			pare

			caso contrario: escreva("Opção inválida")
		}
		
		br()
		escreva("Deseja mudar a opção selecionada? [S/N] |  ")
		leia(sinao)

			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */