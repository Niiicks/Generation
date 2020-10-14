package EstudoJava;

public class Patinete {
	String cor, peso;
	int velAtual, velMax;
	
	void dados() {
		
		System.out.printf("Esse patinete %s pesa incríveis %s kg's!!\n", cor, peso);
		
	}
	void sobe() {
		System.out.println("Segure-se, a brincadeira vai começar!");
	}
	void acelera(int num) {
		int velNova = this.velAtual+num;
		velAtual = velNova;
	}
	
	void check() {
		
		if(this.velAtual < 0) {
			System.out.println("Desafiar as leis da física é errado jovem gafanhote.");
		}
		if(this.velAtual == 0) {
			System.out.println("Já tentou ficar parado em cima de um patinete parado?");
		}
		if(this.velAtual > 0 && this.velAtual <= 20) {
			System.out.println("Divertido, não é mesmo?");
		}
		if(this.velAtual > 20 && this.velAtual <=40) {
			System.out.println("Você já caiu de um patinete?");
		}
		if(this.velAtual > 40) {
			System.out.println("Agora a nasa vem!");
		}
	}
	
}
