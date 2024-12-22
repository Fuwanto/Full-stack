# 1. Escribe un programa que ordene una lista usando el algoritmo de burbuja.
# 2. Implementa el algoritmo Quicksort para ordenar una lista.


def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)


arr = [64, 34, 25, 12, 22, 11, 90]

# Output: [11, 12, 22, 25, 34, 64, 90]
print(bubble_sort(arr))

# Output: [11, 12, 22, 25, 34, 64, 90]
print(quicksort(arr))
