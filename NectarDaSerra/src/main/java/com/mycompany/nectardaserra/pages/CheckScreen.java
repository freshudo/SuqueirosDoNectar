package com.mycompany.nectardaserra.pages;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultComboBoxModel;

import com.mycompany.nectardaserra.entity.Avaliacao;
import com.mycompany.nectardaserra.service.DataBase;

import java.io.FileWriter;
import java.io.IOException;

public class CheckScreen extends javax.swing.JFrame {
    private ArrayList<String> usuarios = DataBase.getUsuarios();;
    
    public CheckScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        lblSuqueiro = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblConsultar = new javax.swing.JLabel();
        comboUsers = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("<-");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblSuqueiro.setText("ADICIONAR SUQUEIRO");

        lblNome.setText("Nome:");

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblConsultar.setText("CONSULTAR SUQUEIRO");

        String[] usuariosArray = usuarios.toArray(new String[0]);
        comboUsers.setModel(new DefaultComboBoxModel<>(usuariosArray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSuqueiro)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lblConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnVoltar)
                                .addGap(75, 75, 75)
                                .addComponent(btnConsultar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSuqueiro)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(btnAdd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnConsultar))
                        .addContainerGap())))
        );

        pack();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        UserScreen postScreen = new UserScreen();
        postScreen.setVisible(true);
        this.setVisible(false);
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))){
            String user = txtNome.getText();
            writer.write(user + ";");
            writer.newLine();
            writer.flush();
            DataBase.addUsuario(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        txtNome.setText("");
        this.setVisible(false);
        CheckScreen nova = new CheckScreen();
        nova.setVisible(true);
    }

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String suqueiro = (String)comboUsers.getSelectedItem();
        ArrayList<Avaliacao> aux = DataBase.readAvas(suqueiro, true);

        Collections.sort(aux, new Comparator<Avaliacao>() {
        @Override
        public int compare(Avaliacao a1, Avaliacao a2) {
            return Float.compare(a2.getNota(), a1.getNota());
        }
        });

        InfoScreen info = new InfoScreen(aux, true, suqueiro, 0);
        info.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboUsers;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSuqueiro;
    private javax.swing.JTextField txtNome;
}
