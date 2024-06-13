/*
 * Realizar un programa que muestre por pantalla la siguiente pirámide: 
1 
22 
333 
4444 
55555
 */

public class Ejercicio6 {

    public static void main(String[] args) {
        // pirámide
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}