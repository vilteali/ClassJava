package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona2[] lasPersonas = new Persona2[2];

		for (Persona2 p : lasPersonas ) {
			
			System.out.println(p.dameNombre());
			
		}
		
	}
}
		
abstract class Persona2 {
	
	public Persona2 (String nom) {
		nombre=nom;
	}
	
	public String dameNombre() { return nombre; }
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona {
		
	// Constructor y los parámetros a asignar una vez creado el objeto nuevo
	public Empleado2(String nom, double sueld, int anio, int mes, int dia) {
			
		super(nom);
		sueldo=sueld;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia); 
		altaContrato=calendario.getTime();
			
	}
	
	// Getter
	public double dameSueldo() {return sueldo;}
 	public Date dameFechaContrato() {return altaContrato;}
 	
 	public String dameDescripcion() {
 		
 		return "Este empleado tiene un sueldo de: "+dameSueldo();
 		
 	}
 	
 	// Método setter 
 	public void subeSueldo(double porcentaje) {
 		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
 	}
	 	
 	// Atributos de la clase Empleado
	private double sueldo;
	private Date altaContrato;
	
}
	
class Alumno extends Persona {

	public Alumno(String nom, String carrera) {
		
		super(nom);
		this.carrera=carrera;
		
	}
	
	public String dameDescripcion() { 
		
		return "Este alumno esta estudiando la carrera de "+carrera;
		
	}
	
	private String carrera;
	
}