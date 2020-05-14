package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {

		/*Empleado empleado1 = new Empleado("Ali Vilte", 20000, 2015, 05, 11);
		Empleado empleado2 = new Empleado("Analia Rodriguez", 67000, 2017, 04, 16);
		Empleado empleado3 = new Empleado("Belen Juarez", 39590, 2016, 02, 01);
		
		System.out.println("Nombre: " +empleado1.dameNombre()+"\nSueldo: "+empleado1.dameSueldo()
							+" \nFecha de alta: "+empleado1.dameFechaContrato());
		
		System.out.println("\nNombre: "+empleado2.dameNombre()+"\nSueldo: "+empleado2.dameSueldo()
							+" \nFecha de alta: "+empleado2.dameFechaContrato());

		System.out.println("\nNombre: "+empleado3.dameNombre()+"\nSueldo: "+empleado3.dameSueldo()
							+" \nFecha de alta: "+empleado3.dameFechaContrato());       */
		
		// Creamos un metodo nuevo 
		Empleado[] losEmpleados = new Empleado [3];

		// Le damos los valores indicados dentro del parametro del constructor
		losEmpleados[0] = new Empleado("Ali Vilte", 20000, 2015, 05, 11);
		losEmpleados[1] = new Empleado("Analia Rodriguez", 67000, 2017, 04, 16);
		losEmpleados[2] = new Empleado("Belen Juarez", 39590, 2016, 02, 01);
	
		/*for(int i=0; i < losEmpleados.length; i++) {
			
			losEmpleados[i].subeSueldo(5);
			
		} */
		
		// For each para recorrer un array 
		for(Empleado i:losEmpleados) {
			i.subeSueldo(5);
		}
			
		/*for(int i=0; i < losEmpleados.length; i++) {
			
			System.out.println("Nombre: "+losEmpleados[i].dameNombre()+" Sueldo: "+losEmpleados[i].dameSueldo()
								+" Fecha de alta: "+losEmpleados[i].dameFechaContrato()); 
		}    */
		
		// For each para recorrer el array e imprimir en pantalla, se reemplaza el
		// nombre del array por una 'e' para simplicarlo.
		for(Empleado e:losEmpleados) {
			
			System.out.println("\nNombre: "+e.dameNombre()+" \nSueldo: "+e.dameSueldo()
								+" \nFecha de alta: "+e.dameFechaContrato()); 
			}   
		}
	}

// Nombre de la clase
class Empleado {
	
	// Constructor y los parámetros a asignar una vez creado el objeto nuevo
	public Empleado(String nom, double sueld, int anio, int mes, int dia) {
		
		nombre=nom;
		sueldo=sueld;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia); 
		altaContrato=calendario.getTime();
		
	}
	
	// Getter
	public String dameNombre() {return nombre;}
	public double dameSueldo() {return sueldo;}
 	public Date dameFechaContrato() {return altaContrato;}
 	
 	// Método setter 
 	public void subeSueldo(double porcentje) {
 		double aumento=sueldo*porcentje/100;
 		sueldo+=aumento;
 	}
 	
 	// Atributos de la clase Empleado
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}