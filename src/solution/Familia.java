package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Familia extends Componente {

	private final Set<Componente> componentes = new HashSet<>();

	public Familia(String nombre) {
		this.nombre = nombre;
    }

	@Override
	public boolean esFamilia() {
		return true;
	}


	@Override
	public void agregar(Componente componente) {
		componentes.add(componente);
	}

	@Override
	public float getPrecio() {
		return 0;
	}

	@Override
	public Componente buscar(String nombre) {
		for(Componente componente : componentes) {
			Componente buscado = componente.buscar(nombre);
			if(buscado != null) return buscado;
		}
		return null;
	}

	@Override
	public String toString() {
		return componentes.toString();
	}

    
    

}
