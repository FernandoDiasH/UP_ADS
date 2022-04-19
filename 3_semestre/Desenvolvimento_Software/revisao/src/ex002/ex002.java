package ex002;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String[] matricula = new String[5];
		String[] nome = new String[5];
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		double[] media = new double[5];
		String result = "Aprovado ()Sim ()Nao";
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite sua Matricula: ");
			 matricula[i] = leitor.nextLine();
			
			System.out.println("Digite seu nome: ");
			 nome[i] = leitor.nextLine();
			
			System.out.println("Digite a primeira nota: ");
			nota1[i] = leitor.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2[i] = leitor.nextDouble();
	
			leitor.nextLine();
			media[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("----------------");
		}
		
		for (int j = 0; j < 5; j++) {
	
			System.out.println("Matricula: " + matricula[j]);
			System.out.println("Nome: " + nome[j]);
			System.out.println("Nota 1: " + nota1[j]);
			System.out.println("Nota 2: " + nota2[j]);
			System.out.println("Media: " + media[j]);
			 
			if(media[j] >= 6) {
				result = "Aprovado (x)Sim ()Nao";
			}
			else {
				result = "Aprovado ()Sim (x)Nao";
			}
			System.out.println(result);
			System.out.println("--------------------");
		}
		leitor.close();
	}

}
