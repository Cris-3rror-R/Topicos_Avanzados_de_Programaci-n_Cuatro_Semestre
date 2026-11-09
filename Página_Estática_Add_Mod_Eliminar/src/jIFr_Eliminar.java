
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * Eliminar elementos a la base de datos
 * 
 * REFERENCIAS
 * El uso de JTable en java
 * https://codegym.cc/es/groups/posts/es.1053.java-jtable
 * El uso de JTable con SQL
 * https://www.youtube.com/watch?v=wTjQ5HJMRHc
 */
public class jIFr_Eliminar extends javax.swing.JInternalFrame {
    public String NCBuscar;
    public Connection cnx;
    public int FSelecionada;
    public ArrayList<Integer> IDs;
    
    public jIFr_Eliminar() {
        initComponents();
        this.setSize(785,540);
        this.setTitle("Eliminar");
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        IDs = new ArrayList<>();
    }
    public boolean Buscar(String NC,JTable Tabla){
    boolean Buscar = false;
        DefaultTableModel modelo;
        try{
        Statement St = cnx.createStatement();
        ResultSet Rs = St.executeQuery("SELECT * from datosgenerales WHERE datosgenerales.NC ='"+NC+"'");
        Object[] Contenido = new Object[7];
        modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0);
        while(Rs.next()){
            Buscar = true;
            IDs.add(Rs.getInt("Id"));
            Contenido [0] = Rs.getString("NC");
            Contenido [1] = Rs.getString("Nom");
            Contenido [2] = Rs.getString("Dom");
            Contenido [3] = Rs.getString("Tel");
            Contenido [4] = Rs.getString("email");
            Contenido [5] = Rs.getInt("edad");
            Contenido [6] = Rs.getString("sexo");
            modelo.addRow(Contenido);
            
        }
        Tabla.setModel(modelo);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    return Buscar;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_BuscarNC = new javax.swing.JTextField();
        jB_BuscarNC = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jB_Eliminar = new javax.swing.JButton();
        jSP_Tabla = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar registros de la base de datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Número de control a eliminar:");

        jTF_BuscarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_BuscarNCActionPerformed(evt);
            }
        });

        jB_BuscarNC.setText("Buscar");
        jB_BuscarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuscarNCActionPerformed(evt);
            }
        });

        jB_Salir.setBackground(new java.awt.Color(255, 102, 102));
        jB_Salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jB_Eliminar.setBackground(new java.awt.Color(153, 0, 0));
        jB_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Eliminar.setText("Eliminar");
        jB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EliminarActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "NC", "Nombre", "Domicilio", "Telefono", "Email", "Edad", "Sexo"
            }
        ));
        jSP_Tabla.setViewportView(jTabla);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setHeaderValue("NC");
            jTabla.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            jTabla.getColumnModel().getColumn(2).setHeaderValue("Domicilio");
            jTabla.getColumnModel().getColumn(3).setHeaderValue("Telefono");
            jTabla.getColumnModel().getColumn(4).setHeaderValue("Email");
            jTabla.getColumnModel().getColumn(5).setHeaderValue("Edad");
            jTabla.getColumnModel().getColumn(6).setHeaderValue("Sexo");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jB_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_BuscarNC, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_BuscarNC))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSP_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_BuscarNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_BuscarNC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSP_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_BuscarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_BuscarNCActionPerformed
       
    }//GEN-LAST:event_jTF_BuscarNCActionPerformed

    private void jB_BuscarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuscarNCActionPerformed
        NCBuscar = "";
        if(!"".equals(jTF_BuscarNC.getText())){
            NCBuscar = jTF_BuscarNC.getText();
            if(Buscar(NCBuscar,jTabla)){
                jTabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) {
                        FSelecionada = jTabla.getSelectedRow();
                    }
                }
            });
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese número de control en la base de datos.");
                jTF_BuscarNC.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El NC esta vacío.");
        }
    }//GEN-LAST:event_jB_BuscarNCActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EliminarActionPerformed
       if(!"".equals(jTF_BuscarNC.getText())){
           String Opcion = JOptionPane.showInputDialog("¿Realmente estas seguro de eliminar el registro?");
           switch(Opcion){
           case "Si","SI","si":
               try{
                    Statement St = cnx.createStatement();
                    PreparedStatement Ps = cnx.prepareStatement("DELETE FROM datosgenerales WHERE NC = '"+NCBuscar+"' AND Id ='"+IDs.get(FSelecionada)+"'");
                    Ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                    this.dispose();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
               break;
           case "No","no","NO":
               jTF_BuscarNC.setText("");
               break;
           default:
               break;
            }
       }else{
           JOptionPane.showMessageDialog(null, "No hay un número de control a eliminar.");
       }
       
    }//GEN-LAST:event_jB_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_BuscarNC;
    private javax.swing.JButton jB_Eliminar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSP_Tabla;
    private javax.swing.JTextField jTF_BuscarNC;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
