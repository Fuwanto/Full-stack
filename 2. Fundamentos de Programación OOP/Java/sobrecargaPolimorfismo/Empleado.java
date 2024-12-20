// 2. Usa polimorfismo en un programa que maneje diferentes tipos de empleados y calcule sus sueldos de manera específica.

package sobrecargaPolimorfismo;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double sueldoBase;

    public Empleado(String nombre, String apellido, String dni, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
}