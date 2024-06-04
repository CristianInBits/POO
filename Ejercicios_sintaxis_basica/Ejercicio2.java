package Ejercicios_sintaxis_basica;

/* Realizar un programa que imprima el resultado del cociente y del resto de dividir (división entera) el número quince entre los diez primeros números naturales. */

public class Ejercicio2 {
    public static void main(String[] args) {
        int a, b;
        final int Q = 15;

        for (int i = 1; i <= 10; i++) {

            a = Q / i;
            b = Q % i;
            System.out.println(Q + " entre " + i + " es " + a + " y el resto es " + b);
        }
    }
}
