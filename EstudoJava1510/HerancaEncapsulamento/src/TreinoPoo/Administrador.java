package TreinoPoo;

public class Administrador extends Pessoa{
	private float ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, float ajudaDeCusto) {
		super(nome,endereco,telefone);
		this.ajudaDeCusto= ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void infoAdm() {
		
	System.out.printf("O Administrador %s vai ter um adicional de R$%.2f como ajuda de custo.", getNome(), ajudaDeCusto);
		
	}
}
