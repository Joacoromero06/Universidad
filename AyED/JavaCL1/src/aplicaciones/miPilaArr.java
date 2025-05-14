package aplicaciones;
import contenedores.PilaArr;
public class miPilaArr extends PilaArr{

    public miPilaArr(int tamPila){
        super(tamPila);
    }
    public Object topePila(){
        Object elemento = this.sacar();
        this.meter(elemento);
        return elemento;
    }
}
