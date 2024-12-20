// 1. Define una clase abstracta `Empleado` con un método abstracto `calcular_sueldo` y extiéndela en clases concretas `EmpleadoFijo` y `EmpleadoTemporal`.
// 2. Agrega un constructor en la clase abstracta y úsalo en las clases derivadas.
package abstractos;

abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public abstract double calcular_sueldo();
}