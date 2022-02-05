package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double nota1, nota2, media = 0, tot = 0, continuar = 0;

		try (Scanner leitor = new Scanner(System.in)) {
			while (continuar != 2) {
				while (tot < 2) {
					media = 0;
					System.out.println("Digite a note 1:");
					nota1 = 0;
					nota1 = leitor.nextDouble();
					if (nota1 > 0 && nota1 <= 10) {
						media = media + nota1;
						tot++;
						System.out.println(nota1);
					} else {
						System.out.println("Nota inválida");
					}
					System.out.println("Digite a nota 2: ");
					nota2 = 0;
					nota2 = leitor.nextDouble();

					if (nota2 > 0 && nota2 <= 10) {
						media = media + nota2;
						tot++;
						System.out.println(nota2);
					} else {
						System.out.println("Nota inválida");

					}
				}

				System.out.println("A média é " + media / 2);

				System.out.println("Pressione 1 para continuar ou 2 para sair  ");
				continuar = leitor.nextDouble();
				tot = 0;
				media = 0;
			}
		}

		System.out.println("Programa finalizado");

	}

}
