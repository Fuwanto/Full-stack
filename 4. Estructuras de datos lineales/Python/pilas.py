# 1. Implementa una pila con funciones para apilar, desapilar y mostrar el elemento superior.


class Pila:
    def __init__(self):
        self.pila = []

    def apilar(self, elemento):
        self.pila.append(elemento)

    def desapilar(self):
        if not self.esta_vacia():
            return self.pila.pop()
        return None

    def mostrar_superior(self):
        if not self.esta_vacia():
            return self.pila[-1]
        return None

    def esta_vacia(self):
        return len(self.pila) == 0

    def __str__(self):
        return str(self.pila)


pila = Pila()
print(pila)
pila.apilar(1)
pila.apilar(2)
pila.apilar(3)
print(pila)


# 2. Escribe un programa que invierta el contenido de una cadena usando una pila.


def invertir_cadena(cadena):
    pila = Pila()
    for caracter in cadena:
        pila.apilar(caracter)
    cadena_invertida = ""
    while not pila.esta_vacia():
        cadena_invertida += pila.desapilar()
    return cadena_invertida


cadena = "Hola mundo"
print(cadena)
print(invertir_cadena(cadena))
