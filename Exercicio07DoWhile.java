import java.util.Scanner;

public class Exercicio07DoWhile {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um n�mero de um lado entre 1 � 20: ");
		int lado = teclado.nextInt();
		
		int tamanho = 1;
		do {
			if (tamanho % lado == 0) {
				if (lado >= 1 && lado <= 20) {
					System.out.printf("*\n");
				}
			} else if (lado >= 1 && lado <= 20) {
				System.out.printf("*");
			} tamanho++;
		} while (tamanho <= lado * lado);
		if (lado < 1 || lado > 20) {
		System.out.println("Tamanho Inexistente!! Digite novamente!!");
    	teclado.close();
	    
		}
	}
}
