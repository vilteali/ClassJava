public class DiscoMusical {

	private String titulo;
	private String autor;
	private int anoEdicion;
	private String formato;
	private boolean digital;

// Constuctor para definir lo que ocurre cuando creamos el objeto
public DiscoMusical () {

	titulo = "";
	autor = "";
	anoEdicion = 0;
	formato = "";
	digital = false;

	}

// Establecer una serie de valores

public void setTitulo(String valorTitulo){
	titulo = valorTitulo;
}
public void setAutor(String valorAutor){
	autor = valorAutor;
}
public void setAnoEdicion(int valorAnoEdicion){
	anoEdicion = valorAnoEdicion;
}
public void setFormato(String valorFormato){
	formato = valorFormato;
}
public void setDigital(boolean valorDigital){
	digital = valorDigital;
}

// Devolver los valores adquiridos 

public String getTitulo() { return titulo; }
public String getAutor() { return autor; }
public int getAnoEdicion() { return anoEdicion; }
public String getFormato() { return formato; }
public String getDigital() { returb digital; }

}