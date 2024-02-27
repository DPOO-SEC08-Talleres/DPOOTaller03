package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Cliente cliente;
	private Vuelo vuelo;
	
	public Tiquete(String _codigo, Vuelo _vuelo, Cliente _cliente, int _tarifa) {
		codigo = _codigo;
		vuelo = _vuelo;
		cliente = _cliente;
		tarifa = _tarifa;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getTarifa() {
		return tarifa;
	}

	public boolean esUsado() {
		return usado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
	
	
	
}
