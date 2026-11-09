
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 * Cristopher Axel Venegas Venegas 4A ISC
 * Implementación de menus e internal frames
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDsP_Principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMe_BDatos = new javax.swing.JMenu();
        jMeIt_Agregar = new javax.swing.JMenuItem();
        jMeIt_Eliminar = new javax.swing.JMenuItem();
        jMeIt_Modificar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMeIt_Buscar = new javax.swing.JMenuItem();
        jMeIt_Consultar = new javax.swing.JMenuItem();
        jMe_Apli = new javax.swing.JMenu();
        jMeIt_VerificarBD = new javax.swing.JMenuItem();
        jMeIt_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDsP_Principal.setBackground(new java.awt.Color(169, 169, 190));
        jDsP_Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDsP_PrincipalLayout = new javax.swing.GroupLayout(jDsP_Principal);
        jDsP_Principal.setLayout(jDsP_PrincipalLayout);
        jDsP_PrincipalLayout.setHorizontalGroup(
            jDsP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jDsP_PrincipalLayout.setVerticalGroup(
            jDsP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jMe_BDatos.setText("Base de datos");

        jMeIt_Agregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Agregar.setText("Agregar");
        jMeIt_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_AgregarActionPerformed(evt);
            }
        });
        jMe_BDatos.add(jMeIt_Agregar);

        jMeIt_Eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Eliminar.setText("Eliminar");
        jMeIt_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_EliminarActionPerformed(evt);
            }
        });
        jMe_BDatos.add(jMeIt_Eliminar);

        jMeIt_Modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Modificar.setText("Modificar");
        jMeIt_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_ModificarActionPerformed(evt);
            }
        });
        jMe_BDatos.add(jMeIt_Modificar);
        jMe_BDatos.add(jSeparator1);

        jMeIt_Buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Buscar.setText("Buscar");
        jMeIt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_BuscarActionPerformed(evt);
            }
        });
        jMe_BDatos.add(jMeIt_Buscar);

        jMeIt_Consultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Consultar.setText("Consultar");
        jMeIt_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_ConsultarActionPerformed(evt);
            }
        });
        jMe_BDatos.add(jMeIt_Consultar);

        jMenuBar1.add(jMe_BDatos);

        jMe_Apli.setText("Aplicación");

        jMeIt_VerificarBD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_VerificarBD.setText("Verificar conexión BD");
        jMeIt_VerificarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_VerificarBDActionPerformed(evt);
            }
        });
        jMe_Apli.add(jMeIt_VerificarBD);

        jMeIt_Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeIt_Salir.setText("Salir");
        jMeIt_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeIt_SalirActionPerformed(evt);
            }
        });
        jMe_Apli.add(jMeIt_Salir);

        jMenuBar1.add(jMe_Apli);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDsP_Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDsP_Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMeIt_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMeIt_SalirActionPerformed

    private void jMeIt_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_EliminarActionPerformed
        Connection cnx;
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
        }else{
            jIFr_Eliminar Eliminar = new jIFr_Eliminar();
            jDsP_Principal.add(Eliminar);
            Eliminar.setVisible(true);
        }
    }//GEN-LAST:event_jMeIt_EliminarActionPerformed

    private void jMeIt_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_AgregarActionPerformed
        Connection cnx;
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
        }else{
            jIFr_Agregar Agregar = new jIFr_Agregar();
            jDsP_Principal.add(Agregar);
            Agregar.setVisible(true);
        }
    }//GEN-LAST:event_jMeIt_AgregarActionPerformed

    private void jMeIt_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_ModificarActionPerformed
        Connection cnx;
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
        }else{
            jIFr_Modificar Modificar = new jIFr_Modificar();
            jDsP_Principal.add(Modificar);
            Modificar.setVisible(true);
        }
    }//GEN-LAST:event_jMeIt_ModificarActionPerformed

    private void jMeIt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_BuscarActionPerformed
        Connection cnx;
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
        }else{
            jIFr_Buscar Buscar = new jIFr_Buscar();
            jDsP_Principal.add(Buscar);
            Buscar.setVisible(true);
        }
    }//GEN-LAST:event_jMeIt_BuscarActionPerformed

    private void jMeIt_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_ConsultarActionPerformed
        Connection cnx;
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        if(cnx==null){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
        }else{
            jIFr_Consultar Consultar = new jIFr_Consultar();
            jDsP_Principal.add(Consultar);
            Consultar.setVisible(true);
        }
    }//GEN-LAST:event_jMeIt_ConsultarActionPerformed

    private void jMeIt_VerificarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeIt_VerificarBDActionPerformed
       ConectarBD Conectar = new ConectarBD();
       Connection cnx;
       cnx = Conectar.conexion();
       if(cnx==null){
          JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos.");
       }else{
          JOptionPane.showMessageDialog(null,"Conexion existosa.");
       }
    }//GEN-LAST:event_jMeIt_VerificarBDActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDsP_Principal;
    private javax.swing.JMenuItem jMeIt_Agregar;
    private javax.swing.JMenuItem jMeIt_Buscar;
    private javax.swing.JMenuItem jMeIt_Consultar;
    private javax.swing.JMenuItem jMeIt_Eliminar;
    private javax.swing.JMenuItem jMeIt_Modificar;
    private javax.swing.JMenuItem jMeIt_Salir;
    private javax.swing.JMenuItem jMeIt_VerificarBD;
    private javax.swing.JMenu jMe_Apli;
    private javax.swing.JMenu jMe_BDatos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
