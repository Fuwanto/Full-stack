// 1. Implementa un programa en Java que genere un error de sintaxis y de tiempo de ejecución, y proporciona las soluciones.
// 2. Crea un programa con un error lógico relacionado con la manipulación de arreglos y describe cómo corregirlo.

public class ErrorSolucion {
    public static void main(String[] args) {
        // Error de sintaxis
        // System.out.println("Hola Mundo);
        // Solución: Agregar comillas al final de la cadena de texto
        System.out.println("Hola Mundo");

        // Error de tiempo de ejecución
        // int[] numeros = {1, 2, 3};
        // System.out.println(numeros[3]);
        // Solución: Acceder a un índice válido
        int[] numeros = { 1, 2, 3 };
        System.out.println(numeros[2]);

        // Error lógico
        // Error lógico: Intentamos sumar los elementos del arreglo, pero usamos el
        // índice incorrecto
        // int[] numeros = {1, 2, 3};
        // int suma = 0;
        // for (int i = 0; i <= numeros.length; i++) {
        // suma += numeros[i];
        // }
        // System.out.println("Suma: " + suma);

        // Solución: Corregir el bucle para que use el índice correcto
        int[] numeros2 = { 1, 2, 3 };
        int suma = 0;
        for (int i = 0; i < numeros2.length; i++) {
            suma += numeros2[i];
        }
        System.out.println("Suma: " + suma);
    }
}