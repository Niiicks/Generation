package Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo() {
		
	}

	public String getAcao() {
		return "O animal "+super.getNome()+" de "+super.getIdade()+" anos vai correr enquanto "+getSom();
	}
}
