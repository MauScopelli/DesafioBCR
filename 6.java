package bcrTesteLogica;

import java.util.Scanner;

public class rodandoListas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o tamanho do array e a quantidade de rotações: ");
		int tamanhoArray = entrada.nextInt();
		int qtdRotacoes = entrada.nextInt();

		System.out.print("Informe o array separado por espaço: ");
		int[] array = new int[tamanhoArray];
		for (int i = 0; i < tamanhoArray; i++) {
			array[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < qtdRotacoes; i++) {

			int[] arrayAux = new int[tamanhoArray];
			for (int j = 1; j < array.length; j++) {
				arrayAux[j-1] = array[j];				
			}
			arrayAux[tamanhoArray-1] = array[0];

			array = arrayAux;
		}
		
		if (tamanhoArray >= 1)
		{
			System.out.print(array[0]);
			for (int i = 1; i < tamanhoArray; i++) {
				System.out.print(" " + array[i]);	
			}
		}
		entrada.close();
	}

}
