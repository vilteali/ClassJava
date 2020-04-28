package medico;

public class Medico {
    
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String dni;
	private String especialidad;

/* Constructor */
public Medico () {

	nombre = "";
	apellidos = "";
	edad = 0;
	casado = false;
	dni = "";
	especialidad = "";

	}

public void setNombre (String valorNombre) {
	nombre = valorNombre;
	System.out.println("Ha cambiado el nombre del medico a: "+nombre);
}

public void setApellidos (String valorApellidos) {
	apellidos = valorApellidos;
	System.out.println("Ha cambiado el apellido del medico a: "+apellidos);
}	

public void setEdad (int ValorEdad) {
	edad = ValorEdad;
	System.out.println("Ha cambiado la edad del medico a: "+edad);
}

public void setCasado (boolean valorCasado) {
	casado = valorCasado;
	System.out.println("Ha cambiado el estado civil del medico a: "+casado);
}

public void setDni (String valorDni) {
	dni = valorDni;
	System.out.println("Ha cambiado el dni del medico a: "+dni);
}

public void setEspecialidad (String valorEspecialidad) {
	especialidad = valorEspecialidad;
	System.out.println("Ha cambiado la especialidad del medico a: "+valorEspecialidad);
}

public String getNombre () { return nombre; }
public String getApellidos () { return apellidos; }
public int GetEdad () { return edad; }
public boolean getBoolean () { return casado; }
public String getDni () { return dni; }
public String getEspecialidad () { return especialidad; }

}





