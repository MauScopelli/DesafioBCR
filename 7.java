package bcrTesteLogica;

import java.util.Scanner;

public class fizzBuzz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o número menor ou igual a 100: ");
		int num = entrada.nextInt();
		
		if (num > 100) {
			System.out.println("O número deve ser menor ou igual a 100!");
		}
		else {
			for (int i = 1; i <= num; i++) {				
				if (i%3 == 0 && i%5 == 0) {
					System.out.println("Fizz Buzz");
				}
				else if (i%3 == 0) {
					System.out.println("Fizz");
				}
				else if (i%5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}				
			}			
		}

		entrada.close();
	}

}
