package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite o primeiro valor");
		base = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		System.out.printf("A area é %.2f", area);

	}

}
