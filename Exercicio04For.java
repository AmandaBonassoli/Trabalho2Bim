import java.util.Scanner;

public class Exercicio04For {
	public static void main (String [] args){
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o número de alunos que sua sala contém: ");
		int alunos = teclado.nextInt();
		float soma = 0;
		
		for(int aluno = 1; aluno <= alunos; aluno++){
			System.out.println("Digite a nota do " +aluno+ "° aluno: ");
			float nota = teclado.nextFloat();
			soma = soma + nota;
		} teclado.close();
		  float media;
		  media = soma / alunos;
		  System.out.println("A média aritmética da turma é: " + media);
	} 
}
