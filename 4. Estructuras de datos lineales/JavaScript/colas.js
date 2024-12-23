// 1. Implementa una cola con funciones básicas y úsala para gestionar un sistema de tareas pendientes.
class Cola {
  constructor() {
    this.cola = [];
  }

  enqueue(elemento) {
    this.cola.push(elemento);
  }

  dequeue() {
    return this.cola.shift();
  }

  isEmpty() {
    return this.cola.length === 0;
  }

  size() {
    return this.cola.length;
  }

  print() {
    console.log(this.cola);
  }
}

const tareas = new Cola();
tareas.enqueue("Tarea 1");
tareas.enqueue("Tarea 2");
tareas.enqueue("Tarea 3");
tareas.print();

console.log("Tarea completada:", tareas.dequeue());
tareas.print();

console.log("Me quedan", tareas.size(), "tareas pendientes");

// 2. Escribe una función que ordene las palabras de una frase en una cola y las devuelva en orden inverso.
function ordenarPalabras(frase) {
  const palabras = frase.split(" ");
  const cola = new Cola();
  palabras.forEach((palabra) => cola.enqueue(palabra));
  const palabrasInversas = [];
  while (!cola.isEmpty()) {
    palabrasInversas.unshift(cola.dequeue());
  }
  return palabrasInversas.join(" ");
}

console.log("Orden inverso de palabras:");
console.log("Hola mundo ->", ordenarPalabras("Hola mundo"));
console.log("JavaScript es genial ->", ordenarPalabras("JavaScript es genial"));
console.log(
  "Estructuras de datos lineales ->",
  ordenarPalabras("Estructuras de datos lineales")
);
