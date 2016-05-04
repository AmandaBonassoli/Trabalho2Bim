
public class Exercicio02For {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os números pares de 1 até 100: ");
		
		for(int par = 1; par <= 100; par++) {
			if (par % 2 == 0) {
				System.out.println("Este número é par = " + par);
			}
		} 
	}
}
