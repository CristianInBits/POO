/** Clase Prueba */
public class Prueba {
    /** único método de la clase : main */
    public static void main(String[] args) {
        // Crear un producto con el constructor con parámetros
        Producto producto1 = new Producto("Chocolate", 100, 10.2);
        Producto producto2 = new Producto("Platanos", 250, 5.4);

        // Crear un producto con el constructor por defecto
        Producto producto3 = new Producto();

        // Modificar los atributos del segundo producto
        producto2.setNombre("Manzanas");
        producto2.setUnidades(310);
        producto2.setPrecio(6.1);

        // Obtener y mostrar los atributos del primer producto
        System.out.println("\nProducto 1: ");
        producto1.imprimirDatos();

        // Obtener y mostrar los atributos del segundo producto
        System.out.println("\nProducto 2:");
        producto2.imprimirDatos();

        // Vender unidades del primer producto y mostrar la ganancia
        producto1.venta(150);
        System.out.println("\nSe han obtenido: " + producto1.venta(20) + " ganancias.");

        // Reabastecer unidades del segundo producto
        producto2.reabastecer(50);
        System.out.println("\nProducto 2 después de reabastecer:");
        producto2.imprimirDatos();

        // Hacer una copia del primer producto
        Producto producto4 = producto1.copia();
        System.out.println("\nCopia del producto1");
        producto4.imprimirDatos();

        // Comparar si el primer producto es más caro que el segundo producto
        System.out.println("\nEl producto uno es más caro que el segundo? -> " + producto1.compara(producto2));
    }
}
