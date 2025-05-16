package Recursos;

public abstract class Operable {

    public void Sumar(Operable a, Operable b);

    public void Resta(Operable a, Operable b);

    public void Producto(Operable a, Operable b);

    public void Potencia(Operable a, int n);

    public boolean Iguales(Operable a, Operable b);
}