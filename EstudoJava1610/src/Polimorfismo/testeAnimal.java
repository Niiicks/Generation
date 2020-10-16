package Polimorfismo;

public class testeAnimal {
	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(5);
		cavalo.setSom("relincha");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Coragem");
		cachorro.setIdade(25);
		cachorro.setSom("late");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Nick");
		preguica.setIdade(90);
		preguica.setSom("boceja");
		
		Animal[] animais = new Animal[3];
		animais[0] = cavalo;
		animais[1] = cachorro;
		animais[2] = preguica;
		
			for(Animal animal: animais) {
				System.out.println(animal.getAcao()+".\n");
			}
	}

}
