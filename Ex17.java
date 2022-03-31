package estrutura_de_decisao;

import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
	
	  Scanner ler = new Scanner(System.in);
		
	  double altura, peso, imc;
	  String sexo;
	  
	  System.out.printf("Voce é homem ou mulher?");
	  sexo = ler.nextLine();
	  
	  
	  
	  System.out.printf("Digite sua altura: ");
	  altura = ler.nextDouble();
	  
	  System.out.printf("Digite seu peso: ");
	  peso = ler.nextDouble();
	  
	  imc = peso / (altura * altura);
	  
	  if (sexo.equals("mulher")) {
		  System.out.printf("voce é mulher e esta no peso ideal");
	  
	  }else if  (imc>=19 && imc < 24) {
		  System.out.printf("Voce é mulher e esta no peso ideal ");
	  
	  }else {
		  
		  if (imc < 20) {
		  System.out.printf("voce e homem e esta abaixo do Peso Ideal ");
		  
		  }else if (imc >= 20 && imc < 25) {
			  System.out.printf("Voce é homem e esta no peso ideal ");
		  }else {
	  
		  System.out.printf("voce é homem e esta Acima do peso " );
		  
	  }
	
		

	}

	}
	
}
