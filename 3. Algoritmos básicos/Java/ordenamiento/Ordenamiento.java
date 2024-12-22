// 1. Implementa el ordenamiento por inserción para un array de enteros.
// 2. Crea un programa que ordene un array de enteros usando Quicksort.

import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {
        int[] array = { 5, 3, 2, 4, 1 };
        System.out.println("Array original: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array ordenado por inserción: " + Arrays.toString(array));

        int[] array2 = { 5, 3, 2, 4, 1 };
        System.out.println("Array original: " + Arrays.toString(array2));
        quickSort(array2, 0, array2.length - 1);
        System.out.println("Array ordenado por Quicksort: " + Arrays.toString(array2));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}

/*
 * Nota:
 * La implementación de Quicksort en Python es más concisa debido a la capacidad
 * de Python
 * para manejar listas de manera flexible y su sintaxis más compacta. En Java,
 * la implementación
 * tiende a ser más detallada y explícita debido a la necesidad de manejar
 * índices y
 * evitar la creación de subarrays adicionales para mejorar la eficiencia.
 * 
 * Ambas implementaciones son correctas y adecuadas para sus respectivos
 * lenguajes.
 * La elección de la implementación depende de las características y
 * convenciones del lenguaje
 * que estés utilizando.
 * 
 */