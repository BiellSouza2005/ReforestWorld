/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.reforestworld;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Guilherme Quiller
 */
public class LoginTela extends javax.swing.JFrame {
    
    
        
    
    

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        initComponents();
        
        loginTextField.setBackground(new java.awt.Color(0,0,0,1));
        senhaPasswordField.setBackground(new java.awt.Color(0,0,0,1));
        jLabel2.setFocusable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        cadastrarButton = new javax.swing.JButton();
        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        cadastrarButton.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarButton.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarButton.setText("Cadastrar-se");
        cadastrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, -1));

        loginTextField.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField.setText("CPF");
        loginTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        loginTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginTextFieldFocusLost(evt);
            }
        });
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 240, 30));

        senhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        senhaPasswordField.setText("Senha");
        senhaPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        senhaPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaPasswordFieldFocusLost(evt);
            }
        });
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImagemLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        setSize(new java.awt.Dimension(631, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        
        
   // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
    CadastroTela1 cadastroTela1 = new CadastroTela1(); 
    cadastroTela1.setVisible(true);
    dispose();
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String login = loginTextField.getText();
        String senha = new String (senhaPasswordField.getPassword());
        if (login.equals("admin") && senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Bem Vindo");
        }
        else {JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos");
                }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginTextFieldFocusLost
        String login = loginTextField.getText();
        if (login.equals("")) {
            loginTextField.setText("CPF");
        }
                    // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldFocusLost

    private void loginTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginTextFieldFocusGained
        String login = loginTextField.getText();
        if (login.equals("CPF")) {
            loginTextField.setText("");
        }
        
                 // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldFocusGained

    private void senhaPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaPasswordFieldFocusGained
        String senha = senhaPasswordField.getText();
        if (senha.equals("Senha")) {
            senhaPasswordField.setText("");
        }
    }//GEN-LAST:event_senhaPasswordFieldFocusGained

    private void senhaPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaPasswordFieldFocusLost
     String senha = senhaPasswordField.getText();
        if (senha.equals("")) {
            senhaPasswordField.setText("Senha");
        }
    }//GEN-LAST:event_senhaPasswordFieldFocusLost

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
