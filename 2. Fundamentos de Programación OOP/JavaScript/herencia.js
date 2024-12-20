// 1. Implementa una clase `Vehiculo` y una clase `Bicicleta` que herede de ella. Agrega métodos únicos a cada una.
// 2. Simula herencia múltiple usando objetos o prototipos.

class Vehiculo {
  constructor(marca, modelo, color) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
  }

  arrancar() {
    console.log("Arrancando...");
  }

  frenar() {
    console.log("Frenando...");
  }
}

class Bicicleta extends Vehiculo {
  constructor(marca, modelo, color, tipo) {
    super(marca, modelo, color);
    this.tipo = tipo;
  }

  pedalear() {
    console.log("Pedalear...");
  }
}

const bicicleta = new Bicicleta("Or Trek", "Mar 1", "Negra", "Montaña");

bicicleta.arrancar();
bicicleta.frenar();
bicicleta.pedalear();

// Simulando herencia múltiple
const vehiculo = {
  arrancar() {
    console.log("Arrancando...");
  },
  frenar() {
    console.log("Frenando...");
  },
};

const bicicleta2 = {
  pedalear() {
    console.log("Pedalear...");
  },
};

Object.setPrototypeOf(bicicleta2, vehiculo);

bicicleta2.arrancar();
bicicleta2.frenar();
bicicleta2.pedalear();
