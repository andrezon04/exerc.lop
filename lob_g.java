package aulas;

import java.util.Scanner;

public class lob_g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Digite o valor de B: ");
		double b = sc.nextDouble();

		System.out.print("Digite o valor de C: ");
		double c = sc.nextDouble();

		System.out.print("Digite o valor de D: ");
		double d = sc.nextDouble();

		double aa1 = a + b;
		double aa2 = a + c;
		double aa3 = a + d;
		double am1 = a * b;
		double am2 = a * c;
		double am3 = a * d;

		double ba1 = b + c;
		double ba2 = b + d;
		double bm1 = b * c;
		double bm2 = b * d;

		double ca1 = c + d;
		double cm1 = c * d;

		System.out.printf("Os valores da soma de A são: %.0f, %.0f e %.0f.", aa1, aa2, aa3);
		System.out.printf("\nOs valores da multiplicação de A são: %.0f, %.0f e %.0f", am1, am2, am3);

		System.out.printf("\nOs valores da soma de B são: %.0f e %.0f", ba1, ba2);
		System.out.printf("\nOs valores da multiplicação de B são: %.0f e %.0f", bm1, bm2);
		
		System.out.printf("\nO valor da soma de C é: %.0f", ca1);
		System.out.printf("\nO valor da multiplicação de C é: %.0f", cm1);

		sc.close();
	}

}
