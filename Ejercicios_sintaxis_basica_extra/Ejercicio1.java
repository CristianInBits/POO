
/* Realizar un programa que dado el número de créditos en primera, segunda, tercera y cuarta matrícula o sucesivas, imprima el importe a pagar de las tasas universitarias de la Universidad Java. Para el cálculo de las tasas universitarias se definirán cuatro constantes que indicarán el precio en euros de un crédito en primera matrícula (26,81 euros), segunda (49,26 euros), tercera (98,75 euros) o sucesivas (136,44 euros). En cuanto al número de créditos de cada tipo de matrícula, se almacenarán en variables, asignando directamente en el código los valores que se deseen. */

public class Ejercicio1 {

    public static void main(String[] args) {

        // precios
        final double PRIMERA = 26.81;
        final double SEGUNDA = 49.26;
        final double TERCERA = 98.75;
        final double CUARTA = 136.44;

        // creditos
        int uno = 30;
        int dos = 10;
        int tres = 12;
        int cuatro = 10;

        double total = PRIMERA * uno + SEGUNDA * dos + TERCERA * tres + CUARTA * cuatro;
        System.out.print(total);
    }

}