package aulas;

import java.util.Scanner;

public class lop_c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio da lata: ");
		double raio = sc.nextDouble();

		System.out.println("Agora, digite a altura: ");
		double altura = sc.nextDouble();

		double resultado = 3.14159 * (raio * raio) * altura;

		System.out.println("O volume da lata é: " + resultado);

	}

}
