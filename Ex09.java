package estrutura_de_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
     double valorA, valorB;
		
	    System.out.printf("Digite o primeiro numero:");
	    valorA = ler.nextDouble();
	    
	    System.out.printf("Digite o segundo numero:");
	    valorB = ler.nextDouble();
	    
	    if(valorA < valorB) {
	    	System.out.printf("O valorA é menor que o valorB");
	    } else  {
	    	System.out.printf("O valorB é menor que o valorA");

	}

	}
	
}
