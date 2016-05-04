import java.util.Scanner;

public class Exercicio10DoWhile {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float soma = 0;
		
		int numeros = 1;
		do {
			System.out.println("Digite o " +numeros+ "° número: ");
			float numero = teclado.nextFloat();
			
			soma = soma + numero;
			numeros++;
		} while (numeros <=20);
		  teclado.close();
		  System.out.println("A soma de todos os valores é = " + soma);
	}
}
