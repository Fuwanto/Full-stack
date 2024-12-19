// Implementa un método que calcule el MCD (máximo común divisor) de dos números utilizando recursión.

public class recursion {
    public static void main(String[] args) {
        System.out.println("MCD de 10 y 5: " + mcd(10, 5));
        System.out.println("MCD de 10 y 3: " + mcd(10, 3));
        System.out.println("MCD de 10 y 2: " + mcd(10, 2));
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }
}