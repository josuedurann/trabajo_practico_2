package ar.edu.unju.fi.ejericio7.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio1.model.Categoria;
import ar.edu.unju.fi.ejercicio1.model.OrigenDeFabricacion;
import ar.edu.unju.fi.ejercicio1.model.Producto;

public class Main {

	public static void main(String[] args) {
Scanner cin = new Scanner(System.in);
		
		List<Producto> stock = new ArrayList();
		
		Producto producto = new Producto(1,"Teclado",34,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(2,"Mouse",2325,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(3,"Monitor",56737,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(4,"Auriculares",90087,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(5,"Cable USB",1344,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(6,"Placa de video",1000376,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(7,"Procesador",12456,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(8,"Memoria RAM",3434,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(9,"Refrigeracion de Torre",1234,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(10,"Notebook",12334,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(11,"Coolers",334,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(12,"Silla de escritorio",1534,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(13,"Mousepad",3498,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(14,"Heladera",3487,OrigenDeFabricacion.ARGENTINA,Categoria.ELECTROHOGAR,true);
		stock.add(producto);
		producto = new Producto(15,"Horno",3456,OrigenDeFabricacion.ARGENTINA,Categoria.ELECTROHOGAR,true);
		stock.add(producto);
		
		String op;
		do{
			System.out.println("--MENU--");
			System.out.println("1-Mostrar Productos");
			System.out.println("2-Mostrar Productos faltantes");
			System.out.println("3-Incrementar el precio de los productos en %20");
			System.out.println("4-Mostrar los productos que corresponden a la categoría Electrohogar y estén disponibles para la venta");
			System.out.println("5- Ordenar los productos por precio de forma descendente");
			System.out.println("6-Mostrar los productos con los nombres en mayúsculas");
			System.out.println("Ingrese Opcion: ");
			op = cin.nextLine();
			
			switch(op) {
			
			case "1": 	mostrar(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
			case "2":   mostrarFalt(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
						
			case "3": 	incrementar(stock);
						System.out.println("YENDO...");
						break;
			case "4": 	mostrarCat(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
			case "5": 	stock.sort(Comparator.comparing(Producto::getPreciouni).reversed());
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
			case "6": 	mostrarMayus(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;

			default:System.out.println("Equivocado.");
				
			}
			
		}while(!op.equals("3"));

	}
	
	public static void mostrar(List<Producto> stock)
	{
		Consumer<Producto> printConsumer = p ->
		{
			if(p.isEstado())
				System.out.println(p);
		};
		stock.forEach(printConsumer);
	}
	
	public static void mostrarFalt(List<Producto> stock)
	{
		Predicate<Producto> filtro = p -> !p.isEstado();
		
		stock.stream().filter(filtro).forEach(System.out::println);
		
	}
	
	public static void incrementar(List<Producto> stock)
	{
		Function<Producto,Producto> incr = (p) -> {p.setPreciouni(p.getPreciouni()*1.2); 
													return p;};
		List<Producto> productosIncrementados = new ArrayList();
		productosIncrementados = stock.stream().map(incr).collect(Collectors.toList());
		productosIncrementados.forEach(System.out::println);
	}
	
	public static void mostrarCat(List<Producto> stock)
	{
		Predicate<Producto> filtro = p -> p.getCategoria() == Categoria.ELECTROHOGAR && p.isEstado();
		stock.stream().filter(filtro).forEach(System.out::println);
	}
	
	public static void mostrarMayus(List<Producto> stock)
	{
		
		Function<Producto,Producto> incr = (p) -> {p.setDescripcion(p.getDescripcion().toUpperCase()); return p;};
		stock = stock.stream().map(incr).collect(Collectors.toList());
		stock.forEach(System.out::println);
		
	}

}
