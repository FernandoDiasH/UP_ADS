package ex004;
import java.util.Scanner;

public class programa004 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Matricula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Nome: ");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		int cont = 0;
		
		do {
			System.out.println("Digite uma nota entre 0 e 10.");
			System.out.println("Nota " + (cont + 1) + ":");
			double temp = leitor.nextDouble();
			
			if (temp >= 0 && temp < 11) {
				notas[cont] = temp;
				cont ++;
				
			}else {
				System.out.println("A nota " + temp + "é invalida");
			}
			
		}while(cont < 5);
		
		System.out.println("-----------Relatorio-------------");
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome:" + nome);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Nota " + i+1 + ": " + notas[i]);
		}
		
		System.out.println("---------------------------------");
		
		leitor.close();
	
	}
}