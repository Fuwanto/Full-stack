package herencia;

public class Gato extends Animal {
    private String raza;

    public Gato(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public void maullar() {
        System.out.println("El gato está maullando");
    }

    @Override
    public void sonido() {
        System.out.println("El gato está maullando");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza: " + raza);
    }

}
