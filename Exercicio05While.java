import java.util.Scanner;

public class Exercicio05While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float numero = 0;
		float soma = 0;
		float media = 0;
		float maior = 0;
		float menor = 0;
		
		int numeros = 1;
		while (numeros <= 10){
			System.out.println("Digite o " +numeros+ "� n�mero: ");
			numero = teclado.nextFloat();
			
			soma = soma + numero;
			media = soma / 10;
			
			if (numero == 1) {
				maior = numero;
				menor = numero;
			} else if (numero > maior) {
				maior = numero;
			} else if (numero < menor) {
				menor = numero;
			} numeros++;
		} teclado.close();
		  System.out.println("O maior n�mero � --> " + maior);
		  System.out.println("O menor n�mero � --> " + menor);
		  System.out.println("A m�dia aritm�tica dos n�meros � --> " + media);
	}
}
