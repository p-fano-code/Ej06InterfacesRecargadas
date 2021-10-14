package vehiculos;

public class Coche extends Vehiculo{

	public Coche(int id, int cv, String nombre) {
		this.setId(id);
		this.setCv(cv);
		this.setNombre(nombre);
	}
	
	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		super.avanzar(distancia);
		System.out.println("El coche avanzó "+distancia+" metros.");
	}
}
