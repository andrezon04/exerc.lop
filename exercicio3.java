package exercicio;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		float num1 = sc.nextFloat();

		if (num1 >= 11 && num1 <= 19) {
			System.out.println("O número é maior que 10 e menor que 20. ");
		} else if (num1 >= 31 && num1 <= 39) {
			System.out.println("O número é maior que 30 e menor que 40. ");
		} else {
			System.out.println("O número não se encaixa em nenhuma classe. ");
		}

	}
}
