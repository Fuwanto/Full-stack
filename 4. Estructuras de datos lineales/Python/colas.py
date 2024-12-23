# 1. Implementa una cola que permita agregar y eliminar elementos, mostrando siempre el frente.
# 2. Escribe un programa que simule la atención de clientes en una fila utilizando una cola.


class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class Queue:
    def __init__(self):
        self.front = None
        self.rear = None

    def is_empty(self):
        return self.front is None

    def peek(self):
        if self.is_empty():
            return None
        return self.front.value

    def enqueue(self, value):
        new_node = Node(value)
        if self.is_empty():
            self.front = new_node
            self.rear = new_node
        else:
            self.rear.next = new_node
            self.rear = new_node

    def dequeue(self):
        if self.is_empty():
            return None
        value = self.front.value
        self.front = self.front.next
        return value

    def display(self):
        current = self.front
        while current:
            print(current.value, end=" ")
            current = current.next
        print()


# simulacion de atencion a clientes
queue = Queue()
queue.enqueue("Cliente 1")
queue.enqueue("Cliente 2")
queue.enqueue("Cliente 3")
queue.enqueue("Cliente 4")
queue.enqueue("Cliente 5")

queue.display()

print("Atendiendo a", queue.dequeue())
print("Atendiendo a", queue.dequeue())

queue.display()

print("Llega un nuevo cliente")
queue.enqueue("Cliente 6")

queue.display()

print("Atendiendo a", queue.dequeue())
print("Atendiendo a", queue.dequeue())
print("Atendiendo a", queue.dequeue())
print("Atendiendo a", queue.dequeue())
