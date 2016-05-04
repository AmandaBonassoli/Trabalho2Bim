
public class Exercicio02DoWhile {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os números pares de 1 até 100: ");
		
		int par = 1;
		do { 
			if (par % 2 == 0) {
				System.out.println("Este número é par = " + par);
			} par++;
		} while (par <= 100);
	}

}
