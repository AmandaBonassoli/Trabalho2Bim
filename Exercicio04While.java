import java.util.Scanner;

public class Exercicio04While {
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o número de alunos que sua sala contém: ");
		int alunos = teclado.nextInt();
		float soma = 0;
		
		int aluno = 1;
		while (aluno <= alunos) {
			System.out.println("Digite a nota do " +aluno+ "° aluno: ");
			float nota = teclado.nextFloat();
			soma = soma + nota;
			aluno++;
		} teclado.close();
		  float media;
		  media = soma / alunos;
          System.out.println("A média aritmética da turma é: " + media);
    }
}