/*
Imprimir por pantalla todos los números primos comprendidos entre el 3 y el 100.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Números primos comprendidos entre 3 y 100");
        boolean bPrimo;
        for (int numero = 3; numero < 100; numero += 2) {
            bPrimo = true;
            for (int i = 3; i < numero / 2 && bPrimo; i++) {
                if (numero % i == 0)
                    bPrimo = false;
            }
            if (bPrimo)
                System.out.println(numero + " - ");
        }
    }
}
