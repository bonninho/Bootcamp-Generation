package listaex0606;

import java.util.Scanner;

public class LacosDoWhile5 {

	public static void main(String[] args) {
		int entrada, positivos=0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Digite um número: ");
			entrada = teclado.nextInt();
			
			if(entrada > 0) {
				positivos = positivos + entrada;
			}
			
		} while (entrada != 0);
		teclado.close();
		
		System.out.println("A soma dos números positivos é: " + positivos);

	}

}
