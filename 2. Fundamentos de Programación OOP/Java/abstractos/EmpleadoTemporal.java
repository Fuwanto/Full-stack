package abstractos;

public class EmpleadoTemporal extends Empleado {
    private int meses_contrato;

    public EmpleadoTemporal(String nombre, int edad, double sueldo, int meses_contrato) {
        super(nombre, edad, sueldo);
        this.meses_contrato = meses_contrato;
    }

    @Override
    public double calcular_sueldo() {
        return sueldo * meses_contrato;
    }
}
