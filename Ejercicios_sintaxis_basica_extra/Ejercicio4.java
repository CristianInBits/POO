/*
 * Hacer un programa que cree e imprima un array bidimensional de 5x6 con los siguientes valores: 
1 2 3 4 5 6 
7 8 9 10 11 12
13 14 15 16 17 18
19 20 21 22 23 24 
25 26 27 28 29 30
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = j + 1 + 6 * i;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}