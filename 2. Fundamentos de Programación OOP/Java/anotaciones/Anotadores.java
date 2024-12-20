// 1. Usa anotaciones para documentar un método como "obsoleto" (`@Deprecated`).
// 2. Crea una anotación personalizada para marcar métodos que necesitan ser optimizados.
package anotaciones;

import anotaciones.NeedsOptimization;

@SuppressWarnings("unused")
public class Anotadores {

    @Deprecated
    public void oldMethod() {
        System.out.println("Este método está obsoleto.");
    }

    @NeedsOptimization
    public void methodToOptimize() {
        System.out.println("soy un método que necesita ser optimizado");
    }

    public void newMethod() {
        System.out.println("Este es el nuevo método.");
    }

    public static void main(String[] args) {
        Anotadores obj = new Anotadores();
        obj.oldMethod(); // Llamada al método obsoleto
        obj.methodToOptimize(); // Llamada al método que necesita ser optimizado
        obj.newMethod(); // Llamada al nuevo método
    }
}
