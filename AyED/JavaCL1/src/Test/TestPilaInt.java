package Test;

import aplicaciones.PilaInt;

public class TestPilaInt {
    public static void main(String[] args) {
        PilaInt pila=new PilaInt();
        pila.Carga();
        System.out.println(pila);
        pila.Reemplaza(2, 4);
        System.out.println(pila);
    }
}
