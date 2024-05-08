package ar.unju.edu.fi.ejercicio3.main;

import ar.unju.edu.fi.ejercicio3.constante.Provincia;

public class Main {

	public static void main(String[] args) {
		
		Provincia[] listapro;
		
		listapro = Provincia.values();
		
		for(int i = 0; i <listapro.length; i++)
		{
			System.out.println(listapro[i]);
			System.out.println("Cantidad de poblacion: "+listapro[i].getPoblacion());
			System.out.println("Superficie: "+listapro[i].getSuperficie()+" KM2");
			System.out.println("Densidad poblacional: "+listapro[i].densidadPobl());
		}

	}

}
