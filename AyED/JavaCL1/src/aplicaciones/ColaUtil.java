package aplicaciones;

import contenedores.ColaArr;
import contenedores.ColaSLinkedList;
import contenedores.PilaSLinkedList;
import recursos.OperacionesCL1;

public class ColaUtil {
    private OperacionesCL1 cola;


    public ColaUtil(){
        this.cola=new ColaSLinkedList();
    }


    public ColaUtil(int tam){
        this.cola=new ColaArr(tam);
    }    


    public OperacionesCL1 GetCola(){
        return this.cola;
    }


    public int Cardinal(){
        int c=0;
        ColaSLinkedList aux=new ColaSLinkedList();

        while (!this.cola.estaVacia()) {
            aux.meter(this.cola.sacar());
            c++;
        }

        while (!aux.estaVacia()) {
            this.cola.meter(aux.sacar());
        }

        System.out.println("Cardinal de la cola es: ");
        return c;
    }


    public void Invertir(){
        PilaSLinkedList aux=new PilaSLinkedList();
        
        while (!this.cola.estaVacia()) {
            aux.meter(this.cola.sacar());
        }

        while (!aux.estaVacia()) {
            this.cola.meter(aux.sacar());
        }
    }


    public void Concatenar(OperacionesCL1 nvo){
        Object aux;
        while (!nvo.estaVacia()) {
            aux=new Object();
            aux=nvo.sacar();
            this.cola.meter(aux);
            nvo.meter(aux);
        }
    }
}
