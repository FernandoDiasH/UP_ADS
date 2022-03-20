package ex004;
import java.util.Scanner;

public class ex004 {
	
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		
		String matriculas[] = new String[5];
		String nomes[] = new String[5];
		double notas1[] = new double[5];
		double notas2[] = new double[5];
		double medias[] = new double[5];
		
		String result = "Aprovado: Sim() Não()";
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite sua matricula: ");
			matriculas[i] = leitor.nextLine();
			
			System.out.println("Digite seu nome: ");
			nomes[i] = leitor.nextLine();
			
			System.out.println("Nota: ");
			notas1[i] = leitor.nextDouble();
			
			System.out.println("Nota: ");
			notas2[i] = leitor.nextDouble();
			leitor.nextLine();
			
			medias[i] = (notas1[i] + notas2[i]) / 2;
			
			System.out.println("------------------------------");
		}
		
		for(int i = 1; i < 6; i++) {
			
			if(medias[i] >= 6) {
				result = "Aprovado: Sim(x) Não()";
				
			}
			else {
				result = "Aprovado: Sim() Não(x)";
			}
			
			
			
			
			
			
		}
		
		
	}

}
