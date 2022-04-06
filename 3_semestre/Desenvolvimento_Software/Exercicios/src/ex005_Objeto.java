import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex005_Objeto {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivos = new File("C:\\Users\\12780765909\\Desktop\\Exercicios\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivos);
		leitor.nextLine(); 
		 
		Categoria[] categorias = new Categoria[5];
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String dados[] = linha.split("\t");
			
			String classe = dados[0];
			String num = dados[1];
			
			
			
		}
		
	}

	
}
