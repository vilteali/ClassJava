package poo;

public class MultiplicadorDieces {

	public MultiplicadorDieces () {
		
	}
	
	// Multiplicar por 10 veces el segundo n�mero del parametro y multiplicarlo por el primer n�mero
	public double multiplicarPorDieces (double num1, int num2) {
		
		int resultado = 1;
		
		for (int i=1; i<=num2; i++) { // bucle para multiplicar por 10 el segundo n�mero

			resultado *= 10;
		
		}
		
		return Math.round(resultado*num1); // Multi el resultado por el primer n�mero
										   // lo redondeamos con la clase Math.Round
		
	}
	
	public static void main(String[] args) {
		
		MultiplicadorDieces multi = new MultiplicadorDieces();
		
		System.out.println(multi.multiplicarPorDieces(3, 5));
	}
	
	
}
