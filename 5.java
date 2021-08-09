package bcrTesteLogica;

import java.util.Scanner;

public class fabricaDeFitas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o tamanho da fita: ");
		int tamanhoFita = entrada.nextInt();
		
		System.out.print("Informe a palavra a ser impressa: ");
		String palavraImpressa = entrada.next();
		
		if (palavraImpressa.length() > 30) {
			System.out.println("A palavra não deve exceder o limite de 30 caracteres!");
		}
		else {
			int qtdFita = 0;
			String textoFita = "";
			while (textoFita.length() + palavraImpressa.length() <= tamanhoFita) {
				textoFita = textoFita + palavraImpressa;				
				qtdFita = qtdFita + 1;
			};
			
			int tamanhoRestante = tamanhoFita - textoFita.length();
			textoFita = textoFita + palavraImpressa.substring(0, tamanhoRestante);

			System.out.println(qtdFita);
			System.out.println(textoFita);
		}
		
		entrada.close();
	}
}
