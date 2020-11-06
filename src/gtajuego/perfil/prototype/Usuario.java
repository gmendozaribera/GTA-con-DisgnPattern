/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.perfil.prototype;

import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author German
 */
public class Usuario extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Usuario
     */
    private final DefaultTableModel tabla = new DefaultTableModel();
    private final LinkedList<Personaje> lista = new LinkedList<Personaje>();
    private Personaje personajeSeleccionado;

    public Usuario() {
        this.setContentPane(fondo);
        initComponents();
        iniciarTabla();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void iniciarTabla() {
        tabla.addColumn("Cabello");
        tabla.addColumn("Remera");
        tabla.addColumn("Pantalon");
        tabla.addColumn("Calzado");
        tabla.addColumn("Sexo");
        this.tbPersonaje.setModel(tabla);
    }

    private void actualizarTabla(String cabello, String remera, String pantalon, String calzado, String sexo) {
        String[] row = new String[5];
        row[0] = cabello;
        row[1] = remera;
        row[2] = pantalon;
        row[3] = calzado;
        row[4] = sexo;
        tabla.addRow(row);
        this.tbPersonaje.setModel(tabla);
    }

    public void nuevoPersonaje() {
        Personaje nuevo;
        if (cbSexo.getSelectedItem().toString() == "Masculino") {
            nuevo = new PersonajeMasculino(cbCabello.getSelectedItem().toString(), cbRemera.getSelectedItem().toString(), cbPantalon.getSelectedItem().toString(), cbCalzado.getSelectedItem().toString(), cbSexo.getSelectedItem().toString());
        } else {
            nuevo = new PersonajeFemenino(cbCabello.getSelectedItem().toString(), cbRemera.getSelectedItem().toString(), cbPantalon.getSelectedItem().toString(), cbCalzado.getSelectedItem().toString(), cbSexo.getSelectedItem().toString());
        }
        lista.add(nuevo);
        actualizarTabla(nuevo.getColorCabello(), nuevo.getColorRemera(), nuevo.getColorPantalon(), nuevo.getColorCalzado(), nuevo.getSexo());

    }

    public void editarPersonaje() {
        int row = tbPersonaje.getSelectedRow();
        this.personajeSeleccionado = lista.get(row);
        this.personajeSeleccionado.setColorCabello(cbCabello.getSelectedItem().toString());
        this.personajeSeleccionado.setColorCalzado(cbCalzado.getSelectedItem().toString());
        this.personajeSeleccionado.setColorPantalon(cbPantalon.getSelectedItem().toString());
        this.personajeSeleccionado.setColorRemera(cbRemera.getSelectedItem().toString());
        lista.set(row, personajeSeleccionado);
        this.tbPersonaje.setValueAt((String) lista.get(row).getColorCabello(), row, 0);
        this.tbPersonaje.setValueAt((String) lista.get(row).getColorRemera(), row, 1);
        this.tbPersonaje.setValueAt((String) lista.get(row).getColorPantalon(), row, 2);
        this.tbPersonaje.setValueAt((String) lista.get(row).getColorCalzado(), row, 3);
        JOptionPane.showMessageDialog(null, "Modificado con Exito");
    }

    public void clonarPersonaje() {
        int row = tbPersonaje.getSelectedRow();
        if (row >= 0) {
            this.personajeSeleccionado = lista.get(row);
            operacion();
        }
    }

    public void operacion() {
        Personaje clon = (Personaje) this.personajeSeleccionado.clone();
        JOptionPane.showMessageDialog(null, "Personaje clonado exitosamente", "Exito", 1);
        lista.add(clon);
        actualizarTabla(clon.getColorCabello(), clon.getColorRemera(), clon.getColorPantalon(), clon.getColorCalzado(), clon.getSexo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPersonaje = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cbCabello = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbPantalon = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbCalzado = new javax.swing.JComboBox<>();
        cbRemera = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar Perfil de Personaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clonar Perfil de Personaje");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbPersonaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPersonaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonajeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPersonaje);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERFILES DE PERSONAJE");

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Nuevo Perfil de Personaje");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbCabello.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Negro", "Cafe", " " }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pantalon");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cabello");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo");

        cbPantalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Amarillo", "Verde", "Negro", "Azul", "Blanco" }));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Remera");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calzado");

        cbCalzado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Amarillo", "Verde", "Negro", "Azul", "Blanco" }));

        cbRemera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Amarillo", "Verde", "Negro", "Azul", "Blanco" }));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPantalon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCalzado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbRemera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCabello, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbCabello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbRemera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(cbCalzado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        editarPersonaje();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nuevoPersonaje();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clonarPersonaje();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbPersonajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonajeMouseClicked
        int row = this.tbPersonaje.getSelectedRow();
        for (int i = 0; i < this.cbCabello.getItemCount(); i++) {
            if (this.cbCabello.getItemAt(i).equals(this.tbPersonaje.getValueAt(row, 0))) {
                this.cbCabello.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < this.cbRemera.getItemCount(); i++) {
            if (this.cbRemera.getItemAt(i).equals(this.tbPersonaje.getValueAt(row, 1))) {
                this.cbRemera.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < this.cbPantalon.getItemCount(); i++) {
            if (this.cbPantalon.getItemAt(i).equals(this.tbPersonaje.getValueAt(row, 2))) {
                this.cbPantalon.setSelectedIndex(i);
            }
        }

        for (int i = 0; i < this.cbCalzado.getItemCount(); i++) {
            if (this.cbCalzado.getItemAt(i).equals(this.tbPersonaje.getValueAt(row, 3))) {
                this.cbCalzado.setSelectedIndex(i);
            }
        }

    }//GEN-LAST:event_tbPersonajeMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCabello;
    private javax.swing.JComboBox<String> cbCalzado;
    private javax.swing.JComboBox<String> cbPantalon;
    private javax.swing.JComboBox<String> cbRemera;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPersonaje;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/images/fondo2.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
}