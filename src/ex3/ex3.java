package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int intervaloInicial, intervaloFinal;
		int cubo;

		System.out.println("Digite o intervalo inicial: ");
		intervaloInicial = teclado.nextInt();
		System.out.println("Digite o intervalo final: ");
		intervaloFinal = teclado.nextInt();

		int intervalo = intervaloFinal - intervaloInicial;

		for (int i = 0; intervalo > 15; i++) {
			cubo = i * i * i;

			System.out.println("Numero: " + i + " seu cubo é: " + cubo);
		}

	}

}
