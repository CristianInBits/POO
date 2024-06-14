/*
 * Escribir un programa que muestre los siguientes patrones por separado, uno debajo del otro, delimitados con la instrucción System.out.println("patron xx");. Usar bucles para generar los patrones. Todos los asteriscos deben imprimirse mediante una sola instrucción de la forma System.out.print('\*');, la cual hace que los asteriscos se impriman uno al lado del otro. Puede utilizar una instrucción de la forma System.out.println(); para posicionarse en la siguiente línea. En los dos últimos patrones puede usar una instrucción de la forma System.out.print(' '); para mostrar un espacio. No debe haber ninguna otra instrucción de salida en el programa. 
\[Sugerencia: los dos últimos patrones requieren que cada línea comience con un número apropiado de espacios en blanco]. A continuación, podemos observar el resultado de una ejecución del programa.
 */

public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("patron 1");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("patron 2");

        for (int k = 1; k <= 10; k++) {
            for (int l = 10; l >= k; l--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("patron 3");

        for (int m = 1; m <= 10; m++) {
            for (int n = 1; n < m; n++)
                System.out.print(' ');
            for (int o = 10; o >= m; o--)
                System.out.print('*');
            System.out.println();
        }

        System.out.println("patron 4");

        for (int p = 1; p <= 10; p++) {
            for (int q = 9; q >= p; q--)
                System.out.print(' ');
            for (int r = 1; r <= p; r++)
                System.out.print('*');
            System.out.println();
        }
    }
}
