package poo;

public class Exponenciador {
	//Clase que permite elevar un n�mero entero m a otro n�mero entero n y obtener un resultado
	public Exponenciador () {
		
	}

    //M�todo 1 para calcular la potencia
    public int potenciaIterando (int n, int m) {

        int resultado = 1;

        for (int i=1; i<=n; i++) {

            resultado = resultado * m;           

        }

        return resultado;

    } //Cierre del m�todo

    public static void main(String[] args) {
    	
    	Exponenciador potencia = new Exponenciador();
    	
    	System.out.println(potencia.potenciaIterando(2, 2));
    	
    }
	
}