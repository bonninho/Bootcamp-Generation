package listaex1106;

import java.util.Scanner;
import java.util.Stack;

public class Ex02Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner teclado = new Scanner(System.in);
		int categoria;
		String nomeLivro;
		
		System.out.println("******************************"
				+ "\n1 - Adicionar livro na pilha"
				+ "\n2 - Listar todos os livros"
				+ "\n3 - Retirar livro da pilha"
				+ "\n0 - Sair"
				+ "\n******************************");

		do {
			System.out.println("\nDigite uma opção: ");
			categoria = teclado.nextInt();
			
			switch(categoria){
			case 1: 
				System.out.println("Digite o nome do livro:");
				teclado.skip("\\R?");
				pilha.push(teclado.nextLine());
				
				System.out.println("Livro adicionado!");
				break;

			case 2: System.out.println("Lista de livros na pilha:");
				System.out.println(pilha);
				break;
				
			case 3: if (pilha.isEmpty()) {
						System.out.println("A pilha está vazia!");
					} else {
						nomeLivro = pilha.pop();
						System.out.println("Livro "+ nomeLivro + " foi retirado da pilha!");
						System.out.println("Pilha atual: " + pilha);
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
