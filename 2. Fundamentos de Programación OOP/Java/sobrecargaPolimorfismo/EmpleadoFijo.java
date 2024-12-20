package sobrecargaPolimorfismo;

public class EmpleadoFijo extends Empleado {
    private double bonoFijo;

    public EmpleadoFijo(String nombre, String apellido, String dni, double sueldoBase, double bonoFijo) {
        super(nombre, apellido, dni, sueldoBase);
        this.bonoFijo = bonoFijo;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() + bonoFijo;
    }
}
