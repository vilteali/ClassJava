package poo;

// Combina las tres primeras letras de dos textos recibidos como parámetro 
// en una sola cadena por un espacio 
public class Combinador {

	private String texto1, texto2; // Atributos 
	
	// Constructor de la base 
	public Combinador() {
		
		texto1="";
		texto2="";
		
	}
	
	// Método que combina las tres primeras letras de cada cadena
	String Combinacion(String cadena1, String cadena2) {
		
	if (cadena1.length() >= 3 && cadena2.length() >= 3) {
		
		String Combinacion = cadena1.substring(0, 3) + " " +cadena2.substring(0, 3);
		return Combinacion;
		
		} else {
			return "No aporta cadena válidas";
		}
	
	}
	
	// Método que combina las cadenas aunque sean menos de 3 caracteres 
	String combinadoSiempre(String vTexto1, String vTexto2) {
		
		int long_texto = 3;
		int long_texto2 = 3;
		
		String CombinadoSiempre	 = "";
		
		if (vTexto1.length() < 3) {
			long_texto = vTexto1.length();
		}
		
		if (vTexto2.length() < 3) {
			long_texto2 = vTexto2.length();
		}
		
		CombinadoSiempre = vTexto1.substring(0, long_texto)+" "+vTexto2.substring(0, long_texto2);
		return CombinadoSiempre;
	}
	
	public static void main(String[] args ){
		
		Combinador prueba = new Combinador();
		
		System.out.println(prueba.Combinacion("Holaaaa", "Chau")); 
		System.out.println(prueba.combinadoSiempre("Saludos", "Argentina"));
		
	}
}
