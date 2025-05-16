package aplicaciones;

import contenedores.PilaArr;

import contenedores.PilaSLinkedList;

import recursos.OperacionesCL1;

public class PilaChar {
    private OperacionesCL1 pila;


    public PilaChar(){
        this.pila=new PilaSLinkedList();
    }


    public PilaChar(int tam){
        this.pila=new PilaArr(tam);
    }


    public String toString(){
        PilaChar aux=new PilaChar();
        String str="Vamos a mostrar la Pila: \n";
        char elem;

        while(!this.pila.estaVacia()){
            elem=(char)this.pila.sacar();
            str+=elem;
            str+="\n";
            aux.pila.meter(elem);
        }
        while(!aux.pila.estaVacia())
            this.pila.meter(aux.pila.sacar());
        return str;
    }


    public void Carga(){
        
    }
}
