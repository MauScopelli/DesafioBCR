package bcrTesteLogica;

import java.util.Scanner;

public class encontrandoEmail {

	public static void main(String[] args) {

		// Recebe a quantidade de emails
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de emails: ");
		int qtdEmail = entrada.nextInt();

		// Recebe a palavra a ser pesquisada
		System.out.print("Informe a palavra-chave a ser pesquisada: ");
		String palavraChave = entrada.next();

		// Recebe o assunto dos emails
		System.out.println("Informe o assunto do(s) email(s): ");
		String[] emails = new String[qtdEmail + 1];
		for (int i = 0; i <= qtdEmail; i++) {
			String email = entrada.nextLine();
			emails[i] = email;
		}

		// Pesquisa a palavra chave nos emails
		for (int i = 0; i <= qtdEmail; i++) {
			String email = emails[i];
			if (email.toLowerCase().contains(palavraChave.toLowerCase())) {
				System.out.println(email);
			}
		}

		entrada.close();
	}
}
