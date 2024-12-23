# 1. Implementa una clase para un árbol binario que permita agregar nodos y realizar un recorrido en orden.
# 2. Escribe una función para calcular la altura de un árbol binario.


class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None


class ArbolBinario:
    def __init__(self):
        self.raiz = None

    def agregar(self, valor):
        if self.raiz is None:
            self.raiz = Nodo(valor)
        else:
            self._agregar(valor, self.raiz)

    def _agregar(self, valor, nodo):
        if valor < nodo.valor:
            if nodo.izquierda is None:
                nodo.izquierda = Nodo(valor)
            else:
                self._agregar(valor, nodo.izquierda)
        else:
            if nodo.derecha is None:
                nodo.derecha = Nodo(valor)
            else:
                self._agregar(valor, nodo.derecha)

    def inorden(self):
        self._inorden(self.raiz)

    def _inorden(self, nodo):
        if nodo is not None:
            self._inorden(nodo.izquierda)
            print(nodo.valor)
            self._inorden(nodo.derecha)

    def altura(self):
        return self._altura(self.raiz)

    def _altura(self, nodo):
        if nodo is None:
            return 0
        else:
            return 1 + max(self._altura(nodo.izquierda), self._altura(nodo.derecha))


arbol = ArbolBinario()
arbol.agregar(5)
arbol.agregar(3)
arbol.agregar(7)
arbol.agregar(2)
arbol.agregar(4)
arbol.agregar(6)
arbol.agregar(8)

print("Inorden:")
arbol.inorden()

print("Altura:")
print(arbol.altura())
