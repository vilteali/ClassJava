package poo;

public class Taxi_Conductor {

	private Taxi vehiculoTaxi;
	private Persona conductorTaxi;
	
	// Constructor 
	public Taxi_Conductor () {
		
		vehiculoTaxi = new Taxi("Bs as", "DVE689", "Caseros", 1800);
		conductorTaxi= new Persona("Jaimito");
		
	}

	// Métodos que devueleve la información sobre el objeto Taxi_Conductor
	public String getDatosTaxiConductor () {
		
		String matricula = vehiculoTaxi.getMatricula();
		String distrito = vehiculoTaxi.getDistrito();
		int tipoMotor = vehiculoTaxi.getTipoMotor();
		String cadenaTipoMotor = "";
		
		if (tipoMotor == 0 ) {
			
			cadenaTipoMotor="Desconocido"; 
		
		} else if (tipoMotor==1) {
			
			cadenaTipoMotor="Gasolina";
			
		} else if (tipoMotor==2) {
			
			cadenaTipoMotor="Diesel";
			
		}

		String datosTaxiCond = "El objeto TaxiCond presenta estos datos. Matrícula: " + matricula +
		" Distrito: " + distrito + " Tipo de motor: " + cadenaTipoMotor;

		return getDatosTaxiConductor();
		
	}

}
