package sobrecargaPolimorfismo;

public class EmpleadoTemporal extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporal(String nombre, String apellido, String dni, double sueldoBase, int mesesContrato) {
        super(nombre, apellido, dni, sueldoBase);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * mesesContrato;
    }
}
