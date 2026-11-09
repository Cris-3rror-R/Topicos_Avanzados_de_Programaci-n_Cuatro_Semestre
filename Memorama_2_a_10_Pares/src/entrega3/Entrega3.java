package entrega3;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Programa de N Pares
 * Cristopher Axel Venegas Venegas
 * Programa que el usuario puede introducir de 2 a 10 pares y 
 * tiene que elegir los pares y despues desaparecen.
 */
public class Entrega3 {

    public static void main(String[] args) {
        Principal p = new Principal();
        p.setTitle("23630177_Entrega3 Juego de Pares 2.0");
        p.setSize(600,600);
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setVisible(true);
    }
    
}
