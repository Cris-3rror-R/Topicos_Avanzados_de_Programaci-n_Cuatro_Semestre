import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Agregar elementos a la base de datos
 * 
 * Ajustes necesarios
    * Validar todos los campos al momento de agregar.
    * El campo Edad necesita ser una ComboBox desde los 16 a los 65.
    * El campo Sexo debe ser un ComoBox con dos opciones Hombre o Mujer.
    * El campo Email añadir los tipos de correo más comunes y otros.
    * Al moneto de cancelar mostrar al usuario una opción cuando estén llenos los 
    * registros y preguntar si realemtne esta seguro de hace dicha opción.
 */
public class jIFr_Agregar extends javax.swing.JInternalFrame {
    public String Sexo = "";
    public String Email = "";
    ConectarBD Conectar = new ConectarBD();
    Connection cnx = Conectar.conexion();
    
    public jIFr_Agregar() {
        initComponents();
        Principal principal = new Principal();
        this.setSize(785,540);
        this.setTitle("Agregar");
        for(int x=16;x<=75;x++){
           jCBox_Edad.addItem(x+"");
        }
           jCBox_Edad.setSelectedIndex(0);
           jCBox_Sexo.setSelectedIndex(0);
           jCBox_Email.setSelectedIndex(0);
        }

    
    public void Vaciar(){
       jTF_NC.setText("");
       jTF_Nom.setText("");
       jTF_Dom.setText("");
       jTF_Tel.setText("");
       jTF_Email.setText("");
       jCBox_Edad.setSelectedIndex(0);
       jCBox_Sexo.setSelectedIndex(0);
    }
    
    public boolean CamposLlenos(){
        boolean Llenos = false;
        if(!"".equals(jTF_NC.getText())){
            if(!"".equals(jTF_Nom.getText())){
               if(!"".equals(jTF_Dom.getText())){
                   if(!"".equals(jTF_Tel.getText())){
                      if(!"".equals(jTF_Email.getText())){
                        if(!"".equals(jCBox_Edad.getSelectedItem())){
                            if(!"".equals(jCBox_Sexo.getSelectedItem())){
                                Llenos = true;
                                return Llenos;
                            }else{
                               JOptionPane.showMessageDialog(null,"El campo Sexo esta vacio.");
                               return Llenos;
                            }
                        }else{
                           JOptionPane.showMessageDialog(null,"El campo Edad esta vacio.");
                           return Llenos;
                        }  
                      }else{
                        JOptionPane.showMessageDialog(null,"El campo Email esta vacio.");
                        return Llenos;
                      } 
                   }else{
                      JOptionPane.showMessageDialog(null,"El campo Telefono esta vacio.");
                      return Llenos;
                   }
               }else{
                  JOptionPane.showMessageDialog(null,"El campo Domicilio esta vacio.");
                  return Llenos;
               } 
            }else{
                JOptionPane.showMessageDialog(null,"El campo Nombre esta vacio.");
                return Llenos;
            }
        }else{
            JOptionPane.showMessageDialog(null,"El campo NC esta vacio.");
            return Llenos;
        }
        
    }
    public boolean Buscar(String NC){
    boolean Buscar = false;
        try{
        Statement St = cnx.createStatement();
        ResultSet Rs = St.executeQuery("SELECT * from datosgenerales WHERE datosgenerales.NC ='"+NC+"'");
        while(Rs.next()){
            Buscar = true;
        }
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
        jTF_NC = new javax.swing.JTextField();
        jTF_Nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Dom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jB_Cancelar = new javax.swing.JButton();
        jB_Agregar = new javax.swing.JButton();
        jTF_Email = new javax.swing.JTextField();
        jCBox_Email = new javax.swing.JComboBox<>();
        jCBox_Edad = new javax.swing.JComboBox<>();
        jCBox_Sexo = new javax.swing.JComboBox<>();

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

        setBackground(new java.awt.Color(204, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar elementos a  la base de datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Número de control:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Domicilio: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Edad: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Sexo: ");

        jB_Cancelar.setBackground(new java.awt.Color(255, 102, 102));
        jB_Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Cancelar.setText("Cancelar");
        jB_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelarActionPerformed(evt);
            }
        });

        jB_Agregar.setBackground(new java.awt.Color(0, 153, 0));
        jB_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jB_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Agregar.setText("Agregar");
        jB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AgregarActionPerformed(evt);
            }
        });

        jCBox_Email.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@yahoo.com", "@protonmail.com" }));
        jCBox_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_EmailActionPerformed(evt);
            }
        });

        jCBox_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_EdadActionPerformed(evt);
            }
        });

        jCBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jCBox_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_SexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jB_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(951, 951, 951))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_NC, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCBox_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTF_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBox_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(453, 453, 453))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_NC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Cancelar)
                    .addComponent(jB_Agregar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelarActionPerformed
       if(!"".equals(jTF_NC.getText()) && !"".equals(jTF_Nom.getText()) && !"".equals(jTF_Dom.getText()) && !"".equals(jTF_Tel.getText()) &&!"".equals(jTF_Email.getText()) &&!"".equals(jCBox_Edad.getSelectedIndex()) &&!"".equals(jCBox_Sexo.getSelectedIndex())){
           String Acepta = JOptionPane.showInputDialog("Realmente estás seguro de cancelar el registro?");
           switch(Acepta){
               case "Si","SI","si":
                   Vaciar();
                   this.dispose();
                   break;
               case "No","NO","no":
                   break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, tan solo acepta un Si o No");
                    break;
           }
       }else{
            this.dispose();
       }
    }//GEN-LAST:event_jB_CancelarActionPerformed

    private void jB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AgregarActionPerformed
       if(!"".equals(jTF_NC.getText()) && !"".equals(jTF_Nom.getText()) && !"".equals(jTF_Dom.getText()) && !"".equals(jTF_Tel.getText()) &&!"".equals(jTF_Email.getText()) &&!"".equals(jCBox_Edad.getSelectedItem()) &&!"".equals(jCBox_Sexo.getSelectedIndex())){
             try{
                PreparedStatement Ps = cnx.prepareStatement("INSERT INTO datosgenerales (Id,NC,Nom,Dom,Tel,email,edad,sexo) VALUES (null,?,?,?,?,?,?,?)");
                Ps.setString(1, jTF_NC.getText());
                Ps.setString(2, jTF_Nom.getText());
                Ps.setString(3, jTF_Dom.getText());
                Ps.setString(4, jTF_Tel.getText());
                Ps.setString(5, (jTF_Email.getText()+Email).toLowerCase());
                Ps.setString(6, jCBox_Edad.getSelectedItem().toString());
                Ps.setString(7, Sexo);
                Ps.executeUpdate();
                Vaciar();
            }catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
                JOptionPane.showMessageDialog(null, "Se agrego el registro a la base de datos");
                this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "No todos los campos estan llenos.");
       }
    }//GEN-LAST:event_jB_AgregarActionPerformed

    private void jCBox_SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_SexoActionPerformed
       Sexo = "";
       switch(jCBox_Sexo.getSelectedIndex()){
           case 0:
               Sexo = "H";
               break;
           case 1:
               Sexo = "M";
               break;
       }        
    }//GEN-LAST:event_jCBox_SexoActionPerformed

    private void jCBox_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_EmailActionPerformed
       Email = "";
       switch(jCBox_Email.getSelectedIndex()){
           case 0:
               Email = "@gmail.com";
               break;
           case 1:
               Email = "@hotmail.com";
               break;
           case 2:
               Email = "@yahoo.com";
               break;
           case 3:
               Email = "@protonmail.com";
               break;
       }
    }//GEN-LAST:event_jCBox_EmailActionPerformed

    private void jCBox_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBox_EdadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Agregar;
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JComboBox<String> jCBox_Edad;
    private javax.swing.JComboBox<String> jCBox_Email;
    private javax.swing.JComboBox<String> jCBox_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_Dom;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_NC;
    private javax.swing.JTextField jTF_Nom;
    private javax.swing.JTextField jTF_Tel;
    // End of variables declaration//GEN-END:variables
}
