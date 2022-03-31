package estrutura_de_decisao;

import java.util.Scanner;
class Ex15 {

	public static void main(String[] args) {
	
	    Scanner ler = new Scanner(System.in);
	    
	    double a, b, c;
		
	    System.out.printf( " Digite o valor do primeiro número: " );
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo número: ");
		b = ler.nextDouble();
		
		System.out.printf( "Digite o valor do terceiro número: ");
		c = ler.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			if ((a == b) && (a == c) && (b == c)) {
				System.out.printf("O triagulo é equilatero");
			}else if ((a != b) && (a != c) && (b != c)) {
				System.out.printf("O triagulo é escaleno");
			}else {
				System.out.printf("O triagulo é isosceles");
			
				
			}
		}
	}
}