// 1. Implementa una clase para una tabla hash básica con funciones para agregar, buscar y eliminar elementos.
// 2. Crea una función hash simple y analiza su rendimiento utilizando distintas claves.
// 3. Implementa una solución para colisiones usando direccionamiento abierto con la técnica de sondeo lineal (linear probing).

class HashTable {
  constructor() {
    this.table = new Array(137);
  }

  simpleHash(data) {
    let total = 0;
    for (let i = 0; i < data.length; i++) {
      total += data.charCodeAt(i);
    }
    return total % this.table.length;
  }

  put(data) {
    let pos = this.simpleHash(data);
    while (this.table[pos] !== undefined) {
      pos++;
    }
    this.table[pos] = data;
  }

  get(data) {
    let pos = this.simpleHash(data);
    while (this.table[pos] !== data) {
      pos++;
    }
    return pos;
  }

  showDistro() {
    for (let i = 0; i < this.table.length; i++) {
      if (this.table[i] !== undefined) {
        console.log(i + ": " + this.table[i]);
      }
    }
  }
}

let someNames = [
  "David",
  "Jennifer",
  "Donnie",
  "Raymond",
  "Cynthia",
  "Mike",
  "Clayton",
  "Danny",
  "Jonathan",
];
let hTable = new HashTable();
for (let i = 0; i < someNames.length; i++) {
  hTable.put(someNames[i]);
}

hTable.showDistro();
console.log(hTable.get("David"));
