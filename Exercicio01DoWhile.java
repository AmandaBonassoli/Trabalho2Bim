
public class Exercicio01DoWhile {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os números ímpares de 1 até 100: ");
		
		int ímpar = 1;
		do { 
			if (ímpar % 2 != 0) {
			System.out.println("Este número é ímpar = " + ímpar);
			} ímpar++;
		} while (ímpar <= 100);
	}
}
