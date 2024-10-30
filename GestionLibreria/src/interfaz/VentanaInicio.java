package interfaz;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        sistemaVac.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesRadioIni = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        sistemaVac = new javax.swing.JRadioButton();
        ultDatos = new javax.swing.JRadioButton();
        iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Cómo quiere iniciar el programa?");

        grupoBotonesRadioIni.add(sistemaVac);
        sistemaVac.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sistemaVac.setText("Sistema vacío");
        sistemaVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemaVacActionPerformed(evt);
            }
        });

        grupoBotonesRadioIni.add(ultDatos);
        ultDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ultDatos.setText("Datos de la última ejecución");
        ultDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultDatosActionPerformed(evt);
            }
        });

        iniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sistemaVac)
                    .addComponent(ultDatos))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sistemaVac)
                .addGap(36, 36, 36)
                .addComponent(ultDatos)
                .addGap(48, 48, 48)
                .addComponent(iniciar)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ultDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultDatosActionPerformed

    }//GEN-LAST:event_ultDatosActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        if(ultDatos.isSelected()){
            VentanaMenu ventMen = new VentanaMenu();
            ventMen.setVisible(true);
        }
        if(sistemaVac.isSelected()){
            VentanaMenu ventMen = new VentanaMenu();
            ventMen.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_iniciarActionPerformed

    private void sistemaVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemaVacActionPerformed

    }//GEN-LAST:event_sistemaVacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotonesRadioIni;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton sistemaVac;
    private javax.swing.JRadioButton ultDatos;
    // End of variables declaration//GEN-END:variables
}
