package ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Estoque {
	public static void main(String[] args) {
		List<String> Estoque = new ArrayList<String>();
		//adicionar itens
		Estoque.add("Feijao");
		Estoque.add("Goiaba");
		Estoque.add("Macarrao");
		Estoque.add("Detergente");
		Estoque.add("Saco Preto");
		Estoque.add("Arroz");
		
		
		 for (String s:Estoque)
				System.out.println(s);
		 
		 System.out.println("------------------------------------------------");
		 //remover item
		 Estoque.remove(0);
		
		 for (String s:Estoque)
				System.out.println(s);
		 
		 System.out.println("------------------------------------------------");
		 //atualizar estoque
		 Estoque.set(0, "Goiabada");
		 
		 for (String s:Estoque)
				System.out.println(s);
	
	}
}
