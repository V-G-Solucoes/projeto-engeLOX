/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fiveacademy.projetoengeloxmaven;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author Vittor
 */
public class Interface extends javax.swing.JFrame {

    public OperacoesModel operacoesModel = new OperacoesModel();

    /**
     * Creates new form Interface
     */
    
    public Interface() {
        setLocationRelativeTo(null);
        initComponents();
    }

    private void AddDigitInOperation(String digit) {
        if (digit == "+" || digit == "-" || digit == "/" || digit == "*" || digit == ".") {

            if (!operacoesModel.isLastDigitASpecialOperator()) {
                operacoesModel.setOperation(digit);
            }
        } else if (digit == ")") {
            operacoesModel.verifySinAndCos();

        } else {
            operacoesModel.setOperation(digit);
        }

        updateOperationInformationOnScreen();

    }

    private void updateOperationInformationOnScreen() {
        LabelResult.setText(operacoesModel.getOperation());
    }

    private void updateResultInformationOnScreen() {
        LabelResult.setText(operacoesModel.getResult());
    }
    
    private void updateResultTempInformationOnScreen(){
        LabelResult.setText(operacoesModel.getTempOperationResult());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnPlus = new javax.swing.JButton();
        BtnMultiplication = new javax.swing.JButton();
        BtnEquals = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnDel = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        BtnDot = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        BtnLess = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        LabelResult = new javax.swing.JLabel();
        BtnCos = new javax.swing.JButton();
        BtnAc = new javax.swing.JButton();
        BtnParentesesDir = new javax.swing.JButton();
        BtnParentesesEsq = new javax.swing.JButton();
        BtnSin1 = new javax.swing.JButton();
        BtnMLess = new javax.swing.JButton();
        BtnMReset = new javax.swing.JButton();
        BtnMEquals = new javax.swing.JButton();
        BtnMPlus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        BtnPlus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnPlus.setText("+");
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        BtnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnMultiplication.setText("*");
        BtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicationActionPerformed(evt);
            }
        });

        BtnEquals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEquals.setText("=");
        BtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualsActionPerformed(evt);
            }
        });

        BtnDivision.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnDivision.setText("/");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnDel.setBackground(new java.awt.Color(255, 0, 51));
        BtnDel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnDel.setForeground(new java.awt.Color(255, 255, 255));
        BtnDel.setText("DEL");
        BtnDel.setIconTextGap(10);
        BtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        BtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnDot.setText(" .\n\n "); // NOI18N
        BtnDot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDotActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        BtnLess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnLess.setText("-");
        BtnLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLessActionPerformed(evt);
            }
        });

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        LabelResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelResult.setText("0.0");
        LabelResult.setToolTipText("");
        LabelResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        LabelResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LabelResult.setVerifyInputWhenFocusTarget(false);

        BtnCos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCos.setText("Cos");
        BtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCosActionPerformed(evt);
            }
        });

        BtnAc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnAc.setText("AC");
        BtnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcActionPerformed(evt);
            }
        });

        BtnParentesesDir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnParentesesDir.setText(")");
        BtnParentesesDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParentesesDirActionPerformed(evt);
            }
        });

        BtnParentesesEsq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnParentesesEsq.setText("(");
        BtnParentesesEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParentesesEsqActionPerformed(evt);
            }
        });

        BtnSin1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSin1.setText("Sen");
        BtnSin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSin1ActionPerformed(evt);
            }
        });

        BtnMLess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnMLess.setText("M-");
        BtnMLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMLessActionPerformed(evt);
            }
        });

        BtnMReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnMReset.setText("MC");
        BtnMReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMResetActionPerformed(evt);
            }
        });

        BtnMEquals.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnMEquals.setText("MRC");
        BtnMEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMEqualsActionPerformed(evt);
            }
        });

        BtnMPlus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnMPlus.setText("M+");
        BtnMPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMPlusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setText("RESULTADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnSin1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnMPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnCos, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(BtnMLess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnMEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(BtnParentesesEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnParentesesDir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnMReset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(BtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(BtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAc, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMLess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnSin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnParentesesEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnParentesesDir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 524));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelActionPerformed
        // TODO add your handling code here:
        operacoesModel.deleteLastDigitOperation();
        updateOperationInformationOnScreen();
    }//GEN-LAST:event_BtnDelActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void BtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDotActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation(".");
    }//GEN-LAST:event_BtnDotActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("+");
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLessActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("-");
    }//GEN-LAST:event_BtnLessActionPerformed

    private void BtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualsActionPerformed
        operacoesModel.setResult(true);
        updateResultInformationOnScreen();
        operacoesModel.getAllresults();
    }//GEN-LAST:event_BtnEqualsActionPerformed

    private void BtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicationActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("*");
    }//GEN-LAST:event_BtnMultiplicationActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("/");
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCosActionPerformed
        AddDigitInOperation("cos(");
    }//GEN-LAST:event_BtnCosActionPerformed

    private void BtnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcActionPerformed
        operacoesModel.clearOperation();
        updateOperationInformationOnScreen();
    }//GEN-LAST:event_BtnAcActionPerformed

    private void BtnParentesesDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParentesesDirActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation(")");
    }//GEN-LAST:event_BtnParentesesDirActionPerformed

    private void BtnParentesesEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParentesesEsqActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("(");
    }//GEN-LAST:event_BtnParentesesEsqActionPerformed

    private void BtnSin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSin1ActionPerformed
        // TODO add your handling code here:
        AddDigitInOperation("sin(");
    }//GEN-LAST:event_BtnSin1ActionPerformed

    private void BtnMLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMLessActionPerformed
        // TODO add your handling code here:
        operacoesModel.removeTempOperation();

    }//GEN-LAST:event_BtnMLessActionPerformed

    private void BtnMPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMPlusActionPerformed
        // TODO add your handling code here:
        
        boolean operationStatus = operacoesModel.setResult(false);
        
        if (operationStatus) {
            operacoesModel.setTempOperation();
        }

        operacoesModel.getTempOperation();
    }//GEN-LAST:event_BtnMPlusActionPerformed

    private void BtnMResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMResetActionPerformed
        // TODO add your handling code here:
        operacoesModel.resetTempOperation();
    }//GEN-LAST:event_BtnMResetActionPerformed

    private void BtnMEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMEqualsActionPerformed
        // TODO add your handling code here:
        operacoesModel.setTempOperationResult();
        updateResultTempInformationOnScreen();
        operacoesModel.getAllresults();
        
    }//GEN-LAST:event_BtnMEqualsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Abre o painel com os resultados anteriores
        ListaDeResultados resultFrame = new ListaDeResultados();
        setLocationRelativeTo(null);
        resultFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnAc;
    private javax.swing.JButton BtnCos;
    private javax.swing.JButton BtnDel;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnDot;
    private javax.swing.JButton BtnEquals;
    private javax.swing.JButton BtnLess;
    private javax.swing.JButton BtnMEquals;
    private javax.swing.JButton BtnMLess;
    private javax.swing.JButton BtnMPlus;
    private javax.swing.JButton BtnMReset;
    private javax.swing.JButton BtnMultiplication;
    private javax.swing.JButton BtnParentesesDir;
    private javax.swing.JButton BtnParentesesEsq;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnSin1;
    private javax.swing.JLabel LabelResult;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
