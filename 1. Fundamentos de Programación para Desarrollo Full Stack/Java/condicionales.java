// Crea un programa que determine si un número está en el rango de 1 a 100.

import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero >= 1 && numero <= 100) {
            System.out.println("El número está en el rango de 1 a 100");
        } else {
            System.out.println("El número no está en el rango de 1 a 100");
        }
    }
}