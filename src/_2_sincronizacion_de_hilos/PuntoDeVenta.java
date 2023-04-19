package _2_sincronizacion_de_hilos;

public class PuntoDeVenta {

    public static void main(String[] args) {

        Producto producto = new Producto("YERBA MATE", 10);
        Sucursal sucursal = new Sucursal(producto);

        Thread cajero1 = new Thread(sucursal, "Jorge");
        Thread cajero2 = new Thread(sucursal, "Manuel");
        Thread cajero3 = new Thread(sucursal, "José");

        cajero1.start();
        cajero2.start();
        cajero3.start();
    }

}
