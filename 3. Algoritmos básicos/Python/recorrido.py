# 1. Usa `map` para duplicar los elementos de una lista.
# 2. Aplica `filter` para extraer los números pares de una lista.
# 3. Utiliza `reduce` para calcular el producto de todos los elementos de una lista.

from functools import reduce


def duplicar(lista):
    return list(map(lambda x: x * 2, lista))


def pares(lista):
    return list(filter(lambda x: x % 2 == 0, lista))


def producto(lista):
    return reduce(lambda x, y: x * y, lista)


lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

print(duplicar(lista))
print(pares(lista))
print(producto(lista))
