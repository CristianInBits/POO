public class Punto {
    private int x, y;

    public Punto(int a, int b) {
        if (a >= 0 && b >= 0) {
            x = a;
            y = b;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x >= 0)
            this.x = x;
    }

    public void setY(int y) {
        if (y >= 0)
            this.y = y;
    }

    public String toString() {
        return ("x: " + x + " y: " + y);
    }

    public boolean desplazarXY(int a, int b) {
        x += a;
        y += b;
        if (x < 0 || y < 0) {
            x -= a;
            y -= b;
            return false;
        } else
            return true;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true; // Comprobación del objeto consigo mismo
        if (o == null)
            return false; // Comprobación de que no sea el objeto nulo
        if (getClass() != o.getClass())
            return false; // Comprobación de la clase
        Punto p = (Punto) o;
        return (this.x == p.getX() && this.y == p.getY());
    }

    public boolean estaDebajo(Punto p) {
        return (this.y < p.getY());
    }

    public boolean estaDerecha(Punto p) {
        return (this.x > p.getX());
    }

    public Punto copia() {
        return new Punto(x, y);
    }
}