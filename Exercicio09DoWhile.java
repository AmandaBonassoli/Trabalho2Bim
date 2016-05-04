import java.util.Scanner;

public class Exercicio09DoWhile {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		int tabuada = 0;
		do {
			System.out.println("" +numero+ " x " +tabuada+ " = " + (numero * tabuada));
			tabuada++;
		} while (tabuada <= 10);
		  teclado.close();
	}

}
