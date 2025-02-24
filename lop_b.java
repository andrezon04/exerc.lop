package aulas;

import java.util.Scanner;

public class lop_b {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);

		System.out.print("Digite quantos graus está em Fahrenheit(F): ");
		double fahr = temp.nextDouble();

		double resultado = ((fahr - 32) * 5) / 9;

		System.out.printf("Convertendo para Celsius(C), fica: %.1fºC",resultado);

	}

}
