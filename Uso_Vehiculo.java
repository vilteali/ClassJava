package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {

		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		micoche1.establece_color("Azul");
		
		Furgoneta miFurgoneta = new Furgoneta(7, 580);
		
		miFurgoneta.establece_color("Azul");
		miFurgoneta.configurar_asientos("Si");
		miFurgoneta.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+" "+ micoche1.dime_color());
		
		System.out.println(miFurgoneta.dime_datos_generales()+miFurgoneta.dimeDatosFurgoneta());
		
	}

}
