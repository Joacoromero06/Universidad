package testing;
import contenedores.*;


import java.util.Scanner;

public class TestSLL {
	public static void main(String[] args) {
		
		//TEST PILA SLINKEDLIST
		Object objAux;
		Scanner sc1, sc2;
		int n, elemento; 
		System.out.println("Ingrese cantidad");
		sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		if (n > 0) {
			PilaSLinkedList objPila = new PilaSLinkedList();//inbstancia 
			
			for (int i=0; i<n; i++) {//Carga
				System.out.println("Ingrese elemento");
				sc2 = new Scanner(System.in);
				elemento=sc2.nextInt();
				
				objPila.meter(elemento);				
			}
			
			while (!objPila.estaVacia()) {//Muestra
				objAux = objPila.sacar();
				if (objAux != null){//No hace falta el control cuando saco pila avanza y para el ultimo queda en null osea esta vacia(no entra al while)
					System.out.println("Elemento Pila " + objAux.toString());
				}		
			}
			
			objAux=objPila.sacar();//para q muestre el error
		}

		///TEST COLA SLINKEDLIST
		ColaSLinkedList cola= new ColaSLinkedList();//instancio
		cola.meter(3);cola.meter(4);cola.meter(5);cola.meter(6);//encolo 4 elem
		while (!cola.estaVacia()) {
			System.out.println(cola.sacar());//Cuando saque va a quedar el finalC en null no entra al while
		}
	}		
		
}
