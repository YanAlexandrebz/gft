package ex4;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(5);
		Retangulo retangulo = new Retangulo(2, 5);
		Circulo circulo = new Circulo(1.5);
		
		System.out.println("�rea do quadrado: "+quadrado.areaCalculavel());
		System.out.println("�rea do retangulo: "+retangulo.areaCalculavel());
		System.out.println("�rea do circulo: "+circulo.areaCalculavel());
		
		
		

	}

}
