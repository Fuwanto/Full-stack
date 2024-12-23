// 1. Implementa un árbol binario con métodos para insertar, buscar y recorrer nodos en postorden.
// 2. Escribe un método para contar el número de hojas en un árbol binario.

public class ArbolBinario {
    private NodoBinario raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int dato) {
        NodoBinario nuevo = new NodoBinario(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoBinario aux = raiz;
            NodoBinario padre;
            while (true) {
                padre = aux;
                if (dato < aux.dato) {
                    aux = aux.izq;
                    if (aux == null) {
                        padre.izq = nuevo;
                        return;
                    }
                } else {
                    aux = aux.der;
                    if (aux == null) {
                        padre.der = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public NodoBinario buscar(int dato) {
        NodoBinario aux = raiz;
        while (aux.dato != dato) {
            if (dato < aux.dato) {
                aux = aux.izq;
            } else {
                aux = aux.der;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public void postorden(NodoBinario r) {
        if (r != null) {
            postorden(r.izq);
            postorden(r.der);
            System.out.print(r.dato + " ");
        }
    }

    public int contarHojas(NodoBinario r) {
        if (r == null) {
            return 0;
        }
        if (r.izq == null && r.der == null) {
            return 1;
        } else {
            return contarHojas(r.izq) + contarHojas(r.der);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(75);
        arbol.insertar(10);
        arbol.insertar(30);
        arbol.insertar(60);
        arbol.insertar(85);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(27);
        arbol.insertar(55);
        arbol.insertar(70);
        arbol.insertar(80);
        arbol.insertar(90);

        System.out.println("Recorrido postorden:");
        arbol.postorden(arbol.raiz);
        System.out.println();

        System.out.println("Número de hojas: " + arbol.contarHojas(arbol.raiz));
    }
}