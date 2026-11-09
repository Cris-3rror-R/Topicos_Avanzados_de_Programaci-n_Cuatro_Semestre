package pkg_23630177_09;

/**
 * @author Villa
 */
public class Sicronización extends Thread {

    private static boolean isFirstFinished = false; // Variable compartida para la sincronización
    String name;
    int timeoff;

    public Sicronización(String name, int timeoff) {
        this.name = name;
        this.timeoff = timeoff;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 100; i++) {
                synchronized (Sicronización.class) { // Bloque sincronizado para garantizar seguridad en hilos
                    if (isFirstFinished) {
                        System.out.println(name + " detectó que otro hilo termino. Se detiene.");
                        return; // Termina si otro hilo ya finalizó
                    }
                }
                System.out.println(name + " - Iteracion " + i +" "+isFirstFinished);
                Thread.sleep(timeoff); // Simula un proceso más largo
            }

            synchronized (Sicronización.class) {
                isFirstFinished = true; // Marca que este hilo terminó primero
                System.out.println(name + " ha terminado primero. Los demás hilos serán interrumpidos.");
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " fue interrumpido.");
        }
    }

    public static void main(String[] args) {
        new Sicronización("Hilo 1", 10).start();
        new Sicronización("Hilo 2", 20).start();
        new Sicronización("Hilo 3", 30).start();
    }

}
