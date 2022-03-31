package estrutura_de_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double P1, P2, media;
		
		media = 5.0;
		System.out.printf("Digite sua primeira nota");
		P1 = ler.nextDouble();
		P2 = (( media * 3 ) - P1 ) / 2 ;
		System.out.printf( "Para poder passar você deve tirar pelo menos %.1f na segunda prova!" , P2 );
		
		

	}

}
