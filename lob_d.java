package aulas;

import java.util.Scanner;

public class lob_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quanto tempo durou a viagem em Horas: ");
		double tempo = sc.nextDouble();

		System.out.print("Qual era a velocidade média percorrida durante a viagem em Km/h: ");
		double velm = sc.nextDouble();

		double distancia = tempo * velm;

		double combustivel = distancia / 12;

		System.out.println("A viagem durou " + tempo + " horas, com uma velocidade média de " + velm
				+ " Km/h, percorrendo uma distância de " + distancia + " quilômetros e gastando um total de "
				+ combustivel + " litros de combustível.");

	}

}
