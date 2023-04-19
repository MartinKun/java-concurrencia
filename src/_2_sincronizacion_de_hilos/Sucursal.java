package _2_sincronizacion_de_hilos;

public class Sucursal implements Runnable {

    Producto producto;

    public Sucursal(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            venderProducto(2);

            if(producto.getExistencia() < 0){
                System.out.println("Existen inconsistencias en la existencia del producto");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    private synchronized  void venderProducto(int cantidadVendida) {
        if (producto.getExistencia() >= cantidadVendida) {
            System.out.printf("La cantidad del producto %s es %d%n",
                    producto.getNombre(), producto.getExistencia()
            );
            System.out.printf("El cajero que realiza la venta es %s%n",
                    Thread.currentThread().getName()
            );

            producto.venderProducto(cantidadVendida);

            System.out.printf("Venta realizada. Nueva existencia: %d%n",
                    producto.getExistencia()
            );


        }
    }
}
