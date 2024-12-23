// 1. Implementa un árbol AVL con métodos para insertar y eliminar NodoAVLs balanceando el árbol.
// 2. Escribe un programa que demuestre el funcionamiento de las rotaciones simples y dobles en un árbol AVL.

public class ArbolAVL {
    private NodoAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public NodoAVL getRaiz() {
        return raiz;
    }

    public void insertar(int dato) {
        raiz = insertar(raiz, dato);
    }

    private NodoAVL insertar(NodoAVL NodoAVL, int dato) {
        if (NodoAVL == null) {
            NodoAVL = new NodoAVL(dato);
        } else if (dato < NodoAVL.getDato()) {
            NodoAVL.setIzquierdo(insertar(NodoAVL.getIzquierdo(), dato));
            if (altura(NodoAVL.getIzquierdo()) - altura(NodoAVL.getDerecho()) == 2) {
                if (dato < NodoAVL.getIzquierdo().getDato()) {
                    NodoAVL = rotacionIzquierda(NodoAVL);
                } else {
                    NodoAVL = rotacionDobleIzquierda(NodoAVL);
                }
            }
        } else if (dato > NodoAVL.getDato()) {
            NodoAVL.setDerecho(insertar(NodoAVL.getDerecho(), dato));
            if (altura(NodoAVL.getDerecho()) - altura(NodoAVL.getIzquierdo()) == 2) {
                if (dato > NodoAVL.getDerecho().getDato()) {
                    NodoAVL = rotacionDerecha(NodoAVL);
                } else {
                    NodoAVL = rotacionDobleDerecha(NodoAVL);
                }
            }
        }
        NodoAVL.setAltura(Math.max(altura(NodoAVL.getIzquierdo()), altura(NodoAVL.getDerecho())) + 1);
        return NodoAVL;
    }

    public void eliminar(int dato) {
        raiz = eliminar(raiz, dato);
    }

    private NodoAVL eliminar(NodoAVL NodoAVL, int dato) {
        if (NodoAVL == null) {
            return null;
        }
        if (dato < NodoAVL.getDato()) {
            NodoAVL.setIzquierdo(eliminar(NodoAVL.getIzquierdo(), dato));
            if (altura(NodoAVL.getDerecho()) - altura(NodoAVL.getIzquierdo()) == 2) {
                if (altura(NodoAVL.getDerecho().getDerecho()) >= altura(NodoAVL.getDerecho().getIzquierdo())) {
                    NodoAVL = rotacionDerecha(NodoAVL);
                } else {
                    NodoAVL = rotacionDobleDerecha(NodoAVL);
                }
            }
        } else if (dato > NodoAVL.getDato()) {
            NodoAVL.setDerecho(eliminar(NodoAVL.getDerecho(), dato));
            if (altura(NodoAVL.getIzquierdo()) - altura(NodoAVL.getDerecho()) == 2) {
                if (altura(NodoAVL.getIzquierdo().getIzquierdo()) >= altura(NodoAVL.getIzquierdo().getDerecho())) {
                    NodoAVL = rotacionIzquierda(NodoAVL);
                } else {
                    NodoAVL = rotacionDobleIzquierda(NodoAVL);
                }
            }
        } else if (NodoAVL.getIzquierdo() != null && NodoAVL.getDerecho() != null) {
            NodoAVL.setDato(encontrarMinimo(NodoAVL.getDerecho()).getDato());
            NodoAVL.setDerecho(eliminar(NodoAVL.getDerecho(), NodoAVL.getDato()));
            if (altura(NodoAVL.getIzquierdo()) - altura(NodoAVL.getDerecho()) == 2) {
                if (altura(NodoAVL.getIzquierdo().getIzquierdo()) >= altura(NodoAVL.getIzquierdo().getDerecho())) {
                    NodoAVL = rotacionIzquierda(NodoAVL);
                } else {
                    NodoAVL = rotacionDobleIzquierda(NodoAVL);
                }
            }
        } else {
            NodoAVL = (NodoAVL.getIzquierdo() != null) ? NodoAVL.getIzquierdo() : NodoAVL.getDerecho();
        }
        if (NodoAVL != null) {
            NodoAVL.setAltura(Math.max(altura(NodoAVL.getIzquierdo()), altura(NodoAVL.getDerecho())) + 1);
        }
        return NodoAVL;
    }

    private NodoAVL encontrarMinimo(NodoAVL NodoAVL) {
        if (NodoAVL == null) {
            return null;
        } else if (NodoAVL.getIzquierdo() == null) {
            return NodoAVL;
        } else {
            return encontrarMinimo(NodoAVL.getIzquierdo());
        }
    }

    private int altura(NodoAVL NodoAVL) {
        return NodoAVL == null ? -1 : NodoAVL.getAltura();
    }

    private NodoAVL rotacionIzquierda(NodoAVL NodoAVL) {
        NodoAVL aux = NodoAVL.getIzquierdo();
        NodoAVL.setIzquierdo(aux.getDerecho());
        aux.setDerecho(NodoAVL);
        NodoAVL.setAltura(Math.max(altura(NodoAVL.getIzquierdo()), altura(NodoAVL.getDerecho())) + 1);
        aux.setAltura(Math.max(altura(aux.getIzquierdo()), NodoAVL.getAltura()) + 1);
        return aux;
    }

    private NodoAVL rotacionDerecha(NodoAVL NodoAVL) {
        NodoAVL aux = NodoAVL.getDerecho();
        NodoAVL.setDerecho(aux.getIzquierdo());
        aux.setIzquierdo(NodoAVL);
        NodoAVL.setAltura(Math.max(altura(NodoAVL.getIzquierdo()), altura(NodoAVL.getDerecho())) + 1);
        aux.setAltura(Math.max(altura(aux.getDerecho()), NodoAVL.getAltura()) + 1);
        return aux;
    }

    private NodoAVL rotacionDobleIzquierda(NodoAVL NodoAVL) {
        NodoAVL.setIzquierdo(rotacionDerecha(NodoAVL.getIzquierdo()));
        return rotacionIzquierda(NodoAVL);
    }

    private NodoAVL rotacionDobleDerecha(NodoAVL NodoAVL) {
        NodoAVL.setDerecho(rotacionIzquierda(NodoAVL.getDerecho()));
        return rotacionDerecha(NodoAVL);
    }

    public void inOrden() {
        inOrden(raiz);
    }

    private void inOrden(NodoAVL NodoAVL) {
        if (NodoAVL != null) {
            inOrden(NodoAVL.getIzquierdo());
            System.out.print(NodoAVL.getDato() + " ");
            inOrden(NodoAVL.getDerecho());
        }
    }

    public void preOrden() {
        preOrden(raiz);
    }

    private void preOrden(NodoAVL NodoAVL) {
        if (NodoAVL != null) {
            System.out.print(NodoAVL.getDato() + " ");
            preOrden(NodoAVL.getIzquierdo());
            preOrden(NodoAVL.getDerecho());
        }
    }

    public void postOrden() {
        postOrden(raiz);
    }

    private void postOrden(NodoAVL NodoAVL) {
        if (NodoAVL != null) {
            postOrden(NodoAVL.getIzquierdo());
            postOrden(NodoAVL.getDerecho());
            System.out.print(NodoAVL.getDato() + " ");
        }
    }

    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(35);
        arbol.insertar(45);
        arbol.insertar(55);
        arbol.insertar(60);
        arbol.insertar(70);
        arbol.insertar(80);
        arbol.insertar(90);
        arbol.insertar(100);
        arbol.insertar(110);
        arbol.insertar(120);
        arbol.insertar(130);
        arbol.insertar(140);
        arbol.insertar(150);

        System.out.println("Recorrido preorden:");
        arbol.preOrden();

        System.out.println("\nRecorrido inorden:");
        arbol.inOrden();

        System.out.println("\nRecorrido postorden:");
        arbol.postOrden();

        arbol.eliminar(10);
        arbol.eliminar(20);

        System.out.println("\nRecorrido preorden:");
        arbol.preOrden();

        System.out.println("\nRecorrido inorden:");
        arbol.inOrden();

        System.out.println("\nRecorrido postorden:");
        arbol.postOrden();
    }
}