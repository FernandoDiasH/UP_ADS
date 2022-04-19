package ex001;

public class ex001 {

	public static void main(String[] args) {
		String matricula = "000111222";
		String nome = "Fernando";
		double nota1 = 9.3;
		double nota2 = 5.9;
		double media = (nota1 + nota2) / 2;
		String result = "Aprovado ()Sim ()Nao";
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		 
		if(media >= 6) {
			result = "Aprovado (x)Sim ()Nao";
		}
		else {
			result = "Aprovado ()Sim (x)Nao";
		}
		System.out.println(result);
	}

}
