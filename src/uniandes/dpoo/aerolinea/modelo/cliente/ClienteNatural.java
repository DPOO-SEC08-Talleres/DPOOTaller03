package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	
	public String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural (String _nombre) {
		nombre = _nombre;
	}

	public String getTipoCliente() {
		return NATURAL;
	}

	public String getidentificador() {
		return null;
	}
	
	
	
	
}
