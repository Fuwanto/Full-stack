// 1. Escribe un programa que inicialice un array con números aleatorios y ordene sus elementos en orden ascendente.
// 2. Implementa una función que encuentre el número más grande y su posición en un array.

import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array sin ordenar: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));

        int[] result = max(array);
        System.out.println("Número más grande: " + result[0] + " en la posición: " + result[1]);
    }

    public static int[] max(int[] array) {
        int max = array[0];
        int pos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        return new int[] { max, pos };
    }
}