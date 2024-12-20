// 1. Usa polimorfismo para que diferentes clases respondan de manera distinta al método `hablar`.

class Animal {
  hablar() {
    return "Hace ruido";
  }
}

class Perro extends Animal {
  hablar() {
    return "Ladra";
  }
}

class Gato extends Animal {
  hablar() {
    return "Maulla";
  }
}

const animal = new Animal();
const perro = new Perro();
const gato = new Gato();

console.log(animal.hablar()); // Hace ruido
console.log(perro.hablar()); // Ladra
console.log(gato.hablar()); // Maulla
