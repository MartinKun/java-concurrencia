package _1_ejecucion_tareas_concurrentes;

import java.security.SecureRandom;

public class ImpresorTareas implements Runnable {

    private final SecureRandom generador = new SecureRandom();
    private final int sleepTime;
    private final String nombreTarea;

    public ImpresorTareas(String nombreTarea){
        this.nombreTarea = nombreTarea;
        this.sleepTime = generador.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s se fue a dormir %d milisegundos%n%n",
                    this.nombreTarea, this.sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
            Thread.currentThread().interrupt();
        }
    }
}
