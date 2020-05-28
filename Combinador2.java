package poo;

public class Combinador2 {

	/* Crear un método tipo función que reciba 3 cadenas de texto y devuelva la 
	 * cadena de texto combinación de: las dos primeras letras de la primera cadena, seguidas por un espacio en blanco, 
	 * seguidas de las cuatro primeras letras de la segunda cadena, 
	 * seguidas de un guión medio y seguido de las 6 primeras letras de la tercera cadena.*/
	public Combinador2() {
		
	}
	
	public String dimeTexto(String cadena1, String cadena2, String cadena3) {
		
		String dimeTexto = (cadena1.substring(0, 2)+" "+cadena2.substring(0, 4)+"-"+cadena3.substring(0, 6));
		
		return dimeTexto;
	}
	
	public static void main(String[] args) {
		
		Combinador2 prueba = new Combinador2();
		
		System.out.println(prueba.dimeTexto("Hola", "java", "eclipse"));
	}
}
