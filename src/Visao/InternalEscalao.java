/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModEscalao;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import modeloConection.ConexaoBD;
import modeloDao.ContEscalao;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;

/**
 *
 * @author Evandro
 */
public class InternalEscalao extends javax.swing.JInternalFrame {
ModEscalao esca=new ModEscalao();
ContEscalao ca=new ContEscalao();
ConexaoBD conex=new ConexaoBD();
IntenalEscLista lista=new IntenalEscLista();
int flag=0;

    /**
     * Creates new form InternalEscalao
     */
    public InternalEscalao() {
        initComponents();
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        //((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
     class JPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
           Graphics2D g2d=(Graphics2D) g;
           int width=getWidth();
           int Height=getHeight();
           
           Color color1=new Color(187,187,187);
           Color color2=new Color(51,51,51);
           GradientPaint gp=new GradientPaint(0,0,color1,180,Height,color2);
           g2d.setPaint(gp);
           g2d.fillRect(0,0, width, Height);
    }
    }
    
 public JTextField getTxtescalao() {
        return txtescalao;
    }
 public JTextField getdia(){
     return txtdias;
 }
 public JTextField getcod(){
     return txtcodigo;
 }
 public JTextField gettp(){
 return txttempo;
 }
 
 public JButton getbtnovo(){
     return btnovo;
 }
 public JButton getgravar(){
     return  btgravar;
 }
 public JButton getcancelar(){
     return btcancelar;
 }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlr = new javax.swing.JPanel();
        txtescalao = new javax.swing.JTextField();
        lbescalao = new javax.swing.JLabel();
        txttempo = new javax.swing.JTextField();
        lbtempo = new javax.swing.JLabel();
        lbcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lbdias = new javax.swing.JLabel();
        txtdias = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new JPanelGradient();
        btnovo = new javax.swing.JButton();
        btgravar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Table Tennis_48px.png"))); // NOI18N
        jLabel3.setText("Sport Gerentior");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro do Escalao");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1100, -1));

        pnlr.setBackground(new java.awt.Color(204, 204, 204));
        pnlr.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtescalao.setBackground(new java.awt.Color(204, 204, 204));
        txtescalao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtescalao.setForeground(new java.awt.Color(0, 0, 0));
        txtescalao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtescalao.setToolTipText("");
        txtescalao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtescalao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtescalao.setEnabled(false);
        txtescalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtescalaoActionPerformed(evt);
            }
        });
        pnlr.add(txtescalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 260, 30));

        lbescalao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbescalao.setForeground(new java.awt.Color(0, 0, 0));
        lbescalao.setText("Escalao");
        pnlr.add(lbescalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 148, 25));

        txttempo.setBackground(new java.awt.Color(204, 204, 204));
        txttempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txttempo.setEnabled(false);
        txttempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttempoActionPerformed(evt);
            }
        });
        pnlr.add(txttempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 260, 30));

        lbtempo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbtempo.setForeground(new java.awt.Color(0, 0, 0));
        lbtempo.setText("Horario");
        pnlr.add(lbtempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 200, 30));

        lbcodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(0, 0, 0));
        lbcodigo.setText("Codigo");
        pnlr.add(lbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 157, 25));

        txtcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcodigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcodigo.setEnabled(false);
        pnlr.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 270, 30));

        lbdias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbdias.setForeground(new java.awt.Color(0, 0, 0));
        lbdias.setText("Dias de Treino");
        pnlr.add(lbdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 30));

        txtdias.setBackground(new java.awt.Color(204, 204, 204));
        txtdias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtdias.setForeground(new java.awt.Color(0, 0, 0));
        txtdias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtdias.setEnabled(false);
        pnlr.add(txtdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 260, 30));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pnlr.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 270, 1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pnlr.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 260, 1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pnlr.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 260, 1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pnlr.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 260, 1));

        jPanel2.add(pnlr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 840, 450));

        btnovo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btgravar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btgravar.setText("Gravar");
        btgravar.setEnabled(false);
        btgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgravarActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btgravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btgravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 450));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
   flag=1;
    txtescalao.setEnabled(true);
    txtdias.setEnabled(true);
    txttempo.setEnabled(true);
     btgravar.setEnabled(true);
     btcancelar.setEnabled(true);
     btnovo.setEnabled(false);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgravarActionPerformed
    if( txtescalao.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Campo Escalao vazio");
            txtescalao.requestFocus();
    }else
        if(txtdias.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Campo Dias de Treino vazio");
            txtdias.requestFocus();
        }else
            if(txttempo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Campo Horario vazio vazio");
                txttempo.requestFocus();
            }else
    if(flag==1){
    esca.setNome(txtescalao.getText());
    esca.setDiastreino(txtdias.getText());
    esca.setTempo(txttempo.getText());
    ca.save(esca);
        getTxtescalao().setText("");
        txtdias.setText("");
        txttempo.setText("");
        txtescalao.setEnabled(false);
        txttempo.setEnabled(false);
        txtdias.setEnabled(false);
    btgravar.setEnabled(false);
    btcancelar.setEnabled(false);
    btnovo.setEnabled(true);
    }else{
    esca.setCodigo(Integer.parseInt(txtcodigo.getText()));
    esca.setNome(txtescalao.getText());
    esca.setDiastreino(txtdias.getText());
    esca.setTempo(txttempo.getText());
    ca.editar(esca);
    txtcodigo.setText("");
        txtescalao.setText("");
        txtdias.setText("");
        txttempo.setText("");
        txtescalao.setEnabled(false);
        txttempo.setEnabled(false);
        txtdias.setEnabled(false);
    btgravar.setEnabled(false);
    btcancelar.setEnabled(false);
    btnovo.setEnabled(true);
    // lista.preencherTabela("Select *from escalao order by codigoE");
    }
    }//GEN-LAST:event_btgravarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        getTxtescalao().setEnabled(false);
        txtdias.setEnabled(false);
        txttempo.setEnabled(false);
     btgravar.setEnabled(false);
     btcancelar.setEnabled(false);
     btnovo.setEnabled(true);
     txtcodigo.setText("");
        txtescalao.setText("");
        txtdias.setText("");
        txttempo.setText("");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void txtescalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtescalaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtescalaoActionPerformed

    private void txttempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttempoActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btgravar;
    private javax.swing.JButton btnovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbdias;
    private javax.swing.JLabel lbescalao;
    private javax.swing.JLabel lbtempo;
    private javax.swing.JPanel pnlr;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdias;
    private javax.swing.JTextField txtescalao;
    private javax.swing.JTextField txttempo;
    // End of variables declaration//GEN-END:variables

}