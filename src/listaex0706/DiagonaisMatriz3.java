package listaex0706;

import java.util.Scanner;

public class DiagonaisMatriz3 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int diagPrincipal = 0, diagSecundaria = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				
				System.out.printf("\nInsira o número na posição [%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		
		teclado.close();
		
		System.out.println("Elementos da diagonal principal: ");
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				
				if(linha == coluna) {
					System.out.print(matriz[linha][coluna]+" ");
					diagPrincipal = diagPrincipal + matriz[linha][coluna];
				}
			}
		}
		System.out.printf("\n");
		
		
		System.out.println("Elementos da diagonal secundária: ");
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				
				if(linha+coluna == 2) {
					System.out.print(matriz[linha][coluna]+" ");
					diagSecundaria = diagSecundaria + matriz[linha][coluna];
				}
			}
		}
		System.out.printf("\n");
		
		System.out.println("Soma dos elementos da diagonal principal: " + diagPrincipal);
		
		System.out.println("Soma dos elementos da diagonal secundária: " + diagSecundaria);
		
	}
	
}
