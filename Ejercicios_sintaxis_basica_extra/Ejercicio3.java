/* Hacer un programa que cree un array unidimensional de 50 posiciones y lo inicialice
con los siguientes valores, para después imprimirlo: 50, 49, 48, 47, …3, 2, 1 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i <= 49; i++) {
            array[i] = 50 - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
