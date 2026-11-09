package pkg23630177_08;

/**
 * Cristopher Axel Venegas Venegas
 * Primera implemetación de Hilos
 */
public class Main extends Thread {
    public Main (String str){
        super(str);
    }
    
    @Override
    public void run(){
        for(int i = 0;i < 10; i++){
            for(int j = 0; j < 100; j++){
                System.out.println(i+j+" "+getName());
            }
        }
        System.out.println("Termina Thread "+getName());
    }
    
    public static void NoHilo(String nom){
        for(int i = 0;i < 10; i++){
            System.out.println(i+" "+nom);
        }
        System.out.println("Termina No Hilo "+nom);
    }
    
    public static void main(String[] args) {
        NoHilo("Hilo 1");
        NoHilo("Hilo 2");
        NoHilo("Hilo 3");
        
        new Main("Conejo 3").start();
        new Main("Conejo 2").start();
        new Main("Tortuga 1").start();
        new Main("Tortuga 2").start();
        
        System.out.println("Termina main principal");
    }
    
}
