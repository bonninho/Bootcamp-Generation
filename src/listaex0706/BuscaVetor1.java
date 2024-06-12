package listaex0706;

import java.util.Scanner;

public class BuscaVetor1 {

	public static void main(String[] args) {
		
		int numeros[] = {2,5,1,3,4,9,7,8,10,6};
		int buscar, posicao = -1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		buscar = teclado.nextInt();
		
		teclado.close();
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == buscar) {
				posicao = i;
				break;
				}
			}
		
		if (posicao >= 0) {
			System.out.printf("\nO número %d está localizado na posição: %d", buscar, posicao);
		
		} else {
			System.out.printf("\nO número %d não foi encontrado!", buscar);
		}

	}

}
