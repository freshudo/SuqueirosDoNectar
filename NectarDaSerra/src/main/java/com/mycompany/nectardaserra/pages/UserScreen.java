package com.mycompany.nectardaserra.pages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import com.mycompany.nectardaserra.classes.Avaliacao;
import com.mycompany.nectardaserra.exception.JuiceNotFoundException;
import com.mycompany.nectardaserra.exception.NotaInvalidaException;
import com.mycompany.nectardaserra.service.DataBase;

public class UserScreen extends javax.swing.JFrame {
    
    private ArrayList<String> usuarios = DataBase.getUsuarios();;
    
    public UserScreen() {
        usuarios = DataBase.getUsuarios();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        comboAva = new javax.swing.JComboBox<>();
        txtNota = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        lblSuco = new javax.swing.JLabel();
        txtSuco = new javax.swing.JTextField();
        lblAva = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        txtComment = new javax.swing.JScrollPane();
        txtCom = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnPassar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("<-");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });

        lblNota.setText("Nota:");
        lblSuco.setText("ID suco:");

        String[] usuariosArray = usuarios.toArray(new String[0]);
        comboAva.setModel(new DefaultComboBoxModel<>(usuariosArray));

        txtSuco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucoActionPerformed(evt);
            }
        });

        lblAva.setText("Suqueiro:");

        lblComment.setText("Comentário");

        txtCom.setColumns(20);
        txtCom.setRows(5);
        txtComment.setViewportView(txtCom);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnPassar.setText("->");
        btnPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComment)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(222, 222, 222)
                        .addComponent(btnEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(btnPassar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAva, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblComment)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSuco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSuco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAva))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuco)
                    .addComponent(txtSuco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNota, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblComment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnEnviar)
                    .addComponent(btnPassar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        JuiceScreen juiceScreen = new JuiceScreen();
        juiceScreen.setVisible(true);
        this.setVisible(false);
    }

    private void txtSucoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucoActionPerformed
    }

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
    }

    private void btnPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassarActionPerformed
        CheckScreen userScreen = new CheckScreen();
        userScreen.setVisible(true);
        this.setVisible(false);
    }

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try{
            String id = txtSuco.getText();
            DataBase.foundJuice(id);
            String nota = txtNota.getText();
            nota = nota.replace(",", ".");
            DataBase.notaInvalida(nota);
        }catch(JuiceNotFoundException e){
            return;
        }catch(NotaInvalidaException e2){
            return;
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))){
            String user = (String)comboAva.getSelectedItem();
            writer.write(user + ";");
            String id = txtSuco.getText();
            writer.write(id + ";");
            String nota = txtNota.getText();
            nota = nota.replace(",", ".");
            writer.write(nota + ";");
            String comment = txtCom.getText();
            comment = comment.replace('\n', '\\').replace('\r', '\\').replace(';', ',');
            writer.write(comment + ";");
            writer.newLine();
            writer.flush();
            float notaF = Float.parseFloat(nota);
            Avaliacao a = new Avaliacao(user, id, notaF, comment);
            DataBase.addAva(a);
            txtSuco.setText("");
            txtNota.setText("");
            txtCom.setText("");
            JOptionPane.showMessageDialog(this, "Quanta frescura!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPassar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboAva;
    private javax.swing.JLabel lblAva;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblSuco;
    private javax.swing.JTextArea txtCom;
    private javax.swing.JScrollPane txtComment;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtSuco;
}
