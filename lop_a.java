package aulas;

import java.util.Scanner;

public class lop_a {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);

		System.out.print("Digite quantos graus está em Celsius(C): ");
		double celsius = temp.nextDouble();

		double resultado = celsius * 9 / 5 + 32;

		System.out.printf("Convertendo para Fahrenheit(F), fica: %.1fºF ",resultado);

	}

}
