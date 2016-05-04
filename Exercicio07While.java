import java.util.Scanner;

public class Exercicio07While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número de um lado entre 1 à 20: ");
		int lado = teclado.nextInt();
		
		int tamanho = 1;
		while (tamanho <= lado * lado) {
			if (tamanho % lado == 0) {
				if (lado >= 1 && lado <= 20) {
					System.out.printf("*\n");
				}
			} else if (lado >= 1 && lado <= 20) {
				System.out.printf("*");
			} tamanho++;
		} if (lado < 1 || lado > 20) {
			System.out.println("Tamanho Inexistente!! Digite novamente!!");
	    	teclado.close();
		}
	}
}
