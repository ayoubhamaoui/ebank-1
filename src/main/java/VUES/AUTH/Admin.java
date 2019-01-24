package VUES.AUTH;

import MODELS.Personne;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author hamza
 */
public class Admin extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form Connecter
     */
    public Admin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        connecter = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Identifiant");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mot de Passe");

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(2, 2, 2));

        connecter.setBackground(new java.awt.Color(255, 255, 255));
        connecter.setForeground(new java.awt.Color(0, 0, 0));
        connecter.setText("Se Connecter");
        connecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connecterMouseClicked(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setForeground(new java.awt.Color(0, 0, 0));
        seven.setText("7");
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setForeground(new java.awt.Color(0, 0, 0));
        eight.setText("8");
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setForeground(new java.awt.Color(0, 0, 0));
        nine.setText("9");
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setForeground(new java.awt.Color(0, 0, 0));
        four.setText("4");
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setForeground(new java.awt.Color(0, 0, 0));
        five.setText("5");
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setForeground(new java.awt.Color(0, 0, 0));
        six.setText("6");
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setForeground(new java.awt.Color(0, 0, 0));
        one.setText("1");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setForeground(new java.awt.Color(0, 0, 0));
        two.setText("2");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setForeground(new java.awt.Color(0, 0, 0));
        three.setText("3");
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setForeground(new java.awt.Color(0, 0, 0));
        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        password.enable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(2, 2, 2));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("S'authontifier autant que Administrateur ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(connecter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(four)
                            .addComponent(seven)
                            .addComponent(one))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(two)
                                .addGap(18, 18, 18)
                                .addComponent(three))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(five)
                                    .addComponent(eight))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nine)
                                    .addComponent(six)))))
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connecter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void topFrameDispose() {
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.dispose();
    }
    private void connecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connecterMouseClicked
        // TODO add your handling code here:
        String id_ = id.getText();
        String pass = password.getText();
        if (!pass.isEmpty() && !id_.isEmpty() && Personne.login(id_, pass) && Personne.getPoste() == 2) {
            //int type = Personne.getPoste(); //1 for client 2 for cashier 3 for director
            new VUES.DashBaordEmployer.Accueil().setVisible(true);
            topFrameDispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error, numero de compte ou mot de passe incorrect");
        }
    }//GEN-LAST:event_connecterMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "5");

    }//GEN-LAST:event_fiveMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "7");
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "8");
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "9");
    }//GEN-LAST:event_nineMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "6");

    }//GEN-LAST:event_sixMouseClicked

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "0");

    }//GEN-LAST:event_zeroMouseClicked

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
//        password.setText(password.getText()+"1");
        password.setText(password.getText() + "1");
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "2");
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "3");
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        // TODO add your handling code here:
        password.setText(password.getText() + "4");
    }//GEN-LAST:event_fourMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connecter;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
