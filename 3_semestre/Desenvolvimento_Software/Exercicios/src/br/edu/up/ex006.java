package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import br.edu.up.modelo.Grupo;

public class ex006 {

	public static void main(String[] args) {
		
		Scanner leitor = getLeitor();
		
		if (leitor == null){
			System.out.println("Não foi possivel executar o programa!");
		} else {
			
			Grupo[] grupos = carregarDados(leitor);
			
			
			gravarRelatorio(grupos);

				
				
			}
		
		System.out.println("Deu certo.");
			
		}
		
		
		
		
		public static void gravarRelatorio(Grupo[] grupos) {
			
			try {
				Formatter gravador = new Formatter("C:\\Users\\Aluno\\Desktop\\Exercicios\\exercicios\\src\\relatorio-grupo.txt");
				
				int vlrTotal = 0;
				for (int i = 0; i < grupos.length; i++) {
					Grupo grp = grupos[i];
					gravador.format("Valor do grupo" + grp.letra + ": " + grp.getValor());
					vlrTotal += grp.getValor();
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
			
			
		}
	
	
	public static Grupo[] carregarDados(Scanner leitor){
		Grupo grupoA = new Grupo();
		Grupo grupoB = new Grupo();
		Grupo grupoC = new Grupo();
		Grupo grupoD = new Grupo();
		Grupo grupoE = new Grupo();
		Grupo grupoF = new Grupo();
		
		while (leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split("\t");
			
			switch (dados[0]) {
			case "A":
				grupoA.adicionarValor(dados[1]);
				break;
			case "B":
				grupoB.adicionarValor(dados[1]);
				break;	
			case "C":
				grupoC.adicionarValor(dados[1]);
				break;
			case "D":
				grupoD.adicionarValor(dados[1]);
				break;
			case "E":
				grupoE.adicionarValor(dados[1]);
				break;
			case "F":
				grupoF.adicionarValor(dados[1]);
				break;		
				
			}
		}
		Grupo[] grupos = new Grupo[6];
		grupos[0]  = grupoA;
		grupos[1]  = grupoB;
		grupos[2]  = grupoC;
		grupos[3]  = grupoD;
		grupos[4]  = grupoE;
		grupos[5]  = grupoF;
		
			return grupos;	
	}

	public static Scanner getLeitor() {
		File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Exercicios\\exercicios\\src\\grupos-tabulados.txt");
		
		Scanner leitor =null;
		try {
			leitor = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("O Arquivo nao foi encontrado!");
		}
		return leitor;
	}
}
