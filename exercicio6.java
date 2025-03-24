package exercicio;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		float num1 = sc.nextFloat();

		System.out.println("Digite outro número: ");
		float num2 = sc.nextFloat();

		float div = (num1 / num2);

		if (num2 == 0) {
			System.out.println("Não é possível dividir por zero. ");
		} else {
			System.out.printf("O resultado é: %.2f ", div);
		}
	}

}
