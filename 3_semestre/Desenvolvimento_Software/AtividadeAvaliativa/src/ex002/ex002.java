package ex002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) throws FileNotFoundException {
		
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double E = 0;
		double F = 0;
		double total = 0;

		
		File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Atividade Avaliativa\\AtividadeAvaliativa\\src\\ex002\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		while (leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] dados = linha.split("\t");
			
			total += Double.parseDouble(dados[1]);
			
			switch (dados[0]) {
			case "A":
				A += Double.parseDouble(dados[1]);
				break;
				
			case "B":
				B += Double.parseDouble(dados[1]);
				break;
				
			case "C":
				C += Double.parseDouble(dados[1]);
				break;
				
			case "D":
				D += Double.parseDouble(dados[1]);
				break;
				
			case "E":
				E += Double.parseDouble(dados[1]);
				break;
				
			case "F":
				F += Double.parseDouble(dados[1]);
				break;	
			}
		}
		
		Formatter gravador = new Formatter("C:\\Users\\Aluno\\Desktop\\Atividade Avaliativa\\AtividadeAvaliativa\\src\\ex002\\relatorio-de-grupos.txt");
		
		gravador.format("Soma total dos grupos: " + total);
		gravador.format("Total grupo A: " + A + "\n");
		gravador.format("Total grupo B: " + B + "\n");
		gravador.format("Total grupo C: " + C + "\n");
		gravador.format("Total grupo D: " + D + "\n");
		gravador.format("Total grupo E: " + E + "\n");
		gravador.format("Total grupo F: " + F + "\n");
		
		gravador.close();
		leitor.close();
	}

}
