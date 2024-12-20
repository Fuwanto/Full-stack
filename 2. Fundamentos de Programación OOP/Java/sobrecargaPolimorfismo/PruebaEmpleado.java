package sobrecargaPolimorfismo;

public class PruebaEmpleado {
    public static void main(String[] args) {
        EmpleadoTemporal et = new EmpleadoTemporal("Juan", "Perez", "123456789", 1000, 6);
        EmpleadoFijo ef = new EmpleadoFijo("Ana", "Gomez", "98765432A", 1200, 200);
        System.out.println("El sueldo de " + et.getNombre() + " " + et.getApellido() + " es: " + et.calcularSueldo());
        System.out.println("El sueldo de " + ef.getNombre() + " " + ef.getApellido() + " es: " + ef.calcularSueldo());
    }
}
