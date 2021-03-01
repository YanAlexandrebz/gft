package ex4;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double areaCalculavel() {
		return Math.PI*raio*raio;
		
		
	}
	
	
}
