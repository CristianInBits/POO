/**
 * 
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        // precios con array

        double[] precios = new double[4];

        precios[0] = 26.81;
        precios[1] = 47.61;
        precios[2] = 89.28;
        precios[3] = 119.04;

        int uno = 30;
        int dos = 10;
        int tres = 12;
        int cuatro = 10;

        double total2 = precios[0] * uno + precios[1] * dos + precios[2] * tres + precios[3] * cuatro;
        System.out.print(total2);
    }
}
