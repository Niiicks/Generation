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
		System.out.println(":::::: Sejam bem vindos à bordo. :::::: \n\n "
				+ "Observe o número de seu assento no cartão de embarque.\n "
				+ "Por medidas de segurança, acomodem as bagagens de mão nos compartimentos acima de seus assentos.\n "
				+ "As que não couberem abaixo da poltrona a sua frente.");
		System.out.println("--------------------------------------------------");
	}
	
	void decolar() {
		System.out.printf("\nSenhoras e Senhores,\n"
				+ "Bem vindos à %s.\n"
				+ "Comandante %s e sua tripulação tem o prazer em recebê-los para o voo %s\n"
				+ "com destino à %s\n"
				+ "Informamos que de acordo com normas brasileiras, não é permitido fumar a bordo, inclusive nos toiletes.\n", companhia, comandante, voo, destino);
		System.out.println("\n Avião decolou ..........\n");
		System.out.println("--------------------------------------------------");
	}
	
	void pousar() {
		System.out.printf("\nSenhoras e Senhores sejam bem-vindos à %s.\n"
				+ "Por medidas de segurança mantenham-se sentados até que o aviso de atar cintos sejam desligados.\n"
				+ "Tenham cuidado ao abrir o compartilhamento de bagagem para retirada de seus pertences de mão,\n"
				+ "Eles podem ter se deslocado durante o voo.\n", destino);
		System.out.println("--------------------------------------------------");
	}
}
