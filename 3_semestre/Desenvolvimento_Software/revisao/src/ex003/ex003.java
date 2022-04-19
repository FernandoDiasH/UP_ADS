package ex003;

import java.util.Scanner;

public class ex003 {
	
	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
	
		double[] notas = new double[5];
		int cont = 0;
		
		System.out.println("Matricula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe as notas a baixo:");
		
		while (cont < 5) {
			
			System.out.println("Informe a " + (cont+1) + " nota: ");
			double temp = leitor.nextDouble();
			
			if(temp <=  10) {
				notas[cont] = temp;
				cont++;
			}
			else {
				System.out.println("Informe uma nota valida: ");
				System.out.println("--------------------------");
			}
		}
		

		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (i + 1) + " nota: " + notas[i]);
		}

		leitor.close();
		}
		
	}


