import java.util.Scanner;

public class Exercicio07For {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número de um lado entre 1 à 20: ");
		int lado = teclado.nextInt();
		
		for(int tamanho = 1; tamanho <= lado * lado; tamanho++) {
	            if(tamanho % lado == 0){
	            	if (lado >= 1 && lado <= 20) {
	            		System.out.printf("*\n");
	            	}
	            } else if (lado >= 1 && lado <= 20) {
	            	System.out.printf("*");
	        } 
	    } if (lado < 1 || lado > 20) {
	    	System.out.println("Tamanho Inexistente!! Digite novamente!!");
	    	teclado.close();
	    }
	}
}

