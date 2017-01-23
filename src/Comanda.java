import solution.Componente;

/**
 * Created by Tamara on 23/01/2017.
 */
public class Comanda {
    private final Componente[] componentes;

    public Comanda(Componente... componentes) {
        this.componentes = componentes;
    }

    public float getTotal() {
        float suma = 0;
        for(int i = 0 ; i < componentes.length; i++)
            suma += componentes[i].getPrecio();
        return suma;
    }


}
