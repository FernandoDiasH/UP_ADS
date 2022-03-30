package ex005;


public class programa005 {
	
	public static void imprimir(String txt) {
		System.out.println(txt);
		
	}
	
	public static void imprimir_num(double num) {
		System.out.println(num);
	}
	
	public static double somar(double a, double b) {
		double somar = a + b;
		return somar;
	}
	
	public static double subtrair(double a, double b) {
		double somar = a - b;
		return somar;
	}
	
	public static double multiplicar(double a, double b) {
		double somar = a * b;
		return somar;
	}
	
	public static double dividir(double a, double b) {
		double somar = a / b;
		return somar;
	}
	
	

	public static void main(String[] args) {
		
		imprimir_num(somar(4, 5));
		
		imprimir_num(subtrair(4, 5));
		
		imprimir_num(multiplicar(4, 5));
		
		imprimir_num(dividir(4, 5));
		
		
	}
	
	

}
