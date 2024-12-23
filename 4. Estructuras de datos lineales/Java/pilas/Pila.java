// 1. Escribe un programa que utilice una pila para evaluar una expresión matemática en notación postfija.
/*
**Nota**: La expresión matemática está en notación postfija, también conocida 
como notación polaca inversa (RPN). En esta notación, los operadores siguen a sus operandos. 
Por ejemplo, la expresión infija `(3 + 4) * 2` se escribiría como `3 4 + 2 *` en notación postfija.
*/

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        String expresion = "23+5*";

        System.out.println("Expresion: " + expresion);

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (Character.isDigit(c)) {
                pila.push(Character.getNumericValue(c));
            } else {
                int a = pila.pop();
                int b = pila.pop();
                switch (c) {
                    case '+':
                        pila.push(b + a);
                        break;
                    case '-':
                        pila.push(b - a);
                        break;
                    case '*':
                        pila.push(b * a);
                        break;
                    case '/':
                        pila.push(b / a);
                        break;
                }
            }
        }
        System.out.println(pila.pop());
    }
}