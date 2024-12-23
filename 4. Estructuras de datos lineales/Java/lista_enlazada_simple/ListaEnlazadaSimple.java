// 1. Define una clase para una lista enlazada simple con métodos para insertar, eliminar y recorrer los nodos.
// 2. Implementa un método que invierta el orden de los nodos en la lista enlazada.

public class ListaEnlazadaSimple {
    private Nodo cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        cabeza = anterior;
    }

    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);

        System.out.println("Lista original:");
        lista.recorrer();

        System.out.println("Lista invertida:");
        lista.invertir();
        lista.recorrer();
    }
}