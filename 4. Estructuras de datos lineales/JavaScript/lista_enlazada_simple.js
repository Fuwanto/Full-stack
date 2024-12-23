// 1. Implementa una lista enlazada simple con funciones para agregar, eliminar y buscar nodos.
// 2. Escribe un método que cuente el número de nodos en la lista enlazada.

class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.siguiente = null;
  }
}

class ListaEnlazadaSimple {
  constructor() {
    this.cabeza = null;
    this.longitud = 0;
  }

  agregar(valor) {
    const nuevoNodo = new Nodo(valor);
    if (!this.cabeza) {
      this.cabeza = nuevoNodo;
    } else {
      let actual = this.cabeza;
      while (actual.siguiente) {
        actual = actual.siguiente;
      }
      actual.siguiente = nuevoNodo;
    }
    this.longitud++;
  }

  eliminar(valor) {
    if (!this.cabeza) {
      return null;
    }
    if (this.cabeza.valor === valor) {
      this.cabeza = this.cabeza.siguiente;
      this.longitud--;
      return;
    }
    let actual = this.cabeza;
    while (actual.siguiente) {
      if (actual.siguiente.valor === valor) {
        actual.siguiente = actual.siguiente.siguiente;
        this.longitud--;
        return;
      }
      actual = actual.siguiente;
    }
  }

  buscar(valor) {
    let actual = this.cabeza;
    while (actual) {
      if (actual.valor === valor) {
        return actual;
      }
      actual = actual.siguiente;
    }
    return null;
  }

  contar() {
    return this.longitud;
  }
}

const lista = new ListaEnlazadaSimple();

lista.agregar(1);
lista.agregar(2);
lista.agregar(3);
lista.agregar(4);
lista.agregar(5);

console.log(lista.contar()); // 5
