package pkg_23630177_09;
/**
 * @author Villa
 */
class MiHilo extends Thread {
    private static volatile boolean hiloTerminado = false; // Variable compartida para sincronización
    String Nombre;
    int Tiempo;
    
    public MiHilo(String Nombre,int Tiempo) {
        this.Nombre = Nombre;
        this.Tiempo = Tiempo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (hiloTerminado) {
                System.out.println(Nombre+ " detectó que otro hilo terminó. Se detiene.");
                return;
            }
            
            System.out.println(Nombre + " - Iteración " + i);
            
            try {
                Thread.sleep(Tiempo); // Simula un retraso en la ejecución
            } catch (InterruptedException e) {
                System.out.println(Nombre + " fue interrumpido.");
                return;
            }
        }

        synchronized (MiHilo.class) {
            if (!hiloTerminado) {
                hiloTerminado = true; // Marca que este hilo terminó primero
                System.out.println(Nombre + " ha terminado primero. Interrumpiendo a los demás.");
            }
        }
    }
}

public class SincronizaciónHilos {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("RUNNER 1",10);
        MiHilo hilo2 = new MiHilo("RUNNER 2",20);
        MiHilo hilo3 = new MiHilo("RUNNER 3",12);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

