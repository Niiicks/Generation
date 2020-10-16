package Polimorfismo;

public class Cachorro extends Animal {

	public Cachorro() {
		
	}
	

	public String getAcao() {
		return "O animal "+super.getNome()+" de "+super.getIdade()+" anos vai correr enquanto "+getSom();
	}
}
