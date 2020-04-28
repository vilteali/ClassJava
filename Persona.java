public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numeroDocumentoIdentidad;

// Constructor para definir lo que ocurre al crear el objeto
public Persona () {

	nombre = "";
	apellidos = "";
	edad = 0;
	casado = false;
	numeroDocumentoIdentidad = "";

	}	

// Serie de metodos para asignar o establecer una serie de valores 

	public void setNombre(String valorNombre){
		nombre = valorNombre; /* El nombre del objeto Persona, adoptará,
                                    el valor que tenga el valorNombre	*/ 
	}
	public void setApellidos(String valorApellidos){
		apellidos = valorApellidos;
	}
	public void setEdad(int valorEdad){
		edad = valorEdad;
	}
	public void setCasado(boolean valorCasado){
		casado = valorCasado;
	}
	public void SetnumeroDocumentoIdentidad(String valorNumeroDocumentoIdentidad){
		numeroDocumentoIdentidad = valorNumeroDocumentoIdentidad;
	}

	// Metodo para devolver los valores adquiridos 

	public String getNombre(){
		return nombre;
	}
	public String getApellidos(){
		return apellidos;
	} 
	public int getEdad(){
		return edad;
	}
	public boolean getCasado(){
		return casado;
	}
	public String getNumeroDocumentoIdentidad(){
		return numeroDocumentoIdentidad;
	}

}