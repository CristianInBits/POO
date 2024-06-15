// Clase Punto
public class Punto{

    /** Atributos de la clase */ 
    private int x, y;

    /**  Constructor por defecto */
    public Punto(){
        x=0;
        y=0;
    }

    /** Constructor con dos argumentos */
    public Punto(int a, int b)
    {
        x=a;
        y=b;
    }

    /** Método que desplaza un punto, modidficando los atributos */
    public void desplazar(int a, int b)
    {
        x+=a;
        y+=b;
    }

    /** Método que desplaza un punto, modificando uno de sus atributos */
    public void desplazar(int a)
    {
        x+=a;
    }

    /* Método que imprime por pantalla la posición del punto. Nótese que no tiene argumentos, trabaja con el propio punto, el argumento implícito. */
    public void posicion()
    {
        System.out.println("valor de x: " + x + " valor de y: " + y);
    }

    /** Método que devuelve la coordenada X del punto. */
    public int getX()
    {
        return x;
    }
    
    /** Método que devuelve la coordenada Y del punto. */
    public int getY()
    {
        return y;
    }

    /** Método que asigna un nuevo valor a la coordenada X del punto. */
    public void setX(int nuevo_valor)
    {
        x=nuevo_valor;
    }

    /** Método que asigna un nuevo valor a la coordenada X del punto. */
    public void setY(int nuevo_valor)
    {
        y=nuevo_valor;
    }

    /** Método que devuelve una copia del punto. 
     * El código comentado es equivalente al programado */
    public Punto copia()
    {
        Punto p = new Punto(x,y);
        return p;

        // return new Punto(x,y);
    }

    /** Método que devuelve la distancia 1 entre el punto y otro punto externo */
    public int distancia (Punto externo)
    {
        int x1 = getX();
        int y1 = getY();
        int x2 = externo.getX();
        int y2 = externo.getY();

        return(Math.abs(x2-x1)+(y2-y1));
    } 

    // Fin clase Punto
}