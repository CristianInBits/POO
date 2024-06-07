/* Implementar un programa en Java que genere una secuencia de enteros al azar entre cero y diez. El programa debe ir desplegando cada entero en pantalla junto con un mensaje que diga si el número es par o no lo es. Además, el programa debe ir sumando todos los valores impares que se vayan generando. El procesamiento debe detenerse en el momento en que la suma supere el valor 25. Al finalizar, el programa debe mostrar en pantalla la suma calculada. 
NOTA:- Para generar un número al azar se puede utilizar el método random de la librería Math (directamente accesible), del siguiente modo:
	int aleatorio = (int)(Math.random()\*11);
	
 El método en cuestión genera un valor real comprendido entre 0.0 y 1.0 (mayor o igual que el primero y menor estricto que el segundo). El conversor de tipos trunca el valor real generado. En el ejemplo, aleatorio contendrá por tanto un valor entre cero y diez. */

public class Ejercicio9 {
    public static void main(String[] args) {
        int suma = 0;
        int generado;

        while (suma <= 25) {
            generado = (int) (Math.random() * 11);
            if (generado % 2 == 0)
                System.out.println(generado + " es par");
            else {
                System.out.println(generado + " es impar");
                suma += generado;
            }
        }
        System.out.println("la suma total de los impares es " + suma);
    }
}
