package poo;

public class Exponenciador {
	//Clase que permite elevar un número entero m a otro número entero n y obtener un resultado
	public Exponenciador () {
		
	}

    //Método 1 para calcular la potencia
    public int potenciaIterando (int n, int m) {

        int resultado = 1;

        for (int i=1; i<=n; i++) {

            resultado = resultado * m;           

        }

        return resultado;

    } //Cierre del método

    public static void main(String[] args) {
    	
    	Exponenciador potencia = new Exponenciador();
    	
    	System.out.println(potencia.potenciaIterando(2, 2));
    	
    }
	
}