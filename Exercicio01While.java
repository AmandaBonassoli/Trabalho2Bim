
public class Exercicio01While {
	public static void main (String [] args) {
		
		System.out.println("Imprimir todos os n�meros �mpares de 1 at� 100: ");
		
		int �mpar = 1;
		while (�mpar <= 100) {
			if (�mpar % 2 != 0) {
				System.out.println("Este n�mero � �mpar = " + �mpar);
			} �mpar++;
		} 
	}
}