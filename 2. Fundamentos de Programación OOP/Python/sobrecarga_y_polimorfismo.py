# 1. Implementa una función que soporte diferentes cantidades de parámetros para sumar números.
# 2. Crea un programa que utilice polimorfismo para calcular áreas de figuras geométricas.


# 1. Implementa una función que soporte diferentes cantidades de parámetros para sumar números.
def suma(*args):
    return sum(args)


print(suma(1, 2, 3, 4, 5))  # 15
print(suma(1, 2, 3))  # 6
print(suma(1, 2))  # 3


# 2. Crea un programa que utilice polimorfismo para calcular áreas de figuras geométricas.
class FiguraGeometrica:
    def area(self):
        pass


class Rectangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura


class Triangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2


figuras = [Rectangulo(10, 20), Triangulo(10, 20)]

for figura in figuras:
    print(figura.area())  # 200, 100
