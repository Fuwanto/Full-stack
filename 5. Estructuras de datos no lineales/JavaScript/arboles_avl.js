// 1. Implementa las rotaciones necesarias para un árbol AVL y realiza pruebas de inserción de nodos.
// 2. Escribe una función para calcular el factor de balance de cada nodo en un árbol AVL.

// Implementación de un árbol AVL
class Nodo {
  constructor(valor) {
    this.valor = valor;
    this.izquierda = null;
    this.derecha = null;
    this.altura = 1;
  }
}

class AVL {
  constructor() {
    this.raiz = null;
  }

  // Función para obtener la altura de un nodo
  altura(nodo) {
    if (nodo === null) return 0;
    return nodo.altura;
  }

  // Función para obtener el máximo de dos números
  maximo(a, b) {
    return a > b ? a : b;
  }

  // Función para obtener el factor de balance de un nodo
  factorBalance(nodo) {
    if (nodo === null) return 0;
    return this.altura(nodo.izquierda) - this.altura(nodo.derecha);
  }

  // Rotación simple a la derecha
  rotacionDerecha(nodo) {
    let aux = nodo.izquierda;
    nodo.izquierda = aux.derecha;
    aux.derecha = nodo;
    nodo.altura =
      this.maximo(this.altura(nodo.izquierda), this.altura(nodo.derecha)) + 1;
    aux.altura =
      this.maximo(this.altura(aux.izquierda), this.altura(aux.derecha)) + 1;
    return aux;
  }

  // Rotación simple a la izquierda

  rotacionIzquierda(nodo) {
    let aux = nodo.derecha;
    nodo.derecha = aux.izquierda;
    aux.izquierda = nodo;
    nodo.altura =
      this.maximo(this.altura(nodo.izquierda), this.altura(nodo.derecha)) + 1;
    aux.altura =
      this.maximo(this.altura(aux.izquierda), this.altura(aux.derecha)) + 1;
    return aux;
  }

  // Rotación doble a la derecha
  rotacionDobleDerecha(nodo) {
    nodo.izquierda = this.rotacionIzquierda(nodo.izquierda);
    return this.rotacionDerecha(nodo);
  }

  // Rotación doble a la izquierda

  rotacionDobleIzquierda(nodo) {
    nodo.derecha = this.rotacionDerecha(nodo.derecha);
    return this.rotacionIzquierda(nodo);
  }

  // Función para insertar un nodo en el árbol AVL
  insertar(valor) {
    this.raiz = this.insertarNodo(this.raiz, valor);
  }

  insertarNodo(nodo, valor) {
    if (nodo === null) {
      return new Nodo(valor);
    }
    if (valor < nodo.valor) {
      nodo.izquierda = this.insertarNodo(nodo.izquierda, valor);
    } else if (valor > nodo.valor) {
      nodo.derecha = this.insertarNodo(nodo.derecha, valor);
    } else {
      return nodo;
    }
    nodo.altura =
      1 + this.maximo(this.altura(nodo.izquierda), this.altura(nodo.derecha));
    let factor = this.factorBalance(nodo);
    if (factor > 1 && valor < nodo.izquierda.valor) {
      return this.rotacionDerecha(nodo);
    }
    if (factor < -1 && valor > nodo.derecha.valor) {
      return this.rotacionIzquierda(nodo);
    }
    if (factor > 1 && valor > nodo.izquierda.valor) {
      return this.rotacionDobleDerecha(nodo);
    }
    if (factor < -1 && valor < nodo.derecha.valor) {
      return this.rotacionDobleIzquierda(nodo);
    }
    return nodo;
  }

  // Función para recorrer el árbol en orden
  inOrden(nodo) {
    if (nodo !== null) {
      this.inOrden(nodo.izquierda);
      console.log(nodo.valor);
      this.inOrden(nodo.derecha);
    }
  }
}

// Prueba de inserción de nodos en un árbol AVL
let arbol = new AVL();
arbol.insertar(10);
arbol.insertar(20);
arbol.insertar(30);
arbol.insertar(40);
arbol.insertar(50);
arbol.insertar(25);
arbol.inOrden(arbol.raiz);

// Prueba de cálculo del factor de balance de cada nodo en un árbol AVL
console.log(arbol.factorBalance(arbol.raiz));
console.log(arbol.factorBalance(arbol.raiz.izquierda));
console.log(arbol.factorBalance(arbol.raiz.derecha));
console.log(arbol.factorBalance(arbol.raiz.derecha.derecha));
console.log(arbol.factorBalance(arbol.raiz.derecha.izquierda));
