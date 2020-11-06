/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.estadoPersonaje.state;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author German
 */
public class Personaje extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Personaje
     */
    private State estado;
    private int salud;
    private int nivelAmenaza;
    private int cantidadDinero;

    private String imagen;

    public Personaje() {
        this.setContentPane(fondo);
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        this.setState(new Saludable());
        this.salud = 100;
        this.nivelAmenaza = 0;
        this.cantidadDinero = 0;

        imagen = estado.getImage();

        lbDinero.setText(String.valueOf(getCantidadDinero()));
        lbNivelAmenaza.setText(String.valueOf(getNivelAmenaza()));
        lbSalud.setText(String.valueOf(getSalud()));
    }

    public void setState(State state) {
        this.estado = state;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getNivelAmenaza() {
        return nivelAmenaza;
    }

    public void setNivelAmenaza(int nivelAmenaza) {
        this.nivelAmenaza = nivelAmenaza;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void paint() {
        lbImagen.setIcon(new ImageIcon(getClass().getResource("/images/" + estado.getImage())));
    }

    public void esconderse() {
        estado.esconderse(this);
        lbDinero.setText(String.valueOf(getCantidadDinero()));
        lbNivelAmenaza.setText(String.valueOf(getNivelAmenaza()));
        lbSalud.setText(String.valueOf(getSalud()));
        this.paint();
    }

    public void cometerCrimen() {
        estado.cometerCrimen(this);
        lbNivelAmenaza.setText(String.valueOf(getNivelAmenaza()));
        this.paint();
    }

    public void cumplirMision() {
        estado.cumplirMision(this);
        lbDinero.setText(String.valueOf(getCantidadDinero()));
        this.paint();

    }

    public void recibirDano() {
        estado.recibirDano(this);
        lbSalud.setText(String.valueOf(getSalud()));
        this.paint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImagen = new javax.swing.JLabel();
        btnCometerCrimen = new javax.swing.JButton();
        btnEsconderse = new javax.swing.JButton();
        btnCumplirMision = new javax.swing.JButton();
        btnRecibirDano = new javax.swing.JButton();
        lbEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbSalud = new javax.swing.JLabel();
        lbDinero = new javax.swing.JLabel();
        lbNivelAmenaza = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parado.png"))); // NOI18N
        lbImagen.setText("imagen");

        btnCometerCrimen.setBackground(new java.awt.Color(255, 153, 0));
        btnCometerCrimen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCometerCrimen.setForeground(new java.awt.Color(255, 255, 255));
        btnCometerCrimen.setText("COMETER CRIMEN");
        btnCometerCrimen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCometerCrimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCometerCrimenActionPerformed(evt);
            }
        });

        btnEsconderse.setBackground(new java.awt.Color(0, 0, 204));
        btnEsconderse.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEsconderse.setForeground(new java.awt.Color(255, 255, 255));
        btnEsconderse.setText("ESCONDERSE");
        btnEsconderse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEsconderse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsconderseActionPerformed(evt);
            }
        });

        btnCumplirMision.setBackground(new java.awt.Color(0, 102, 0));
        btnCumplirMision.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCumplirMision.setForeground(new java.awt.Color(255, 255, 255));
        btnCumplirMision.setText("CUMPLIR MISION");
        btnCumplirMision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCumplirMision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplirMisionActionPerformed(evt);
            }
        });

        btnRecibirDano.setBackground(new java.awt.Color(255, 0, 0));
        btnRecibirDano.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRecibirDano.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibirDano.setText("RECIBIR DAÑO");
        btnRecibirDano.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecibirDano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirDanoActionPerformed(evt);
            }
        });

        lbEstado.setBackground(new java.awt.Color(255, 255, 0));
        lbEstado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbEstado.setText("estado");

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("DINERO");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("NIVEL AMENAZA");

        lbSalud.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbSalud.setForeground(new java.awt.Color(255, 255, 255));
        lbSalud.setText("jLabel5");

        lbDinero.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDinero.setForeground(new java.awt.Color(255, 255, 255));
        lbDinero.setText("jLabel6");

        lbNivelAmenaza.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbNivelAmenaza.setForeground(new java.awt.Color(255, 255, 255));
        lbNivelAmenaza.setText("jLabel7");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("SALUD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDinero)
                    .addComponent(lbSalud)
                    .addComponent(lbNivelAmenaza))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbSalud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbNivelAmenaza))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRecibirDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCumplirMision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCometerCrimen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEsconderse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCometerCrimen)
                        .addGap(24, 24, 24)
                        .addComponent(btnEsconderse)
                        .addGap(18, 18, 18)
                        .addComponent(btnCumplirMision)
                        .addGap(28, 28, 28)
                        .addComponent(btnRecibirDano)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCometerCrimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCometerCrimenActionPerformed
        cometerCrimen();
    }//GEN-LAST:event_btnCometerCrimenActionPerformed

    private void btnEsconderseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsconderseActionPerformed
        esconderse();
    }//GEN-LAST:event_btnEsconderseActionPerformed

    private void btnCumplirMisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplirMisionActionPerformed
        cumplirMision();
    }//GEN-LAST:event_btnCumplirMisionActionPerformed

    private void btnRecibirDanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirDanoActionPerformed
        recibirDano();
    }//GEN-LAST:event_btnRecibirDanoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Personaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCometerCrimen;
    private javax.swing.JButton btnCumplirMision;
    private javax.swing.JButton btnEsconderse;
    private javax.swing.JButton btnRecibirDano;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbDinero;
    public javax.swing.JLabel lbEstado;
    public javax.swing.JLabel lbImagen;
    public javax.swing.JLabel lbNivelAmenaza;
    public javax.swing.JLabel lbSalud;
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
