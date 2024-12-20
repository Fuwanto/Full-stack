package abstractos;

public class EmpleadoFijo extends Empleado {
    private double bono;

    public EmpleadoFijo(String nombre, int edad, double sueldo, double bono) {
        super(nombre, edad, sueldo);
        this.bono = bono;
    }

    @Override
    public double calcular_sueldo() {
        return sueldo + bono;
    }
}
