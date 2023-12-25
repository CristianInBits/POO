/**
 * CLASE “PRUEBA” QUE EN EL “MAIN” UTILICE TODOS LOS MÉTODOS
 */
public class Prueba {

    public static void main(String[] args) {
    
    // Crear un objeto Producto:
    Producto producto1 = new Producto("chocolatinas",30,2);

    // Imprimir los datos iniciales del producto:
    producto1.imprimir();

    // Vender producto
    System.out.println("Se vendió chocolatinas por un precio de " + producto1.venderProducto(5) + " euros");
    producto1.imprimir();

    // Producto por defecto
    Producto producto2 = new Producto();

    // Producto 3
    Producto producto3 = new Producto("pan", 10, 0.5);

    // RESUMEN
    producto1.imprimir();
    producto2.imprimir();
    producto3.imprimir();
    
    //Añadir más pan
    producto3.reabastecerInventario(13);
    // RESUMEN
    producto1.imprimir();
    producto2.imprimir();
    producto3.imprimir();
}

}
