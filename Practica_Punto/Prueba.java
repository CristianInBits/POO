/** Clase principal, de prueba o cliente, sólo contiene el método main */
public class Prueba {
    /** Método main */
    public static void main(String[] args) {

        // CONSTRUCTORES DE PUNTO
        Punto p1 = new Punto();
        Punto p2 = new Punto(5, 5);

        Punto p3 = p1.copia();
        /*
         * Nótese que no es necesario que p3 llame al constructor, porque ya la copia
         * reserva memoria.
         */

        // MÉTODOS DE PUNTO

        /*
         * Adviértase el concepto de argumento implícito: los métodos trabajarán sobre
         * los puntos que los invocan.
         */
        p1.desplazar(5);
        System.out.print("p1 : ");
        p1.posicion();

        p2.desplazar(3, 7);
        System.out.print("p2 : ");
        p2.posicion();

        System.out.print("p3 : ");
        p3.posicion();

        p3.setX(4);
        p3.setY(7);

        int x = p3.getX();
        int y = p3.getY();

        System.out.println("En el punto p3 la coordenada X es: " + x + " y la coordenada Y es: " + y);
        System.out.println("La distancia entre p1 y p2 es: " + p1.distancia(p2));

    } /* Fin del main */
} /* Fin de la clase Prueba */
