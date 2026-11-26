public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        int precio = 200;

        int conDescuento = tienda.aplicarDescuento(precio, 25);
        System.out.println("Precio original: " + precio + " euros");
        System.out.println("Con un 25% de descuento: " + conDescuento + " euros");
        System.out.println("Con IVA (21%): " + tienda.precioConIva(conDescuento) + " euros");
    }
}
