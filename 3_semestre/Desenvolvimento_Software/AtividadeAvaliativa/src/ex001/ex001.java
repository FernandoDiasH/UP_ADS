package ex001;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		String[] matricula = new String[5];
		String[] nome = new String[5];
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		String result = "Aprovado: ( ) Sim ( ) Não";
		double[] media = new double[5];
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite sua matricula: ");
			matricula[i] = leitor.nextLine();
			
			System.out.println("Digite seu nome: ");
			nome[i] = leitor.nextLine();
			
			System.out.println("Digite a primeira nota: ");
			nota1[i] = leitor.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2[i] = leitor.nextDouble();
			
			System.out.println("------------------------");
			
			leitor.nextLine();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		for (int i = 0; i < 5; i++) {
			
			if(media[i] >=6) {
				result = "Aprovado: (x) Sim ( ) Não";
			}else {
				result = "Aprovado: ( ) Sim (x) Não";
			}
			
			System.out.println("Matricula: " + matricula[i] );
			System.out.println("Nome: " + nome[i] );
			System.out.println("Primeira nota: " + nota1[i]);
			System.out.println("Segunda nota: " + nota2[i]);
			System.out.println("Nota Final: " + media[i]);
			System.out.println(result);
			System.out.println("---------------------------");
		}
		leitor.close();
	}
}
