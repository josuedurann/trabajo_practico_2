package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechanac;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public LocalDate getFechanac() {
		return fechanac;
	}



	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public double getEstatura() {
		return estatura;
	}



	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public Posicion getPosicion() {
		return posicion;
	}



	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}



	public int calcularEdad() 
	{
			Period period = Period.between(fechanac, LocalDate.now());
			return period.getYears();

	}
}
