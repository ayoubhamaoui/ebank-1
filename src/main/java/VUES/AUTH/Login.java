/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VUES.AUTH;

import VUES.AUTH.Registre.RegistreStep1;
import VUES.AUTH.Registre.RegistreStep2;
import VUES.AUTH.Registre.RegistreStep3;
import VUES.dashboardapp.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author hamza
 */
public class Login extends javax.swing.JFrame {

    // creation new account's panels
    private RegistreStep1 registreStep1 = new RegistreStep1();
    private RegistreStep2 registreStep2 = new RegistreStep2();
    private RegistreStep3 registreStep3 = new RegistreStep3();
    // password reset's panels
    private PasswordReset passwordResetStep1 = new PasswordReset();
    // login panel
    private Connecter connecter = new Connecter();
    // Admin panel
    private Admin admin = new Admin();
    // current panel
    private String panel = "";
    private int xx, xy;

    /**
     * Creates new form Home
     */
    public Login(){
        initComponents();
        steps();
        container.setLayout(new FlowLayout());
        container.add(connecter);
    }

    private void steps() {
        step3.disable();
        step2.disable();
        hideSteps();
    }

    private void hideSteps() {
        step1.hide();
        step2.hide();
        step3.hide();
    }

    private void showSteps() {
        step1.show();
        step2.show();
        step3.show();
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

        jPanel1 = new javax.swing.JPanel();
        reset = new javax.swing.JPanel();
        Indicator2 = new javax.swing.JPanel();
        passwordReset = new javax.swing.JLabel();
        connect = new javax.swing.JPanel();
        Indicator1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        Indicator3 = new javax.swing.JPanel();
        registre = new javax.swing.JLabel();
        Button4 = new javax.swing.JPanel();
        Indicator4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        administrateur = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        step1 = new javax.swing.JLabel();
        step2 = new javax.swing.JLabel();
        step3 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        suivant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 69, 69));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reset.setBackground(new java.awt.Color(15, 122, 122));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        Indicator2.setBackground(new java.awt.Color(255, 255, 255));
        Indicator2.setOpaque(false);

        javax.swing.GroupLayout Indicator2Layout = new javax.swing.GroupLayout(Indicator2);
        Indicator2.setLayout(Indicator2Layout);
        Indicator2Layout.setHorizontalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator2Layout.setVerticalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        passwordReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordReset.setForeground(new java.awt.Color(255, 255, 255));
        passwordReset.setText("Mot de passe oublier ?");
        passwordReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout resetLayout = new javax.swing.GroupLayout(reset);
        reset.setLayout(resetLayout);
        resetLayout.setHorizontalGroup(
            resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetLayout.createSequentialGroup()
                .addComponent(Indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordReset)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        resetLayout.setVerticalGroup(
            resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(resetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordReset, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 232, 50));

        connect.setBackground(new java.awt.Color(0, 18, 18));
        connect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectMouseClicked(evt);
            }
        });

        Indicator1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Indicator1Layout = new javax.swing.GroupLayout(Indicator1);
        Indicator1.setLayout(Indicator1Layout);
        Indicator1Layout.setHorizontalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator1Layout.setVerticalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se connecter");

        javax.swing.GroupLayout connectLayout = new javax.swing.GroupLayout(connect);
        connect.setLayout(connectLayout);
        connectLayout.setHorizontalGroup(
            connectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connectLayout.createSequentialGroup()
                .addComponent(Indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 113, Short.MAX_VALUE))
        );
        connectLayout.setVerticalGroup(
            connectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 232, -1));

        create.setBackground(new java.awt.Color(15, 122, 122));
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });

        Indicator3.setBackground(new java.awt.Color(255, 255, 255));
        Indicator3.setOpaque(false);

        javax.swing.GroupLayout Indicator3Layout = new javax.swing.GroupLayout(Indicator3);
        Indicator3.setLayout(Indicator3Layout);
        Indicator3Layout.setHorizontalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator3Layout.setVerticalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        registre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registre.setForeground(new java.awt.Color(255, 255, 255));
        registre.setText("Créer un Compte");

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addComponent(Indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registre)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registre, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 232, 50));

        Button4.setBackground(new java.awt.Color(252, 230, 252));
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
        });

        Indicator4.setBackground(new java.awt.Color(204, 0, 204));
        Indicator4.setOpaque(false);

        javax.swing.GroupLayout Indicator4Layout = new javax.swing.GroupLayout(Indicator4);
        Indicator4.setLayout(Indicator4Layout);
        Indicator4Layout.setHorizontalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator4Layout.setVerticalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button4Layout.createSequentialGroup()
                .addComponent(Indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, 232, -1));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));

        jPanel14.setBackground(new java.awt.Color(0, 89, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(1, 39, 39));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" E-Bank");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 37));

        administrateur.setBackground(new java.awt.Color(15, 122, 122));
        administrateur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        administrateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrateurMouseClicked(evt);
            }
        });

        Indicator5.setBackground(new java.awt.Color(255, 255, 255));
        Indicator5.setOpaque(false);

        javax.swing.GroupLayout Indicator5Layout = new javax.swing.GroupLayout(Indicator5);
        Indicator5.setLayout(Indicator5Layout);
        Indicator5Layout.setHorizontalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator5Layout.setVerticalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        a.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Administrateur ?");

        javax.swing.GroupLayout administrateurLayout = new javax.swing.GroupLayout(administrateur);
        administrateur.setLayout(administrateurLayout);
        administrateurLayout.setHorizontalGroup(
            administrateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrateurLayout.createSequentialGroup()
                .addComponent(Indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        administrateurLayout.setVerticalGroup(
            administrateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administrateurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(administrateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 232, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 204));

        jPanel8.setBackground(new java.awt.Color(8, 30, 30));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.setToolTipText("");

        step1.setText("Etape 1");
        step1.setToolTipText("");
        step1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                step1MouseClicked(evt);
            }
        });

        step2.setText("Valider numéro de telephone");
        step2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                step2MouseClicked(evt);
            }
        });

        step3.setText("Etape 3");
        step3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                step3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(step1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(step2)
                .addGap(214, 214, 214)
                .addComponent(step3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(step1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(step3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 170));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel2.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 730, -1));

        suivant.setText("suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });
        jPanel2.add(suivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 750, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
        // TODO add your handling code here:
        if(container.getComponent(container.getComponentCount()-1).equals(registreStep1) && registreStep1.getInfos()) {
            container.removeAll();
            container.add(registreStep2);
            step2.enable();
            this.container.revalidate();
            this.container.repaint();
        }else if (container.getComponent(container.getComponentCount()-1).equals(registreStep2) && registreStep2.codeValid()) {
            labelShow("step3");
            container.removeAll();
            container.add(registreStep3);
            suivant.setVisible(false);
            this.container.revalidate();
            this.container.repaint();
        }
    }//GEN-LAST:event_suivantActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
        steps();
        showSteps();
        onClick(create);
        onLeaveClick(reset);
        onLeaveClick(connect);
        onLeaveClick(Button4);
        onLeaveClick(administrateur);

        // indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(true);
        Indicator4.setOpaque(false);
        Indicator5.setOpaque(false);
        panel = "Registre";
        show("Registre");
    }// GEN-LAST:event_createMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }// GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }// GEN-LAST:event_jPanel2MouseDragged

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_btn_closeMouseClicked

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Button4MouseClicked
        // TODO add your handling code here:
        onClick(Button4);
        onLeaveClick(reset);
        onLeaveClick(create);
        onLeaveClick(connect);

        onLeaveClick(administrateur);
        // indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(true);
        Indicator5.setOpaque(false);

        container.removeAll();
        this.container.add(new home());
        this.container.revalidate();
        validate();

        show("task");

    }// GEN-LAST:event_Button4MouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        hideSteps();
        onClick(reset);
        onLeaveClick(connect);
        onLeaveClick(create);
        onLeaveClick(Button4);

        onLeaveClick(administrateur);

        // indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(true);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        Indicator5.setOpaque(false);

        show("passwordReset");

    }// GEN-LAST:event_resetMouseClicked

    private void connectMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_connectMouseClicked
        // TODO add your handling code here:
        hideSteps();
        onClick(connect);
        onLeaveClick(reset);
        onLeaveClick(create);
        onLeaveClick(Button4);

        onLeaveClick(administrateur);

        // indicators
        Indicator1.setOpaque(true);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        Indicator5.setOpaque(false);

        show("Connecter");

    }// GEN-LAST:event_connectMouseClicked

    private void step1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_step1MouseClicked
        // TODO add your handling code here:
        container.removeAll();
        suivant.setVisible(true);
        if (panel.equals("Registre")) {
            container.add(registreStep1);
        } else if (panel.equals("PasswordReset")) {
            container.add(passwordResetStep1);
        }
        this.container.revalidate();
        this.container.repaint();
    }// GEN-LAST:event_step1MouseClicked

    private void step2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_step2MouseClicked
        // TODO add your handling code here:
        //System.out.println("step2 cliecked");
        suivant.setVisible(true);
        if (step2.isEnabled()) {
            container.removeAll();
            container.add(registreStep2);
            this.container.revalidate();
            this.container.repaint();
        }
    }// GEN-LAST:event_step2MouseClicked

    private void step3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_step3MouseClicked
        // TODO add your handling code here:
        suivant.setVisible(false);
        if (step3.isEnabled()) {
            container.removeAll();
            container.add(registreStep3);
            this.container.revalidate();
            this.container.repaint();
        }

    }// GEN-LAST:event_step3MouseClicked

    private void tostep2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tostep2MouseClicked
        // TODO add your handling code here:
        // SendAnSMS()

        if (registreStep1.getInfos()) {
            labelShow("step2");
            labelShow("tostep3");
            container.removeAll();
            container.add(registreStep2);

            this.container.revalidate();
            this.container.repaint();
        }
    }// GEN-LAST:event_tostep2MouseClicked

    private void tostep3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tostep3MouseClicked

        // TODO add your handling code here:
        if (registreStep2.codeValid()) {
            labelShow("step3");
            container.removeAll();
            container.add(registreStep3);
            this.container.revalidate();
            this.container.repaint();
        }

    }// GEN-LAST:event_tostep3MouseClicked

    private void passwordResetMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passwordResetMouseClicked
        // TODO add your handling code here:
        hideSteps();
        onClick(reset);
        onLeaveClick(connect);
        onLeaveClick(create);
        onLeaveClick(Button4);
        onLeaveClick(administrateur);

        // indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(true);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        Indicator5.setOpaque(false);
        panel = "PasswordReset";
        show("passwordReset");
    }// GEN-LAST:event_passwordResetMouseClicked

    private void administrateurMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_administrateurMouseClicked
        hideSteps();
        onClick(administrateur);
        onLeaveClick(connect);
        onLeaveClick(create);
        onLeaveClick(Button4);
        onLeaveClick(reset);

        // indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        Indicator5.setOpaque(true);
        panel = "Admin";
        show("Admin");
    }// GEN-LAST:event_administrateurMouseClicked

    public void labelShow(String lable) {
        if (lable.equals("step2")) {
            step2.enable();
            step2.repaint();
            step2.revalidate();
        }
        if (lable.equals("tostep2")) {
        }
        if (lable.equals("step3")) {
            step3.enable();
            step3.repaint();
            step3.revalidate();
        }
        if (lable.equals("tostep3")) {
        }
    }

    // bad idea
    private void onClick(JPanel panel) {
        panel.setBackground(new Color(0, 18, 18));

    }

    private void onLeaveClick(JPanel panel) {
        panel.setBackground(new Color(15, 122, 122));
    }

    public void show(String nom) {

        container.removeAll();
        javax.swing.JPanel panelToShow = new javax.swing.JPanel();

        if (nom.equals("Connecter")) {
            panelToShow = connecter;
        }

        if (nom.equals("Registre")) {
            panelToShow = registreStep1;
        }
        if (nom.equals("RegistreStep2")) {
            panelToShow = registreStep2;
        }

        if (nom.equals("passwordReset")) {
            panelToShow = passwordResetStep1;
        }
        if (nom.equals("Admin")) {
            panelToShow = admin;
        }

        this.container.add(panelToShow);
        this.container.revalidate();
        this.container.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Indicator1;
    private javax.swing.JPanel Indicator2;
    private javax.swing.JPanel Indicator3;
    private javax.swing.JPanel Indicator4;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JLabel a;
    private javax.swing.JPanel administrateur;
    private javax.swing.JLabel btn_close;
    private javax.swing.JPanel connect;
    private javax.swing.JPanel container;
    private javax.swing.JPanel create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel passwordReset;
    private javax.swing.JLabel registre;
    private javax.swing.JPanel reset;
    private javax.swing.JLabel step1;
    private javax.swing.JLabel step2;
    private javax.swing.JLabel step3;
    private javax.swing.JButton suivant;
    // End of variables declaration//GEN-END:variables

}
