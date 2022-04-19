package ex005;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Exercicios\\Dev_Soft\\src\\ex005\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();

		
		while(leitor.hasNext()) {
			System.out.println(leitor.nextLine());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
	}
}
