import java.util.Iterator;

public class ListaEnlazada<T> implements Iterable<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void insertarAlFinal(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);
        if (tamaño == 0) {
            primero = nodo;
        } else {
            ultimo.siguiente = nodo;
        }
        ultimo = nodo;
        tamaño++;
    }

    public void eliminar(T valor) {
        Nodo<T> anterior = null;
        Nodo<T> actual = primero;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                if (anterior == null) {
                    primero = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                if (actual == ultimo) {
                    ultimo = anterior;
                }
                tamaño--;
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaEnlazada<>(primero);
    }

    private static class Nodo<T> {
        public T valor;
        public Nodo<T> siguiente;

        public Nodo(T valor) {
            this.valor = valor;
            siguiente = null;
        }
    }

    private static class IteradorListaEnlazada<T> implements Iterator<T> {
        private Nodo<T> actual;

        public IteradorListaEnlazada(Nodo<T> primero) {
            actual = primero;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            T valor = actual.valor;
            actual = actual.siguiente;
            return valor;
        }
    }
}
