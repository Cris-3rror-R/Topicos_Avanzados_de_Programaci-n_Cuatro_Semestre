import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * Modificar elementos a la base de datos
 */
public class jIFr_Modificar extends javax.swing.JInternalFrame {

    public String NCBuscar;
    public Connection cnx;
    public int dominio=0;
    public String Sexo;
    public String Email;
    public int FSelecionada;
    public ArrayList<Integer> IDs;
    
    public jIFr_Modificar() {
        initComponents();
        this.setSize(785,540);
        this.setTitle("Modificar");
        ConectarBD Conectar = new ConectarBD();
        cnx = Conectar.conexion();
        IDs = new ArrayList<>();
        for(int x=16;x<=75;x++) {
            jCBox_Edad.addItem(x+"");
        }
        jCBox_Edad.setSelectedIndex(0);
    }
    
    public int ContEdad(int Edad){
        int cont = 0;
        for(int x=16;x<=75;x++){
            if(x!=Edad){
                cont++;
            }else{
                break;
            }
        }
        return cont;
    } 
    
    public int ContSexo(String Sexo){
        int cont=0;
        if("H".equals(Sexo)){
            cont=0;
        }else{
            cont=1;
        }
        
        return cont;
    }
    public String Email(String email) {
    String aux = "";
    for(int x=0;x<email.length();x++) {
        char b = email.charAt(x);
        if(b!='@'){
           aux=aux+b; 
        }else{
            break; 
        }
    }
    return aux;
}
   public int dominio(String email) {
    int cont = -1;
    int indice = email.indexOf('@');
    String gmail = email.substring(indice);
        switch (gmail) {
            case "@gmail.com":
                cont = 0;
                break;
            case "@hotmail.com":
                cont = 1;
                break;
            case "@yahoo.com":
                cont = 2;
                break;
            case "@protonmail.com":
                cont = 3;
                break;
        }
    return cont;
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
   
    public void Actualizar(String NC,int Id){
        try{
        Statement St = cnx.createStatement();
        ResultSet Rs = St.executeQuery("SELECT * from datosgenerales WHERE datosgenerales.NC ='"+NC+"' AND datosgenerales.Id ='"+Id+"'");
        while(Rs.next()){
            int Edad = Rs.getInt("edad");
            String email = Rs.getString("email");
            String Sexo = Rs.getString("sexo");
            dominio = 0;
            jTF_Nom.setText(Rs.getString("Nom"));
            jTF_Dom.setText(Rs.getString("Dom"));
            jTF_Tel.setText(Rs.getString("Tel"));
            jTF_Email.setText(Email(email).toLowerCase());
            jCBox_Email.setSelectedIndex(dominio(email));
            jCBox_Edad.setSelectedIndex(ContEdad(Edad));
            jCBox_Sexo.setSelectedIndex(ContSexo(Sexo));
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_ModificarNC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTF_Nom = new javax.swing.JTextField();
        jTF_Dom = new javax.swing.JTextField();
        jTF_Tel = new javax.swing.JTextField();
        jTF_Email = new javax.swing.JTextField();
        jCBox_Email = new javax.swing.JComboBox<>();
        jCBox_Edad = new javax.swing.JComboBox<>();
        jCBox_Sexo = new javax.swing.JComboBox<>();
        jB_Modificar = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jB_Buscar = new javax.swing.JButton();
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

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar elementos a  la base de datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Número de control a modificar:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Edad:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Sexo:");

        jCBox_Email.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@yahoo.com", "@protonmail.com" }));
        jCBox_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_EmailActionPerformed(evt);
            }
        });

        jCBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jCBox_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_SexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_Tel))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBox_Edad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBox_Sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBox_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBox_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jB_Modificar.setBackground(new java.awt.Color(255, 153, 0));
        jB_Modificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Modificar.setText("Modificar");
        jB_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ModificarActionPerformed(evt);
            }
        });

        jB_Salir.setBackground(new java.awt.Color(255, 102, 102));
        jB_Salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jB_Salir.setText("Cancelar");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jB_Buscar.setText("Buscar");
        jB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuscarActionPerformed(evt);
            }
        });

        jSP_Tabla.setBackground(new java.awt.Color(255, 255, 204));
        jSP_Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSP_TablaMouseClicked(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "NC", "Nombre", "Domicilio", "Telefono", "Email", "Edad", "Sexo"
            }
        ));
        jTabla.setFocusable(false);
        jSP_Tabla.setViewportView(jTabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_ModificarNC, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_Buscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jB_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSP_Tabla))))
                .addGap(114, 178, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_ModificarNC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSP_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ModificarActionPerformed
        if(!"".equals(jTF_ModificarNC.getText())){
            String Opcion = JOptionPane.showInputDialog("¿Estas seguro de modificar el registro?");
            switch(Opcion){
                case "Si","si","SI":
                    if(!"".equals(jTF_Nom.getText()) && !"".equals(jTF_Dom.getText()) && !"".equals(jTF_Tel.getText()) &&!"".equals(jTF_Email.getText()) &&!"".equals(jCBox_Edad.getSelectedItem()) &&!"".equals(jCBox_Sexo.getSelectedIndex())){
                        try{
                            PreparedStatement Ps = cnx.prepareStatement("UPDATE datosgenerales SET Nom = ?, Dom = ?, Tel = ?, email = ?, edad = ?, sexo = ? WHERE NC = ? AND Id = ?");
                            Ps.setString(1, jTF_Nom.getText());
                            Ps.setString(2, jTF_Dom.getText());
                            Ps.setString(3, jTF_Tel.getText());
                            Ps.setString(4, jTF_Email.getText()+Email.toLowerCase());
                            Ps.setString(5, jCBox_Edad.getSelectedItem().toString());
                            Ps.setString(6, Sexo);
                            Ps.setString(7, jTF_ModificarNC.getText());
                            Ps.setString(8, IDs.get(FSelecionada).toString());
                            Ps.executeUpdate();
                        }catch(SQLException ex) {
                            System.out.println(ex.getMessage());
                        }
                        JOptionPane.showMessageDialog(null, "Se modifico el registro a la base de datos");
                        this.dispose();
                    }
                    break;
                case "No","no","NO":
                    jTF_ModificarNC.setText("");
                    jTF_Nom.setText("");
                    jTF_Dom.setText("");
                    jTF_Tel.setText("");
                    jTF_Email.setText("");
                    jCBox_Email.setSelectedIndex(0);
                    jCBox_Edad.setSelectedIndex(0);
                    jCBox_Sexo.setSelectedIndex(0);
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay un NC a modificar.");
        }
    }//GEN-LAST:event_jB_ModificarActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

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

    private void jB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuscarActionPerformed
        String NCBuscar = "";
        int cont = 0;
        if(!"".equals(jTF_ModificarNC.getText())){
            NCBuscar = jTF_ModificarNC.getText();
            if(Buscar(NCBuscar,jTabla)){
                int idSeleccionado = IDs.get(0);
                Actualizar(NCBuscar, idSeleccionado);
                jTabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) {
                        FSelecionada = jTabla.getSelectedRow();
                        if (FSelecionada != -1) {
                            Actualizar(jTF_ModificarNC.getText(), IDs.get(FSelecionada));
                        }
                    }
                }
            });
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese número de control en la base de datos.");
                jTF_ModificarNC.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El NC esta vacío.");
        }
    }//GEN-LAST:event_jB_BuscarActionPerformed

    private void jSP_TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSP_TablaMouseClicked

    }//GEN-LAST:event_jSP_TablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Buscar;
    private javax.swing.JButton jB_Modificar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JComboBox<String> jCBox_Edad;
    private javax.swing.JComboBox<String> jCBox_Email;
    private javax.swing.JComboBox<String> jCBox_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSP_Tabla;
    private javax.swing.JTextField jTF_Dom;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_ModificarNC;
    private javax.swing.JTextField jTF_Nom;
    private javax.swing.JTextField jTF_Tel;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
