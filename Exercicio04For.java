import java.util.Scanner;

public class Exercicio04For {
	public static void main (String [] args){
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o n�mero de alunos que sua sala cont�m: ");
		int alunos = teclado.nextInt();
		float soma = 0;
		
		for(int aluno = 1; aluno <= alunos; aluno++){
			System.out.println("Digite a nota do " +aluno+ "� aluno: ");
			float nota = teclado.nextFloat();
			soma = soma + nota;
		} teclado.close();
		  float media;
		  media = soma / alunos;
		  System.out.println("A m�dia aritm�tica da turma �: " + media);
	} 
}
