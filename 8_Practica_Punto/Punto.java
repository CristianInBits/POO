
public class Punto {
    /** Atributos de la clase */
    private int x, y;

    /** Constructor por defecto */
    public Punto() {
        x = 0;
        y = 0;
    }

    /** Constructor con dos argumentos */
    public Punto(int a, int b) {
        x = a;
        y = b;
    }

    /** Método que desplaza un punto, modificando los atributos */
    public void desplazar(int a, int b) {
        x += a; // x = x+a;
        y += b; // y = y+b;
    }

    /**
     * Método que desplaza un punto, modificando uno de sus
     * atributos
     */
    public void desplazar(int a) {
        x += a; // x = x+a;
    }

    /**
     * Método que imprime por pantalla la posición del punto. Nótese
     * que no tiene argumentos, trabaja con el propio punto, el
     * argumento implícito
     */
    public void posicion() {
        System.out.println("valor de x: " + x + " valor de y: " + y);
    }

    /** Método que devuelve la coordenada X del punto. (get) */
    public int coordenadaX() {
        return x;
    }

    /** Método que devuelve la coordenada Y del punto. (get) */
    public int coordenadaY() {
        return y;
    }

    /**
     * Método que asigna un nuevo valor a la coordenada X del punto.
     * (set)
     */
    public void asignaX(int nuevo_valor) {
        x = nuevo_valor;
    }

    /**
     * Método que asigna un nuevo valor a la coordenada Y del punto.
     * (set)
     */
    public void asignaY(int nuevo_valor) {
        y = nuevo_valor;
    }

    /**
     * Método que devuelve una copia del punto.
     * El código comentado es equivalente al programado
     */
    public Punto copia() {
        Punto c = new Punto(x, y);
        return c;
        // return new Punto (x,y);
    }

    /**
     * Método que devuelve la distancia 1 entre el punto y otro punto
     * externo.
     */
    public int distancia(Punto externo) {
        int x1 = coordenadaX();
        int y1 = this.coordenadaY();
        int x2 = externo.coordenadaX();
        int y2 = externo.coordenadaY();
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
} // Fin clase Punto.
