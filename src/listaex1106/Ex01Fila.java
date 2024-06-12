package listaex1106;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner teclado = new Scanner(System.in);
		int categoria;
		String nomeCliente;
		
		System.out.println("******************************"
				+ "\n1 - Adicionar cliente na fila"
				+ "\n2 - Listar todos os clientes"
				+ "\n3 - Retirar cliente da fila"
				+ "\n0 - Sair"
				+ "\n******************************");

		do {
			System.out.println("\nDigite uma opção: ");
			categoria = teclado.nextInt();
			
			switch(categoria){
			case 1: 
				System.out.println("Digite o nome do cliente:");
				teclado.skip("\\R?");
				fila.add(teclado.nextLine());
				
				System.out.println("Cliente adicionado!");
				break;

			case 2: System.out.println("Lista de clientes na fila:");
				System.out.println(fila);
				break;
			case 3: nomeCliente = fila.poll();
					if (nomeCliente == null) {
						System.out.println("A fila está vazia!");
					} else {
						System.out.println("Cliente "+ nomeCliente + " foi chamado!");
						System.out.println("Fila atual: " + fila);
					}
					break;
			case 0: 
				System.out.println("Programa finalizado!");
				break;
			default: System.out.println("Opção inválida! Por favor escolha uma opção de 0 a 3.");
			}
			
		} while (categoria != 0);
		
		teclado.close();
		
		

	}

}
