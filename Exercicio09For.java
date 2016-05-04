import java.util.Scanner;

public class Exercicio09For {
	public static void main (String [] args){
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		
		for (int tabuada = 0; tabuada <= 10; tabuada++){
			System.out.println("" +numero+ " x " +tabuada+ " = " + (numero * tabuada));
			
		} teclado.close();
	}
}
