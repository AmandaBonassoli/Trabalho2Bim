
public class Exercicio02While {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os n�meros pares de 1 at� 100: ");
		
		int par = 1;
		while (par <= 100) {
			if (par % 2 == 0) {
				System.out.println("Este n�mero � par = " + par);
			} par++;
		}
	}
}
