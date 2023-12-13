/**
 * Hacer un programa que cree un array unidimensional de 50 posiciones y lo
 * inicialice
 * con los siguientes valores, para después imprimirlo: 50, 49, 48, 47, …3, 2, 1
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] miarray = new int[50];

        for (int i = 1; i <= 50; i++) {
            miarray[i - 1] = i;
        }

        for (int i = 49; i >= 0; i--) {
            System.out.println(miarray[i]);
        }
    }
}