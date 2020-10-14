package EstudoJava;

public class Aviao {
	private String companhia, comandante, voo, destino;	
	
	public Aviao (String empresa, String nome, String numero, String local) {
		companhia = empresa;
		comandante = nome;
		voo = numero;
		destino = local;
	}
	
	void embarcar() {
		System.out.println(":::::: Sejam bem vindos � bordo. :::::: \n\n "
				+ "Observe o n�mero de seu assento no cart�o de embarque.\n "
				+ "Por medidas de seguran�a, acomodem as bagagens de m�o nos compartimentos acima de seus assentos.\n "
				+ "As que n�o couberem abaixo da poltrona a sua frente.");
		System.out.println("--------------------------------------------------");
	}
	
	void decolar() {
		System.out.printf("\nSenhoras e Senhores,\n"
				+ "Bem vindos � %s.\n"
				+ "Comandante %s e sua tripula��o tem o prazer em receb�-los para o voo %s\n"
				+ "com destino � %s\n"
				+ "Informamos que de acordo com normas brasileiras, n�o � permitido fumar a bordo, inclusive nos toiletes.\n", companhia, comandante, voo, destino);
		System.out.println("\n Avi�o decolou ..........\n");
		System.out.println("--------------------------------------------------");
	}
	
	void pousar() {
		System.out.printf("\nSenhoras e Senhores sejam bem-vindos � %s.\n"
				+ "Por medidas de seguran�a mantenham-se sentados at� que o aviso de atar cintos sejam desligados.\n"
				+ "Tenham cuidado ao abrir o compartilhamento de bagagem para retirada de seus pertences de m�o,\n"
				+ "Eles podem ter se deslocado durante o voo.\n", destino);
		System.out.println("--------------------------------------------------");
	}
}
