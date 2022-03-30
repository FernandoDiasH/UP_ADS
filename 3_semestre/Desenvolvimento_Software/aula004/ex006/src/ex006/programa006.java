package ex006;

import java.util.Iterator;

public class programa006 {
	
	public static void imprimir_num(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		//Tipos primitivos - variavel
		int numero = 100;
		
		
		// Classes ->  A variavel frase é um objeto.
		String texto = "Só sei que nada sei. (Socrates)";
		
		// Mostra a quantidade de caracteres na classe
		int comprimento = texto.length();
		System.out.println("Comprimento: " + comprimento);
		
		//Mostra um texto de uma determinada posição a outra.
		String subTexto = texto.substring(5, 25);
		System.out.println(subTexto);
		
		//Mostra uma posiçâo especifica .
		char caractere = texto.charAt(9);
		System.out.println("Char: " + caractere);
		System.out.println("");
		
		for(int i = 0; i < comprimento; i++ ) {
			
			char caract = texto.charAt(i);
			System.out.println("char: " + caract);
			
		}
		
		String[] palavras = texto.split(" ");
		for (String palavra : palavras) {
			System.out.println("Frases:" + palavra);
			
		}
		
		String textoHifen = texto.replace(" ", "-");
		System.out.println(textoHifen);
		
		String textoTab = texto.replace(" "," 	");
		System.out.println(textoTab);
		
		String[] palavrasTab = textoTab.split("\t");
		for (String palavra : palavras) {
			System.out.println(palavra);
			
		}
		
		
		
	}

}
