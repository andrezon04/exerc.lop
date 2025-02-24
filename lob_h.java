package aulas;

import java.util.Scanner;

public class lob_h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o comprimento: ");
		double comp = sc.nextDouble();

		System.out.print("Digite a altura: ");
		double alt = sc.nextDouble();

		System.out.print("Digite a largura: ");
		double larg = sc.nextDouble();

		double vol = comp * larg * alt;

		System.out.printf("O Volume é = " + vol);

		sc.close();
	}

}
