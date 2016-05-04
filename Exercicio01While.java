
public class Exercicio01While {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os números ímpares de 1 até 100: ");
		
		int ímpar = 1;
		while (ímpar <= 100) {
			if (ímpar % 2 != 0) {
				System.out.println("Este número é ímpar = " + ímpar);
			} ímpar++;
		} 
	}
}