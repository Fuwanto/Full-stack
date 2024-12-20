# 1. Implementa una clase abstracta `Figura` con un método abstracto `calcular_area` y crea dos clases que hereden de ella: `Cuadrado` y `Circulo`.
# 2. Agrega una restricción adicional en las clases derivadas para manejar casos de error.

from abc import ABC, abstractmethod


class Figura(ABC):
    @abstractmethod
    def calcular_area(self):
        pass


class Cuadrado(Figura):
    def __init__(self, lado):
        if lado <= 0:
            raise ValueError("El lado debe ser mayor a 0")
        self.lado = lado

    def calcular_area(self):
        return self.lado**2


class Circulo(Figura):
    def __init__(self, radio):
        if radio <= 0:
            raise ValueError("El radio debe ser mayor a 0")
        self.radio = radio

    def calcular_area(self):
        return 3.1416 * self.radio**2


cuadrado = Cuadrado(5)
print(cuadrado.calcular_area())

circulo = Circulo(5)
print(circulo.calcular_area())

try:
    cuadrado = Cuadrado(-5)
except ValueError as e:
    print(e)

try:
    circulo = Circulo(-5)
except ValueError as e:
    print(e)
