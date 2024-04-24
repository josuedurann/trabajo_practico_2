package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	private int codigo;
	private String descripcion;
	private double preciouni;
	private OrigenDeFabricacion origenfab;
	private Categoria categoria;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPreciouni() {
		return preciouni;
	}
	public void setPreciouni(double preciouni) {
		this.preciouni = preciouni;
	}
	public OrigenDeFabricacion getOrigenfab() {
		return origenfab;
	}
	public void setOrigenfab(OrigenDeFabricacion origenfab) {
		this.origenfab = origenfab;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

	
	
}
