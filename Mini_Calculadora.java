package poo;

public class Mini_Calculadora {

	// Método para devolver valor absoluto
	public double valorAbsoluto(double x) {	return Math.abs(x);	}

	// Método para devolver la raíz cuadrada
	public double raizCuadrada(double y) { return Math.sqrt(y); }
	
	public static void main(String[] args) {
		
		Mini_Calculadora calc = new Mini_Calculadora();
		
		System.out.println(calc.raizCuadrada(16));
		System.out.println(calc.valorAbsoluto(-15));
		
	}
}
