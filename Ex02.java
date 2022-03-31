package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  
	  double base, altura, area;
	  
	  base = 10.5;
	  altura = 5.5;
	  area = base * altura;
	  
	  System.out.printf("A area do quadrado é: %2f", area);
	}

}
