package listaex0406;

import java.util.Scanner;

public class LeiaValores04 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.printf("\nNúmero 2: ");
		n2 = leia.nextFloat();
		
		System.out.printf("\nNúmero 3: ");
		n3 = leia.nextFloat();
		
		System.out.printf("\nNúmero 4: ");
		n4 = leia.nextFloat();
		
		leia.close();
		
		resultado = (n1 * n2)-(n3 * n4);
		
		System.out.printf("\nDiferença: %.1f", resultado);

	}

}
