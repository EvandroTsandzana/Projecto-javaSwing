/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.Modalidade;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloDao.ContModalidade;

/**
 *
 * @author Evandro
 */
public class InternalModalidade extends javax.swing.JInternalFrame {
int flag=0;
Modalidade mod=new Modalidade();
ContModalidade ms=new ContModalidade();
    /**
     * Creates new form InternalModalidade
     */
    public InternalModalidade() {
        initComponents();
         setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        this.carregaEscalao();
        bi.setNorthPane(null);
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
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbesc = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new JPanelGradient();
        btnovo = new javax.swing.JButton();
        btgravar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 199, -1));

        txtcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcodigo.setEnabled(false);
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 265, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modalidade");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 214, 20));

        txtmod.setBackground(new java.awt.Color(204, 204, 204));
        txtmod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtmod.setForeground(new java.awt.Color(0, 0, 0));
        txtmod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtmod.setEnabled(false);
        jPanel2.add(txtmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 261, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Escalao");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 221, 20));

        cbesc.setBackground(new java.awt.Color(51, 51, 51));
        cbesc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbesc.setForeground(new java.awt.Color(0, 0, 0));
        cbesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbesc.setEnabled(false);
        cbesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbescActionPerformed(evt);
            }
        });
        jPanel2.add(cbesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 264, 32));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, 1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

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

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 260, 1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Table Tennis_48px.png"))); // NOI18N
        jLabel5.setText("Sport Gerentior");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro da Modalidade");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnovo.setBackground(new java.awt.Color(204, 204, 204));
        btnovo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnovo.setForeground(new java.awt.Color(51, 51, 51));
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btgravar.setBackground(new java.awt.Color(204, 204, 204));
        btgravar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btgravar.setForeground(new java.awt.Color(51, 51, 51));
        btgravar.setText("Gravar");
        btgravar.setEnabled(false);
        btgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgravarActionPerformed(evt);
            }
        });

        btcancelar.setBackground(new java.awt.Color(204, 204, 204));
        btcancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(51, 51, 51));
        btcancelar.setText("Cancelar");
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btgravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btgravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
    flag=1;
   // txtcodigo.setEnabled(true);
    txtmod.setEnabled(true);
    cbesc.setEnabled(true);
    btcancelar.setEnabled(true);
    btgravar.setEnabled(true);
    btnovo.setEnabled(false);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
    txtmod.setEnabled(false);
    cbesc.setEnabled(false);
    btcancelar.setEnabled(false);
    btgravar.setEnabled(false);
    btnovo.setEnabled(true);
    txtcodigo.setText("");
    txtmod.setText("");
    }//GEN-LAST:event_btcancelarActionPerformed
 
    private int verigica(String dado){
        ResultSet rs = ms.carregaEscalao();
           int id=0;
           try{
           rs.beforeFirst();
           while(rs.next()){
               if(rs.getString("nome").equalsIgnoreCase(dado)){
                   id=rs.getInt("codigoE");
                   break;
               }
           }
           }catch(SQLException se){
               se.printStackTrace();
           }
           return id;
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
    
    public JTextField getcod(){
        return txtcodigo; 
    }
    
    public JTextField getmo(){
        return txtmod; 
    }
    
    public JComboBox getesc(){
        return cbesc;
    }
    
    private void btgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgravarActionPerformed
     if(txtmod.getText().isEmpty()){
         JOptionPane.showMessageDialog(rootPane,"Campo modalidade vaziu preencha esse campo primeiro");
         txtmod.requestFocus();
     }else
         if(flag==1){
            // mod.setCodigo(Integer.parseInt(txtcodigo.getText()));
             mod.setNome(txtmod.getText());
             mod.setEscalao(verigica((String) cbesc.getSelectedItem()));
             ms.save(mod);
              txtmod.setEnabled(false);
              cbesc.setEnabled(false);
              btcancelar.setEnabled(false);
              btgravar.setEnabled(false);
              btnovo.setEnabled(true);
             txtmod.setText("");
         }else{
             mod.setCodigo(Integer.parseInt(txtcodigo.getText()));
             mod.setNome(txtmod.getText());
             mod.setEscalao(verigica((String) cbesc.getSelectedItem()));
             ms.editar(mod);
              txtmod.setEnabled(false);
              cbesc.setEnabled(false);
              btcancelar.setEnabled(false);
              btgravar.setEnabled(false);
              btnovo.setEnabled(true);
             txtmod.setText("");
             txtcodigo.setText("");
         }
     
    }//GEN-LAST:event_btgravarActionPerformed

    private void cbescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbescActionPerformed
       try{
           ResultSet rs=ms.escalaoBaynome(cbesc.getSelectedItem().toString());
       }catch(Exception ex){
        ex.printStackTrace();
       }
    }//GEN-LAST:event_cbescActionPerformed

    public void carregaEscalao(){
        try{
            ResultSet rs=ms.carregaEscalao();
            rs.beforeFirst();
            while(rs.next()){
             mod.setCodigo(rs.getInt("CodigoE"));
             mod.setNome(rs.getString("nome"));
             try{
                 cbesc.addItem((String)(mod.getNome()));
             }catch(NullPointerException ns){
                 
             }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "erro no preenchimento do combo box");
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btgravar;
    private javax.swing.JButton btnovo;
    private javax.swing.JComboBox<String> cbesc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtmod;
    // End of variables declaration//GEN-END:variables
}
