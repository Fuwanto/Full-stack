// 1. Implementa la sobrecarga de métodos en una clase `Calculadora` para realizar operaciones con diferentes tipos de parámetros.

package sobrecargaPolimorfismo;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(1, 2));
        System.out.println(calculadora.sumar(1.5, 2.5));
        System.out.println(calculadora.restar(1, 2));
        System.out.println(calculadora.restar(1.5, 2.5));
        System.out.println(calculadora.multiplicar(1, 2));
        System.out.println(calculadora.multiplicar(1.5, 2.5));
        System.out.println(calculadora.dividir(1, 2));
        System.out.println(calculadora.dividir(1.5, 2.5));
    }
}
