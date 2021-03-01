package ex4;

public class Quadrado implements AreaCalculavel{
	
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double areaCalculavel() {
		return lado*lado;
		
	}
	
	
	
}
