package bcrTesteLogica;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro menor do que 46: ");
		int numInformado = entrada.nextInt();

		if (numInformado >= 46) {
			System.out.println("O número informado deve ser menor do que 46!");
		} else {
			int numAnterior = 0;
			int numAtual = 1;
			int numAux;

			System.out.print(numAnterior + " ");
			while (numAtual < numInformado) {
				System.out.print(numAtual + " ");
				numAux = numAnterior;
				numAnterior = numAtual;
				numAtual = numAtual + numAux;

			}
		}
		entrada.close();
	}

}
