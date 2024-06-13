/*
 * Escribir un programa que muestre la siguiente figura geométrica.

\* - - - - - - - - * 
\- * - - - - - - * - 
\- - * - - - - * - - 
\- - - * - - * - - -
\- - - - * * - - - - 
\- - -  -* * - - - -
\- - - * - - * - - - 
\- - * - - - - * - - 
\- * - - - - - - * - 
\* - - - - - - - - *
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        // figura
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((i == j) || (i + j == 10))
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }

    }
}
