package solution;


import javax.naming.OperationNotSupportedException;

public class Producto extends Componente {
	private float precio;

	public Producto(String nombre) {
		this.nombre = nombre;
	}
    public Producto(String nombre, float precio) {
    	this.nombre = nombre;
    	this.precio = precio;
	}

	@Override
	public boolean esFamilia() {
		return false;
	}

	@Override
	public void agregar(Componente componente) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public float getPrecio() {
		return precio;
	}

	@Override
	public Componente buscar(String nombre) {
		if(this.nombre.equals(nombre)) {
			return this;
		}
		return null;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	

}
