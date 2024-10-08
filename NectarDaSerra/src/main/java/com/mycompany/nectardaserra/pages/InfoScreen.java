package com.mycompany.nectardaserra.pages;

import java.util.ArrayList;

import com.mycompany.nectardaserra.entity.Avaliacao;
import com.mycompany.nectardaserra.service.DataBase;

public class InfoScreen extends javax.swing.JFrame {

    public InfoScreen(ArrayList<Avaliacao> avas, boolean suqueiro, String title, float media) {
        initComponents(avas, suqueiro, title, media);
    }

    private void initComponents(ArrayList<Avaliacao> avas, boolean suqueiro, String title, float media) {

        lblTitle = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();


        lblTitle.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTitle.setText(title);

        lblNota.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        if(suqueiro){
            lblNota.setText("");
        }else{
            String notaMedia = String.format("%.2f", media);
            lblNota.setText("Nota: " + notaMedia);
        }

        ArrayList<AvaPanel> paineis = new ArrayList<>();

        for(int i=0; i<avas.size(); i++){
            Avaliacao a = avas.get(i);
            String title2, comment;
            float nota;
            if(suqueiro){
                String title3 = a.getSuco();
                title2 = DataBase.juiceName(title3);
            }else{
                title2 = a.getUsuario();
            }
            nota = a.getNota();
            comment = a.getComentario();
            AvaPanel aux = new AvaPanel(title2, nota, comment);
            paineis.add(aux);
        }

        AvaPanel[] avalias = paineis.toArray(new AvaPanel[0]);
        
        list.setModel(new javax.swing.AbstractListModel<AvaPanel>() {
            public int getSize() { return avalias.length; }
            public AvaPanel getElementAt(int i) { return avalias[i]; }
        });

        list.setCellRenderer(new javax.swing.ListCellRenderer<AvaPanel>() {
            @Override
            public java.awt.Component getListCellRendererComponent(
                    javax.swing.JList<? extends AvaPanel> list,
                    AvaPanel value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {
                if (isSelected) {
                    value.setBackground(list.getSelectionBackground());
                    value.setForeground(list.getSelectionForeground());
                } else {
                    value.setBackground(list.getBackground());
                    value.setForeground(list.getForeground());
                }
                value.setEnabled(list.isEnabled());
                value.setFont(list.getFont());
                value.setOpaque(true);
                return value;
            }
        });

        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                        .addComponent(lblNota)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(InfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoScreen(null, true, "", 0).setVisible(true);
            }
        });
    }

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<AvaPanel> list;
}
