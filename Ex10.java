package estrutura_de_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2;
		
		System.out.printf("Digite o primeiro numero");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero");
		valor2 = ler.nextDouble();
		
		if (valor1 > valor2) {
			System.out.printf("O valor %1f é maior que o outro valor", valor1);
		}else if (valor1 == valor2) {
			System.out.printf("Os valores %1f e %1f são iguais", valor1, valor2);
		}else {
			
			System.out.printf("O valor %1f é menor que o outro valor", valor2);
			
			
		}
		
		

	}

}
