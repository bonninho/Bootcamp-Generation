package listaex0506;

import java.util.Scanner;

public class CaseLanches5 {

	public static void main(String[] args) {
		int codProduto = 0, quantidade = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*****************************");
		System.out.println("****LANCHONETE DO BONINHO****");
		System.out.println("*****************************");

		System.out.print("Insira o código do produto: ");
		codProduto = teclado.nextInt();
		
		System.out.print("Insira a quantidade: ");
		quantidade = teclado.nextInt();
		
		teclado.close();
		
		System.out.println();
		
		switch (codProduto) {
		case 1: {
			System.out.printf("Produto: Cachorro Quente\nValor total:R$ %.2f", quantidade*10.0);
			break;
		}
		case 2: {
			System.out.printf("Produto: X-Salada\nValor total:R$ %.2f", quantidade*15.0);
			break;
		}
		case 3: {
			System.out.printf("Produto: X-Bacon\nValor total:R$ %.2f", quantidade*18.0);
			break;
		}
		case 4: {
			System.out.printf("Produto: Bauru\nValor total:R$ %.2f", quantidade*12.0);
			break;
		}
		case 5: {
			System.out.printf("Produto: Refrigerante\nValor total:R$ %.2f", quantidade*8.0);
			break;
		}
		case 6: {
			System.out.printf("Produto: Suco de laranja\nValor total:R$ %.2f", quantidade*13.0);
			break;
		}
		default:
			System.out.println("Código inválido!");
			break;
		}
	}

}
