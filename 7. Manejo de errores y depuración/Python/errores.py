# 1. Escribe un programa en Python que genere un error de sintaxis y uno de tiempo de ejecución, y luego explica cómo podrían ser solucionados.
# 2. Crea un programa que contenga un error lógico y explica cómo identificarlo durante la ejecución.

# Error de sintaxis
# print("Hola Mundo") # Error de sintaxis, falta cerrar comillas
# Solución: Agregar una comilla al final de la cadena de texto
print("Hola Mundo")

# Error de tiempo de ejecución
# a = 10
# b = 0
# print(a/b) # Error de tiempo de ejecución, división por cero
# Solución: Cambiar el valor de b a un número distinto de cero
a = 10
b = 2
print(a / b)

# Error lógico
# a = 10
# b = 20
# c = a + b # Error lógico, debería ser a - b

# Identificación del error lógico
# Se puede identificar el error lógico al observar que el resultado de la operación no es el esperado
a = 10
b = 20
c = a - b  # Corrección del error lógico
print(c)
