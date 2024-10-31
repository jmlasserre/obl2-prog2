package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaGenero extends javax.swing.JFrame {

    public VentanaGenero(Sistema sys) {
        modelo = sys;
        initComponents();
        recargarTabla();
      
    }
    
    public void recargarTabla(){
        nombreList.setListData(modelo.getNombresGenero().toArray());
        descList.setListData(modelo.getDescsGenero().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTextField = new javax.swing.JTextField();
        descTextField = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        registrarGeneroButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nombreList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        descList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Género");
        setPreferredSize(new java.awt.Dimension(712, 597));

        nombreTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        descTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descTextField.setToolTipText("");
        descTextField.setAutoscrolls(false);
        descTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTextFieldActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setText("Nombre");

        genero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        genero.setText("Descripción");

        cancelarButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        registrarGeneroButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrarGeneroButton.setText("Registrar");
        registrarGeneroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarGeneroButtonActionPerformed(evt);
            }
        });

        nombreList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(nombreList);

        descList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(descList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Género");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreTextField)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarGeneroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarGeneroButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void registrarGeneroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarGeneroButtonActionPerformed
        if (nombreTextField.getText().trim().length() == 0 || descTextField.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos. Compruebe que no estén vacíos y vuelva a intentarlo.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } else if (modelo.generoEsUnico(nombreTextField.getText())){
            modelo.agregarGenero(nombreTextField.getText(), descTextField.getText());
            recargarTabla();
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "El género ya existe. ¿Desea sobreescribir los datos?", "Género ya existente",
                    JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Se sobreescribirá la descripción del género.", "Género ya existente",
                        JOptionPane.INFORMATION_MESSAGE);
                modelo.agregarGenero(nombreTextField.getText(), descTextField.getText());
                recargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se sobreescribirán los datos.", "Género ya existente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        nombreTextField.setText("");
        descTextField.setText("");

    }//GEN-LAST:event_registrarGeneroButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void descTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JList descList;
    private javax.swing.JTextField descTextField;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre;
    private javax.swing.JList nombreList;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton registrarGeneroButton;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
