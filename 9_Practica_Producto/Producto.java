/**
 * • Producto con un nombre, una can�dad de unidades y un precio.
 * • Constructor con los tres atributos.
 * • Constructor por defecto.
 * • Métodos para obtener y para modificar los tres atributos.
 * • Método para obtener el valor total del producto en inventario.
 * • Método para imprimir por consola los datos del producto, incluyendo su
 * valor total.
 * • Método para vender una can�dad dada de unidades del producto. Devolverá la
 * ganancia obtenida en la venta.
 * • Método para reabastecer una can�dad dada de unidades del producto.
 * • Método que devuelve una copia del producto.
 * • Método que devuelve true si el producto actual es más caro que otro
 * producto
 * externo.
 */
public class Producto {

    private String nombre;
    private int unidades;
    private double precio;

    // Constructor con los tres atributos.
    public Producto(String nombre, int unidades, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    // Producto con un nombre, una cantidad de unidades y un precio.
    public Producto() {
        this.nombre = "";
        this.unidades = 0;
        this.precio = 0;
    }

    // Métodos para obtener y para modificar los tres atributos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int nuevasUnidades) {
        this.unidades = nuevasUnidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Método para obtener el valor total del producto en inventario.

    public double getValorTotal() {
        return unidades * precio;
    }

    // Método para imprimir por consola los datos del producto, incluyendo su valor
    // total.

    public void imprimir() {
        System.out.println("Producto : " + nombre);
        System.out.println("Undiades : " + unidades + " unidades");
        System.out.println("Precio : " + precio + " euros");
        System.out.println("Valor Total : " + getValorTotal() + " euros");
    }

    // Método para vender una cantidad dada de unidades del producto. Devolverá la
    // ganacia obtenida en la venta.
    public double venderProducto(int cantidad) {
        this.unidades -= cantidad;
        return this.precio * cantidad;
    }

    // Método para reabastecer una cantidad dada de unidades del producto.

    public void reabastecerInventario(int unidades) {
        this.unidades += unidades;
    }

    // Método que devuelve una copia del producto.
    public Producto copia() {
        Producto nuevoProducto = new Producto(nombre, unidades, precio);
        return nuevoProducto;
    }

    // Método que devuelve true si el producto actual es más caro que otro producto
    // externo.
    public boolean comparaProductos(Producto productoB) {
        if (this.precio > productoB.getPrecio())
            return true;
        else
            return false;
    }

}