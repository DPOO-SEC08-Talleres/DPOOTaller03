package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto destino;
	private Aeropuerto origen;
	
	
	
	public Ruta (Aeropuerto _origen, Aeropuerto _destino, String _horaSalida, String _horaLlegada, String _codigoRuta) {
		origen = _origen;
		destino = _destino;
		horaSalida = _horaSalida;
		horaLlegada = _horaLlegada;
		codigoRuta = _codigoRuta;
	}


    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

	public String getCodigoRuta() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getHoraSalida() {
		return horaSalida;
	}


	public String getHoraLlegada() {
		return horaLlegada;
	}


	public Aeropuerto getDestino() {
		return destino;
	}


	public Aeropuerto getOrigen() {
		return origen;
	}
	
	public int getDuracion() {
		return 0;
	}
	
	public int getMinutos() {
		return 0;
	}
	
	public int getHoras() {
		return 0;
	}
	
}
