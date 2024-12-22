// 1. Crea un programa que realice una búsqueda secuencial en un array y devuelva si el elemento está presente.
// 2. Escribe un método que implemente la búsqueda binaria en un array ordenado.

public class Busqueda {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int elemento = 5;
        System.out.println("");
        System.out.println(busquedaSecuencial(array, elemento));
        System.out.println("");
        System.out.println(busquedaBinaria(array, elemento));
    }

    public static boolean busquedaSecuencial(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio] == elemento) {
                return medio;
            } else if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
