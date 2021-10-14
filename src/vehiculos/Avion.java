package vehiculos;

public class Avion extends Vehiculo{

	public Avion (int id, int cv, String nombre) {
		this.setId(id);
		this.setCv(cv);
		this.setNombre(nombre);
	}
	
	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		super.avanzar(distancia);
		System.out.println("El avión avanzó "+(distancia+getCv())*3+" metros.");
	}
}
