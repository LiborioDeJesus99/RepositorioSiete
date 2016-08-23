/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSiete;

import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class Principial extends javax.swing.JFrame {

    /**
     * Creates new form Principial
     */
    public Principial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAños = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBonos = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Empresa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Años Laborando ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 30));

        txtAños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñosKeyTyped(evt);
            }
        });
        jPanel1.add(txtAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Bono Para El Trabajador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        txtBonos.setEditable(false);
        jPanel1.add(txtBonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        String Anos, BN;
        int Años, Oper, ResT;
        txtBonos.setText("");
        if (txtAños.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor Digite Los Años Laborados", "Error", JOptionPane.ERROR_MESSAGE);
            txtAños.requestFocusInWindow();
        } else {
            Años = Integer.parseInt(txtAños.getText());
            Oper = Años - 1;
            ResT = (120000 * Oper) + 100000;
            BN = String.valueOf(ResT);
            txtBonos.setText(BN);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        
        txtBonos.setText("");
        txtAños.setText("");
       
        txtAños.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtAñosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñosKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtAñosKeyTyped

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
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAños;
    private javax.swing.JTextField txtBonos;
    // End of variables declaration//GEN-END:variables
}
