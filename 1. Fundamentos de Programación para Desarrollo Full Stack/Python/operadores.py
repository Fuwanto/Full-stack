# Crea una función que calcule el área de un rectángulo y determine si el área es mayor a 50 usando operadores relacionales.


def area_rectangulo(base, altura):
    area = base * altura
    if area > 50:
        return f"El área del rectángulo es {area} y es mayor a 50"
    else:
        return f"El área del rectángulo es {area} y es menor a 50"


print(area_rectangulo(10, 6))
print(area_rectangulo(10, 5))
print(area_rectangulo(10, 10))
