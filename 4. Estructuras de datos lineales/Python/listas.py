# 1. Crea un programa que inicialice una lista con números del 1 al 10 y calcule su suma.
def suma_lista():
    lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    suma = 0
    for i in lista:
        suma += i
    return suma


print(suma_lista())


# 2. Escribe una función que busque un elemento específico en una lista y devuelva su índice o un mensaje indicando que no se encontró.
def buscar_elemento(lista, elemento):
    if elemento in lista:
        return lista.index(elemento)
    else:
        return "Elemento no encontrado"


print(buscar_elemento([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 5))
