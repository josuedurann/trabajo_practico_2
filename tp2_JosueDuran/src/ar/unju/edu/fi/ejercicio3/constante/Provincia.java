package ar.unju.edu.fi.ejercicio3.constante;

public enum Provincia {
	JUJUY(811611,53219), SALTA(1441351,155488), TUCUMAN(1448188,22525), CATAMARCA(429562,102601), LARIOJA(324226,89380), SANTIAGODELESTERO(1060960,136351);
	
	private int poblacion;
	private int superficie;
	
	
	private Provincia(int poblacion, int superficie) {
		this.poblacion = poblacion;
		this.superficie = superficie;
	}


	public int getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public int densidadPobl()
	{
		 return poblacion/superficie;
		
	}
	
}
