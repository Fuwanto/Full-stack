# 1. Define una clase `Persona` con atributos `nombre` y `edad`, y un método para mostrar la información.
# 2. Implementa un método estático que cuente la cantidad de instancias creadas de la clase.


class Persona:
    cantidad = 0

    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        Persona.cantidad += 1

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Edad: {self.edad}")

    @staticmethod
    def contar_instancias():
        print(f"Cantidad de instancias: {Persona.cantidad}")


p1 = Persona("Juan", 30)
p2 = Persona("Ana", 25)
p3 = Persona("Pedro", 35)

p1.mostrar_info()
p2.mostrar_info()
p3.mostrar_info()

Persona.contar_instancias()
