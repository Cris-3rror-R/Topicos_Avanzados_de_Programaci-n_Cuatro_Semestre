import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JColorChooser;
/**
 * Cristopher Axel Venegas Venegas 4A ISC
 * Programa que le permite al usuario elegir entre varios tipos de fuentes y colores de texto.
 * 
 * Referencia/Fuentes de consultas
 * Cómo hacer la fuente de subrayado:
 * https://www.lawebdelprogramador.com/foros/Java/1423586-Como-subrayar-texto-y-negrita-en-Java-Swing.html
 * Sitio en explicando la Class Font de Java
 * https://docs.oracle.com/javase/7/docs/api/java/awt/Font.html
 */
public class FormatearTexto extends javax.swing.JFrame {
    int tipo;
    int tam;
    String nom;
    
    public FormatearTexto() {
        initComponents();
        jL_Vist.setForeground(Color.red);
        tipo = jL_Vist.getFont().getStyle();
        tam = jL_Vist.getFont().getSize();
        String [] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String fontName : fontNames){
            jCB_Fuente.addItem(fontName);
        }
        for(int x=6;x<=70;x+=2){
            jCB_Tam.addItem(x+"");
        }
        jCB_Tam.setSelectedIndex(0);
        
        jCBox_N.setSelected(true);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_1 = new javax.swing.JPanel();
        jP_Fuente = new javax.swing.JPanel();
        jCB_Fuente = new javax.swing.JComboBox<>();
        jP_Tam = new javax.swing.JPanel();
        jCB_Tam = new javax.swing.JComboBox<>();
        jP_Tipo = new javax.swing.JPanel();
        jCBox_N = new javax.swing.JCheckBox();
        jCBox_Ng = new javax.swing.JCheckBox();
        jCBox_C = new javax.swing.JCheckBox();
        jCBox_S = new javax.swing.JCheckBox();
        jP_2 = new javax.swing.JPanel();
        jP_Vist = new javax.swing.JPanel();
        jL_Vist = new javax.swing.JLabel();
        jP_Color = new javax.swing.JPanel();
        jCB_Color = new javax.swing.JComboBox<>();
        jP_Editor = new javax.swing.JPanel();
        jTF_Editor = new javax.swing.JTextField();
        botonSalir1 = new proyecto_07.BotonSalir();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("23630177_11.1");

        jP_1.setBackground(new java.awt.Color(255, 153, 153));

        jP_Fuente.setBackground(new java.awt.Color(204, 204, 204));
        jP_Fuente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fuente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCB_Fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_FuenteItemStateChanged(evt);
            }
        });
        jCB_Fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_FuenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_FuenteLayout = new javax.swing.GroupLayout(jP_Fuente);
        jP_Fuente.setLayout(jP_FuenteLayout);
        jP_FuenteLayout.setHorizontalGroup(
            jP_FuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCB_Fuente, 0, 164, Short.MAX_VALUE)
        );
        jP_FuenteLayout.setVerticalGroup(
            jP_FuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FuenteLayout.createSequentialGroup()
                .addComponent(jCB_Fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jP_Tam.setBackground(new java.awt.Color(204, 204, 204));
        jP_Tam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tamaño", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCB_Tam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_TamItemStateChanged(evt);
            }
        });
        jCB_Tam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_TamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_TamLayout = new javax.swing.GroupLayout(jP_Tam);
        jP_Tam.setLayout(jP_TamLayout);
        jP_TamLayout.setHorizontalGroup(
            jP_TamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TamLayout.createSequentialGroup()
                .addComponent(jCB_Tam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jP_TamLayout.setVerticalGroup(
            jP_TamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TamLayout.createSequentialGroup()
                .addComponent(jCB_Tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jP_Tipo.setBackground(new java.awt.Color(204, 204, 204));
        jP_Tipo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCBox_N.setText("Normal");
        jCBox_N.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCBox_NStateChanged(evt);
            }
        });
        jCBox_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_NActionPerformed(evt);
            }
        });

        jCBox_Ng.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCBox_Ng.setText("Negrita");
        jCBox_Ng.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCBox_NgStateChanged(evt);
            }
        });
        jCBox_Ng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_NgActionPerformed(evt);
            }
        });

        jCBox_C.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCBox_C.setText("Cursiva");
        jCBox_C.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCBox_CStateChanged(evt);
            }
        });
        jCBox_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_CActionPerformed(evt);
            }
        });

        jCBox_S.setText("Subrayado");
        jCBox_S.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCBox_SStateChanged(evt);
            }
        });
        jCBox_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_SActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_TipoLayout = new javax.swing.GroupLayout(jP_Tipo);
        jP_Tipo.setLayout(jP_TipoLayout);
        jP_TipoLayout.setHorizontalGroup(
            jP_TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TipoLayout.createSequentialGroup()
                .addGroup(jP_TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBox_N)
                    .addComponent(jCBox_Ng)
                    .addComponent(jCBox_C)
                    .addComponent(jCBox_S))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jP_TipoLayout.setVerticalGroup(
            jP_TipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TipoLayout.createSequentialGroup()
                .addComponent(jCBox_N)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBox_Ng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBox_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBox_S)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_1Layout = new javax.swing.GroupLayout(jP_1);
        jP_1.setLayout(jP_1Layout);
        jP_1Layout.setHorizontalGroup(
            jP_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jP_Tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jP_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP_1Layout.setVerticalGroup(
            jP_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Fuente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_Tam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jP_2.setBackground(new java.awt.Color(255, 204, 204));

        jP_Vist.setBackground(new java.awt.Color(204, 204, 204));
        jP_Vist.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vista previa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jL_Vist.setText("Hola mundo...");

        javax.swing.GroupLayout jP_VistLayout = new javax.swing.GroupLayout(jP_Vist);
        jP_Vist.setLayout(jP_VistLayout);
        jP_VistLayout.setHorizontalGroup(
            jP_VistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_VistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Vist, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );
        jP_VistLayout.setVerticalGroup(
            jP_VistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_VistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Vist)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jP_Color.setBackground(new java.awt.Color(204, 204, 204));
        jP_Color.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Color", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCB_Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Verde", "Azul", "Naranja", "Violeta", "Otro..." }));
        jCB_Color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_ColorItemStateChanged(evt);
            }
        });
        jCB_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_ColorLayout = new javax.swing.GroupLayout(jP_Color);
        jP_Color.setLayout(jP_ColorLayout);
        jP_ColorLayout.setHorizontalGroup(
            jP_ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_Color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jP_ColorLayout.setVerticalGroup(
            jP_ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ColorLayout.createSequentialGroup()
                .addComponent(jCB_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jP_Editor.setBackground(new java.awt.Color(204, 204, 204));
        jP_Editor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Editor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTF_Editor.setText("Escribe aquí...");
        jTF_Editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_EditorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_EditorLayout = new javax.swing.GroupLayout(jP_Editor);
        jP_Editor.setLayout(jP_EditorLayout);
        jP_EditorLayout.setHorizontalGroup(
            jP_EditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_EditorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTF_Editor)
                .addContainerGap())
        );
        jP_EditorLayout.setVerticalGroup(
            jP_EditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_EditorLayout.createSequentialGroup()
                .addComponent(jTF_Editor, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jP_2Layout = new javax.swing.GroupLayout(jP_2);
        jP_2.setLayout(jP_2Layout);
        jP_2Layout.setHorizontalGroup(
            jP_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_2Layout.createSequentialGroup()
                        .addComponent(jP_Vist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jP_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_2Layout.setVerticalGroup(
            jP_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP_Vist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_FuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_FuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_FuenteActionPerformed

    private void jCB_TamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_TamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_TamActionPerformed

    private void jCBox_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_NActionPerformed
        tipo = Font.PLAIN;
        jCBox_Ng.setSelected(false);
        jCBox_C.setSelected(false);
        jCBox_S.setSelected(false);
        jCBox_N.setSelected(true);
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
    }//GEN-LAST:event_jCBox_NActionPerformed

    private void jCBox_NgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_NgActionPerformed
         if(jCBox_Ng.isSelected()){
            tipo = Font.BOLD;
            jCBox_N.setSelected(false);
            jCBox_C.setSelected(false);
            jCBox_S.setSelected(false);
        }else{
            tipo = Font.PLAIN;
            jCBox_N.setSelected(true);
        }
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
    }//GEN-LAST:event_jCBox_NgActionPerformed

    private void jCBox_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_SActionPerformed
        tipo = Font.PLAIN;
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
        if(jCBox_S.isSelected()){
           
            Font Subrayar = jL_Vist.getFont();
            Map Caracteristicas = Subrayar.getAttributes();
            Caracteristicas.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            jL_Vist.setFont(Subrayar.deriveFont(Caracteristicas));
            
            jCBox_N.setSelected(false);
            jCBox_C.setSelected(false);
            jCBox_Ng.setSelected(false);
        }else{
            jCBox_N.setSelected(true);
        }
    }//GEN-LAST:event_jCBox_SActionPerformed

    private void jCB_FuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_FuenteItemStateChanged
        nom = jCB_Fuente.getSelectedItem().toString();
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
    }//GEN-LAST:event_jCB_FuenteItemStateChanged

    private void jCB_TamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_TamItemStateChanged
        tam = Integer.parseInt(jCB_Tam.getSelectedItem().toString());
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
    }//GEN-LAST:event_jCB_TamItemStateChanged

    private void jCBox_NStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBox_NStateChanged

    }//GEN-LAST:event_jCBox_NStateChanged

    private void jCBox_NgStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBox_NgStateChanged

    }//GEN-LAST:event_jCBox_NgStateChanged

    private void jCBox_CStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBox_CStateChanged
       
    }//GEN-LAST:event_jCBox_CStateChanged

    private void jCBox_SStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCBox_SStateChanged
       
    }//GEN-LAST:event_jCBox_SStateChanged

    private void jCB_ColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_ColorItemStateChanged
       
    }//GEN-LAST:event_jCB_ColorItemStateChanged

    private void jCB_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ColorActionPerformed
       Color color = jL_Vist.getForeground();
       switch(jCB_Color.getSelectedIndex()){
           case 0:
               color = Color.RED;
               break;
            case 1:
               color = Color.GREEN;
               break;
            case 2:
               color = Color.BLUE;
               break;
            case 3:
               color = Color.ORANGE;
               break;
            case 4:
               color = Color.MAGENTA;
               break;
            case 5:
               color = JColorChooser.showDialog(null,"Seleccione un color",Color.BLACK);
               break;
           default:
               break;
       }
       jL_Vist.setForeground(color);
    }//GEN-LAST:event_jCB_ColorActionPerformed

    private void jTF_EditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_EditorActionPerformed
       jL_Vist.setText(jTF_Editor.getText());
    }//GEN-LAST:event_jTF_EditorActionPerformed

    private void jCBox_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_CActionPerformed
      if(jCBox_C.isSelected()){
            tipo = Font.ITALIC;
            jCBox_N.setSelected(false);
            jCBox_Ng.setSelected(false);
            jCBox_S.setSelected(false);
        }else{
            tipo = Font.PLAIN;
            jCBox_N.setSelected(true);
        }
        Font fuente = new Font(nom,tipo,tam);
        jL_Vist.setFont(fuente);
    }//GEN-LAST:event_jCBox_CActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatearTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyecto_07.BotonSalir botonSalir1;
    private javax.swing.JComboBox<String> jCB_Color;
    private javax.swing.JComboBox<String> jCB_Fuente;
    private javax.swing.JComboBox<String> jCB_Tam;
    private javax.swing.JCheckBox jCBox_C;
    private javax.swing.JCheckBox jCBox_N;
    private javax.swing.JCheckBox jCBox_Ng;
    private javax.swing.JCheckBox jCBox_S;
    private javax.swing.JLabel jL_Vist;
    private javax.swing.JPanel jP_1;
    private javax.swing.JPanel jP_2;
    private javax.swing.JPanel jP_Color;
    private javax.swing.JPanel jP_Editor;
    private javax.swing.JPanel jP_Fuente;
    private javax.swing.JPanel jP_Tam;
    private javax.swing.JPanel jP_Tipo;
    private javax.swing.JPanel jP_Vist;
    private javax.swing.JTextField jTF_Editor;
    // End of variables declaration//GEN-END:variables
}
