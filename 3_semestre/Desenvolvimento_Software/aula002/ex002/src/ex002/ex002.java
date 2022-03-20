package ex002;

public class ex002 {

		public static void main(String[] args) {
			
			String[] matriculas = new String[5];
			matriculas[0] = "0000";
			matriculas[1] = "1111";
			matriculas[2] = "2222";
			matriculas[3] = "3333";
			matriculas[4] = "4444";
			
			String[] nomes = new String[5];
			nomes[0] = "Fer1";
			nomes[1] = "Fer2";
			nomes[2] = "Fer3";
			nomes[3] = "Fer4";
			nomes[4] = "Fer5";
			
			double[] notas_1 = new double[5];
			notas_1[0] = 6.1;
			notas_1[1] = 5.7;
			notas_1[2] = 9.1;
			notas_1[3] = 4.5;
			notas_1[4] = 8.7;
			
			double[] notas_2 = new double[5];
			notas_2[0] = 6.8;
			notas_2[1] = 8.7;
			notas_2[2] = 3.7;
			notas_2[3] = 4.7;
			notas_2[4] = 5.1;
			
			double[] medias = new double[5];
			medias[0] = ( notas_1[0] + notas_2[0] )/ 2;
			medias[1] = ( notas_1[1] + notas_2[1] )/ 2;
			medias[2] = ( notas_1[2] + notas_2[2] )/ 2;
			medias[3] = ( notas_1[3] + notas_2[3] )/ 2;
			medias[4] = ( notas_1[4] + notas_2[4] )/ 2;
			
			String result = "Aprovado: Sim ( ) Nao ( ) ";
			
			if(medias[0] >= 6) {
				 result = "Aprovado: Sim (x) Nao ( ) ";
			}
			else {
				result = "Aprovado: Sim ( ) Nao (x) ";
			}
		
			System.out.println("Matricula: " + matriculas[0]);
			System.out.println("Nome: " + nomes[0]);
			System.out.println(result);
			System.out.println("Nota Final: " + medias[0]);
			System.out.println("");
			
			//--------------------------------------------------------
			
			if(medias[1] >= 6) {
				 result = "Aprovado: Sim (x) Nao ( ) ";
			}
			else {
				result = "Aprovado: Sim ( ) Nao (x) ";
			}
		
			System.out.println("Matricula: " + matriculas[1]);
			System.out.println("Nome: " + nomes[1]);
			System.out.println(result);
			System.out.println("Nota Final: " + medias[1]);
			System.out.println("");
			//--------------------------------------------------------------
			
			if(medias[2] >= 6) {
				 result = "Aprovado: Sim (x) Nao ( ) ";
			}
			else {
				result = "Aprovado: Sim ( ) Nao (x) ";
			}
		
			System.out.println("Matricula: " + matriculas[2]);
			System.out.println("Nome: " + nomes[2]);
			System.out.println(result);
			System.out.println("Nota Final: " + medias[2]);
			System.out.println("");
			
			//--------------------------------------------------------------
			
			if(medias[3] >= 6) {
				 result = "Aprovado: Sim (x) Nao ( ) ";
			}
			else {
				result = "Aprovado: Sim ( ) Nao (x) ";
			}
		
			System.out.println("Matricula: " + matriculas[3]);
			System.out.println("Nome: " + nomes[3]);
			System.out.println(result);
			System.out.println("Nota Final: " + medias[3]);
			System.out.println("");
			
			//--------------------------------------------------------------
			
			if(medias[4] >= 6) {
				 result = "Aprovado: Sim (x) Nao ( ) ";
			}
			else {
				result = "Aprovado: Sim ( ) Nao (x) ";
			}
		
			System.out.println("Matricula: " + matriculas[4]);
			System.out.println("Nome: " + nomes[4]);
			System.out.println(result);
			System.out.println("Nota Final: " + medias[4]);
			System.out.println("");
			
			
			
		}
}
