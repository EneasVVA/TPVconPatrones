
import Utils.Fixtures;
import solution.Familia;
import solution.Producto;

public class Main {

    public static void main(String[] args) {
        Familia raiz = new Familia("raiz");
        Fixtures.poblar(raiz);

        try {
            Comanda comanda = new Comanda(raiz.buscar("Te"), raiz.buscar("Tostada con tomate"));
            System.out.println(comanda.getTotal());

        } catch(NullPointerException e) {
            System.out.println("Identificador de producto no encontrado");
        }
    }
}
