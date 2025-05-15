package TADs;

import Recursos.IOperaciones;;

public class Matriz implements IOperaciones{
    Object matriz[][];
    int n,m;


    //CONSTRUCTORES SETTERS Y GETTERS
    public Matriz(int n, int m) {
        this.matriz=new Object[m][n];
        this.n = n;
        this.m = m;
    }
    public Object[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(Object[][] matriz) {
        this.matriz = matriz;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }


    //METODOS DE IOPERACIONES GENERALES PARA CUALQUIER OBJETO MATEMATICO
    public void Sumar(Object a, Object b) {
        int m=((Matriz)a).getM();
        int n=((Matriz)b).getN();
        if(IgualTam((Matriz)a, (Matriz)b)){
            Matriz C=new Matriz(m, n);
            for( int i=0;i<m;i++)
                for( int j=0;j<n;j++){
                    //PROBLEMA DE GENERALIDAD NO PUEDO SUMAR LOS ELEMENTOS NO TENGO UN METODO
                    Object aux=new Object();
                    aux.Sumar(((Matriz(a)).getMatriz())[i][j],(Matriz(b)).getMatriz()[i][j]);

                    C[i][j].Sumar((Matriz(a)).getMatriz()[i][j],(Matriz(b)).getMatriz()[i][j]);
                }
        }
    }


    public void Resta(Object a, Object b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Resta'");
    }

    @Override
    public void Producto(Object a, Object b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Producto'");
    }

    @Override
    public void Potencia(Object a, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Potencia'");
    }

    @Override
    public boolean Iguales(Object a, Object b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Iguales'");
    }

    

    //METODOS UNICOS DE LA CLASE MATRIZ
    public static boolean IgualTam(Matriz A,Matriz B){
        return A.getM()==B.getM()&&A.getN()==B.getN();
    } 
    


     
}