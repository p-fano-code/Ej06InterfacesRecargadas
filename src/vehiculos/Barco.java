package vehiculos;

public class Barco extends Vehiculo{

	public Barco(int id, int cv, String nombre) {
		this.setId(id);
		this.setCv(cv);
		this.setNombre(nombre);
	}
	
	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		super.avanzar(distancia);
		System.out.println("El barco avanzó "+(distancia+getCv())*2+" metros.");
	}
}
