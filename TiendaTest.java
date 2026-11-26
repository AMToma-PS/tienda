public class TiendaTest {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        assert tienda.aplicarDescuento(200, 25) == 150 : "Error en aplicarDescuento()";
        assert tienda.precioConIva(100) == 121 : "Error en precioConIva()";

        System.out.println("Todos los tests pasaron correctamente.");
    }
}
