package abstractos;

import abstractos.EmpleadoFijo;
import abstractos.EmpleadoTemporal;

@SuppressWarnings("unused")
public class Prueba {
    public static void main(String[] args) {
        EmpleadoFijo ef = new EmpleadoFijo("Juan", 30, 1000, 200);
        EmpleadoTemporal et = new EmpleadoTemporal("Pedro", 25, 800, 6);

        System.out.println("");
        System.out.println(ef.calcular_sueldo());
        System.out.println(et.calcular_sueldo());
    }
}
