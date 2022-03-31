package estrutura_de_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double cat1, cat2, hipotenusa;
		System.out.printf("Digite o valor do primeiro cateto");
		cat1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo cateto");
		cat2 = ler.nextDouble();
		
		System.out.printf("Digite o valor da hipotenusa");
		hipotenusa = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor");
		cat1 = ler.nextDouble();
		System.out.printf("Digite o segundo valor");
		cat2 = ler.nextDouble();
		System.out.printf("Digite o terceiro valor");
		hipotenusa = ler.nextDouble();
		
		if ( hipotenusa * hipotenusa == cat1*cat1 + cat2*cat2) {
			System.out.printf("Este triangulo pode ser um triangulo retangulo");
		}else {
			System.out.printf("Esse triangulo não pode ser um triangulo retangulo");
		}
	}

}
