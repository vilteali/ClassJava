package poo;

public class Mini_Calculadora {

	// M�todo para devolver valor absoluto
	public double valorAbsoluto(double x) {	return Math.abs(x);	}

	// M�todo para devolver la ra�z cuadrada
	public double raizCuadrada(double y) { return Math.sqrt(y); }
	
	public static void main(String[] args) {
		
		Mini_Calculadora calc = new Mini_Calculadora();
		
		System.out.println(calc.raizCuadrada(16));
		System.out.println(calc.valorAbsoluto(-15));
		
	}
}
