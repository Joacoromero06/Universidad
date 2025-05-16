package aplicaciones;

import contenedores.PilaArr;

import contenedores.PilaSLinkedList;

import recursos.Entrada;

import recursos.OperacionesCL1;

public class PilaInt {
    private OperacionesCL1 pila;
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
}
