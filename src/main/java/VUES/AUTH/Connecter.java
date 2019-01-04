/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VUES.AUTH;

import MODELS.AccountManagement;
import MODELS.client;
import VUES.dashboardapp.Accueil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author hamza
 */
public class Connecter extends javax.swing.JPanel implements ActionListener{

    private String pass = "";
    private String stars = "";
    private AccountManagement am;

    /**
     * Creates new form Connecter
     */
    public Connecter() {
        this.am = new AccountManagement();
        
        initComponents();
        initializeButtons() ;
        

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
        numcompte = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        connecter = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        heigth = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 204));

        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setText("Numero De Compte :");

        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setText("Mot de Passe");

        numcompte.setBackground(new java.awt.Color(255, 255, 255));

        password.setEditable(false);
        password.setBackground(new java.awt.Color(255, 255, 255));

        connecter.setBackground(new java.awt.Color(255, 255, 255));
        connecter.setForeground(new java.awt.Color(96, 83, 150));
        connecter.setText("Se Connecter");
        connecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connecterMouseClicked(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setForeground(new java.awt.Color(96, 83, 150));
        seven.setText("7");

        heigth.setBackground(new java.awt.Color(255, 255, 255));
        heigth.setForeground(new java.awt.Color(96, 83, 150));
        heigth.setText("8");

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setForeground(new java.awt.Color(96, 83, 150));
        nine.setText("9");

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setForeground(new java.awt.Color(96, 83, 150));
        four.setText("4");

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setForeground(new java.awt.Color(96, 83, 150));
        five.setText("5");

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setForeground(new java.awt.Color(96, 83, 150));
        six.setText("6");

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setForeground(new java.awt.Color(96, 83, 150));
        one.setText("1");

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setForeground(new java.awt.Color(96, 83, 150));
        two.setText("2");

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setForeground(new java.awt.Color(96, 83, 150));
        three.setText("3");

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setForeground(new java.awt.Color(96, 83, 150));
        zero.setText("0");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(96, 83, 150));
        jButton2.setText("reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(connecter)
                        .addGap(289, 289, 289))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numcompte, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(one)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(four)
                                        .addComponent(seven)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(two)
                                        .addGap(18, 18, 18)
                                        .addComponent(three))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(five)
                                        .addGap(18, 18, 18)
                                        .addComponent(six))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(heigth)
                                        .addGap(18, 18, 18)
                                        .addComponent(nine))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(zero)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numcompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heigth)
                            .addComponent(nine)
                            .addComponent(seven))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(six)
                            .addComponent(five)
                            .addComponent(four))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(two)
                            .addComponent(three))
                        .addGap(18, 18, 18)
                        .addComponent(zero)))
                .addGap(6, 6, 6)
                .addComponent(connecter)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initializeButtons(){
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        heigth.addActionListener(this);
        nine.addActionListener(this);
    }
    
    
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        stars = "";
        pass = "";
        password.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void connecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connecterMouseClicked
        // TODO add your handling code here:
        if (client.login(numcompte.getText(), pass)) {
            JOptionPane.showMessageDialog(this, "Connected !!");
            new Accueil().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "numero de compte ou mot de passe incorrect !!");
        }
    }//GEN-LAST:event_connecterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connecter;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton heigth;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nine;
    private javax.swing.JTextField numcompte;
    private javax.swing.JButton one;
    private javax.swing.JTextField password;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        javax.swing.JButton source = (javax.swing.JButton)e.getSource();
        pass += source.getText();
        stars += "*";
        password.setText(stars);
    }
}


