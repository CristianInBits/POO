/**
 * PRIMERA PARTE. CLASE PUNTO
 * Se pide construir una clase denominada Punto.
 * Un punto se caracteriza por tener dos coordenadas, una que indica su posición
 * sobre el eje X y
 * otra que indica su posición sobre el eje Y, ambos valores enteros. Ninguno de
 * los dos valores
 * puede ser negativo.
 * Los puntos se podrán inicializar de la siguiente forma:
 * • Con dos argumentos, que inicializa las coordenadas X e Y a esos valores.
 * Se ofrecerán métodos Get y Set para cada uno de los dos atributos de la
 * clase.
 * El comportamiento del punto atenderá a la siguiente especificación, por lo
 * que se deben
 * programar métodos que realicen las siguientes tareas:
 * • Devolver una cadena de caracteres con los valores del punto (sobrescribir
 * el método
 * toString ()).
 * • desplazarXY, que suma a las coordenadas, respectivamente, cada uno de los
 * dos valores
 * recibidos.
 * • Sobrescribir equals, devolviendo true si el punto que recibe está en las
 * mismas
 * coordenadas que el punto actual.
 * • copia, que devuelve un nuevo punto con las mismas coordenadas que el
 * actual.
 * • estaDebajo, que devuelve true si el punto actual se encuentra por debajo
 * del punto que
 * recibe, es decir, devuelve true si la coordenada y del punto actual es menor
 * que la del
 * punto que recibe.
 * • estaDerecha, que devuelve true si el punto actual se encuentra a la derecha
 * del punto
 * que recibe, es decir, devuelve true si la coordenada x del punto actual es
 * mayor que la
 * del punto que recibe.
 * 
 * SEGUNDA PARTE. CLASE RECTANGULO
 * Se pide construir una clase denominada Rectangulo.
 * Un rectángulo se caracteriza por tener dos puntos, que representan su extremo
 * inferior
 * izquierdo y su extremo superior derecho. El primero de estos puntos tendrá
 * que estar siempre
 * por debajo y a la izquierda que el segundo.
 * Los rectángulos se podrán inicializar de las siguientes formas:
 * • Sin argumentos, inicializará el extremo inferior izquierdo a (0,0) y el
 * extremo superior
 * derecho a (1,1).
 * • Con dos argumentos de tipo entero, que representan la base y la altura del
 * rectángulo.
 * El extremo inferior izquierdo se debe poner en el punto (0,0) y el extremo
 * superior
 * derecho a los valores correspondientes para que el rectángulo tenga la base y
 * altura
 * indicada.
 * • Con dos argumentos de la clase Punto, que representan el extremo inferior
 * izquierdo y
 * el extremo superior derecho del rectángulo.
 * • Con un argumento de la clase Rectángulo, que copia los atributos del
 * rectángulo pasado
 * como parámetro en el rectángulo actual.
 * Se ofrecerán métodos Get y Set para cada uno de los dos atributos de la
 * clase.
 * El comportamiento del rectángulo atenderá a la siguiente especificación, por
 * lo que se
 * deben programar métodos que realicen las siguientes tareas:
 * • Devolver una cadena de caracteres con los valores del rectángulo
 * (sobrescribir el
 * método toString ()).
 * • Devolver la base del rectángulo.
 * • Devolver la altura del rectángulo.
 * • Devolver el área del rectángulo.
 * • Devolver el perímetro del rectángulo.
 * • Programar un método valores que devuelva un array con cuatro componentes,
 * correspondientes a los valores de la base, altura, área y perímetro del
 * rectángulo,
 * respectivamente.
 * • equals, que devuelve true si el rectángulo que recibe está en las mismas
 * coordenadas
 * que el rectángulo original.
 * • desplazarX, que traslada el rectángulo tantas posiciones en el eje X como
 * indique el
 * valor recibido.
 */
//package PracticaRectangulo;

public class Rectangulo {

    private Punto inf_izdo, sup_dcho;

    public Rectangulo() {
        this.inf_izdo = new Punto(0, 0);
        this.sup_dcho = new Punto(1, 1);
    }

    public Rectangulo(int base, int altura) {
        inf_izdo = new Punto(0, 0);
        if (base > 0 && altura > 0) {
            sup_dcho = new Punto(base, altura);
        } else
            sup_dcho = new Punto(1, 1);
    }

    public Rectangulo(Punto p1, Punto p2) {
        if (p1.estaDebajo(p2) && p2.estaDerecha(p1)) {
            inf_izdo = p1.copia();
            sup_dcho = p2.copia();
        } else {
            inf_izdo = new Punto(0, 0);
            sup_dcho = new Punto(1, 1);
        }
    }

    public Rectangulo(Rectangulo r) {
        inf_izdo = r.getInfIzdo();
        sup_dcho = r.getSupDcho();
    }

    public Punto getInfIzdo() {
        return inf_izdo.copia();
    }

    public Punto getSupDcho() {
        return sup_dcho.copia();
    }

    public void setInfIzdo(Punto p) {
        if (p.estaDebajo(sup_dcho) && sup_dcho.estaDerecha(p))
            inf_izdo = p.copia();
    }

    public void setSupDcho(Punto p) {
        if (inf_izdo.estaDebajo(p) && p.estaDerecha(inf_izdo))
            sup_dcho = p.copia();
    }

    @Override
    public String toString() {
        return ("Inferior Izquierdo " + inf_izdo.toString() + " Superior Derecho " +
                sup_dcho.toString());
    }

    public int base() {
        return (sup_dcho.getX() - inf_izdo.getX());
    }

    public int altura() {
        return (sup_dcho.getY() - inf_izdo.getY());
    }

    public int perimetro() {
        return base() * 2 + altura() * 2;
    }

    public int area() {
        return this.base() * this.altura();
    }

    public int[] valores() {
        int[] val = { base(), altura(), area(), perimetro() };
        return val;
    }

    public void desplazarX(int i) {
        if (inf_izdo.desplazarXY(i, 0))
            sup_dcho.desplazarXY(i, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // Comprobación del objeto consigo mismo
        if (o == null)
            return false; // Comprobación de que no sea el objeto nulo
        if (getClass() != o.getClass())
            return false; // Comprobación de la clase
        Rectangulo r = (Rectangulo) o;
        return (this.inf_izdo.equals(r.getInfIzdo()) && this.sup_dcho.equals(r.getSupDcho()));
    }
}
