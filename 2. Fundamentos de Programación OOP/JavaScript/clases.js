// 1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
// 2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.

class Persona {
  static contador = 0;
  constructor(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
    Persona.contador++;
  }

  mostrarInfo() {
    console.log(`Nombre: ${this.nombre}, Edad: ${this.edad}`);
  }

  static contarInstancias() {
    console.log(`Cantidad de instancias: ${Persona.contador}`);
  }
}

let persona1 = new Persona("Juan", 30);
let persona2 = new Persona("Ana", 25);
let persona3 = new Persona("Pedro", 40);

persona1.mostrarInfo();
persona2.mostrarInfo();
persona3.mostrarInfo();

Persona.contarInstancias(); // 3
