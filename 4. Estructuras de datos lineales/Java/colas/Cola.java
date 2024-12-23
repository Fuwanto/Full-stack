// 1. Define una clase para una cola simple con métodos para agregar, eliminar y mostrar el frente de la cola.
// 2. Implementa un programa que utilice una cola para simular un sistema de impresión de documentos.

public class Cola {
    private int[] cola;
    private int frente;
    private int fin;
    private int maximo;

    public Cola(int maximo) {
        this.maximo = maximo;
        this.cola = new int[maximo];
        this.frente = 0;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return this.fin < this.frente;
    }

    public boolean estaLlena() {
        return this.fin == this.maximo - 1;
    }

    public void agregar(int dato) {
        if (!this.estaLlena()) {
            this.cola[++this.fin] = dato;
            System.out.println("Documento " + dato + " agregado a la cola.");
        } else {
            System.out.println("La cola está llena. No se puede agregar el documento " + dato);
        }
    }

    public int eliminar() {
        if (!this.estaVacia()) {
            int eliminado = this.cola[this.frente++];
            System.out.println("Documento " + eliminado + " eliminado de la cola.");
            return eliminado;
        } else {
            System.out.println("La cola está vacía. No se puede eliminar ningún documento.");
            return -1;
        }
    }

    public int mostrarFrente() {
        if (!this.estaVacia()) {
            return this.cola[this.frente];
        } else {
            System.out.println("La cola está vacía.");
            return -1;
        }
    }

    public void mostrarCola() {
        if (!this.estaVacia()) {
            System.out.print("Cola actual: ");
            for (int i = this.frente; i <= this.fin; i++) {
                System.out.print(this.cola[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public static void main(String[] args) {
        // Simulacion de sistema de impresión de documentos.
        Cola cola = new Cola(5);
        System.out.println("Agregando documentos a la cola...");
        cola.agregar(1);
        cola.agregar(2);
        cola.agregar(3);
        cola.agregar(4);
        cola.agregar(5);
        cola.agregar(6);
        cola.mostrarCola();
        System.out.println("Eliminando documentos de la cola...");
        cola.eliminar();
        cola.eliminar();
        cola.mostrarCola();
        System.out.println("Agregando más documentos a la cola...");
        cola.agregar(7);
        cola.agregar(8);
        cola.mostrarCola();
    }
}