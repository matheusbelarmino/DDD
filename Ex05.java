package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
    Scanner ler = new Scanner(System.in);
    
    double a, Fahrenheit;
    
    System.out.printf("Digite a temperatura em Cº");
    a= ler.nextDouble();
    
    System.out.printf("Digite a temperatura equivalente em Fahrenheit");
    
    Fahrenheit = (a * 1.8)+32;
    
    System.out.printf(" A temperatura em Fº:%.2f", Fahrenheit);
    }

}
