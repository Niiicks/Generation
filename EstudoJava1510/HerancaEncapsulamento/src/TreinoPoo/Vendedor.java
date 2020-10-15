package TreinoPoo;

public class Vendedor extends Pessoa{
	
	private float totalVendas;
	private int Comissao;
	private float Salario;
	public Vendedor(String nome, String endereco, String telefone, float totalVendas, int Comissao, float Salario) {
		super(nome, endereco, telefone);
		this.totalVendas = totalVendas;
		this.Comissao = Comissao;
		this.Salario = Salario;
	}
	
	public float somaComissao() {
		float total = Salario + (totalVendas*((float) Comissao/100));
		return total;
	}
	public void infoVendedor() {
		System.out.print("O vendedor "+getNome()+" teve um total de "+totalVendas+" em vendas, vai receber uma comissão de "+Comissao+"%. Salário com comissão: "+somaComissao());
	}
	public float getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}
	public float getComissao() {
		return Comissao;
	}
	public void setComissao(int comissao) {
		Comissao = comissao;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}

}
