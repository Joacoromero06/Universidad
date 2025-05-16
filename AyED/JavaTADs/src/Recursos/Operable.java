package Recursos;

public abstract class Operable {

    public abstract void Sumar(Operable a, Operable b);

    public abstract void Resta(Operable a, Operable b);

    public abstract void Producto(Operable a, Operable b);

    public abstract void Potencia(Operable a, int n);

    public abstract boolean Iguales(Operable a, Operable b);

    public abstract Operable Carga();

    public abstract Operable Inicializa();
}