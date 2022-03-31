package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		double A, B, C, D, E, valor, soma;
		
		System.out.printf("Digite o primeiro nuemero");
		A = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero");
		B= ler.nextDouble();
		
		System.out.printf("Digite o terceiro numero");
		C= ler.nextDouble();
		
		System.out.printf("Digite o quarto numero");
		D= ler.nextDouble();
		
		System.out.printf("Digite o quinto numero");
		E= ler.nextDouble();
		
		valor = 1500;
		
		soma = A + B + C + D + E - valor;
		
		System.out.printf("O valor do troco é de: %.2f", valor);
		
		
	}

}
