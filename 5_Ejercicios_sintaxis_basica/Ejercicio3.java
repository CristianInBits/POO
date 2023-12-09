/**
 * Modificar el programa del ejercicio uno para que salgan por pantalla los
 * números del cero al diez, mostrando si cada uno de ellos es par o impar.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i + " es par");
            else
                System.out.println(i + " es impar");
        }
    }
}
