# Genera una tabla de multiplicar usando un bucle `for`.


def tabla_multiplicar(numero):
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero * i}")


tabla_multiplicar(5)
