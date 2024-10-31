package interfaz;
import dominio.*;

public class VentanaMenu extends javax.swing.JFrame {

    public VentanaMenu(Sistema sys) {
        modelo = sys;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regEditoriales = new javax.swing.JMenuItem();
        regGeneros = new javax.swing.JMenuItem();
        regAutores = new javax.swing.JMenuItem();
        regLibros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        consLibros = new javax.swing.JMenuItem();
        consVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías - Realizado por Leandro Chiurchiu (286847) y Juan Martín Lasserre (289139)");

        jMenu1.setText("Registros");

        regEditoriales.setText("Editoriales");
        regEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEditorialesActionPerformed(evt);
            }
        });
        jMenu1.add(regEditoriales);

        regGeneros.setText("Generos");
        regGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regGenerosActionPerformed(evt);
            }
        });
        jMenu1.add(regGeneros);

        regAutores.setText("Autores");
        regAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAutoresActionPerformed(evt);
            }
        });
        jMenu1.add(regAutores);

        regLibros.setText("Libros");
        jMenu1.add(regLibros);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventas");

        jMenuItem1.setText("Registro de Ventas");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Anular Ventas");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        consLibros.setText("Consultar Libros");
        consLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consLibrosActionPerformed(evt);
            }
        });
        jMenu3.add(consLibros);

        consVentas.setText("Consultar Ventas");
        consVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consVentasActionPerformed(evt);
            }
        });
        jMenu3.add(consVentas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAutoresActionPerformed
        VentanaAutor vent = new VentanaAutor(modelo);
        vent.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_regAutoresActionPerformed

    private void consVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consVentasActionPerformed

    private void regEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEditorialesActionPerformed
        VentanaEditorial vent = new VentanaEditorial(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_regEditorialesActionPerformed

    private void regGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regGenerosActionPerformed
        VentanaGenero vent = new VentanaGenero(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_regGenerosActionPerformed

    private void consLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consLibrosActionPerformed
        VentanaConsultaLibros vent = new VentanaConsultaLibros(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_consLibrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consLibros;
    private javax.swing.JMenuItem consVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem regAutores;
    private javax.swing.JMenuItem regEditoriales;
    private javax.swing.JMenuItem regGeneros;
    private javax.swing.JMenuItem regLibros;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
