package estrutura_de_decisao;

import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	double peso, altura, imc;
	
	System.out.printf("Digite o peso");
	peso = ler.nextDouble();
	
	System.out.printf("Digite a altura em metros");
	altura = ler.nextDouble();
	
	imc = peso / (altura * altura);
	System.out.printf("Seu imc é de %2.f", imc);

	}

}
