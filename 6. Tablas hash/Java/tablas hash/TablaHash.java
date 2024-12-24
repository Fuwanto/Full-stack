// 1. Implementa una tabla hash utilizando una lista de encadenamiento para manejar colisiones.
// 2. Escribe una función para calcular el índice hash utilizando el método de multiplicación.
// 3. Implementa el redimensionamiento de una tabla hash cuando su factor de carga supere un límite.

public class TablaHash<K, V> {
    private static final int CAPACIDAD_INICIAL = 16;
    private static final double FACTOR_CARGA = 0.75;
    private int tamaño;
    private int capacidad;
    private ListaEnlazada<Entrada<K, V>>[] tabla;

    @SuppressWarnings("unchecked")
    public TablaHash() {
        capacidad = CAPACIDAD_INICIAL;
        tabla = new ListaEnlazada[capacidad];
        for (int i = 0; i < capacidad; i++) {
            tabla[i] = new ListaEnlazada<>();
        }
    }

    public void insertar(K clave, V valor) {
        if (clave == null) {
            return;
        }
        int indice = calcularIndice(clave);
        ListaEnlazada<Entrada<K, V>> lista = tabla[indice];
        for (Entrada<K, V> entrada : lista) {
            if (entrada.clave.equals(clave)) {
                entrada.valor = valor;
                return;
            }
        }
        lista.insertarAlFinal(new Entrada<>(clave, valor));
        tamaño++;
        if ((double) tamaño / capacidad > FACTOR_CARGA) {
            redimensionar();
        }
    }

    public V obtener(K clave) {
        if (clave == null) {
            return null;
        }
        int indice = calcularIndice(clave);
        ListaEnlazada<Entrada<K, V>> lista = tabla[indice];
        for (Entrada<K, V> entrada : lista) {
            if (entrada.clave.equals(clave)) {
                return entrada.valor;
            }
        }
        return null;
    }

    public void eliminar(K clave) {
        if (clave == null) {
            return;
        }
        int indice = calcularIndice(clave);
        ListaEnlazada<Entrada<K, V>> lista = tabla[indice];
        for (Entrada<K, V> entrada : lista) {
            if (entrada.clave.equals(clave)) {
                lista.eliminar(entrada);
                tamaño--;
                return;
            }
        }
    }

    private int calcularIndice(K clave) {
        int hashCode = clave.hashCode();
        double constante = (Math.sqrt(5) - 1) / 2;
        double parteDecimal = hashCode * constante % 1;
        return (int) (capacidad * parteDecimal);

    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        capacidad *= 2;
        ListaEnlazada<Entrada<K, V>>[] nuevaTabla = new ListaEnlazada[capacidad];
        for (int i = 0; i < capacidad; i++) {
            nuevaTabla[i] = new ListaEnlazada<>();
        }
        for (ListaEnlazada<Entrada<K, V>> lista : tabla) {
            for (Entrada<K, V> entrada : lista) {
                int indice = calcularIndice(entrada.clave);
                nuevaTabla[indice].insertarAlFinal(entrada);
            }
        }
        tabla = nuevaTabla;
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    private static class Entrada<K, V> {
        K clave;
        V valor;

        public Entrada(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        TablaHash<String, Integer> tabla = new TablaHash<>();
        tabla.insertar("a", 1);
        tabla.insertar("b", 2);
        tabla.insertar("c", 3);
        tabla.insertar("d", 4);
        tabla.insertar("e", 5);
        tabla.insertar("f", 6);
        tabla.insertar("g", 7);
        tabla.insertar("h", 8);
        tabla.insertar("i", 9);
        tabla.insertar("j", 10);
        tabla.insertar("k", 11);
        tabla.insertar("l", 12);
        tabla.insertar("m", 13);
        tabla.insertar("n", 14);
        tabla.insertar("o", 15);
        tabla.insertar("p", 16);
        tabla.insertar("q", 17);
        tabla.insertar("r", 18);
        tabla.insertar("s", 19);
        tabla.insertar("t", 20);
        tabla.insertar("u", 21);
        tabla.insertar("v", 22);
        tabla.insertar("w", 23);
        tabla.insertar("x", 24);
        tabla.insertar("y", 25);
        tabla.insertar("z", 26);
        System.out.println(tabla.tamaño());
        System.out.println(tabla.obtener("a"));
        System.out.println(tabla.obtener("b"));
        System.out.println(tabla.obtener("c"));
        System.out.println(tabla.obtener("d"));
        System.out.println(tabla.obtener("e"));
        System.out.println(tabla.obtener("f"));
        System.out.println(tabla.obtener("g"));
        System.out.println(tabla.obtener("h"));
        System.out.println(tabla.obtener("i"));
        System.out.println(tabla.obtener("j"));
        System.out.println(tabla.obtener("k"));
        System.out.println(tabla.obtener("l"));
        System.out.println(tabla.obtener("m"));
        System.out.println(tabla.obtener("n"));
        System.out.println(tabla.obtener("o"));
        System.out.println(tabla.obtener("p"));
        System.out.println(tabla.obtener("q"));
        System.out.println(tabla.obtener("r"));
        System.out.println(tabla.obtener("s"));

        tabla.eliminar("a");
        tabla.eliminar("b");
        tabla.eliminar("c");
        tabla.eliminar("d");
        tabla.eliminar("e");
        tabla.eliminar("f");
        tabla.eliminar("g");
        tabla.eliminar("h");
        tabla.eliminar("i");
        tabla.eliminar("j");
        tabla.eliminar("k");
        tabla.eliminar("l");
        tabla.eliminar("m");
        tabla.eliminar("n");
        tabla.eliminar("o");
        tabla.eliminar("p");
        tabla.eliminar("q");
        tabla.eliminar("r");
        tabla.eliminar("s");

        System.out.println(tabla.tamaño());
        System.out.println(tabla.estaVacia());

    }
}
