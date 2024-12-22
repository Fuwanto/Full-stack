# 1. Implementa una búsqueda secuencial para encontrar un número en una lista y devuelve su posición.
# 2. Crea una función que implemente la búsqueda binaria en una lista ordenada.


def busqueda_secuencial(lista, numero):
    for i in range(len(lista)):
        if lista[i] == numero:
            return i
    return -1


def busqueda_binaria(lista, numero):
    izquierda = 0
    derecha = len(lista) - 1
    while izquierda <= derecha:
        mitad = (izquierda + derecha) // 2
        if lista[mitad] == numero:
            return mitad
        elif lista[mitad] < numero:
            izquierda = mitad + 1
        else:
            derecha = mitad - 1
    return -1


lista = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
numero = 13

# Prueba de la búsqueda secuencial
print(busqueda_secuencial(lista, numero))  # 6

# Prueba de la búsqueda binaria
print(busqueda_binaria(lista, numero))  # 6
