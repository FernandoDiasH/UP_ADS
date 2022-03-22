package ex005;

import java.util.Scanner;

public class programa005 {

	public static void main(String[] args) {
		
		// Declaracao de variaveis
		double[] notas = new double[5];
		double pesos[] = {0.05, 0.05, 0.2, 0.2, 0.5};
		int cont = 0;
		double nFinal = 0;
		
		//input de dados
		Scanner leitor = new Scanner(System.in);
		System.out.println("Matricula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Nome: ");
		String nome = leitor.nextLine();
		
		// input e verificação de entrada de dados
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
		
		
		//print do relatorio 
		System.out.println("-----------Relatorio-------------");
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome:" + nome);
		for(int i = 0; i < 5; i++) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
		// calculo da nota final
		for(int i = 0; i < 5; i++) {
			nFinal =(notas[i] * pesos[i]) + nFinal;		
		}
		//verificaçao de aprovacao
		if(nFinal >= 6) {
			System.out.println("Parabens, voce esta Aprovado!");
		}else {
			System.out.println("Que pena, Voce esta reprovado!");
		}
		System.out.println("Nota Fianl: " + nFinal);
		
		System.out.println("---------------------------------");
		
		leitor.close();
	
	}
}
