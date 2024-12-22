import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recorrido {
    public static void main(String[] args) {
        // 1. Usa Streams y `map` para convertir un ArrayList de enteros en una lista de
        // sus cuadrados.
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        List<Integer> cuadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(cuadrados);

        // 2. Aplica `filter` para seleccionar los strings que comienzan con una letra
        // específica en una lista.
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("adios");
        palabras.add("mariposa");
        palabras.add("anto");

        List<String> palabrasFiltradas = palabras.stream()
                .filter(p -> p.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(palabrasFiltradas);

        // 3. Usa `reduce` para calcular el valor acumulado de un ArrayList de números.
        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(4);
        numeros2.add(5);

        int suma = numeros2.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(suma);
    }
}