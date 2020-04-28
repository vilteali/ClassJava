public class Taxi {

	private String ciudad;
	private String matricula;
	private String distrito;
	private int tipoMotor;

public Taxi () {
	
        ciudad = "";
        matricula = "";
        distrito = "";
        tipoMotor = 0;
}
public void setCiudad (String valorCiudad) {
        ciudad = valorCiudad;
}

public void setMatricula (String valorMatricula) {
        matricula = valorMatricula;
}

public void setDistrito (String valorDistrito) {
        distrito = "Distrito" +valorDistrito;
}

public void setTipoMotor (int valorTipoMotor) {
        tipoMotor = valorTipoMotor;
}

public String getMatricula () { return matricula; }
public String getDistrito () { return distrito; }
public int getTipoMotor () { return tipoMotor; }

}

