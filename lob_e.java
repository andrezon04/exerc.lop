package aulas;

import java.util.Scanner;

public class lob_e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do bem: R$");
		double valor = sc.nextDouble();

		System.out.print("Digite o valor da taxa(%): ");
		double taxa = sc.nextDouble();

		System.out.print("Digite o tempo de atraso da prestação em meses: ");
		double tempo = sc.nextDouble();

		double total = valor + (valor * (taxa / 100) * tempo);

		System.out.printf("O valor do bem em atraso é: R$ %.2f", total);

		sc.close();

	}

}
