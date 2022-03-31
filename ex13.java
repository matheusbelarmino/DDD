package estrutura_de_decisao;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3;
		
		System.out.printf("Digite o primeiro valor");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor");
		valor3 = ler.nextDouble();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.printf("o maior valor entre eles é o  %1f", valor1);
			
		}else if (valor2 > valor1 && valor2 > valor3) {
			System.out.printf("o maior valor entre eles é o %1f", valor2);
			
		}else {
			System.out.printf("o maior valor entre eles é o %1f", valor3);
			
			
		}

	}

}
