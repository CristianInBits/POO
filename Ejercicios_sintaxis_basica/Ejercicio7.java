/* Calcular el factorial del número siete, usando WHILE, DO… WHILE y FOR. */

public class Ejercicio7 {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 7; i++)
            fact = fact * i;
        System.out.println(fact);

        fact = 1;
        int i = 1;
        while (i <= 7) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

        fact = 1;
        i = 1;
        do {
            fact = fact * i;
            i++;
        } while (i <= 7);
        System.out.println(fact);
    }
}
