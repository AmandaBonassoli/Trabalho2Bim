import java.util.Scanner;

public class Exercicio09While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		int tabuada = 0;
		while (tabuada <= 10) {
			System.out.println("" +numero+ " x " +tabuada+ " = " + (numero * tabuada));
			tabuada++;
		} teclado.close();
	}

}
