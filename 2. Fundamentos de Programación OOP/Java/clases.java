// 1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
// 2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

class Persona {
    private String nombre;
    private int edad;
    private static int cantidad = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 20);
        Persona p2 = new Persona("Ana", 25);
        Persona p3 = new Persona("Pedro", 30);

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

        System.out.println("Cantidad de instancias: " + Persona.getCantidad());
    }
}

