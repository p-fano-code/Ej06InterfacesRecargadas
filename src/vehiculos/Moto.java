package vehiculos;

public class Moto extends Vehiculo{

	public Moto(int id, int cv, String nombre) {
		this.setId(id);
		this.setCv(cv);
		this.setNombre(nombre);
	}
	
	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		super.avanzar(distancia);
		System.out.println("La moto avanzó "+distancia+" metros.");
	}
}
