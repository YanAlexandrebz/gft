package ex2;

public class ex2 {

	public static void main(String[] args) {

		int valor1;
		int valor2;

		for (int i = 10; i <= 215; i++) {
			
			valor1 = i % 3;
			valor2 = i % 7;
			

			if (valor1 == 0 && valor2 == 0) {
				System.out.println("Valores divisiveis por 3 e 7: " + i);
			}

		}

	}

}
