package listaex1006;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.Scanner;

public class ExCollection02 {

	public static void main(String[] args) {

		int buscar, posicao = -1;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);

		Collections.addAll(numeros, 1, 5, 6, 8, 9, 3, 2, 4, 7, 10);

		System.out.println("Digite o número que deseja encontrar: ");
		buscar = teclado.nextInt();

		teclado.close();

		for (int numero : numeros) {
			if (numero == buscar) {
				posicao = numeros.indexOf(buscar);
				break;
			}
		}

		if (posicao >= 0) {
			System.out.printf("O número %d está localizado na posição: %d", buscar, posicao);
		} else {
			System.out.println("O número " + buscar + " não foi encontrado!");
		}
	}

}
