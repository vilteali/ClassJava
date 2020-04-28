public class Rueda { 

	private String tipo;
	private double grosor;
	private double diametro;
	private String marca;

// Constructor
public Rueda () {

	tipo="";
	grosor=0.00;
	diametro=0.00;
	marca="";

public void setTipo(String valorTipo){tipo=valorTipo;}
public void setGrosor(double valorGrosor){grosor=valorGrosor;}
public void setDiametro(double valorDiametro){diametro=valorDiametro;}
public void setMarca(String valorMarca){marca=valorMarca;}

// Obtener los valores del metodo 
public String getTipo(){return tipo;}
public double getGrosor(){return grosor;}
public double getDiametro(){return diametro;}
public String getMarca(){return marca;} 

// Determinar que tipo de vehiculo debe ir
public void comprobarDimensiones() {

	if ( diametro > 1.4){
		System.out.println("La rueda es para un vehiculo muy grande");
	} else if ( diametro <= 1.4 && diametro > 0.8 ) {
			System.out.println("La rueda es para un vehiculo mediano");
	} else {
		System.out.println("La rueda es para un vehiculo pequeñi"); 
	}

	if ((diametro > 1.4 && grosor < 0.4 )||(diametro <= 1.4 && 
		diametro > 0.8 && grosor < 0.25))
			System.out.println("El grosor para esta rueda es in inferior al recomendado"); 

	}

}