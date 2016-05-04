import java.util.Scanner;

public class Exercicio10For {
	public static void main (String [] args){
		
		Scanner teclado = new Scanner (System.in);
		
		float soma = 0;
		
		for (int numeros = 1; numeros <= 20; numeros++){
		
		System.out.println("Digite o " +numeros+ "° número: ");
		float numero = teclado.nextFloat();
		
		soma = soma + numero;
		
	    } teclado.close();
		System.out.println("A soma de todos estes valores é = " + soma);
	}
}
