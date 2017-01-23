package solution;


import javax.naming.OperationNotSupportedException;

public abstract class Componente {
    public String nombre;

    abstract public boolean esFamilia();
    abstract public void agregar(Componente componente) throws OperationNotSupportedException;
    public abstract float getPrecio();
    public abstract Componente buscar(String nombre);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Componente that = (Componente) o;

        return nombre.toLowerCase().equals(that.nombre.toLowerCase());
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
