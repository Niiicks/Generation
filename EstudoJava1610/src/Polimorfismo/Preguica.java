package Polimorfismo;

public class Preguica extends Animal {

	public Preguica() {
		
	}
	

	public String getAcao() {
		return "O animal "+super.getNome()+" de "+super.getIdade()+" anos vai cochilar enquanto "+getSom();
	}
}
