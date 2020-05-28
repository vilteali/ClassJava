package poo;

public class Coche {
	
	// Atributos
	private int ruedas, largo, ancho, motor, peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	// Método constructor (estado inicial del objeto)
	public Coche () {
		
		ruedas=4;
		largo=2000;
		ancho=250;
		motor=1300;
		peso_plataforma=4000;
	}
	
	// Método getter
	public String dime_datos_generales() {
		return "La plataforma del vehículo tiene "+ruedas+" ruedas"+". Mide "+largo/1000+
				"mts. Tiene "+ancho+" cm de ancho. Motor de "+motor+". Y un peso de "+peso_plataforma+" kg.";
		
	}
	
	// Método setter
	public void establece_color(String color_coche) {color=color_coche;}	
	
	// Método getter
	public String dime_color() {return "El color del coche es "+color;}
	
	// Método setter
	public void configurar_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;
		}
		
	}
	
	// Método getter
	public String dime_asientos() {
		
		if (asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
		
	}
	
	// Método setter
	public void configura_climatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
		
	}
	
	// Método getter
	public String dime_climatizador() {
		if (climatizador==true) {
			return "El coche tiene climatizador";	
		} else {
			return "El coche no tiene climatizador";
		}
		
	}
}
