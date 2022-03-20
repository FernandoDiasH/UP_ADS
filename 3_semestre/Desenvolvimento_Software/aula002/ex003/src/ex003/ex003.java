package ex003;

import java.util.Scanner;

public class ex003 {
		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Matricula: ");
			String matricula = leitor.nextLine();
			
			System.out.println("Nome: ");
			String nome= leitor.nextLine();
			
			System.out.println("Nota: ");
			double nota_1 = leitor.nextDouble();
			
			System.out.println("Nota: ");
			double nota_2 = leitor.nextDouble();
			
			double media = (nota_1 + nota_2) / 2;
			String result = "Aprovado: Sim ( ) Não ( )";
			
			
			if(media >= 6) {
				result = "Aprovado: Sim (x) Não ( )";
			}
			else {
				result = "Aprovado: Sim ( ) Não (x)";
			}
			
			System.out.println("Matricula: " + matricula);
			System.out.println("Nome: " + nome);
			System.out.println("1° Nota: " + nota_1);	
			System.out.println("2° Nota: " + nota_2);		
			System.out.println(result);
			System.out.println("Nota Final " + media);
			
			
			leitor.close();
			
			
		}
}
