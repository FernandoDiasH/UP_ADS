
/** Exercício de fixação 1

Criar um programa para processar as seguintes informações de um aluno:
matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;

Durante a execução calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. 
Se a nota final for igual ou superior a 6 o aluno está aprovado, caso contrário estará reprovado;

O programa deverá imprimir o seguinte relatório:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx 
**/

package ex001;

public class Programa {// inicio

	public static void main(String[] args) {
		
		// Declação de variaveis
		
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
