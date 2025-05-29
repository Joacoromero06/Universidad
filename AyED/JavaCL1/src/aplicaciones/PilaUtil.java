package aplicaciones;

import contenedores.PilaArr;
import contenedores.PilaSLinkedList;
import recursos.ContLin1;

public class PilaUtil {
    protected ContLin1 pila;


    public PilaUtil(){
        this.pila=new PilaSLinkedList();
    }


    public PilaUtil(int tam){
        this.pila=new PilaArr(tam);     
    }
  
    
    public Object topePila(){
        Object elemento =pila.sacar();
        pila.meter(elemento);
        return elemento;
    }
}
