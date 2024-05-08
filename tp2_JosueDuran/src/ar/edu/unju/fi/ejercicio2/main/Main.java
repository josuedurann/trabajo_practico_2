package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Main {

	public static void main(String[] args) {
		List<Efemeride> lista = new ArrayList();
		Scanner cin = new Scanner(System.in);
		String op;
		do 
		{
			System.out.println("--MENU--");
			System.out.println("1 - Crear efemeride");
			System.out.println("2 - Mostrar efemerides");
			System.out.println("3 - Eliminar efemeride");
			System.out.println("4 - Modicar efemeride");
			System.out.println("5 - Salir");
			System.out.println("Ingrese opcion: ");
			op = cin.nextLine();
			
			
			switch(op) 
			{
				case "1": 	Efemeride efeme = new Efemeride();
							crearefem(efeme);
							lista.add(efeme);
							break;
				case "2": mostrarefem(lista);
							System.out.println("ENTER para continuar");
							cin.nextLine();
							break;
				case "3": eliminarefem(lista);
							break;
				case "4": modefem(lista);
							break;
				case "5": System.out.println("YENDO...");
							break;
				default:System.out.println("Equivocado");
				
			}
		}while(!op.equals("5"));

	}
	
	public static void crearefem(Efemeride e) 
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Ingrese codigo: ");
		e.setCodigo(cin.nextInt());
		cin.nextLine();
		mes(e);
		System.out.println("Ingrese dia: ");
		e.setDia(cin.nextInt());
		cin.nextLine();
		System.out.println("Ingrese detalles: ");
		e.setDetalle(cin.nextLine());
	}
	public static void mes(Efemeride e) 
	{
		Scanner cin = new Scanner(System.in);
		String mes;
		System.out.println("Ingrese mes en numero: ");
		mes = cin.nextLine();
		
		switch(mes) 
		{
			case "1": e.setMes(Mes.ENERO);
						break;
			case "2": e.setMes(Mes.FEBRERO);
						break;
			case "3": e.setMes(Mes.MARZO);
						break;
			case "4": e.setMes(Mes.ABRIL);
						break;
			case "5": e.setMes(Mes.MAYO);
						break;
			case "6": e.setMes(Mes.JUNIO);
						break;
			case "7": e.setMes(Mes.JULIO);
						break;
			case "8": e.setMes(Mes.AGOSTO);
						break;
			case "9": e.setMes(Mes.SEPTIEMBRE);
						break;
			case "10": e.setMes(Mes.OCTUBRE);
						break;
			case "11": e.setMes(Mes.NOVIEMBRE);
						break;
			case "12": e.setMes(Mes.DICIEMBRE);
						break;
			default: System.out.println("Equivocado"); 
		}
	}
	public static void mostrarefem(List<Efemeride> lista) 
	{
		for(Efemeride efem: lista)
		{
			System.out.println("Codigo: "+efem.getCodigo());
			System.out.println("Mes: "+efem.getMes());
			System.out.println("Dia: "+efem.getDia());
			System.out.println("Detalle: "+efem.getDetalle());
		}
	}
	public static void eliminarefem(List<Efemeride> lista)
	{
		Scanner cin = new Scanner(System.in);
		int codigo;
		boolean band = false;
		
		System.out.println("Ingrese codigo de Efemeride a eliminar: ");
		codigo = cin.nextInt();
		
		for(Efemeride efem: lista)
		{
			if(codigo == efem.getCodigo())
			{
				band = lista.remove(efem);
			}
		}
		if(band)
			System.out.println("Se elimino correctamente");
		else
			System.out.println("Codigo no existente");
		
	}
	public static void modefem(List<Efemeride> lista)
	{
		Scanner cin = new Scanner(System.in);
		int codigo;
		boolean band = false;
		
		System.out.println("Ingrese codigo de Efemeride a modificar: ");
		codigo = cin.nextInt();
		
		for(Efemeride efem: lista)
		{
			if(codigo == efem.getCodigo())
			{
				band = true;
				
				System.out.println("Ingrese codigo: ");
				efem.setCodigo(cin.nextInt());
				cin.nextLine();
				mes(efem);
				System.out.println("Ingrese dia: ");
				efem.setDia(cin.nextInt());
				cin.nextLine();
				System.out.println("Ingrese detalles: ");
				efem.setDetalle(cin.nextLine());
				cin.nextLine();
			}
				
			}
		if(!band)
			System.out.println("El codigo no pertence a un dia existente");
		}

}
		



