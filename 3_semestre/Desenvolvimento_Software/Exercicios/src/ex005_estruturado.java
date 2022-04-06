import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ex005_estruturado {
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivos = new File("C:\\Users\\12780765909\\Desktop\\Exercicios\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivos);
		leitor.nextLine(); 
		
		int soma_total = 0;
		int soma_A = 0;
		int soma_B = 0;
		int soma_C = 0;
		int soma_D = 0;
		int soma_F = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split("\t");
			
			soma_total = soma_total + Integer.parseInt(dados[1]);

			if(dados[0].equals("A")) {
				soma_A = soma_A + Integer.parseInt(dados[1]);
			}
			else if(dados[0].equals("B")) {
				
				soma_B = soma_B + Integer.parseInt(dados[1]);
			}
			else if(dados[0].equals("C")) {
				
				soma_C = soma_C + Integer.parseInt(dados[1]);
			}
			else if(dados[0].equals("D")) {
				
				soma_D = soma_D + Integer.parseInt(dados[1]);
			}
			else if(dados[0].equals("F")) {
				
				soma_F = soma_F + Integer.parseInt(dados[1]);
			}
			
			
			
		
		}

		System.out.println("Soma total: " + soma_total);
		System.out.println("Soma da Categoria A: " + soma_A);
		System.out.println("Soma da Categoria B: " + soma_B);
		System.out.println("Soma da Categoria C: " + soma_C);
		System.out.println("Soma da Categoria D: " + soma_D);
		System.out.println("Soma da Categoria F: " + soma_F);
		leitor.close();
	}
	
	

}
