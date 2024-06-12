package listaex0606;

import java.util.Scanner;

public class LacosFor01 {

	public static void main(String[] args) {
		
		int comeco, fim;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		comeco = teclado.nextInt();;
		System.out.print("Digite o último número do intervalo: ");
		fim = teclado.nextInt();
		
		teclado.close();
		
		if (fim < comeco) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.printf("No intervalo entre %d e %d:\n",comeco,fim);
			for(int i = comeco; i <= fim; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
				
			}
		}

	}

}
