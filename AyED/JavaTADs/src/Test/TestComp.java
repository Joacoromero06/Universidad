package Test;

import TADs.Complejo;

public class TestComp {
    public static void main(String[] args) {
        
        Complejo n1=new Complejo(1,1);
        System.out.println(n1);
        
        Complejo n2=new Complejo();
        n2.Division(n1, new Complejo());
        
        System.out.println(Complejo.Modulo(n1));
        
        n2.Conjugado(n1);
        System.out.println(n2);
    }
}
