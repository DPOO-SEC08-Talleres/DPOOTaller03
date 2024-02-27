package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private HashMap<String, Tiquete> tiquetes;
	
	public Vuelo(Ruta _ruta, String _fecha, Avion _avion) {
		ruta = _ruta;
		fecha = _fecha;
		avion = _avion;
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Avion getAvion() {
		return avion;
	}

	public HashMap<String, Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	public int venderTiquetes() {
		return 0;
	}
	
	public boolean equals (Vuelo object2) {
		return false;
	}
	
	
}
