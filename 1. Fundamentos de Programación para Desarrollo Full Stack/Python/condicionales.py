# Escribe un programa que indique si un número es par o impar.


def par_o_impar(n):
    if n % 2 == 0:
        return f"El número {n} es par"
    else:
        return f"El número {n} es impar"


print(par_o_impar(2))
print(par_o_impar(3))
print(par_o_impar(4))
print(par_o_impar(5))
