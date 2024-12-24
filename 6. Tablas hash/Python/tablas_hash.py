# 1. Implementa una tabla hash utilizando encadenamiento para resolver colisiones. Define operaciones básicas como insertar, buscar y eliminar elementos.
# 2. Escribe una función que calcule el índice hash para una clave dada y explica cómo minimiza las colisiones.
# 3. Simula el rehashing de una tabla hash cuando el factor de carga excede un valor determinado.


class HashTable:
    def __init__(self):
        self.MAX = 10
        self.arr = [[] for i in range(self.MAX)]

    def get_hash(self, key):
        hash = 0
        for char in key:
            hash += ord(char)
        return hash % self.MAX

    def __setitem__(self, key, val):
        h = self.get_hash(key)
        found = False
        for idx, element in enumerate(self.arr[h]):
            if len(element) == 2 and element[0] == key:
                self.arr[h][idx] = (key, val)
                found = True
                break
        if not found:
            self.arr[h].append((key, val))

    def __getitem__(self, key):
        h = self.get_hash(key)
        for element in self.arr[h]:
            if element[0] == key:
                return element[1]

    def __delitem__(self, key):
        h = self.get_hash(key)
        for index, element in enumerate(self.arr[h]):
            if element[0] == key:
                del self.arr[h][index]


# Uso de la clase HashTable
t = HashTable()
t["march 6"] = 310
t["march 17"] = 420
t["march 17"] = 67
t["march 6"] = 67
t["march 6"] = 310

print(t.arr)
print(t["march 6"])
del t["march 6"]
print(t.arr)
print(t["march 6"])
print(t["march 17"])
