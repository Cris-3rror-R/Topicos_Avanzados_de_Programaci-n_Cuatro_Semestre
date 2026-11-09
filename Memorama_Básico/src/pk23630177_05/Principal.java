package pk23630177_05;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *Cristopher Axel Venegas Venegas
 * Pares de Botones
 */
public class Principal extends javax.swing.JFrame {

    int n=0, pares=0;
    JButton BotonAux= new JButton();
    public Principal() { 
        initComponents();
    }
private void ActualizaBoton(JButton Boton){
    if(n==0){
            n++;
            BotonAux=Boton;
            Boton.setIcon(Boton.getPressedIcon());
        }else{
            if(!Boton.equals(BotonAux)){
                n=0;
                if(Boton.getPressedIcon().toString().equals(BotonAux.getPressedIcon().toString())){
                    Boton.setIcon(Boton.getPressedIcon());
                    BotonAux.setVisible(false);
                    Boton.setVisible(false);
                    pares++;
                    if(pares==2){
                        JOptionPane.showMessageDialog(null, "Has ganado");
                        System.exit(0);
                    }
                }else{
                    BotonAux.setIcon(Boton.getIcon());
                    }
            }
        }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Principal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("23630177_05");
        setResizable(false);
        setSize(new java.awt.Dimension(350, 400));

        jP_Principal.setBackground(new java.awt.Color(102, 102, 102));
        jP_Principal.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jButton1.setBackground(Color.GRAY.darker()
        );
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A_Tapa.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A.png"))); // NOI18N
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jP_Principal.add(jButton1);

        jButton2.setBackground(Color.GRAY.darker()
        );
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A_Tapa.png"))); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jP_Principal.add(jButton2);

        jButton3.setBackground(Color.GRAY.darker());
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A_Tapa.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/B.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jP_Principal.add(jButton3);

        jButton4.setBackground(Color.GRAY.darker());
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/A_Tapa.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pk23630177_05/B.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jP_Principal.add(jButton4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ActualizaBoton(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ActualizaBoton(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ActualizaBoton(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ActualizaBoton(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jP_Principal;
    // End of variables declaration//GEN-END:variables
}
