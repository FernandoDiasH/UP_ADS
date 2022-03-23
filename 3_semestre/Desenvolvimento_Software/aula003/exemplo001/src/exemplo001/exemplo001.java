package exemplo001;

public class exemplo001 {

	public static void main(String[] args) {
		imprimir(somar(10,50));
		
		
		
	}
	
	//funcoes
	
	public static void imprimir(double valor) {
		System.out.println(valor);
	}
	public static double somar(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
	
	

}
