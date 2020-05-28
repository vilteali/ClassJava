package poo;

public class Estudiante {

	private String nombre;
	
	public Estudiante () {
		
		nombre="Pepe";
		
	}
	
	// Método que devuelve true si el nombre del estudiante es Pepe
	public boolean esPepe() {
		
		boolean seLlamaPepe=false;
		if (nombre.equals("Pepe")) {
			
			seLlamaPepe=true;
			
		}
		return seLlamaPepe;
		
	}
	
	public static void main(String[] args) {
		
		Estudiante Lucas = new Estudiante();
		
		System.out.println(Lucas.esPepe());
		
	}
}
