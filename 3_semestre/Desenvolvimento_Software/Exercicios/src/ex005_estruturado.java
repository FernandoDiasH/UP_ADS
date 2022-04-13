import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ex005_estruturado {
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivos = new File("C:\\Users\\Aluno\\Desktop\\Exercicios\\exercicios\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivos);
		leitor.nextLine(); 
		
		int soma_total = 0;
		int soma_A = 0;
		int soma_B = 0;
		int soma_C = 0;
		int soma_D = 0;
		int soma_E = 0;
		int soma_F = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split("\t");
			
			soma_total = soma_total + Integer.parseInt(dados[1]);

			switch (dados[0]) {
			case "A":
				soma_A += getValor(dados[1]);
				break;
			case "B":
				soma_B += getValor(dados[1]);
				break;
			case "C":
				soma_C += getValor(dados[1]);
				break;
			case "D":
				soma_D += getValor(dados[1]);
				break;
			case "E":
				soma_E += getValor(dados[1]);
				break;
			case "F":
				soma_F += getValor(dados[1]);
				break;

				
			}
		
		}

		imprimirGrupo("A", soma_A);
		imprimirGrupo("B", soma_B);
		imprimirGrupo("C", soma_C);
		imprimirGrupo("D", soma_D);
		imprimirGrupo("E", soma_E);
		imprimirGrupo("F", soma_F);
		
		
		leitor.close();
	}
	
	public static void imprimirGrupo(String letra, int vrl) {
		System.out.println("Valor total do Grupo " + letra + ": " + vrl);
		
	}
	
	public static int getValor(String vrl) {
		return Integer.parseInt(vrl);
	}
	
	

}
