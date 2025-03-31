package lopal;

import java.util.Scanner;

public class ex1_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");

		}

		sc.close();
	}

}
