package com.mycompany.nectardaserra.pages;

import java.util.ArrayList;

import com.mycompany.nectardaserra.classes.Avaliacao;
import com.mycompany.nectardaserra.service.DataBase;

public class JuiceScreen extends javax.swing.JFrame {
    
    public JuiceScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        btn101 = new javax.swing.JButton();
        btn103 = new javax.swing.JButton();
        btn104 = new javax.swing.JButton();
        btn105 = new javax.swing.JButton();
        btn107 = new javax.swing.JButton();
        btn109 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn112 = new javax.swing.JButton();
        btn114 = new javax.swing.JButton();
        btn115 = new javax.swing.JButton();
        btn116 = new javax.swing.JButton();
        btn118 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn121 = new javax.swing.JButton();
        btn125 = new javax.swing.JButton();
        lbl101 = new javax.swing.JLabel();
        lbl103 = new javax.swing.JLabel();
        lbl104 = new javax.swing.JLabel();
        lbl105 = new javax.swing.JLabel();
        lbl107 = new javax.swing.JLabel();
        lbl109 = new javax.swing.JLabel();
        lbl110 = new javax.swing.JLabel();
        lbl111 = new javax.swing.JLabel();
        lbl112 = new javax.swing.JLabel();
        lbl114 = new javax.swing.JLabel();
        lbl115 = new javax.swing.JLabel();
        lbl116 = new javax.swing.JLabel();
        lbl118 = new javax.swing.JLabel();
        lbl120 = new javax.swing.JLabel();
        lbl121 = new javax.swing.JLabel();
        lbl125 = new javax.swing.JLabel();
        obs = new javax.swing.JLabel();
        btn126 = new javax.swing.JButton();
        btn127 = new javax.swing.JButton();
        btn128 = new javax.swing.JButton();
        btn129 = new javax.swing.JButton();
        btn157 = new javax.swing.JButton();
        btn156 = new javax.swing.JButton();
        btn195 = new javax.swing.JButton();
        btn193 = new javax.swing.JButton();
        btn146 = new javax.swing.JButton();
        btn138 = new javax.swing.JButton();
        btn137 = new javax.swing.JButton();
        btn136 = new javax.swing.JButton();
        btn134 = new javax.swing.JButton();
        btn132 = new javax.swing.JButton();
        btn131 = new javax.swing.JButton();
        btn130 = new javax.swing.JButton();
        btn148 = new javax.swing.JButton();
        lbl126 = new javax.swing.JLabel();
        lbl127 = new javax.swing.JLabel();
        lbl128 = new javax.swing.JLabel();
        lbl129 = new javax.swing.JLabel();
        lbl130 = new javax.swing.JLabel();
        lbl131 = new javax.swing.JLabel();
        lbl132 = new javax.swing.JLabel();
        lbl134 = new javax.swing.JLabel();
        lbl136 = new javax.swing.JLabel();
        lbl137 = new javax.swing.JLabel();
        lbl138 = new javax.swing.JLabel();
        lbl146 = new javax.swing.JLabel();
        lbl193 = new javax.swing.JLabel();
        lbl195 = new javax.swing.JLabel();
        lbl156 = new javax.swing.JLabel();
        lbl157 = new javax.swing.JLabel();
        btnPassar = new javax.swing.JButton();
        lbl148 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn101.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn101.setText("101");
        btn101.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn101ActionPerformed(evt);
            }
        });

        btn103.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn103.setText("103");
        btn103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn103ActionPerformed(evt);
            }
        });

        btn104.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn104.setText("104");
        btn104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn104ActionPerformed(evt);
            }
        });

        btn105.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn105.setText("105");
        btn105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn105ActionPerformed(evt);
            }
        });

        btn107.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn107.setText("107");
        btn107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn107ActionPerformed(evt);
            }
        });

        btn109.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn109.setText("109");
        btn109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn109ActionPerformed(evt);
            }
        });

        btn110.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn110.setText("110");
        btn110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn110ActionPerformed(evt);
            }
        });

        btn111.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn111.setText("111");
        btn111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn111ActionPerformed(evt);
            }
        });

        btn112.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn112.setText("112");
        btn112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn112ActionPerformed(evt);
            }
        });

        btn114.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn114.setText("114");
        btn114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn114ActionPerformed(evt);
            }
        });

        btn115.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn115.setText("115");
        btn115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn115ActionPerformed(evt);
            }
        });

        btn116.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn116.setText("116");
        btn116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn116ActionPerformed(evt);
            }
        });

        btn118.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn118.setText("118");
        btn118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn118ActionPerformed(evt);
            }
        });

        btn120.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn120.setText("120");
        btn120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120ActionPerformed(evt);
            }
        });

        btn121.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn121.setText("121");
        btn121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn121ActionPerformed(evt);
            }
        });

        btn125.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn125.setText("125");
        btn125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn125ActionPerformed(evt);
            }
        });

        lbl101.setText("Tangerina natural");

        lbl103.setText("Acerola e laranja");

        lbl104.setText("Caqui e laranja");

        lbl105.setText("Cenoura e laranja");

        lbl107.setText("Goiaba e laranja");

        lbl109.setText("Frutas¹ com laranja");

        lbl110.setText("Mamão e laranja");

        lbl111.setText("Manga e laranja");

        lbl112.setText("Morango e laranja");

        lbl114.setText("Abacaxi, hortelã e laranja");

        lbl115.setText("Acerola, beterraba, cenoura e laranja");

        lbl116.setText("Kiwi, maçã, hortelã e laranja");

        lbl118.setText("Maçã, cenoura e laranja");

        lbl120.setText("Maçã, maracujá e laranja");

        lbl121.setText("Melancia");

        lbl125.setText("Melão, abacaxi, gengibre e laranja");

        obs.setText("1- Mamão, maçã, abacaxi, melão e banana");

        btn126.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn126.setText("126");
        btn126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn126ActionPerformed(evt);
            }
        });

        btn127.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn127.setText("127");
        btn127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn127ActionPerformed(evt);
            }
        });

        btn128.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn128.setText("128");
        btn128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn128ActionPerformed(evt);
            }
        });

        btn129.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn129.setText("129");
        btn129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn129ActionPerformed(evt);
            }
        });

        btn157.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn157.setText("157");
        btn157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn157ActionPerformed(evt);
            }
        });

        btn156.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn156.setText("156");
        btn156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn156ActionPerformed(evt);
            }
        });

        btn195.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn195.setText("195");
        btn195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn195ActionPerformed(evt);
            }
        });

        btn193.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn193.setText("193");
        btn193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn193ActionPerformed(evt);
            }
        });

        btn146.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn146.setText("146");
        btn146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn146ActionPerformed(evt);
            }
        });

        btn138.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn138.setText("138");
        btn138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn138ActionPerformed(evt);
            }
        });

        btn137.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn137.setText("137");
        btn137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn137ActionPerformed(evt);
            }
        });

        btn136.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn136.setText("136");
        btn136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn136ActionPerformed(evt);
            }
        });

        btn134.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn134.setText("134");
        btn134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn134ActionPerformed(evt);
            }
        });

        btn132.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn132.setText("132");
        btn132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn132ActionPerformed(evt);
            }
        });

        btn131.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn131.setText("131");
        btn131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn131ActionPerformed(evt);
            }
        });

        btn130.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn130.setText("130");
        btn130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn130ActionPerformed(evt);
            }
        });

        btn148.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        btn148.setText("148");
        btn148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn148ActionPerformed(evt);
            }
        });

        lbl126.setText("Mamão, banana e laranja");

        lbl127.setText("Mamão, abacaxi, banana e laranja");

        lbl128.setText("Morango, abacaxi e laranja");

        lbl129.setText("Morango, goiaba e laranja");

        lbl130.setText("Morango, kiwi e laranja");

        lbl131.setText("Mamão, framboesa e laranja");

        lbl132.setText("Pêra, maracujá e laranja");

        lbl134.setText("Manga, maracujá e laranja");

        lbl136.setText("Framboesa, amora e laranja");

        lbl137.setText("Mamão, maracujá e laranja");

        lbl138.setText("Pêra, abacaxi e laranja");

        lbl146.setText("Abacaxi, amora e laranja");

        lbl193.setText("Abacaxi, beterraba e laranja");

        lbl195.setText("Suco de uva natural");

        lbl156.setText("Agrião, hortelã, couve, mel e limão");

        lbl157.setText("Rúcula, agrião, brocolis, mel e laranja");

        btnPassar.setText("->");
        btnPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassarActionPerformed(evt);
            }
        });

        lbl148.setText("Maçã verde, maçã fuji, couve, abacaxi, hortelã, e água de côco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl104))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn105, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl105))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn125, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl125))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn121, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl121))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl120))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn118, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl118))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn116, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl116))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl115))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl114))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn112, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl112))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl111))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl110))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn109, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl109))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn107, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl107))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl103)
                                    .addComponent(lbl101, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn130, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl130))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn131, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl131))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn132, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl132))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn134, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl134))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn136, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl136))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn137, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl137))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn138, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl138))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn146, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl146))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn193, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl193))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn195, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl195))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn156, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl156))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn157, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl157))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn129, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl129))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn128, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl128))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn127, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl127))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn126, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl126))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn148, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl148)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(863, 863, 863)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPassar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn101)
                        .addComponent(lbl101))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn126)
                        .addComponent(lbl126)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn103)
                        .addComponent(lbl103))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn127)
                        .addComponent(lbl127)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn104)
                        .addComponent(lbl104))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn128)
                        .addComponent(lbl128)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn105)
                        .addComponent(lbl105))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn129)
                        .addComponent(lbl129)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn130)
                            .addComponent(lbl130))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn131)
                            .addComponent(lbl131))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl110)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn132)
                                .addComponent(lbl132))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn107)
                            .addComponent(lbl107))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn109)
                            .addComponent(lbl109))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn110)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl111)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn134)
                            .addComponent(lbl134)))
                    .addComponent(btn111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn112)
                        .addComponent(lbl112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn136)
                        .addComponent(lbl136)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn114)
                        .addComponent(lbl114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn137)
                        .addComponent(lbl137)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn115)
                            .addComponent(lbl115))
                        .addComponent(btn138, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lbl138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn116)
                        .addComponent(lbl116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn146)
                        .addComponent(lbl146)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn118)
                        .addComponent(lbl118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn193)
                        .addComponent(lbl193)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn120)
                        .addComponent(lbl120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn195)
                        .addComponent(lbl195)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn121)
                        .addComponent(lbl121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn156)
                        .addComponent(lbl156)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn125)
                        .addComponent(lbl125))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn157)
                        .addComponent(lbl157)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn148)
                    .addComponent(lbl148))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(obs)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPassar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn101ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("101", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("101");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn103ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("103", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("103");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn104ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("104", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("104");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn105ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("105", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("105");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn107ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("107", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("107");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn109ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("109", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("109");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn110ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("110", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("110");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn111ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("111", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("111");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn112ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("112", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("112");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn114ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("114", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("114");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn115ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("115", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("115");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn116ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("116", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("116");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn118ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("118", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("118");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("120", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("120");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn121ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("121", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("121");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn125ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("125", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("125");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn126ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("126", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("126");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn127ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("127", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("127");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn128ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("128", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("128");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn129ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("129", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("129");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn157ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("157", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("157");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn156ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("156", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("156");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn195ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("195", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("195");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn193ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("193", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("193");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn146ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("146", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("146");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn138ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("138", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("138");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn137ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("137", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("137");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn136ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("136", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("136");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn134ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("134", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("134");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn132ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("132", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("132");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn131ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("131", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("131");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn130ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("130", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("130");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btn148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn148ActionPerformed
        ArrayList<Avaliacao> a = DataBase.readAvas("148", false);
        float media = DataBase.calcMedia(a);
        String title = DataBase.juiceName("148");
        InfoScreen info = new InfoScreen(a, false, title, media);
        info.setVisible(true);
    }

    private void btnPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassarActionPerformed
        UserScreen userScreen = new UserScreen();
        userScreen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPassarActionPerformed

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
            java.util.logging.Logger.getLogger(JuiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuiceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuiceScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btn101;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn105;
    private javax.swing.JButton btn107;
    private javax.swing.JButton btn109;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn112;
    private javax.swing.JButton btn114;
    private javax.swing.JButton btn115;
    private javax.swing.JButton btn116;
    private javax.swing.JButton btn118;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn121;
    private javax.swing.JButton btn125;
    private javax.swing.JButton btn126;
    private javax.swing.JButton btn127;
    private javax.swing.JButton btn128;
    private javax.swing.JButton btn129;
    private javax.swing.JButton btn130;
    private javax.swing.JButton btn131;
    private javax.swing.JButton btn132;
    private javax.swing.JButton btn134;
    private javax.swing.JButton btn136;
    private javax.swing.JButton btn137;
    private javax.swing.JButton btn138;
    private javax.swing.JButton btn146;
    private javax.swing.JButton btn148;
    private javax.swing.JButton btn156;
    private javax.swing.JButton btn157;
    private javax.swing.JButton btn193;
    private javax.swing.JButton btn195;
    private javax.swing.JButton btnPassar;
    private javax.swing.JLabel lbl101;
    private javax.swing.JLabel lbl103;
    private javax.swing.JLabel lbl104;
    private javax.swing.JLabel lbl105;
    private javax.swing.JLabel lbl107;
    private javax.swing.JLabel lbl109;
    private javax.swing.JLabel lbl110;
    private javax.swing.JLabel lbl111;
    private javax.swing.JLabel lbl112;
    private javax.swing.JLabel lbl114;
    private javax.swing.JLabel lbl115;
    private javax.swing.JLabel lbl116;
    private javax.swing.JLabel lbl118;
    private javax.swing.JLabel lbl120;
    private javax.swing.JLabel lbl121;
    private javax.swing.JLabel lbl125;
    private javax.swing.JLabel lbl126;
    private javax.swing.JLabel lbl127;
    private javax.swing.JLabel lbl128;
    private javax.swing.JLabel lbl129;
    private javax.swing.JLabel lbl130;
    private javax.swing.JLabel lbl131;
    private javax.swing.JLabel lbl132;
    private javax.swing.JLabel lbl134;
    private javax.swing.JLabel lbl136;
    private javax.swing.JLabel lbl137;
    private javax.swing.JLabel lbl138;
    private javax.swing.JLabel lbl146;
    private javax.swing.JLabel lbl148;
    private javax.swing.JLabel lbl156;
    private javax.swing.JLabel lbl157;
    private javax.swing.JLabel lbl193;
    private javax.swing.JLabel lbl195;
    private javax.swing.JLabel obs;
}
