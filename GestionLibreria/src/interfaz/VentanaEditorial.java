package interfaz;
import dominio.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class VentanaEditorial extends javax.swing.JFrame {

    public VentanaEditorial(Sistema sys) {
        modelo = sys;
        initComponents();
        tabla = (DefaultTableModel) editorialTable.getModel();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTextField = new javax.swing.JTextField();
        paisTextField = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        editorialTable = new javax.swing.JTable();
        cancelarButton = new javax.swing.JButton();
        registrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Editorial");
        setPreferredSize(new java.awt.Dimension(712, 597));

        nombreTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        paisTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLabel.setText("Nombre");

        paisLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paisLabel.setText("Pais");

        editorialTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editorialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Pais de Origen"
            }
        ));
        editorialTable.setRowHeight(25);
        editorialTable.setRowMargin(10);
        editorialTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(editorialTable);

        cancelarButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        registrarButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(paisTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(registrarButton)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        String[] fila = new String[2];
        fila[0] = nombreTextField.getText();
        fila[1] = paisTextField.getText();
        if (fila[0].trim().length() == 0 || fila[1].trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos. Compruebe que no estén vacíos y vuelva a intentarlo.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } else if (modelo.esUnicaEditorial(fila[0])){
            tabla.addRow(fila);
            modelo.registrarEditorial(nombreTextField.getText(), paisTextField.getText());
            nombreTextField.setText("");
            paisTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "La editorial ingresada ya existe en el sistema.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            nombreTextField.setText("");
            paisTextField.setText("");
        }
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTable editorialTable;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JTextField paisTextField;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
    DefaultTableModel tabla;
}
