// Escribe un programa que determine si una persona es mayor de edad usando un operador ternario.

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.close();
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);
    }
}