/**
 * Escribir el siguiente fragmento der código:
 */

public class Ejercicio8 {

    public static void main(String[] args) {
        int y = 5, x = 5, a, b;

        a = x++;
        b = ++y;
        System.out.println("a) " + a + " " + b + " " + x + " " + y);
        b++;
        a--;
        System.out.println("b) " + a + " " + b);

        a += 3;
        b -= 5;
        System.out.println("b) " + a + " " + b);

        a = b = x = 9;
        System.out.println("b) " + a + " " + b);
    }
}