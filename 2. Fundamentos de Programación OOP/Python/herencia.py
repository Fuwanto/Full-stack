# 1. Define una clase `Persona` y una clase derivada `Estudiante` que agregue un atributo `nota`.
# 2. Muestra cómo funciona la herencia múltiple combinando dos clases base en una clase hija.


# 1. Define una clase `Persona` y una clase derivada `Estudiante` que agregue un atributo `nota`.
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad


class Estudiante(Persona):
    def __init__(self, nombre, edad, nota):
        super().__init__(nombre, edad)
        self.nota = nota


estudiante = Estudiante("Juan", 20, 10)
print(estudiante.nombre)
print(estudiante.edad)
print(estudiante.nota)


# 2. Muestra cómo funciona la herencia múltiple combinando dos clases base en una clase hija.
class A:
    def __init__(self):
        print("Clase A")


class B:
    def __init__(self):
        print("Clase B")


class C(A, B):
    def __init__(self):
        super().__init__()
        print("Clase C")


c = C()
# Salida:
# Clase A
# Clase C
