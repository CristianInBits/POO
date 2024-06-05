/* Realizar un programa que muestre por pantalla el calendario de un mes de 31 días. Suponemos que el día 1 es lunes. A cada día numérico le corresponde un día de la semana. */

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 31; i++) {
            switch (i % 7) {
                case 1:
                    System.out.println(i + " - Lunes");
                    break;
                case 2:
                    System.out.println(i + " - Martes");
                    break;
                case 3:
                    System.out.println(i + " - Miercoles");
                    break;
                case 4:
                    System.out.println(i + " - Jueves");
                    break;
                case 5:
                    System.out.println(i + " - Viernes");
                    break;
                case 6:
                    System.out.println(i + " - Sabado");
                    break;
                case 0:
                    System.out.println(i + " - Domingo");
                    break;
            }
        }
    }
}
