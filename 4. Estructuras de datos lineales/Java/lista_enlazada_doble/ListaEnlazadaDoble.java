// 1. Crea una clase para una lista enlazada doble con métodos para agregar y eliminar nodos en los extremos.
// 2. Implementa un método que cuente los nodos de una lista enlazada doble.

public class ListaEnlazadaDoble {
    private NodoDoble inicio;
    private NodoDoble fin;

    public ListaEnlazadaDoble() {
        inicio = null;
        fin = null;
    }

    public void agregarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }

    public void agregarFin(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    public void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.siguiente;
            if (inicio != null) {
                inicio.anterior = null;
            } else {
                fin = null;
            }
        }
    }

    public void eliminarFin() {
        if (fin != null) {
            fin = fin.anterior;
            if (fin != null) {
                fin.siguiente = null;
            } else {
                inicio = null;
            }
        }
    }

    public int contarNodos() {
        int contador = 0;
        NodoDoble aux = inicio;
        while (aux != null) {
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }

    public void mostrar() {
        NodoDoble aux = inicio;
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        lista.agregarInicio(10);
        lista.agregarInicio(20);
        lista.agregarFin(30);
        lista.agregarFin(40);
        lista.mostrar();
        System.out.println("Nodos: " + lista.contarNodos());
        lista.eliminarInicio();
        lista.eliminarFin();
        lista.mostrar();
        System.out.println("Nodos: " + lista.contarNodos());

    }

}
