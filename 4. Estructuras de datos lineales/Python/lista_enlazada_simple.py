# 1. Implementa una lista enlazada simple que permita agregar un nodo al final y mostrar todos los nodos.
# 2. Crea una función para eliminar un nodo específico por valor en la lista enlazada.


class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None


class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def agregar(self, valor):
        nuevo_nodo = Nodo(valor)
        if self.cabeza is None:
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo

    def mostrar(self):
        actual = self.cabeza
        while actual:
            print(actual.valor)
            actual = actual.siguiente

    def eliminar(self, valor):
        actual = self.cabeza
        if actual.valor == valor:
            self.cabeza = actual.siguiente
        else:
            while actual.siguiente:
                if actual.siguiente.valor == valor:
                    actual.siguiente = actual.siguiente.siguiente
                    break
                actual = actual.siguiente


lista = ListaEnlazada()
lista.agregar(1)
lista.agregar(2)
lista.agregar(3)
lista.agregar(4)
lista.agregar(5)
lista.mostrar()

print("Eliminar 3")
lista.eliminar(3)
lista.mostrar()
