package lopal;

public class ExLopal1 {

	public static void main(String[] args) {
		int[] valores = { 55, 75, 90, 115, 130, 170, 200 };
		int totalsem = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Dia" + (i + 1) + ": R$" + valores[i]);
			totalsem += valores[i];
		}
		double media = ((double) totalsem / valores.length);// Uso de "valores.lenght" pois é mais prático e flexível e transformar temporariamente as variáveis em "double" com "(double)"
		System.out.println("\nO valor total gasto em reais é: R$" + totalsem);
		System.out.printf("A média total da semana em reais é: R$ %.2f%n",media);
	}

}
