# 1. Implementa un grafo usando una matriz de adyacencia y realiza un recorrido BFS.
# 2. Escribe un programa que encuentre todos los caminos posibles entre dos nodos en un grafo dirigido.


class Grafo:
    def __init__(self, vertices):
        self.vertices = vertices
        self.matriz = [[0] * vertices for i in range(vertices)]
        self.visitados = [False] * vertices

    def agregar_arista(self, u, v):
        self.matriz[u][v] = 1

    def eliminar_arista(self, u, v):
        self.matriz[u][v] = 0

    def mostrar_matriz(self):
        for fila in self.matriz:
            print(fila)

    def bfs(self, s):
        cola = []
        cola.append(s)
        self.visitados[s] = True

        while cola:
            s = cola.pop(0)
            print(s, end=" ")

            for i in range(self.vertices):
                if self.matriz[s][i] == 1 and not self.visitados[i]:
                    cola.append(i)
                    self.visitados[i] = True

    def encontrar_camino(self, u, v, camino):
        camino.append(u)
        if u == v:
            print(camino)
        else:
            for i in range(self.vertices):
                if self.matriz[u][i] == 1 and not i in camino:
                    self.encontrar_camino(i, v, camino)
        camino.pop()


g = Grafo(4)
g.agregar_arista(0, 1)
g.agregar_arista(0, 2)
g.agregar_arista(1, 2)
g.agregar_arista(2, 0)
g.agregar_arista(2, 3)
g.agregar_arista(3, 3)

print("Matriz de adyacencia:")
g.mostrar_matriz()

print("\nRecorrido BFS:")
g.bfs(2)

print("\n\nCaminos entre 0 y 3:")
g.encontrar_camino(0, 3, [])
