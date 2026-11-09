package pkg_23630177_09;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * Cristopher Axel Venegas Venegas
 * Implementación de hilo utilizando ProgressBar y Sincronización.
 */
public class ProgressBar extends javax.swing.JFrame {

    private static boolean RunnerWin = false;
    
    public ProgressBar() {
        initComponents();
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSalir1 = new proyecto_07.BotonSalir();
        jB_Iniciar = new javax.swing.JButton();
        jPB_1 = new javax.swing.JProgressBar();
        jPB_3 = new javax.swing.JProgressBar();
        jPB_2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProgressBar");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jB_Iniciar.setBackground(new java.awt.Color(51, 102, 0));
        jB_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Iniciar.setText("Iniciar");
        jB_Iniciar.setOpaque(true);
        jB_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_IniciarActionPerformed(evt);
            }
        });

        jPB_1.setBackground(new java.awt.Color(255, 102, 102));
        jPB_1.setMaximum(500);
        jPB_1.setToolTipText("");
        jPB_1.setName("RUNNER 1"); // NOI18N

        jPB_3.setBackground(new java.awt.Color(0, 153, 153));
        jPB_3.setMaximum(500);
        jPB_3.setName("RUNNER 3"); // NOI18N
        jPB_3.setOpaque(true);

        jPB_2.setBackground(new java.awt.Color(153, 204, 0));
        jPB_2.setMaximum(500);
        jPB_2.setName("RUNNER 2"); // NOI18N
        jPB_2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jB_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(botonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPB_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPB_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPB_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPB_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPB_3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jPB_2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_IniciarActionPerformed
        RunnerWin = false;
        jB_Iniciar.setEnabled(false);
        new Thread(new runner(jPB_1)).start();
        new Thread(new runner(jPB_3)).start();
        new Thread(new runner(jPB_2)).start();
    }//GEN-LAST:event_jB_IniciarActionPerformed

    public int TiempoEsp(){
        int Tiempo =((int)(Math.random()*275)+1);
        return Tiempo;
    }
    
    public class runner implements Runnable{
        JProgressBar jPB;
        
        public runner(JProgressBar jPB) {
            this.jPB = jPB;
        }
        public void run(){
            for(int i=0 ;i<=500; i+=5){
                if(RunnerWin){
                   break; 
                }
                jPB.setValue(i);
                jPB.repaint();
                try{
                    Thread.sleep(TiempoEsp());
                }catch(InterruptedException err){
                }
            }
            synchronized(runner.class){
                if(!RunnerWin){
                    RunnerWin=true;
                    jB_Iniciar.setEnabled(true);
                    JOptionPane.showMessageDialog(null,"Gano "+jPB.getName());
                }
            }
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyecto_07.BotonSalir botonSalir1;
    private javax.swing.JButton jB_Iniciar;
    private javax.swing.JProgressBar jPB_1;
    private javax.swing.JProgressBar jPB_2;
    private javax.swing.JProgressBar jPB_3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
