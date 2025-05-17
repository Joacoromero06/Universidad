package aplicaciones;

import contenedores.PilaArr;
import contenedores.PilaSLinkedList;

public class PilaUtil {


    public static Object topePila(PilaSLinkedList pila){
        Object elemento =pila.sacar();
        pila.meter(elemento);
        return elemento;

    }
    
    
    public static Object topePila(PilaArr pila){
        Object elemento =pila.sacar();
        pila.meter(elemento);
        return elemento;

    }

}
