import java.util.Scanner;

public class Exercicio08For {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite seu nome usuário: ");
		String usuario = teclado.next();
		System.out.println("Em seguida, digite quantas vezes quer que seu nome se repita: ");
		int quantidades = teclado.nextInt();
		
		System.out.println("Nome: " +usuario+ ", " +quantidades+ " vezes: ");
		
		for(int quantidade = 1; quantidade <= quantidades; quantidade++) {
			
			System.out.println("" + usuario);
		} teclado.close();
	}
}
