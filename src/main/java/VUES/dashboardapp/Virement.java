/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VUES.dashboardapp;

import MODELS.Account;
import MODELS.ClientOperation;
import MODELS.Personne;
import MODELS.SendSMS;
import VUES.AUTH.State;
import javax.swing.JOptionPane;

/**
 *
 * @author taoufik
 */
public class Virement extends javax.swing.JPanel {

    /**
     * Creates new form mail
     */
    public Virement() {
        initComponents();
        //    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(Account.getAccounts(Client.getCin())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        motif = new javax.swing.JTextField();
        mnt = new javax.swing.JTextField();
        num = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(2, 2, 2));
        jLabel1.setText("Compte du Bénéficiaire  (*)");

        jLabel2.setForeground(new java.awt.Color(2, 2, 2));
        jLabel2.setText("Motif  (*)");

        jLabel4.setForeground(new java.awt.Color(2, 2, 2));
        jLabel4.setText("Montant  (*)");

        jLabel3.setForeground(new java.awt.Color(2, 2, 2));
        jLabel3.setText("* Indique un champ obligatoire");

        valider.setBackground(new java.awt.Color(4, 96, 96));
        valider.setForeground(new java.awt.Color(255, 255, 255));
        valider.setText("Valider");
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        motif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mnt)
                            .addComponent(motif, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(num))))
                .addGap(0, 358, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(valider)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(mnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(motif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(valider)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_validerActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_validerActionPerformed

    private void motifActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_motifActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_motifActionPerformed

    private boolean inputFieldIsEmpty() {
        return num.getText().isEmpty() || motif.getText().isEmpty() || mnt.getText().isEmpty();
    }

    private void validerMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_validerMouseClicked

        if (inputFieldIsEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuliiez vérifier les champs", "Input invalide",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String numCompte = num.getText();
            float montant = Float.parseFloat(mnt.getText());
            String mot = motif.getText();

            if (Account.AccountActive(numCompte) && Long.parseLong(numCompte) != (long) Account.getNumAccount()) {
                if (montant > 0) {
                    // tous les données sont valides
                    // verifier que le client à le solde pour effectuer le virement
                    if (Account.getSolde() >= montant) {// if le client a le solde on finalise l'operation
                        if (confirm()) {
                            ClientOperation.createClientOperation((int) Account.getNumAccount(), Integer.parseInt(numCompte), mot, montant);
                            JOptionPane.showMessageDialog(this, "Virement effectué", "Opération terminée", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Votre fond est insuffisant pour réaliser l'opération, Merci d'allimenter votre compte",
                                "Fond insuffisant", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Le montant ne peut pas être négative ou nulle", "Montant invalide",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Numero de compte invalide", "compte invalide",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }// GEN-LAST:event_validerMouseClicked

    public int sendAnSMS() {
        int code = (int) (Math.random() * 10000);
        State.setCheck(code);
        SendSMS sms = new SendSMS("+212" + Personne.getTel().substring(1, 10), "code de verification est : " + code);
        return code;
    }

    public boolean confirm() {
        int code = sendAnSMS();
        int codeInput;

        do {
            codeInput = Integer.parseInt(JOptionPane.showInputDialog(this, "Entrer le code de confirmation :"));
        } while (codeInput != code);

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mnt;
    private javax.swing.JTextField motif;
    private javax.swing.JTextField num;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
