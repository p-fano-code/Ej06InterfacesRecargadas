package vehiculos;

public class Vehiculo implements Movible{
	
	private int id;
	private int cv;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", cv=" + cv + ", nombre=" + nombre + "]";
	}
	
	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		Movible.super.avanzar(distancia);
	}

}
