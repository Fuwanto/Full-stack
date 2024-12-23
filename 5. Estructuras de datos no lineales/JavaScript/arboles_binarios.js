// 1. Crea un árbol binario e implementa un método para recorrerlo en preorden, inorden y postorden.
// 2. Escribe una función para buscar un elemento específico en un árbol binario.

class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.izquierda = null;
    this.derecha = null;
  }
}

class ArbolBinario {
  constructor() {
    this.raiz = null;
  }

  insertar(valor) {
    const nuevoNodo = new Nodo(valor);

    if (!this.raiz) {
      this.raiz = nuevoNodo;
    } else {
      this.insertarNodo(this.raiz, nuevoNodo);
    }
  }

  insertarNodo(nodo, nuevoNodo) {
    if (nuevoNodo.valor < nodo.valor) {
      if (!nodo.izquierda) {
        nodo.izquierda = nuevoNodo;
      } else {
        this.insertarNodo(nodo.izquierda, nuevoNodo);
      }
    } else {
      if (!nodo.derecha) {
        nodo.derecha = nuevoNodo;
      } else {
        this.insertarNodo(nodo.derecha, nuevoNodo);
      }
    }
  }

  preorden(nodo = this.raiz) {
    if (!nodo) return;
    console.log(nodo.valor);
    this.preorden(nodo.izquierda);
    this.preorden(nodo.derecha);
  }

  inorden(nodo = this.raiz) {
    if (!nodo) return;
    this.inorden(nodo.izquierda);
    console.log(nodo.valor);
    this.inorden(nodo.derecha);
  }

  postorden(nodo = this.raiz) {
    if (!nodo) return;
    this.postorden(nodo.izquierda);
    this.postorden(nodo.derecha);
    console.log(nodo.valor);
  }

  buscar(valor, nodo = this.raiz) {
    if (!nodo) return false;
    if (nodo.valor === valor) return true;
    if (valor < nodo.valor) {
      return this.buscar(valor, nodo.izquierda);
    } else {
      return this.buscar(valor, nodo.derecha);
    }
  }
}

const arbol = new ArbolBinario();
arbol.insertar(10);
arbol.insertar(5);
arbol.insertar(15);
arbol.insertar(3);
arbol.insertar(7);
arbol.insertar(12);
arbol.insertar(17);

console.log("Preorden:");
arbol.preorden();

console.log("Inorden:");
arbol.inorden();

console.log("Postorden:");
arbol.postorden();

console.log("Buscar 7:", arbol.buscar(7));
console.log("Buscar 8:", arbol.buscar(8));
