package solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReferencesFactory {
	private Set<Producto> productos;
	private Producto producto;
	static private ReferencesFactory instance = new ReferencesFactory();
	
	
	private ReferencesFactory() {
		super();
		productos = new HashSet<>();
	}

	
	
	public Producto getReference(Producto _producto) {
		for(Producto producto : productos) {
			if(producto.equals(_producto))
				return producto;
		}

		productos.add(_producto);
		return _producto;
	}

	public Producto getReference(String nombreProducto) {
		return getReference(new Producto(nombreProducto));
	}

	public void removeReference(Producto producto) {
		productos.remove(producto);
	}

	public static ReferencesFactory getFactory() {
		return instance;
	}
}
