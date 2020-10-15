package TreinoPoo;

public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa Jessica = new Pessoa("Jessica", "Av. Paulista, 311", "+55(11)98763-9874");
		Pessoa Maria = new Pessoa("Maria", "Av. Pompeia, 3415", "+55(11)2342-3464");
		Pessoa Clecia = new Pessoa("Clecia", "R. Pitomba, 914", "+55(11)97553-0188");
		
		//testando somente SuperClass com atributos encapsulados
		Jessica.info();
		System.out.println(Maria.getEndereco());
		Clecia.info();
		Clecia.addSobrenome("Dos Santos");
		System.out.println(Clecia.getNome());
		
		System.out.println("___________________________________________________________________\n");
		
		//testando Fornecedor (heran�a pessoa)
		
		Fornecedor Batata = new Fornecedor("Josiel", "Rua das batatas, 100","(11) 4672-8774", 10000, 300);
		
		Batata.getEndereco();
		Batata.info(); //info pessoa
		Batata.infoForn(); //info fornecedor
		System.out.printf("Cr�dito com fornecedor %s: %.2f", Batata.getNome(), Batata.obterSaldo());
		
		System.out.println("\n___________________________________________________________________\n");
		
		Empregado Piloto = new Empregado("Dummond", "Rua dos pilotos, 1000", "(11) 4787-9987", 99887, 1100);
		
		Piloto.info();
		Piloto.setImposto(20);
		Piloto.infoEmpr();
		
		System.out.println("\n___________________________________________________________________\n");
		
		Administrador Adm = new Administrador("Josias", "Rua um, 14", "(44) 3214-2324", 300);
		Adm.info();
		Adm.infoAdm();
		
		System.out.println("\n___________________________________________________________________\n");
		Vendedor vend1 = new Vendedor("Josival", "Rua do amor, 123", "(11) 3982-9873", 9887, 10, 1500);
		
		vend1.somaComissao();
		vend1.info();
		vend1.infoVendedor();
	}
	
}
