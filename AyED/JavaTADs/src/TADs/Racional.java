package TADs;

import Recursos.IOperaciones;
import Recursos.ParOrdenado;

public class Racional implements IOperaciones {
    private Numero num,den;

    public Racional(Numero num, Numero den) {
        this.num = num;
        this.den = den;
    }

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    public Numero getDen() {
        return den;
    }

    public void setDen(Numero den) {
        this.den = den;
    }


    public void Sumar(Object a, Object b) {
        
        Numero aux1=new Numero();
        aux1.Producto( ((Racional)a).getNum()  ,  ((Racional)b).getDen() );

        Numero aux2=new Numero();
        aux2.Producto( ((Racional)b).getNum()  ,  ((Racional)a).getDen() );
        
        Numero num=new Numero();
        num.Sumar(aux1,aux2);

        Numero den=new Numero();
        den.Producto( ((Racional)a).getDen()  ,  ((Racional)b).getDen() );

        this.num=num;
        this.den=den;
    }


    public void Resta(Object a, Object b) {

        Numero aux1=new Numero();
        aux1.Producto( ((Racional)a).getNum()  ,  ((Racional)b).getDen() );

        Numero aux2=new Numero();
        aux2.Producto( ((Racional)b).getNum()  ,  ((Racional)a).getDen() );
        
        Numero num=new Numero();
        num.Resta(aux1,aux2);

        Numero den=new Numero();
        den.Producto( ((Racional)a).getDen()  ,  ((Racional)b).getDen() );

        this.num=num;
        this.den=den;
    }

  
    public void Producto(Object a, Object b) {
        
        Numero num=new Numero();
        num.Producto( ((Racional)a).getNum()  ,  ((Racional)b).getNum() );

        Numero den=new Numero();
        den.Producto( ((Racional)a).getDen()  ,  ((Racional)b).getDen() );

        this.num=num;
        this.den=den;
    }


    public void Potencia(Object a, int n) {

        Numero num=new Numero();
        num.Potencia( ((Racional)a).getNum()  ,  n );

        Numero den=new Numero();
        den.Potencia( ((Racional)a).getDen()  ,  n );

        this.num=num;
        this.den=den;
    }

    
    public boolean Iguales(Object a, Object b) {
        
        ((Racional)a).Simplificacion();
        ((Racional)b).Simplificacion();

        return Iguales(((Racional)a).getNum(),((Racional)b).getNum()) && Iguales(((Racional)a).getDen(),((Racional)b).getDen());
    }


    public String toString(){
        return this.num +" / "+this.den;
    }


    public void Simplificacion(){
        
        Numero mcd=new Numero();
        mcd.MCD(this.num , this.den);

        ParOrdenado cr=Numero.CyR(this.num, mcd);
        this.num=cr.getX();

        cr=Numero.CyR(this.den, mcd);
        this.den=cr.getX();
    }

    

}

