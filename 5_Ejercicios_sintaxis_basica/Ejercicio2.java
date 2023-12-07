/**
 * Realizar un programa que imprima el resultado del cociente y del resto de
 * dividir (división entera) el número quince entre los diez primeros números
 * naturales.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int resto, cociente;
        final int Q = 15;

        for (int i = 1; i <= 15; i++) {
            resto = 15 % i;
            cociente = 15 / i;

            System.out.println(Q + " entre " + i + " es " + cociente + " y el resto es " + resto);
        }
    }
}
