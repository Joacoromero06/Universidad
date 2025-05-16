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


    public void Carga(){
        System.out.println("Vamos a cargar la Pila: ");
        System.out.println("Ingrese el tamaño");
        int n=Entrada.sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Cargue el elemento "+(i+1)+": ");
            this.pila.meter(Entrada.sc.nextInt());
        }
    }


    public String toString() {

        String str="Vamos a mostrar la pila: \n";
        PilaInt aux=new PilaInt();
        int elem;

        while(!this.pila.estaVacia()){
            str+="Elemento: ";
            elem=(int)this.pila.sacar();
            str+=elem;
            aux.pila.meter(elem);
            str+="\n";
        }

        while (!aux.pila.estaVacia()) {
            this.pila.meter(aux.pila.sacar());
        }
        return str;
    }
    
    
    public void Reemplaza(int bus,int nvo){
        int elem;//pilaInt aux no importa si atras tiene array o slinkedlist
        PilaInt aux=new PilaInt();//va a recibir la pila con los elem reemplazados, despues lo vuelvo a la pil original

        while(!this.pila.estaVacia()){
            elem=(int)this.pila.sacar();
            if(elem==bus)
                elem=nvo;
            aux.pila.meter(elem); 
        }
        while (!aux.pila.estaVacia()) {
            this.pila.meter((int)aux.pila.sacar()); 
        }
    }
}
