package estrutura_de_decisao;

import java.util.Scanner;
class Ex15 {

	public static void main(String[] args) {
	
	    Scanner ler = new Scanner(System.in);
	    
	    double a, b, c;
		
	    System.out.printf( " Digite o valor do primeiro n�mero: " );
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo n�mero: ");
		b = ler.nextDouble();
		
		System.out.printf( "Digite o valor do terceiro n�mero: ");
		c = ler.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			if ((a == b) && (a == c) && (b == c)) {
				System.out.printf("O triagulo � equilatero");
			}else if ((a != b) && (a != c) && (b != c)) {
				System.out.printf("O triagulo � escaleno");
			}else {
				System.out.printf("O triagulo � isosceles");
			
				
			}
		}
	}
}