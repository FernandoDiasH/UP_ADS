
/** Exerc�cio de fixa��o 1

Criar um programa para processar as seguintes informa��es de um aluno:
matr�cula, nome , nota1, nota2 e se ele est� aprovado ou reprovado;

Durante a execu��o calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. 
Se a nota final for igual ou superior a 6 o aluno est� aprovado, caso contr�rio estar� reprovado;

O programa dever� imprimir o seguinte relat�rio:
Matr�cula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) N�o
Nota final: xxxxx 
**/

package ex001;

public class Programa {// inicio

	public static void main(String[] args) {
		
		// Decla��o de variaveis
		
		String matricula = "12345";
		String nome = "Fernando";
		double nota_1 = 7.5;
		double nota_2 = 6.7;
		double media  = (nota_1 + nota_2)/ 2;
		String result = "Aprovado: Sim ( ) Nao ( ) ";
		
		// Condicionais
		
		if(media >= 6) {
			 result = "Aprovado: Sim (x) Nao ( ) ";
		}
		else {
			result = "Aprovado: Sim ( ) Nao (x) ";
		}
		
		//execussao do programa
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println(result);
		System.out.println("Nota Final: " + media);
		
		
	}

}//fim
