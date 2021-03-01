package ex1;

public class Eletronico extends Produto{

	
	
	public Eletronico(String classe, String nome, double valor, int quantidade) {
		super(classe, nome, valor, quantidade);
		
	}

	@Override
	public double calcularValorFinal(double valor, int quantidade) {
		return ((valor*(double)quantidade)*(1+15/100));
	}
	
	
	
}
