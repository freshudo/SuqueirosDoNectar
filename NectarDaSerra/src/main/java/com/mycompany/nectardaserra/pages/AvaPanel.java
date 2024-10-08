package com.mycompany.nectardaserra.pages;

public class AvaPanel extends javax.swing.JPanel {

    public AvaPanel(String title, float nota, String comment) {
        initComponents(title, nota, comment);
    }

    private void initComponents(String title, float nota, String comment) {

        lblTitle = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCom = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        lblTitle.setText(title);

        lblNota.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        String notaMedia = String.format("%.1f", nota);
        lblNota.setText("Nota: " + notaMedia);

        txtCom.setColumns(20);
        txtCom.setRows(5);
        comment = comment.replace('\\', '\n');
        txtCom.setText(comment);
        jScrollPane1.setViewportView(txtCom);

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNota)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtCom;
}
