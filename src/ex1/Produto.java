package ex1;

public class Produto {
	
	private String nome;
	private double valor;
	private int quantidade;
	private String classe;
	
	
	public Produto(String classe, String nome, double valor, int quantidade) {
		super();
		this.classe = classe;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	
	public double calcularValorFinal(double valor, int quantidade) {
		return ((valor*(double)quantidade)*(1+10/100));
	}
	
	public String toString() {
		String aux = "";
		aux += "Classe -> "+classe+"\n";
		aux += "Nome -> "+nome+"\n";
		aux += "Valor -> "+valor+"\n";
		aux += "Quantidade -> "+quantidade+"\n";
		return aux;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	
}
