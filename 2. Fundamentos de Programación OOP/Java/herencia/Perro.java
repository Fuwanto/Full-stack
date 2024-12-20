package herencia;

public class Perro implements Mascota, Mamifero {
    private String raza;
    private String nombre;
    private int edad;
    private String genero;

    public Perro(String nombre, int edad, String genero, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro está ladrando");
    }

    @Override
    public void sonido() {
        System.out.println("El perro está ladrando");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Raza: " + raza);
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void amamantar() {
        System.out.println("El perro está amamantando");
    }

    @Override
    public void gestar() {
        System.out.println("El perro está gestando");
    }

    @Override
    public void parir() {
        System.out.println("El perro está pariendo");
    }
}
