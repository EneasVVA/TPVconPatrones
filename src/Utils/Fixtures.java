package Utils;

import solution.Familia;
import solution.Producto;
import solution.ReferencesFactory;

/**
 * Created by Tamara on 23/01/2017.
 */
public class Fixtures {
    public static void poblar(Familia raiz) {
        ReferencesFactory referencias =  ReferencesFactory.getFactory();

        referencias.getReference(new Producto("Café", (float)2.22));
        Familia bebidas = new Familia("Bebidas");
        bebidas.agregar(new Producto("Café", (float)2.22));
        Familia refrescos = new Familia("Refrescos");
        refrescos.agregar(new Producto("Cocacola", (float)2));
        refrescos.agregar(new Producto("Fanta naranja", (float)2));
        bebidas.agregar(refrescos);
        Familia desayunos = new Familia("Desayunos");
        desayunos.agregar(referencias.getReference("Café"));
        desayunos.agregar(referencias.getReference(new Producto("Tostada con tomate", (float)4.1)));
        desayunos.agregar(referencias.getReference(new Producto("Te", (float)1.0)));
        Familia tapas = new Familia("Tapas");
        tapas.agregar(referencias.getReference(new Producto("Cacahuetes", (float)0.5)));
        tapas.agregar(referencias.getReference(new Producto("Patatas", (float)0.4)));

        raiz.agregar(desayunos);
        raiz.agregar(bebidas);
        raiz.agregar(tapas);
    }
}
