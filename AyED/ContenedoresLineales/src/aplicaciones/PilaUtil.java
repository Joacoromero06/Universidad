package aplicaciones;

import CL1.PilaArr;
import CL1.PilaSLinkedList;
import TDA.OperacionesCL1;

public class PilaUtil {
    protected OperacionesCL1 pila;


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
