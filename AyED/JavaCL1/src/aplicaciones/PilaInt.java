package aplicaciones;

import contenedores.PilaArr;

import contenedores.PilaSLinkedList;

import recursos.Entrada;

import recursos.OperacionesCL1;

public class PilaInt {
    private OperacionesCL1 pila;

    public PilaInt(){
        this.pila=new PilaSLinkedList();
    }


    public PilaInt(int tam){
        this.pila=new PilaArr(tam);
            
    }


    void Carga(){
        int n=Entrada.sc.nextInt();
        for(int i=0;i<=n;i++){
            this.pila.meter(Entrada.sc.nextInt());
        }
    }


    public String toString() {
        String str="";
        while(!this.pila.estaVacia()){
            str+="Elemento: ";
            str+=this.pila.sacar().toString();
            str+="\n";
        }
        return str;
    }
    
    
    public void Reemplaza(int bus,int nvo){
        int aux;

        while(!this.pila.estaVacia()){
            aux=(int)this.pila.sacar();
            if(aux==bus)

        }
    }
}
