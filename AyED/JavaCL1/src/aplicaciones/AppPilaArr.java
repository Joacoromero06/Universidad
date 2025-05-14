package aplicaciones;
import contenedores.PilaArr;
public class AppPilaArr {
    public Object topePila(PilaArr pila){
        Object elemento =pila.sacar();
        pila.meter(elemento);
        return elemento;

    }

}
