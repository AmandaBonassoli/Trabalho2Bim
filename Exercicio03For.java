import java.util.Scanner;

public class Exercicio03For {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int inteiro = teclado.nextInt();
		
		for (int positivo = 1; positivo <= inteiro; positivo++) {
			System.out.println("Imprimir Infinitamente até --> " + positivo);
		} teclado.close();
	} 
}
