package ex1;

public class Movel extends Produto{

	
	
	public Movel(String classe, String nome, double valor, int quantidade) {
		super(classe, nome, valor, quantidade);
		
	}

	@Override
	public double calcularValorFinal(double valor, int quantidade) {
		if(quantidade >= 10) {
			return ((valor*(double)quantidade)*(1+5/100));
		}
		return ((valor*(double)quantidade)*(1+11/100));
	}

}
