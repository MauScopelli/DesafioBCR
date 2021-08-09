package bcrTesteLogica;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ternosRepetidos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma sequência com as letras que representam os ternos de Carlo: ");
		String ternos = entrada.next();

		String ternosUnicos = RemoverRepetidas(ternos);

		int ternosRemovidos = ternos.length() - ternosUnicos.length();

		System.out.println(ternosRemovidos);

		entrada.close();
	}

	private static String RemoverRepetidas(String texto) {
		Pattern padrao = Pattern.compile("([A-Za-z])\\1+");
		return padrao.matcher(texto).replaceAll("$1");
	}
}
