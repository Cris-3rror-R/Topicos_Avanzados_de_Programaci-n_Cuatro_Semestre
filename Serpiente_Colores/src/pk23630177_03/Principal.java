package pk23630177_03;

import java.awt.Color;

/**
 *Cristopher Axel Venegas Venegas 
 *Los colores de los paneles cambian cuando se presionan los botones.
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        Inicializar_Colores();
    }
    static Color ColorP[] = new Color [8];
    
    public void Inicializar_Colores(){
      ColorP[0]=jP_Color0.getBackground();
      ColorP[1]=jP_Color1.getBackground();
      ColorP[2]=jP_Color2.getBackground();
      ColorP[3]=jP_Color3.getBackground();
      ColorP[4]=jP_Color4.getBackground();
      ColorP[5]=jP_Color5.getBackground();
      ColorP[6]=jP_Color6.getBackground();
      ColorP[7]=jP_Color7.getBackground();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Principal = new javax.swing.JPanel();
        jP_Color0 = new javax.swing.JPanel();
        jP_Color1 = new javax.swing.JPanel();
        jP_Color2 = new javax.swing.JPanel();
        jP_Color7 = new javax.swing.JPanel();
        jP_Botones = new javax.swing.JPanel();
        jB_Derecha = new javax.swing.JButton();
        jB_Izquierda = new javax.swing.JButton();
        jP_Color3 = new javax.swing.JPanel();
        jP_Color6 = new javax.swing.JPanel();
        jP_Color5 = new javax.swing.JPanel();
        jP_Color4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("23630177_03");
        setPreferredSize(new java.awt.Dimension(500, 450));
        setResizable(false);

        jP_Principal.setPreferredSize(new java.awt.Dimension(450, 500));
        jP_Principal.setLayout(new java.awt.GridLayout(3, 3));

        jP_Color0.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color0Layout = new javax.swing.GroupLayout(jP_Color0);
        jP_Color0.setLayout(jP_Color0Layout);
        jP_Color0Layout.setHorizontalGroup(
            jP_Color0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color0Layout.setVerticalGroup(
            jP_Color0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color0);

        jP_Color1.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color1Layout = new javax.swing.GroupLayout(jP_Color1);
        jP_Color1.setLayout(jP_Color1Layout);
        jP_Color1Layout.setHorizontalGroup(
            jP_Color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color1Layout.setVerticalGroup(
            jP_Color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color1);

        jP_Color2.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color2Layout = new javax.swing.GroupLayout(jP_Color2);
        jP_Color2.setLayout(jP_Color2Layout);
        jP_Color2Layout.setHorizontalGroup(
            jP_Color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color2Layout.setVerticalGroup(
            jP_Color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color2);

        jP_Color7.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color7Layout = new javax.swing.GroupLayout(jP_Color7);
        jP_Color7.setLayout(jP_Color7Layout);
        jP_Color7Layout.setHorizontalGroup(
            jP_Color7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color7Layout.setVerticalGroup(
            jP_Color7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color7);

        jP_Botones.setBackground(new java.awt.Color(153, 153, 153));

        jB_Derecha.setBackground(new java.awt.Color(204, 204, 204));
        jB_Derecha.setText("Derecha");
        jB_Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DerechaActionPerformed(evt);
            }
        });

        jB_Izquierda.setBackground(new java.awt.Color(204, 204, 204));
        jB_Izquierda.setText("Izquierda");
        jB_Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_IzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BotonesLayout = new javax.swing.GroupLayout(jP_Botones);
        jP_Botones.setLayout(jP_BotonesLayout);
        jP_BotonesLayout.setHorizontalGroup(
            jP_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jB_Derecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_BotonesLayout.setVerticalGroup(
            jP_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BotonesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jB_Derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jP_Principal.add(jP_Botones);

        jP_Color3.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color3Layout = new javax.swing.GroupLayout(jP_Color3);
        jP_Color3.setLayout(jP_Color3Layout);
        jP_Color3Layout.setHorizontalGroup(
            jP_Color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color3Layout.setVerticalGroup(
            jP_Color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color3);

        jP_Color6.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color6Layout = new javax.swing.GroupLayout(jP_Color6);
        jP_Color6.setLayout(jP_Color6Layout);
        jP_Color6Layout.setHorizontalGroup(
            jP_Color6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color6Layout.setVerticalGroup(
            jP_Color6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color6);

        jP_Color5.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color5Layout = new javax.swing.GroupLayout(jP_Color5);
        jP_Color5.setLayout(jP_Color5Layout);
        jP_Color5Layout.setHorizontalGroup(
            jP_Color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color5Layout.setVerticalGroup(
            jP_Color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color5);

        jP_Color4.setBackground(ColorRandom());

        javax.swing.GroupLayout jP_Color4Layout = new javax.swing.GroupLayout(jP_Color4);
        jP_Color4.setLayout(jP_Color4Layout);
        jP_Color4Layout.setHorizontalGroup(
            jP_Color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jP_Color4Layout.setVerticalGroup(
            jP_Color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        jP_Principal.add(jP_Color4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jB_DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DerechaActionPerformed
        Color Aux=ColorP[7];
        for(int x=ColorP.length-1;x>0;x--){
            ColorP[x]=ColorP[x-1];
        }
        ColorP[0]=Aux;
        jP_Color0.setBackground(ColorP[0]);
        jP_Color1.setBackground(ColorP[1]);
        jP_Color2.setBackground(ColorP[2]);
        jP_Color3.setBackground(ColorP[3]);
        jP_Color4.setBackground(ColorP[4]);
        jP_Color5.setBackground(ColorP[5]);
        jP_Color6.setBackground(ColorP[6]);
        jP_Color7.setBackground(ColorP[7]);
    }//GEN-LAST:event_jB_DerechaActionPerformed

    private void jB_IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_IzquierdaActionPerformed
        Color Aux=ColorP[0];
        for(int x=0;x<ColorP.length-1;x++){
            ColorP[x]=ColorP[x+1];
        }
        ColorP[7]=Aux;
        jP_Color0.setBackground(ColorP[0]);
        jP_Color1.setBackground(ColorP[1]);
        jP_Color2.setBackground(ColorP[2]);
        jP_Color3.setBackground(ColorP[3]);
        jP_Color4.setBackground(ColorP[4]);
        jP_Color5.setBackground(ColorP[5]);
        jP_Color6.setBackground(ColorP[6]);
        jP_Color7.setBackground(ColorP[7]);
    }//GEN-LAST:event_jB_IzquierdaActionPerformed
    
    public Color ColorRandom(){
        int R=(int)(Math.random()*255);
        int B=(int)(Math.random()*255);;
        int G=(int)(Math.random()*255);;
        Color Color_Random = new Color(R,B,G);
        return Color_Random;
    }
    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Principal().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Derecha;
    private javax.swing.JButton jB_Izquierda;
    private javax.swing.JPanel jP_Botones;
    private javax.swing.JPanel jP_Color0;
    private javax.swing.JPanel jP_Color1;
    private javax.swing.JPanel jP_Color2;
    private javax.swing.JPanel jP_Color3;
    private javax.swing.JPanel jP_Color4;
    private javax.swing.JPanel jP_Color5;
    private javax.swing.JPanel jP_Color6;
    private javax.swing.JPanel jP_Color7;
    private javax.swing.JPanel jP_Principal;
    // End of variables declaration//GEN-END:variables
}
