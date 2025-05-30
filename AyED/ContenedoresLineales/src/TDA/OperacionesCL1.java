package TDA;
//Tanto Pilas como Colas tienen estas 4 operaciones
//No importa como se implementan es un contrato nomas
//La van a implementar cada objeto(pila-linklis,cola-arr)
public interface OperacionesCL1 {
  void meter(Object elemento);
  Object sacar();
  boolean estaVacia();
  void limpiar();
}



