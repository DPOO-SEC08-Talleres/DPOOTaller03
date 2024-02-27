package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	List<Tiquete> tiquetesSinUsar;
	List<Tiquete> tiqutesUsados;
	
	public Cliente() {
		
	}
	public String getTipoCliente() {
		return null;
	}
	
	public void agregarTiquete (Tiquete tiquete) {
		
	}
	
	public int calcularvalorTotaltiquetes() {
		return 0;
	}
	
	public void usarTiquetes (Vuelo vuelo) {
		
	}
	
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

}
