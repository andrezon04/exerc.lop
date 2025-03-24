package exercicio;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num1, num2 = sc.nextInt();
		num1 = num2;
		int x = 0;

		while (x < 6) {
			num1 = ((num1 + num2) * 2);
			x++;
			System.out.println("O resultado é : " + num1);
		}

	}

}
