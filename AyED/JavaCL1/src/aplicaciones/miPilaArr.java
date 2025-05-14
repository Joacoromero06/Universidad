package aplicaciones;
import contenedores.PilaArr;//Solo necesito la clase PilaArr


public class miPilaArr extends PilaArr{
    //Sin atributos, mi pila no tiene nuevos atributos


    //Necesario para instanciar una objeto de tipo miPilaArr??
    public miPilaArr(int tamPila){
        super(tamPila);//Llamo al constructor de la super clase con su respectivo atributro q necesita
    }
    public Object topePila(){
        Object elemento = this.sacar();
        this.meter(elemento);
        return elemento;
    }
}
