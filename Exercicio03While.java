import java.util.Scanner;

public class Exercicio03While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int inteiro = teclado.nextInt();
		
		int positivo = 1;
		while (positivo <= inteiro) {
			System.out.println("Imprimir Infinitamente até --> " + positivo);
			positivo++;
	    } teclado.close();
	}
}
