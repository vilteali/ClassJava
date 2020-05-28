package poo;

public class Profesor {

	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;
	private boolean especialista;

	// Constructor 
	public Profesor(String nom, String apell, int edad, boolean casado, boolean especi) {
		
		nombre=nom;
		apell=apellido;
		this.edad=edad;
		this.casado=casado;
		especialista=especi;
		
	}

	// Constructor 2
	public Profesor() {
		
		nombre="";
		apellido="";
		edad=0;
		casado=false;
		especialista=false;
		
	}
	
	// Métodos setters
	public void setNombre(String dimeNombre) {
		nombre=dimeNombre;
	}
	
	public void setApellido(String dimeApellido) {
		apellido=dimeApellido;
	}
	public void setEdad(int dimeEdad) {
		edad=dimeEdad;
	}
	public void setCasado(boolean dimeCasado) {
		casado=dimeCasado;
	}
	public void setEspecialista(boolean dimeEspecialista) {
		especialista=dimeEspecialista;
	}
	
	// Métodos getters
	public String dimeNombre() { return nombre; }
	public String dimeApellido() { return apellido; }
	public int dimeEdad() { return edad; }
	public boolean dimeCasado() { return casado; }
	public boolean dimeEspecialista() { return especialista; }
	
	public static void main(String[] args) {
		
		Profesor profe1 = new Profesor();
		Profesor profe2 = new Profesor("Alvaro", "Felipe", 60, false, true);
		
		profe2.setCasado(true);
		
		System.out.println(profe2.dimeCasado());
		
	}
	
}
