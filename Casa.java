package poo;

public class Casa {
	
	// Atributos o instancia de variables en la clase
	private double superficie;
	private String direccion;
	private SalonCasa salonCasa;
	private CocinaCasa cocina;
	
	// M�todo constructor a inicializar objeto Casa
	public Casa () {
		
		superficie = 0.0;
		direccion = "";
		salonCasa = new SalonCasa();
		cocina = new CocinaCasa();
		
	}
	
	// M�todos a establecer y devolver
	public void dimeSuperficie(double superficie) {
		this.superficie=superficie;
	}
	
	public void dimeDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public void dimeSalonCasa(SalonCasa valorSalonCasa) {
		salonCasa = valorSalonCasa;
	}
	
	public void dimeCocina(CocinaCasa valorCocinaCasa) {
		cocina = valorCocinaCasa;
	}
	
	public double getSuperficie() { return superficie; }
	public String getDireccion() { return direccion; }
	public SalonCasa getSalonCasa() { return salonCasa; }
	public CocinaCasa getCocinaCasas() { return cocina; }
}

class SalonCasa {
	
	// Atributos o instancia de variables en la clase
	private int numeroDeTelevisores;
	private String tipoSalon;

	// M�todo constructor a incializar objeto SalonCasa
	public SalonCasa () {
		
		numeroDeTelevisores=0;
		tipoSalon="Desconocido";
		
	}
	
	// M�todos a establecer y devolver
	public void dimeNumeroTelevisisores (int numeroDeTelevisores) {
		this.numeroDeTelevisores=numeroDeTelevisores;
	}
	
	public void dimeTipoSalon (String tipoSalon) {
		this.tipoSalon=tipoSalon;
	}
	
	public int getNumeroTelevisores() { return numeroDeTelevisores; }
	public String getTipoSalon() { return tipoSalon; }
	
}

class CocinaCasa {
	
	// Atributos o instancia de variables en la casa
	private boolean esIndependiente;
	private int numeroDeFuegos;
	
	// M�todo constructor a inicializar objeto CocinaCasa
	public CocinaCasa () {
		
		esIndependiente=false;
		numeroDeFuegos=0;
	}
	
	// Metodos a establecer y devolver
	public void dimeSiEsIndependiente (boolean esIndependiente) {
		this.esIndependiente=esIndependiente;
	}
	
	public void dimeNumeroDeFuegos (int numeroDeFuegos) {
		this.numeroDeFuegos=numeroDeFuegos;
	}

	public boolean getEsIndependiente() { return esIndependiente; }
	public int getNumeroDeFuegos () { return numeroDeFuegos; }
	
}
