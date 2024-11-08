/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Menu_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Menu_GUI
     */
    public Menu_GUI() {
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

        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastrar_btn = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        calculadora_btn = new javax.swing.JMenuItem();
        bloco_btn = new javax.swing.JMenuItem();
        navegador_btn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        encerrar_btn = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        help_btn = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jMenu1.setText("Ciente");

        cadastrar_btn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        cadastrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon.png"))); // NOI18N
        cadastrar_btn.setText("Cadastrar");
        cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_btnActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrar_btn);

        jMenu6.setText("Relatório");

        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem3.setText("Produtos");
        jMenu6.add(jMenuItem3);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produto");

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ferramentas");

        calculadora_btn.setText("Calculadora");
        calculadora_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadora_btnActionPerformed(evt);
            }
        });
        jMenu3.add(calculadora_btn);

        bloco_btn.setText("Bloco de Notas");
        bloco_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloco_btnActionPerformed(evt);
            }
        });
        jMenu3.add(bloco_btn);

        navegador_btn.setText("Navegador");
        navegador_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navegador_btnActionPerformed(evt);
            }
        });
        jMenu3.add(navegador_btn);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        encerrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fechar.png"))); // NOI18N
        encerrar_btn.setText("Encerrar");
        encerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrar_btnActionPerformed(evt);
            }
        });
        jMenu4.add(encerrar_btn);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Ajuda");

        help_btn.setText("Help");
        help_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_btnActionPerformed(evt);
            }
        });
        jMenu7.add(help_btn);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_btnActionPerformed
        JOptionPane.showMessageDialog(null, "sim");
    }//GEN-LAST:event_cadastrar_btnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void encerrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrar_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_encerrar_btnActionPerformed

    private void calculadora_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadora_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start calc.exe ") ;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro P001, calculadora não encontrada");
        }
    }//GEN-LAST:event_calculadora_btnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bloco_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloco_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start notepad.exe ") ;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro P002, bloco de notas não encontrada");
        }
    }//GEN-LAST:event_bloco_btnActionPerformed

    private void help_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_btnActionPerformed
        //C:\help.pdf
        try {
            Runtime.getRuntime().exec("cmd.exe /c start C:\\help.pdf ") ;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro P003, documento não encontrado não encontrada");
        }
    }//GEN-LAST:event_help_btnActionPerformed

    private void navegador_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navegador_btnActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /c start chrome.exe caiocruz.netlify.app ") ;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro P003, documento não encontrado não encontrada");
        }
    }//GEN-LAST:event_navegador_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bloco_btn;
    private javax.swing.JMenuItem cadastrar_btn;
    private javax.swing.JMenuItem calculadora_btn;
    private javax.swing.JMenuItem encerrar_btn;
    private javax.swing.JMenuItem help_btn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem navegador_btn;
    // End of variables declaration//GEN-END:variables
}
