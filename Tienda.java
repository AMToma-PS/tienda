public class Tienda {
    public int aplicarDescuento(int precio, int porcentaje) {
        return precio - precio * porcentaje / 100;
    }

    public int precioConIva(int precio) {
        return precio * 21 / 100;
    }
}
