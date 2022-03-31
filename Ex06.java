package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
    double a, b, cotacao;
    
    System.out.printf("Digite o valor");
    a = ler.nextDouble();
    
    System.out.printf("Digite a cotacao");
   b = ler.nextDouble();
    
    cotacao = a * b;
    
    System.out.printf("A cotacao em reais é: %.2f", cotacao);
    
	}

}
