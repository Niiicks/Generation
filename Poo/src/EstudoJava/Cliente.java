package EstudoJava;

public class Cliente {
		 String nome;
		 String idade;
		 String cep;
		
		void imprime() {
			System.out.println(":::::Dados do Cliente :::::");
			System.out.printf("Cliente %s tem %s anos e mora no cep %s.", nome, idade, cep);
		}
}
