public class ExcepcionEjer {
    public static void main(String[] args) {
        // 1. Implementa un código en Java que maneje una excepción
        // `ArithmeticException` usando `try-catch` y explica cómo funciona el bloque
        // `finally`.
        try {
            int a = 10 / 0;
            System.out.println("Resultado: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { // Se ejecuta siempre, haya o no excepción
            System.out.println("Bloque finally");
        }

        // 2. Escribe un programa en Java que lance y maneje excepciones múltiples
        // dentro de un solo bloque `try-catch`.
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}