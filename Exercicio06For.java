import java.util.Scanner;

public class Exercicio06For {
	public static void main (String [] args){
		
		Scanner teclado = new Scanner (System.in);
		
		int positivo = 0;
		int negativo = 0;
		for (int numeros = 1; numeros <= 20; numeros++){
			System.out.println("Digite o " +numeros+ "� n�mero: ");
			int numero = teclado.nextInt();
			
			if (numero > 0){
			numero = 1;
			positivo =  positivo + numero;
			
			} else if (numero < 0){
			numero = 1;
			negativo = negativo + numero;
			}
		} teclado.close();
		System.out.println("S�o positivos " + positivo + " n�mero(s) e s�o negativos " + negativo + " n�mero(s)");
	}
}
