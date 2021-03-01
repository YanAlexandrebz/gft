package ex1;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Eletronico", "Ventilador", 320.00, 3));
		lista.add(new Produto("Eletronico", "Computador", 3999.00, 2));
		lista.add(new Produto("Movel", "Mesa", 270.00, 2));
		lista.add(new Produto("Produto", "Caderno", 10.50, 10));
		lista.add(new Produto("Movel", "Cadeira", 234.25, 2));
		lista.add(new Produto("Produto", "Caneta", 0.70, 15));
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

}
}
