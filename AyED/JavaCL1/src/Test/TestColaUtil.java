package Test;

import aplicaciones.ColaUtil;
import recursos.Entrada;

public class TestColaUtil{
    public static void main(String[] args) {
        ColaUtil cola=new ColaUtil();

        System.out.println("Vamos a cargar la Pila: ");
        System.out.println("Ingrese el tamaño");
        int n=Entrada.sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Cargue el elemento "+(i+1)+": ");
            cola.GetCola().meter(Entrada.sc.nextInt());
        }
        System.out.println(cola.Cardinal());

        

    }
}