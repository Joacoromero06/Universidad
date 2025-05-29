package recursos;
//Tanto Pilas como Colas tienen estas 4 operaciones
//No importa como se implementan es un contrato nomas
//La van a implementar cada objeto(pila-linklis,cola-arr)
public interface ContLin1 {
  void meter(Object elemento);
  Object sacar();
  boolean estaVacia();
  void limpiar();
}



