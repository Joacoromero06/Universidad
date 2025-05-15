package TADs;

import Recursos.IOperaciones;

public class Numero implements IOperaciones {
    private int valor;
    
    public Numero(){
        this.valor=0;
    }
    public Numero(int valor){
        this.valor=valor;
    }
    public int GetValor(){
        return this.valor;
    }
    public void SetValor(int valor){
        this.valor=valor;
    }
    public void Sumar(Object a, Object b) {
        this.valor=((Numero)a).GetValor()+((Numero)b).GetValor();
    }
    public void Resta(Object a, Object b) {
        this.valor=((Numero)a).GetValor()-((Numero)b).GetValor();
    }
    public void Producto(Object a, Object b) {
        this.valor=((Numero)a).GetValor()*((Numero)b).GetValor();
    }
    public void Potencia(Object a, int n) {
        this.valor=(int)Math.pow((double)((Numero)a).GetValor(),(double)n);
    }
    public boolean Iguales(Object a, Object b) {
        return ((Numero)a).GetValor()==((Numero)b).GetValor();
    }
    public String toString(){
        return "Numero: "+this.valor;
    }
    //METODOS UNICOS PARA NUMERO
    public static int MCD(Numero a, Numero b){
        if(b.GetValor()==0)
            return a.GetValor();
        else{
            a.SetValor(b.GetValor());
            b.SetValor(Resto(a, b));
            return MCD(  a  , b);
        }     
    }
    public static int RestoNaturales(Numero a, Numero b){
        if(b.GetValor()==0)
            return -1;
        if(a.GetValor()-b.GetValor()<0)
            return a.GetValor();
        else{
            a.SetValor(a.GetValor()-b.GetValor());
            return RestoNaturales(a,b);
        }
    }
    public static int CocienteNaturales(Numero a, Numero b){
        if(a.GetValor()-b.GetValor()<0||b.GetValor()==0)
            return 0;
        else{
            a.SetValor(a.GetValor()-b.GetValor());
            return CocienteNaturales(a,b)+1;
        }
    }
    public static int Resto(Numero a, Numero b){
        Numero x=new Numero(Math.abs(a.GetValor()));
        Numero y=new Numero(Math.abs(b.GetValor()));
        int r=RestoNaturales(x,y);
        if(a.GetValor()<0){
            if(b.GetValor()<0)
                r=(-1)*b.GetValor()-r;
            else
                r=b.GetValor()-r;
        }
        return r;
    }
    public static int Cociente(Numero a, Numero b){
        Numero x=new Numero(Math.abs(a.GetValor()));
        Numero y=new Numero(Math.abs(b.GetValor()));
        int c=CocienteNaturales(x,y);
        if(a.GetValor()<0){
            if(b.GetValor()<0)
                c++;
            else
                c=(-1)*c-1;
        }
        else 
            if(b.GetValor()<0)
                c*=-1;
        return c;
    }
}
