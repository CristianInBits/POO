/** Clase Producto */
public class Producto {
    /** Atributos de la clase */
    private String nombre;
    private int unidades;
    private double precio;

    /** Método constructor con los tres atributos */
    public Producto(String nombre, int unidades, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    /** Constructor por defecto */
    public Producto() {
        this.nombre = "";
        this.unidades = 0;
        this.precio = 0.0;
    }

    /** Método para obtener el nombre */
    public String getNombre() {
        return this.nombre;
    }

    /** Método para obtener las unidades */
    public int getUnidades() {
        return this.unidades;
    }

    /** Método para obtener el precio */
    public double getPrecio() {
        return this.precio;
    }

    /** Método para modificar el nombre */
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    /** Método para modificar las unidades */
    public void setUnidades(int nuevasUnidades) {
        this.unidades = nuevasUnidades;
    }

    /** Método para modificar el precio */
    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    /** Método para obtener el valor total del producto */
    public double valorTotal() {
        return unidades * precio;
    }

    /**
     * Método para imprimir por consola los datos del producto, incluyendo su valor
     * total
     */
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Unidades: " + unidades);
        System.out.println("Precio: " + precio);
        System.out.println("Valor Total en Inventario: " + valorTotal());
    }

    /**
     * Método para vender una cantidad dada de unidades del producto. Devolverá la
     * ganancia obtenida en la venta.
     */
    public double venta(int unidadesVendidas) {
        // Existen esas unidades
        if (unidades >= unidadesVendidas) {
            this.unidades -= unidadesVendidas;
            return unidadesVendidas * precio;
        } else {
            System.out.println("No hay suficientes unidades para vender!");
            return 0.0;
        }
    }

    /** Método para reabastecer una cantidad dada de unidades del producto. */
    public void reabastecer(int unidadesNuevas) {
        this.unidades += unidadesNuevas;
    }

    /** Método que devuelve una copia del producto */
    public Producto copia() {
        Producto p = new Producto(nombre, unidades, precio);
        return p;

        // return new Producto(nombre,unidades,precio);
    }

    /**
     * Método que devuelve true si el producto actual es más caro que otro producto
     * externo
     */
    public boolean compara(Producto productoExterno) {
        if (this.getPrecio() > productoExterno.getPrecio())
            return true;
        else
            return false;
    }

}