package listaex1006;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExCollection04 {
	public static void main(String[] args) {
		int buscar;
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner teclado = new Scanner(System.in);

		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		System.out.println("Digite o número que deseja encontrar: ");
		buscar = teclado.nextInt();

		teclado.close();

		if (numeros.contains(buscar)) {
			System.out.println("O número " + buscar + " foi encontrado!");
		} else {
			System.out.println("O número " + buscar + " não foi encontrado!");
		}

	}

}
