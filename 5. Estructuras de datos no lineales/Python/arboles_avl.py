# 1. Implementa un árbol AVL que permita insertar nodos y mantenga el balance automáticamente.
# 2. Escribe una función para imprimir los nodos del árbol AVL por niveles.


class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None
        self.altura = 1


class ArbolAVL:
    def insertar(self, raiz, valor):
        if not raiz:
            return Nodo(valor)
        elif valor < raiz.valor:
            raiz.izquierda = self.insertar(raiz.izquierda, valor)
        else:
            raiz.derecha = self.insertar(raiz.derecha, valor)

        raiz.altura = 1 + max(
            self.obtener_altura(raiz.izquierda), self.obtener_altura(raiz.derecha)
        )

        balance = self.obtener_balance(raiz)

        # Caso 1 - Izquierda
        if balance > 1 and valor < raiz.izquierda.valor:
            return self.rotar_derecha(raiz)

        # Caso 2 - Derecha
        if balance < -1 and valor > raiz.derecha.valor:
            return self.rotar_izquierda(raiz)

        # Caso 3 - Izquierda Derecha
        if balance > 1 and valor > raiz.izquierda.valor:
            raiz.izquierda = self.rotar_izquierda(raiz.izquierda)
            return self.rotar_derecha(raiz)

        # Caso 4 - Derecha Izquierda
        if balance < -1 and valor < raiz.derecha.valor:
            raiz.derecha = self.rotar_derecha(raiz.derecha)
            return self.rotar_izquierda(raiz)

        return raiz

    def obtener_altura(self, raiz):
        if not raiz:
            return 0
        return raiz.altura

    def obtener_balance(self, raiz):
        if not raiz:
            return 0
        return self.obtener_altura(raiz.izquierda) - self.obtener_altura(raiz.derecha)

    def rotar_derecha(self, z):
        y = z.izquierda
        T3 = y.derecha

        y.derecha = z
        z.izquierda = T3

        z.altura = 1 + max(
            self.obtener_altura(z.izquierda), self.obtener_altura(z.derecha)
        )
        y.altura = 1 + max(
            self.obtener_altura(y.izquierda), self.obtener_altura(y.derecha)
        )

        return y

    def rotar_izquierda(self, z):
        y = z.derecha
        T2 = y.izquierda

        y.izquierda = z
        z.derecha = T2

        z.altura = 1 + max(
            self.obtener_altura(z.izquierda), self.obtener_altura(z.derecha)
        )
        y.altura = 1 + max(
            self.obtener_altura(y.izquierda), self.obtener_altura(y.derecha)
        )

        return y

    def imprimir_niveles(self, raiz):
        if not raiz:
            return

        cola = []
        cola.append(raiz)

        while len(cola) > 0:
            print(cola[0].valor, end=" ")
            nodo = cola.pop(0)

            if nodo.izquierda:
                cola.append(nodo.izquierda)
            if nodo.derecha:
                cola.append(nodo.derecha)


arbol = ArbolAVL()
raiz = None
raiz = arbol.insertar(raiz, 10)
raiz = arbol.insertar(raiz, 20)
raiz = arbol.insertar(raiz, 30)
raiz = arbol.insertar(raiz, 40)
raiz = arbol.insertar(raiz, 50)
raiz = arbol.insertar(raiz, 25)
raiz = arbol.insertar(raiz, 35)
raiz = arbol.insertar(raiz, 45)
raiz = arbol.insertar(raiz, 55)
arbol.imprimir_niveles(raiz)
