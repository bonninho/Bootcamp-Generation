package listaex0406;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		float salarioBruto, addNoturno, horaExtra, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("\nAdicional noturno: ");
		addNoturno = leia.nextFloat();
		
		System.out.printf("\nHoras Extras: ");
		horaExtra = leia.nextFloat();
		
		System.out.printf("\nDescontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = salarioBruto + addNoturno + (horaExtra * 5) - descontos;
		
		System.out.printf("\nSalário líquido: %.2f", salarioLiquido);
		
	}

}
