package ar.edu.unju.fi.ejercicio6.interfaces.funcional;

@FunctionalInterface
public interface Converter<T,T1> {
	
	T1 convert(T t);
	
	
	static <T> boolean isNotNull(T t) 
	{
		return t != null;
	}
	
	
	default void mostrarObjeto(T1 t1)
	{
		System.out.println("Objeto -" + t1.toString());
	}

}
