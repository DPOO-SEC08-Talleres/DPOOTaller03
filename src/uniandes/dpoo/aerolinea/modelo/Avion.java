package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	private String nombre;
	private int capacidad;
	
	
	public Avion (String _nombre, int _capacidad) {
		nombre = _nombre;
		capacidad = _capacidad;
	}


	public String getNombre() {
		return nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}
	

}
