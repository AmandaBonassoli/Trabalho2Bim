import java.util.Scanner;

public class Exercicio10While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float soma = 0;
		
		int numeros = 1;
		while (numeros <=20) {
			System.out.println("Digite o " +numeros+ "° número: ");
			float numero = teclado.nextFloat();
			
			soma = soma + numero;
			numeros++;
			
		} teclado.close();
		  System.out.println("A soma de todos os valores é = " + soma);
	}
}
