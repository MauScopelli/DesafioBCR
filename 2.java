package bcrTesteLogica;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro menor do que 40: ");

		int numInformado = entrada.nextInt();

		if (numInformado >= 40) {
			System.out.println("O número informado deve ser menor do que 40!");
		} else {
			int numTotal = 1;
			for (int i = 1; i <= numInformado; i++) {
				numTotal = numTotal * i;

			}
			System.out.println(numTotal);

		}
		entrada.close();
	}

}
