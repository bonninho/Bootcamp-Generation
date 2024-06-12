package listaex0406;

import java.util.Scanner;

public class AtividadeSalario {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		leia.close();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é: " + novoSalario);
		
	}

}
