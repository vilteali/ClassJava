public class Motor () {

	// Instancia de atributos
	private int tipoBomba;
	private String tipoFluido;
	private String combustibe;

	// Constructor
public Motor () {

	tipoBomba=0;
	tipoFluido="";
	combustibe="";

	}

public void setTipoBomba(int valueTipoBomba){tipoBomba=valueTipoBomba;}
public void setTipoFluido(String valueTipoFluido){tipoFluido=valueTipoFluido;}
public void setCombustible(String valueCombustible){combustibe=valueCombustible;}

public int getTipoBomba(){return tipoBomba;}
public String getTipoFluido(){return tipoFluido;}
public String getCombustible(){return combustibe;}

public void dimeTipoMotor(){

	switch(tipoBomba){
		case 0:
			System.out.println("No ha establecido un valor definido para el tipo de bomba");
			break;
		case 1:
			System.out.println("La bomba es una bomba de agua");
			break;
		case 2: 
			System.out.println("La bomba es de gasolina");
			break;
		case 3:
			System.out.println("La bomba es de hormigon");
			break;
		case 4:
			System.out.println("La es de pasta alimenticia");
			break;
		default:
			System.out.println("No existe un valor valido para el tipo de bomba");
			break;	

		} 

	}

}

