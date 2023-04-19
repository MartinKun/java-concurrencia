package _2_sincronizacion_de_hilos;

public class Producto {

    private int existencia;
    private String nombre;

    public Producto(String nombre, int existencia) {
        this.nombre = nombre;
        this.existencia = existencia;
    }

    public int getExistencia() {
        return existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void venderProducto(int cantidadVendida){
        this.existencia -= cantidadVendida;
    }
}
