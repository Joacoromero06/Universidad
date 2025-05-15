package Test;

import TADs.Numero;

public class TestNum {
    public static void main(String[] args) {
        Numero n1=new Numero(15);Numero n2=new Numero(5);
        Numero n3=new Numero();n3.Producto(n1,n2);
        int a=Numero.Cociente(n1,n2);
        System.out.println("El cociente entre "+n1+" con "+n2+" es: "+a);
        System.err.println(n1);
        a=Numero.MCD(n2, n1);//Como el cociente detruye n1 quedo en 0
        System.out.println("El MCD entre "+n3+" con "+n2+" es: "+a);
    }
}
