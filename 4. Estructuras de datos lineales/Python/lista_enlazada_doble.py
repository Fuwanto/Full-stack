# 1. Implementa una lista enlazada doble con métodos para agregar nodos al inicio y al final.
# 2. Escribe una función que recorra la lista en ambos sentidos (adelante y atrás).


class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None
        self.anterior = None


class ListaEnlazadaDoble:
    def __init__(self):
        self.cabeza = None
        self.cola = None

    def agregar_inicio(self, valor):
        nuevo = Nodo(valor)
        if self.cabeza is None:
            self.cabeza = nuevo
            self.cola = nuevo
        else:
            nuevo.siguiente = self.cabeza
            self.cabeza.anterior = nuevo
            self.cabeza = nuevo

    def agregar_final(self, valor):
        nuevo = Nodo(valor)
        if self.cola is None:
            self.cabeza = nuevo
            self.cola = nuevo
        else:
            nuevo.anterior = self.cola
            self.cola.siguiente = nuevo
            self.cola = nuevo

    def recorrer_adelante(self):
        actual = self.cabeza
        while actual:
            print(actual.valor)
            actual = actual.siguiente

    def recorrer_atras(self):
        actual = self.cola
        while actual:
            print(actual.valor)
            actual = actual.anterior


lista = ListaEnlazadaDoble()
lista.agregar_inicio(1)
lista.agregar_inicio(2)
lista.agregar_inicio(3)
lista.agregar_final(4)
lista.agregar_final(5)
lista.agregar_final(6)

print("Recorrido adelante:")
lista.recorrer_adelante()

print("Recorrido atrás:")
lista.recorrer_atras()
