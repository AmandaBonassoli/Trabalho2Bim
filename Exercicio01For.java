
public class Exercicio01For {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os números ímpares de 1 até 100: ");
		
		for (int ímpar = 1; ímpar <= 100; ímpar++) {
			if (ímpar % 2 != 0) {
				System.out.println("Este número é ímpar = " + ímpar);
			}
		}
	}
}

