package test;

import java.util.ArrayList;

import vehiculos.Avion;
import vehiculos.Barco;
import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche1 = new Coche(1, 400, "Ferrari");				
		Moto moto1 = new Moto(1, 170, "CBR-500r");
		Barco barco1 = new Barco(1, 10, "La Pinta");		
		Avion avion1 = new Avion(1, 300, "AC-130");
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(coche1);vehiculos.add(barco1);vehiculos.add(avion1);vehiculos.add(moto1);
		
		
		for (Vehiculo vehiculo : vehiculos) {
			int distanciaAleatoria = (int)(Math.random() * 500) + 100; 
			vehiculo.avanzar(distanciaAleatoria);
		}
		
	}

}
