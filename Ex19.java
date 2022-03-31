package estrutura_de_decisao;

import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double P1, P2, media;
		
		System.out.printf("Digite sua nota da p1");
		P1 = ler.nextDouble();
		
		System.out.printf("Digite sua nota da p2");
		P2 = ler.nextDouble();
		
		media = ((P1 + 2* P2) /3);
		
	    if (media >=5 ) {
	    	System.out.printf("VOCE ESTA APROVADO!");
	    	
	    }else  {
	    	System.out.printf("VOCE ESTA REPROVADO!");
	    }

	}

}

