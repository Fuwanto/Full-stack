// 1. Crea un grafo utilizando una lista de adyacencia e implementa el recorrido DFS.
class Grafo {
  constructor() {
    this.vertices = [];
    this.aristas = [];
  }

  agregarVertice(vertice) {
    this.vertices.push(vertice);
    this.aristas[vertice] = [];
  }

  agregarArista(vertice1, vertice2) {
    this.aristas[vertice1].push(vertice2);
    this.aristas[vertice2].push(vertice1);
  }

  dfs(vertice) {
    let visitado = [];
    this._dfs(vertice, visitado);
  }

  _dfs(vertice, visitado) {
    visitado[vertice] = true;
    console.log(`Visitando vértice ${vertice}`);
    for (let i = 0; i < this.aristas[vertice].length; i++) {
      if (!visitado[this.aristas[vertice][i]]) {
        this._dfs(this.aristas[vertice][i], visitado);
      }
    }
  }

  // funcion para ver si es conexo o no
  conexo() {
    let visitado = [];
    this._dfs(0, visitado);
    for (let i = 0; i < this.vertices.length; i++) {
      if (!visitado[i]) {
        return false;
      }
    }
    return true;
  }
}

let grafo = new Grafo();
grafo.agregarVertice(0);
grafo.agregarVertice(1);
grafo.agregarVertice(2);
grafo.agregarVertice(3);
grafo.agregarVertice(4);
grafo.agregarVertice(5);

grafo.agregarArista(0, 1);
grafo.agregarArista(0, 2);
grafo.agregarArista(1, 3);
grafo.agregarArista(1, 4);
grafo.agregarArista(2, 5);

console.log("Recorrido DFS:");
grafo.dfs(0);

console.log("Es conexo:");
console.log(grafo.conexo());

grafo.agregarVertice(6); // Agregar un nuevo vértice que no está conectado
console.log("Es conexo:");
console.log(grafo.conexo());
