// Leandro Chiurchiu (286847) y Juan Martí­n Lasserre (289139)
// M2B
package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaAutor extends javax.swing.JFrame {

    public VentanaAutor(Sistema sys) {
        modelo = sys;
        initComponents();
        recargarTabla();
    }
    public void recargarTabla(){
        listaNom.setListData(modelo.getNombresAutor().toArray());
        listaNac.setListData(modelo.getNacionAutor().toArray());
        listaGen.setListData(modelo.getNombresGenero().toArray());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        nacionalidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGen = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNac = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaNom = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(140, 40, 213, 30);
        getContentPane().add(nacionalidad);
        nacionalidad.setBounds(140, 130, 213, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 40, 111, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Nacionalidad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 120, 34);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(6, 143, 0, 398);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(787, 143, 0, 0);

        cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(410, 200, 113, 32);

        registrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(170, 200, 113, 32);

        listaGen.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaGen.setToolTipText("");
        jScrollPane1.setViewportView(listaGen);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 60, 260, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Generos en los que escribe");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 30, 250, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 280, 80, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nacionalidad");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 280, 130, 25);

        listaNac.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaNac);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 310, 260, 200);

        listaNom.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaNom);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(60, 310, 260, 200);

        setBounds(0, 0, 724, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        ArrayList<String> listaGeneros = new ArrayList<>();
        for (int i = 0; i < listaGen.getModel().getSize(); i++){
            listaGeneros.add((String) listaGen.getModel().getElementAt(i));
        }
        if (nombre.getText().trim().length() == 0 || nacionalidad.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos. Compruebe que no estén vacíos y vuelva a intentarlo.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        } else if (modelo.autorEsUnico(nombre.getText())){
            modelo.registrarAutor(nombre.getText(), nacionalidad.getText(), listaGeneros);
            recargarTabla();
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "El autor ya existe. ¿Desea sobreescribir los datos?", "Autor ya existente",
                    JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Se sobreescribirá los datos del Autor.", "Autor ya existente",
                        JOptionPane.INFORMATION_MESSAGE);
                modelo.registrarAutor(nombre.getText(), nacionalidad.getText(), listaGeneros);
                recargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se sobreescribirán los datos.", "Autor ya existente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        nombre.setText("");
        nacionalidad.setText("");
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    Sistema modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listaGen;
    private javax.swing.JList listaNac;
    private javax.swing.JList listaNom;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}

