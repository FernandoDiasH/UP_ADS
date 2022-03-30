import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class programa {
	public static void main(String[] args) throws FileNotFoundException {
		
//		
//		aluno1.matricula ="12345";
//		aluno1.nome = "Joao";
//		aluno1.nota1 = 7.5;
//		aluno1.nota2 = 7.6;
//		aluno1.nota3 = 4.8;
//		
//		Aluno aluno2 = new Aluno();
//		aluno2.matricula ="6596";
//		aluno2.nome = "Marcos";
//		aluno2.nota1 = 4.5;
//		aluno2.nota2 = 9.6;
//		aluno2.nota3 = 6.8;
//		
		File arquivos = new File("C:\\Users\\Aluno\\Desktop\\aula004\\ExClasse\\src\\alunos.csv");
		Scanner leitor = new Scanner(arquivos);
		leitor.nextLine();
		
		Aluno[] alunos = new Aluno[5];
		int contador = 0;

		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String [] dados = linha.split(";");
			String matricula = dados[0];
			String nome = dados[1];
			String nota1 = dados[2];
			String nota2 = dados[3];
			String nota3 = dados[4];
			
			Aluno aluno = new Aluno();
			aluno.matricula = matricula;
			aluno.nome = nome;
			aluno.nota1 = Double.parseDouble(nota1);
			aluno.nota2 = Double.parseDouble(nota2);
			aluno.nota3 = Double.parseDouble(nota3);
			
			
			alunos[contador] = aluno;
			contador++;
		}
		

		
//		alunos[0] = aluno1;
//		alunos[1] = aluno2;
		
		for (int i = 0; i < alunos.length; i++) {
			Aluno a = alunos[i];
			System.out.println("Maticula: " + a.matricula);
			System.out.println("Nome: " + a.nome);
			System.out.println("Nota 1: " + a.nota1);
			System.out.println("Nota 2: " + a.nota2);
			System.out.println("Nota 3: " + a.nota3);
			System.out.println();
		}
		
		
		
		leitor.close();
		
		
	}
}
