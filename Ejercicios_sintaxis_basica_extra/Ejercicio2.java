
/* Repetir el ejercicio anterior, metiendo esta vez los precios (la información que antes aparecía en constantes) en un array, y calculando la matricula a pagar accediendo a las posiciones del array correspondientes.
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        // creditos
        int uno = 30;
        int dos = 10;
        int tres = 12;
        int cuatro = 10;

        double[] precios = new double[4];

        precios[0] = 26.81;
        precios[1] = 47.61;
        precios[2] = 89.28;
        precios[3] = 119.04;

        double total = precios[0] * uno + precios[1] * dos + precios[2] * tres + precios[3] * cuatro;
        System.out.print(total);
    }
}
