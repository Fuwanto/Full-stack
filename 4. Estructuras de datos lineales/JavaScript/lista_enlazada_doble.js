// 1. Implementa una lista enlazada doble con funciones para agregar y eliminar nodos en posiciones específicas.
// 2. Escribe una función que devuelva el valor del nodo central en una lista enlazada doble.

class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.siguiente = null;
    this.anterior = null;
  }
}

class ListaEnlazadaDoble {
  constructor() {
    this.cabeza = null;
    this.cola = null;
    this.longitud = 0;
  }

  agregarNodo(valor) {
    const nuevoNodo = new Nodo(valor);
    if (!this.cabeza) {
      this.cabeza = nuevoNodo;
      this.cola = nuevoNodo;
    } else {
      this.cola.siguiente = nuevoNodo;
      nuevoNodo.anterior = this.cola;
      this.cola = nuevoNodo;
    }
    this.longitud++;
  }

  eliminarNodo(posicion) {
    if (posicion < 0 || posicion >= this.longitud) {
      return null;
    }
    let actual = this.cabeza;
    if (posicion === 0) {
      this.cabeza = actual.siguiente;
      if (this.cabeza) {
        this.cabeza.anterior = null;
      } else {
        this.cola = null;
      }
    } else if (posicion === this.longitud - 1) {
      actual = this.cola;
      this.cola = actual.anterior;
      this.cola.siguiente = null;
    } else {
      let indice = 0;
      let anterior = null;
      while (indice < posicion) {
        anterior = actual;
        actual = actual.siguiente;
        indice++;
      }
      anterior.siguiente = actual.siguiente;
      actual.siguiente.anterior = anterior;
    }
    this.longitud--;
    return actual.valor;
  }

  obtenerNodoCentral() {
    if (!this.cabeza) {
      return null;
    }
    let lento = this.cabeza;
    let rapido = this.cabeza;
    while (rapido && rapido.siguiente) {
      lento = lento.siguiente;
      rapido = rapido.siguiente.siguiente;
    }
    return lento.valor;
  }
}

const listaEnlazadaDoble = new ListaEnlazadaDoble();
listaEnlazadaDoble.agregarNodo(1);
listaEnlazadaDoble.agregarNodo(2);
listaEnlazadaDoble.agregarNodo(3);
listaEnlazadaDoble.agregarNodo(4);
listaEnlazadaDoble.agregarNodo(5);
console.log(listaEnlazadaDoble.obtenerNodoCentral()); // 3
