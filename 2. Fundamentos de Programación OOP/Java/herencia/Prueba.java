// 1. Define una clase `Animal` y herédala en una clase `Gato`. Sobrescribe un método en la clase hija.
// 2. Usa interfaces para simular herencia múltiple y combina varias interfaces en una clase.

package herencia;

public class Prueba {
    public static void main(String[] args) {
        Gato gato = new Gato("Tom", 3, "Macho", "Siames");
        gato.mostrarDatos();
        gato.comer();
        gato.dormir();
        gato.sonido();
        gato.maullar();

        Perro perro = new Perro("Pluto", 5, "Macho", "Labrador");
        perro.mostrarDatos();
        perro.comer();
        perro.dormir();
        perro.sonido();
        perro.ladrar();
        perro.jugar();
        perro.amamantar();
        perro.gestar();
        perro.parir();
    }
}
