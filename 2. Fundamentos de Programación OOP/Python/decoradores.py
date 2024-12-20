## 1. Escribe un decorador que registre el tiempo que toma ejecutar una función.
import time


def timer(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Tiempo de ejecución de {func.__name__}: {end - start:.6f} segundos")
        return result

    return wrapper


## 2. Implementa un decorador que agregue un mensaje antes y después de ejecutar una función.
def message(message_before, message_after):
    def decorator(func):
        def wrapper(*args, **kwargs):
            print(message_before, func.__name__, "con argumentos", args, kwargs)
            result = func(*args, **kwargs)
            print(message_after, func.__name__, "con resultado", result)
            return result

        return wrapper

    return decorator


# 1
@timer
def sum(a, b):
    return a + b


sum(2, 3)


# 2
@message("Antes de ejecutar la función", "Después de ejecutar la función")
def multiply(a, b):
    return a * b


multiply(2, 3)
