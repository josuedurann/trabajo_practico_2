package ar.edu.unju.fi.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.constantes.Posicion;
import ar.edu.unju.fi.model.Jugador;

public class Main {

	public static void main(String[] args) {
		String op;
		Scanner cin = new Scanner(System.in);
		List<Jugador> plantel = new ArrayList();
		
		String pausa;
		do {
		System.out.println("------------------------");
		System.out.println("1- Alta de Jugador");
		System.out.println("2- Mostrar todos los jugadores");
		System.out.println("3- Modificar la posicion de un jugador");
		System.out.println("4- Eliminar un jugador ");
		System.out.println("5- Salir");
		System.out.println("Ingrese Opcion: "); 
		op= cin.nextLine();
		switch(op) 
		{
			case "1": Jugador jg = new Jugador();
					altaJugador(jg);
					plantel.add(jg);
					break;
			case "2": mostrarList(plantel);
					break;
			case "3": modPos(plantel);
					break;
			case "4": eliminarJug(plantel);
					break;
			case "5": System.out.println("YENDO...");
					break;
			default :System.out.println("Equivocado");
		 }
		}while(op.equals("5"));


	}
	public static void altaJugador(Jugador jg) {
		Scanner cin = new Scanner(System.in);
		boolean error=false;
		System.out.print("Ingrese su nombre: ");
		jg.setNombre(cin.nextLine());
		System.out.print("Ingrese su apellido: ");
		jg.setApellido(cin.nextLine());
		do {
		try {
			error=false;
			System.out.println("Ingrese su Fecha de Nacimiento (dd/mm/yyyy): ");
			jg.setFechanac(LocalDate.parse(cin.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			cin.nextLine();
		} catch ( DateTimeParseException e) {
			System.out.println("Fecha mal ingresada");
			error=true;
		}
		}while(error);
		System.out.println("Ingrese su Nacionalidad: ");
		jg.setNacionalidad(cin.nextLine());
		System.out.print("Ingrese su Estatura: ");
		jg.setEstatura(cin.nextDouble());
		System.out.print("Ingrese su peso: ");
		jg.setPeso(cin.nextDouble());
		cin.nextLine();
		posicion(jg);
		
	}
	public static void posicion(Jugador jg)
		{
			Scanner cin = new Scanner(System.in);
			System.out.println("Posicion");
			System.out.println("1 - Delantero");
			System.out.println("2 - Medio");
			System.out.println("3 - Defensa");
			System.out.println("4 - Arquero");
			System.out.println("Ingrese Posicion");
			jg.setPosicion(Posicion.values()[cin.nextInt()-1]);
		}
	
	public static void mostrarList(List<Jugador> plantel)
	{
		for(Jugador jugadores: plantel)
		{
			System.out.println("Nombre: "+jugadores.getNombre());
			System.out.println("Apellido: "+jugadores.getApellido());
			System.out.println("Fecha de nacimiento: "+jugadores.getFechanac());
			System.out.println("Nacionalidad: "+jugadores.getNacionalidad());
			System.out.println("Estatura: "+jugadores.getEstatura());
			System.out.println("Peso: "+jugadores.getPeso());
			System.out.println("Posicion: "+jugadores.getPosicion());
			
		}
	}
	public static void modPos(List<Jugador> plantel)
	{
		Scanner cin = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.println("Ingrese el nombre del jugador a modificar: ");
		nombre = cin.nextLine();
		System.out.println("Ingresa el apellido del jugador: ");
		apellido = cin.nextLine();
		for(Jugador jugadores: plantel)
		{
			if(jugadores.getNombre().equals(nombre) && jugadores.getApellido().equals(apellido))
			{
				posicion(jugadores);
			}
		}
	}
	
	public static void eliminarJug(List<Jugador> plantel)
	{
		Scanner cin = new Scanner(System.in);
		String nombre;
		String apellido;
		boolean borrado = false;
		System.out.println("Ingrese el nombre del jugador a modificar: ");
		nombre = cin.nextLine();
		System.out.println("Ingresa el apellido del jugador: ");
		apellido = cin.nextLine();
		for(int i = 0; i <plantel.size(); i++)
		{
			if(plantel.get(i).getNombre().equals(nombre) && plantel.get(i).getApellido().equals(apellido)) {
				plantel.remove(i);
				borrado = true;}
			if(borrado)
				System.out.println("Jugador Eliminado");
			else
				System.out.println("Jugador no encontrado");
				
		}	
	}
}
