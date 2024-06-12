package listaex0506;

import java.util.Scanner;

public class ReajusteSalario6 {

	public static void main(String[] args) {
		
		String nome, cargo = "";
		float salario,novoSalario,reajuste=0;
		int cargoNum;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nome  = teclado.nextLine();
		
		System.out.printf("\nCargo: ");
		cargoNum = teclado.nextInt();
		
		System.out.printf("\nSalário: ");
		salario = teclado.nextFloat();
		
		teclado.close();
		
		switch (cargoNum) {
		case 1: {
			cargo = "Gerente";
			reajuste = 10;
			break;
			}
		case 2: {
			cargo = "Vendedor";
			reajuste = 7;
			break;
			}
		case 3: {
			cargo = "Supervisor";
			reajuste = 9;
			break;
			}
		case 4:{
			cargo = "Motorista";
			reajuste = 6;
			break;
			}
		case 5: {
			cargo = "Estoquista";
			reajuste = 5;
			break;
			}
		case 6:{
			cargo = "Técnico de TI";
			reajuste = 8;
			break;
			}
		}
		
		novoSalario = salario + ((reajuste/100)*salario);
		
		System.out.println("******************************");
		System.out.printf("Nome do colaborador: %s \n"
						+ "Cargo: %s \n"
						+ "Salário: R$ %.2f",nome,cargo,novoSalario);
		
	}

}
