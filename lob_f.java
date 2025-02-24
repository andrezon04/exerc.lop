package aulas;

import java.util.Scanner;

public class lob_f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da variável A: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite o valor da variável B: ");
		double b = sc.nextDouble();
		
		System.out.printf("Os valores antes da troca: A = %.0f e B = %.0f", a, b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.printf("\nOs valores após a troca: A = %.0f e B = %.0f", a, b);
	
		sc.close();

	}

}
