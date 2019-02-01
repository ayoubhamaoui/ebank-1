/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VUES.DashboardDirector;

import Exceptions.EmployeException;
import MODELS.Director;
import MODELS.MailBoxLayer;
import MODELS.SendEmail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza
 */
public class NewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form NewEmployee
     */
    public NewEmployee() {
        initComponents();
        ResultSet res = Director.getAgences();
        try {
            while (res.next()) {
                agences.addItem(res.getString("nom"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getDate() throws Exception {
        if (datePicker.getDate() != null) {
            Date d = new Date();
            int annee = d.getYear() + 1900;
            int mois = d.getMonth() + 1;
            int jour = d.getDate();
            int year = datePicker.getDate().getYear() + 1900;
            int month = datePicker.getDate().getMonth() + 1;
            int day = datePicker.getDate().getDate();

            if (annee - year < 18) {
                throw new Exception("Verifier que vous etes Inserer une date de naissance valide ");
            } else if (annee - year == 18) {
                if (mois - month < 0) {
                    throw new Exception("Verifier que vous etes Inserer une date de naissance valide ");
                } else if (mois == month) {
                    if (jour - day < 0) {
                        throw new Exception("Verifier que vous etes Inserer une date de naissance valide ");
                    }
                }
            }
            return (datePicker.getDate().getYear() + 1900) + "-" + (datePicker.getDate().getMonth() + 1) + "-" + datePicker.getDate().getDate();
        }
        throw new Exception("Verifier que vous etes Inserer une date de naissance valide ");
    }

    private void isEmailOk() throws Exception {
        if (!MailBoxLayer.checkSMTP(email.getText())) {
            emailmsg.setText("email n'existe pas!!");
            throw new Exception();
        } else {
            emailmsg.setText("");
        }
    }

    private void isTelOk() throws Exception {
        if (tel.getText().length() != 10) {
            telmsg.setText("le numero de telephone n'est pas valide!!");
            throw new Exception();
        } else {
            telmsg.setText("");
        }
    }

    private void allFieldsSet() throws Exception {
        String Nom = nom.getText();
        String Prenom = prenom.getText();
        String Cin = cin.getText();
        String Ville = ville.getText();
        String Adresse = adresse.getText();
        String Tel = tel.getText();
        String Email = email.getText();
        String Salaire = salaire.getText();
        String title = sexe.getSelectedItem().toString();
        String Agence = agences.getSelectedItem().toString();
        String Password = password.getText();
        if (!Nom.isEmpty() && !Prenom.isEmpty() && !Cin.isEmpty() && !Ville.isEmpty() && !Adresse.isEmpty() && !Tel.isEmpty() && !Email.isEmpty() && !Salaire.isEmpty() && !title.isEmpty() && !Agence.isEmpty() && !Password.isEmpty()) {
            return;
        }
        throw new Exception("Verifier que vous avez remplir tous les champs");
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
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        ville = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        salaire = new javax.swing.JTextField();
        sexe = new javax.swing.JComboBox<>();
        agences = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        msg = new javax.swing.JLabel();
        telmsg = new javax.swing.JLabel();
        emailmsg = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel1.setForeground(new java.awt.Color(2, 2, 2));
        jLabel1.setText("Nom :");

        jLabel2.setForeground(new java.awt.Color(2, 2, 2));
        jLabel2.setText("Prenom :");

        jLabel3.setForeground(new java.awt.Color(2, 2, 2));
        jLabel3.setText("Tel :");

        jLabel4.setForeground(new java.awt.Color(2, 2, 2));
        jLabel4.setText("Ville :");

        jLabel5.setForeground(new java.awt.Color(2, 2, 2));
        jLabel5.setText("Adresse : ");

        jLabel6.setForeground(new java.awt.Color(2, 2, 2));
        jLabel6.setText("Email :");

        jLabel7.setForeground(new java.awt.Color(2, 2, 2));
        jLabel7.setText("Date de Naissance :");

        jLabel8.setForeground(new java.awt.Color(2, 2, 2));
        jLabel8.setText("Agence :");

        jLabel9.setForeground(new java.awt.Color(2, 2, 2));
        jLabel9.setText("Salaire :");

        jLabel10.setForeground(new java.awt.Color(2, 2, 2));
        jLabel10.setText("Sexe :");

        nom.setBackground(new java.awt.Color(255, 255, 255));
        nom.setForeground(new java.awt.Color(2, 2, 2));

        prenom.setBackground(new java.awt.Color(255, 255, 255));
        prenom.setForeground(new java.awt.Color(2, 2, 2));

        tel.setBackground(new java.awt.Color(255, 255, 255));
        tel.setForeground(new java.awt.Color(2, 2, 2));

        ville.setBackground(new java.awt.Color(255, 255, 255));
        ville.setForeground(new java.awt.Color(2, 2, 2));

        adresse.setBackground(new java.awt.Color(255, 255, 255));
        adresse.setForeground(new java.awt.Color(2, 2, 2));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(2, 2, 2));

        salaire.setBackground(new java.awt.Color(255, 255, 255));
        salaire.setForeground(new java.awt.Color(2, 2, 2));

        sexe.setBackground(new java.awt.Color(255, 255, 255));
        sexe.setForeground(new java.awt.Color(2, 2, 2));
        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M.", "Mme.", "Mlle" }));

        agences.setBackground(new java.awt.Color(255, 255, 255));
        agences.setForeground(new java.awt.Color(2, 2, 2));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(2, 2, 2));
        jButton3.setText("Annuler");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(4, 96, 96));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ajouter");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(2, 2, 2));
        jLabel11.setText("Cin :");

        cin.setBackground(new java.awt.Color(255, 255, 255));
        cin.setForeground(new java.awt.Color(2, 2, 2));

        datePicker.setBackground(new java.awt.Color(255, 255, 255));
        datePicker.setForeground(new java.awt.Color(2, 2, 2));

        jLabel12.setText("Password :");

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(2, 2, 2));

        msg.setForeground(new java.awt.Color(222, 2, 2));

        telmsg.setForeground(new java.awt.Color(222, 2, 2));

        emailmsg.setForeground(new java.awt.Color(222, 2, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(agences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(salaire))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nom)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prenom, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(password))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ville, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telmsg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailmsg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adresse, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)))))
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telmsg)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailmsg)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(agences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msg)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        String Nom = nom.getText();
        String Prenom = prenom.getText();
        String Cin = cin.getText();
        String Ville = ville.getText();
        String Adresse = adresse.getText();
        String Tel = tel.getText();
        String Email = email.getText();
        String Salaire = salaire.getText();
        String title = sexe.getSelectedItem().toString();
        String Agence = agences.getSelectedItem().toString();
        String Password = password.getText();
        try {
            String date_naissance = getDate();
            isEmailOk();
            isTelOk();
            allFieldsSet();
            Director.addEmploye(Cin, Nom, Prenom, date_naissance, Adresse, Ville, Tel, Email, Password, title, Agence, Salaire);
            new SendEmail(Email, Nom, Prenom, Password, Cin);
            dispose();

        } catch (EmployeException ex) {
            msg.setText(ex.getMessage());

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JComboBox<String> agences;
    private javax.swing.JTextField cin;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailmsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel msg;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField salaire;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telmsg;
    private javax.swing.JTextField ville;
    // End of variables declaration//GEN-END:variables
}
