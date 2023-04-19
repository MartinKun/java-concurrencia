# Ejecución de tareas concurrentes

Este ejemplo muestra cómo ejecutar tareas concurrentes en Java utilizando la interfaz Runnable y la clase ExecutorService. Se proporcionan dos clases: ImpresorTareas e EjecutorTareas. La primera implementa la interfaz Runnable y define un método run() que duerme durante un tiempo aleatorio antes de imprimir un mensaje en la consola. La segunda clase utiliza ExecutorService para administrar la ejecución de varias instancias de ImpresorTareas.

El método main() de EjecutorTareas inicia tres instancias de ImpresorTareas y las envía al ExecutorService para su ejecución. Después de iniciar las tareas, el método shutdown() se llama en el ExecutorService para indicar que no se aceptarán más tareas y que el servicio puede comenzar a apagarse de manera ordenada. Una vez que todas las tareas se han completado, el servicio se detendrá automáticamente.
