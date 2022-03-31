package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int NumA, NumB, NumC, NumD, NumE, media;
		
		System.out.printf("Digite o primeiro numero: ");
		NumA= ler.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		NumB= ler.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		NumC= ler.nextInt();
		
		System.out.printf("Digite o quarto numero: ");
		NumD= ler.nextInt();
		
		System.out.printf("Digite o quinto numero: ");
		NumE= ler.nextInt();
		
		media = NumA + NumB + NumC + NumD + NumE /5;
		
		System.out.printf("A media aritmetica é: %d", media);
		
		
	}

}
