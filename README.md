# Sincronización de hilos.

El objetivo de este ejemplo es demostrar cómo se pueden evitar problemas de consistencia de datos cuando varios hilos intentan acceder y modificar los mismos datos simultáneamente en un programa Java mediante la sincronización de los métodos críticos.

En el mismo, se simula un punto de venta en una sucursal que vende un único producto (en este caso, yerba mate) y cuenta con tres cajeros que realizan ventas de forma concurrente.

La clase Producto define un producto que se vende en la sucursal. La clase Sucursal implementa la interfaz Runnable y se utiliza para simular la venta del producto. La clase PuntoDeVenta es la clase principal que inicia el programa y crea los hilos de los cajeros.

Cada hilo de cajero creado ejecuta el método run() de la clase Sucursal de forma concurrente. Este método llama al método venderProducto() de manera sincronizada para evitar la posible inconsistencia en la cantidad de producto que se vende en la sucursal.

La sincronización se logra mediante la palabra clave synchronized que se aplica al método venderProducto(). El método venderProducto() verifica si hay suficiente existencia del producto para realizar la venta, si lo hay, se realiza la venta y se actualiza la existencia del producto. Si no hay suficiente existencia, se emite un mensaje de advertencia indicando que hay inconsistencias en la existencia del producto.
