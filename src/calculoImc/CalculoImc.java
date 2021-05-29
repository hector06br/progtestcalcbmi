package calculoImc;


import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // para digitar numeros com parte decimal
		Scanner sc = new Scanner(System.in); // recebe os número pelo teclado

		System.out.print("Digite o Peso:");
		double peso = sc.nextDouble();

		System.out.print("Digite a Altura:");
		double altura = sc.nextDouble();

		System.out.print("Resultado do IMC");

		ValoresImc pesoIdeal = new ValoresImc(peso, altura);
		double massaCorporal = pesoIdeal.calculaImc();

		System.out.println();
		System.out.println("Calculando...");
		System.out.println();

		System.out.printf("O valor do seu IMC é: %.2f%n", massaCorporal);
		/*
		 * if (massaCorporal < 24.9) { System.out.println("Abaixo do peso");
		 * 
		 * 
		 * if (m0 ) {
		 * 
		 * System.out.println("Parabéns você está no peso ideal"); }
		 * 
		 * 
		 * if (massaCorporal >= 24.9) {
		 * 
		 * System.out.println("Acima do peso");
		 * 
		 * }
		 */

		if (massaCorporal <= 18.5) {
			
			System.out.println("abaixo do peso");

		} else if (massaCorporal <= 24.9) {

			System.out.println("peso ideal");
		}

		else {

			System.out.println("Acima do peso");

		}

		sc.close();

	}
}
