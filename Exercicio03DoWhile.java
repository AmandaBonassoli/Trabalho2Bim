import java.util.Scanner;

public class Exercicio03DoWhile {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		int inteiro = teclado.nextInt();
		
		int positivo = 1;
		do { 
			System.out.println("Imprimir Infinitamente at� --> " + positivo);
			positivo++;
		} while (positivo <= inteiro);
		  teclado.close();
	}
}
