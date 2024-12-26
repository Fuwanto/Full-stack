# 1. Escribe un programa en Python que lance una excepción personalizada cuando un número ingresado sea negativo y luego captúralo con un bloque `try-except`.
# 2. Implementa un bloque `try-except-finally` en Python para manejar errores de lectura de un archivo.


# 1. Escribe un programa en Python que lance una excepción personalizada cuando un número ingresado sea negativo y luego captúralo con un bloque `try-except`.
class NumeroNegativoError(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)


def numero_negativo(numero):
    if numero < 0:
        raise NumeroNegativoError("El número no puede ser negativo.")
    return numero


try:
    numero = int(input("Ingresa un número: "))
    print(numero_negativo(numero))
except NumeroNegativoError as e:
    print(e)

# 2. Implementa un bloque `try-except-finally` en Python para manejar errores de lectura de un archivo.
try:
    with open("archivo.txt", "r") as archivo:
        print(archivo.read())
except FileNotFoundError as e:
    print(e)
finally:
    print("Se ha intentado leer el archivo.")
