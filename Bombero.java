package poo;

public class Bombero {

	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	public Bombero (String nombre, String apellido, int edad, boolean casado, boolean especialista) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.casado=casado;
		this.especialista=especialista;

	}
		
		// Setters
		public void dimeNombre (String valorNombre) { nombre = valorNombre; }
		public void dimeApellido (String valorApellido) { apellido = valorApellido; }
		public void dimeEdad (int valorEdad) { edad = valorEdad; }
		public void dimeCasado (boolean valorCasado) { casado = valorCasado; }
		public void dimeEspeci (boolean valorEspecialista) { especialista = valorEspecialista; }
		
		// Getters 
		public String getNombre() { return nombre; }
		public String getApellido () { return apellido; }
		public int getEdad () { return edad; }
		public boolean getCasado() { return casado; }
		public boolean getEspecia() { return especialista; }
		

	public static void main(String[] args) {
		
		Bombero empleado1 = new Bombero("Alfredo", "Ramirez", 32, false, true);
	
	}
	
}
