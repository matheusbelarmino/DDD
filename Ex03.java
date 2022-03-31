package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 int base, altura, area;
	 
	 System.out.printf("Digite o primeiro valor: ");
	 base = ler.nextInt();
	 
	 System.out.printf("Digite o segundo valor: ");
	 altura = ler.nextInt();
	 
	 area = base * altura /2;
	 
	 System.out.printf("A area do triangulo é: %d", area);

		}

}
