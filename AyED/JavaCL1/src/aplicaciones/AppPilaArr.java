package aplicaciones;
import contenedores.PilaArr;//Solo necesito la clase PilaArr


public class AppPilaArr {
    //Sin atributos clase que usa PilaArr

    public Object topePila(PilaArr pila){
        Object elemento =pila.sacar();
        pila.meter(elemento);
        return elemento;

    }

}
