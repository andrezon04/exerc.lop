package exercicio;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua nota: ");
		double nota = sc.nextDouble();

		if (nota > 7) {
			System.out.println("Você está aprovado, parabéns! ");
		} else if (nota < 4) {
			System.out.println("Você está reprovado, que pena. ");
		} else if (nota <= 7 && nota >= 4) {
			System.out.println("Você está de recuperação, boa sorte. ");
		}

	}

}
