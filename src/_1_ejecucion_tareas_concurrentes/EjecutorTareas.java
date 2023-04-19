package _1_ejecucion_tareas_concurrentes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorTareas {
    public static void main(String[] args) {

        //Creamos tres objetos ImpresorTareas.
        ImpresorTareas tarea1 = new ImpresorTareas("Tarea1");
        ImpresorTareas tarea2 = new ImpresorTareas("Tarea2");
        ImpresorTareas tarea3 = new ImpresorTareas("Tarea3");

        System.out.println("Iniciando Executor");

        ExecutorService executorService = Executors.newCachedThreadPool();

        //Iniciar las tres tareas.
        executorService.execute(tarea1);
        executorService.execute(tarea2);
        executorService.execute(tarea3);

        executorService.shutdown();

        System.out.println("Tareas iniciadas, método main finalizado.");
    }
}
