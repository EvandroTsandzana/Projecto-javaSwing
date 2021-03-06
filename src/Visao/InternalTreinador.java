/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModEscalao;
import Modelobeans.Modalidade;
import Modelobeans.beans_treinador;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.ContTreinador;

/**
 *
 * @author Evandro
 */
public class InternalTreinador extends javax.swing.JInternalFrame {
ConexaoBD conex =new ConexaoBD();
beans_treinador  tr=new  beans_treinador();
ContTreinador ct=new ContTreinador();
Modalidade mods=new Modalidade();
ModEscalao esca=new ModEscalao();
int flag=0;
    /**
     * Creates new form InternalTreinador
     */
    public InternalTreinador() {
        initComponents();
         setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        this.carregarEscalao();
        this.carregarmodalidade();
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
    
    public JTextField getcod(){
    return txtcodigo;
}
    
    public JTextField nome(){
    return txtnome;
}
    public JTextField data(){
    return txtdata;
}
    public JTextField cont(){
    return txtcont;
}
    public JTextField mo(){
    return txtmorada;
}
    public JTextField num(){
    return txtnum;
}
    public JComboBox esc(){
    return cbesc;
}
     public JComboBox mod(){
    return cbmod;
}
        
      public JRadioButton fem(){
         return  rbfem;
      }
       public JRadioButton masc(){
         return  rbmasc;
      }
       public JButton novo(){
           return novo;
       }
        public JButton gravar(){
           return grava;
       }
         public JButton cancela(){
           return cancela;
       }
       
      
     
     private int verifica(String dado){
     conex.Conexao();
        ResultSet rs = ct.escalao();
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
               JOptionPane.showMessageDialog(null,se.getMessage());
           }
           return id;
    }
 private int verificas(String dado){
        ResultSet rs = ct.Modalidade();
           int id=0;
           try{
           rs.beforeFirst();
           while(rs.next()){
               if(rs.getString("nome").equalsIgnoreCase(dado)){
                   id=rs.getInt("codigoM");
                   break;
               }
           }
           }catch(SQLException se){
               JOptionPane.showMessageDialog(null,se.getMessage());
           }
           return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskt = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmorada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbmasc = new javax.swing.JRadioButton();
        rbfem = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbesc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbmod = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new JPanelGradient();
        novo = new javax.swing.JButton();
        grava = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        deskt.setBackground(new java.awt.Color(51, 51, 51));
        deskt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 20));

        txtcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcodigo.setEnabled(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 67, 164, 30));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 20));

        txtnome.setBackground(new java.awt.Color(204, 204, 204));
        txtnome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnome.setForeground(new java.awt.Color(0, 0, 0));
        txtnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtnome.setEnabled(false);
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 67, 280, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data de Nascimento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 133, 20));

        txtdata.setBackground(new java.awt.Color(204, 204, 204));
        txtdata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdata.setForeground(new java.awt.Color(0, 0, 0));
        txtdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtdata.setEnabled(false);
        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });
        jPanel1.add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 67, 200, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Morada");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 143, 20));

        txtmorada.setBackground(new java.awt.Color(204, 204, 204));
        txtmorada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtmorada.setForeground(new java.awt.Color(0, 0, 0));
        txtmorada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtmorada.setEnabled(false);
        jPanel1.add(txtmorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 280, 30));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 53, 27));

        rbmasc.setBackground(new java.awt.Color(204, 204, 204));
        rbmasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbmasc.setForeground(new java.awt.Color(0, 0, 0));
        rbmasc.setText("Masculino");
        rbmasc.setEnabled(false);
        jPanel1.add(rbmasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        rbfem.setBackground(new java.awt.Color(204, 204, 204));
        rbfem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbfem.setForeground(new java.awt.Color(0, 0, 0));
        rbfem.setText("Femenino");
        rbfem.setEnabled(false);
        jPanel1.add(rbfem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contactos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 128, -1));

        txtcont.setBackground(new java.awt.Color(204, 204, 204));
        txtcont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcont.setForeground(new java.awt.Color(0, 0, 0));
        txtcont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcont.setEnabled(false);
        jPanel1.add(txtcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 240, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Numero de Documento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 161, 25));

        txtnum.setBackground(new java.awt.Color(204, 204, 204));
        txtnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnum.setForeground(new java.awt.Color(0, 0, 0));
        txtnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtnum.setEnabled(false);
        jPanel1.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 280, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Escalao");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 20));

        cbesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbesc.setForeground(new java.awt.Color(0, 0, 0));
        cbesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbesc.setEnabled(false);
        cbesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbescActionPerformed(evt);
            }
        });
        jPanel1.add(cbesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 280, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Modalidade");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 191, 20));

        cbmod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbmod.setForeground(new java.awt.Color(0, 0, 0));
        cbmod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmod.setEnabled(false);
        cbmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmodActionPerformed(evt);
            }
        });
        jPanel1.add(cbmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 280, 31));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 280, 1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 200, 1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 240, 1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 280, 1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 280, 1));

        deskt.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 78, 849, 451));

        novo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        grava.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        grava.setText("Gravar");
        grava.setEnabled(false);
        grava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaActionPerformed(evt);
            }
        });

        cancela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancela.setText("Cancelar");
        cancela.setEnabled(false);
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grava, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(grava, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        deskt.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 78, 200, 451));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Table Tennis_48px.png"))); // NOI18N
        jLabel7.setText("Sport Gerentior");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registro do Treinador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307)
                .addComponent(jLabel11)
                .addGap(0, 415, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        deskt.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1109, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deskt)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskt)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        flag=1;
        txtcodigo.setEnabled(true);
        txtnome.setEnabled(true);
        txtdata.setEnabled(true);
        txtmorada.setEnabled(true);
        txtcont.setEnabled(true);
        rbmasc.setEnabled(true);
        rbfem.setEnabled(true);
        txtnum.setEnabled(true);
        cbesc.setEnabled(true);
        cbmod.setEnabled(true);
        grava.setEnabled(true);
        cancela.setEnabled(true);
        novo.setEnabled(false);
        txtcodigo.setText("");
        txtcont.setText("");
        txtdata.setText("");
        txtmorada.setText("");
        txtnome.setText("");
        txtnum.setText("");
        rbmasc.setSelected(false);
        rbfem.setSelected(false);
    }//GEN-LAST:event_novoActionPerformed

    private void cbescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbescActionPerformed
        try {
            ResultSet rs = ct.escalaoBaynome(cbesc.getSelectedItem().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_cbescActionPerformed

    private void cbmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmodActionPerformed
          try {
            ResultSet rs = ct.ModalidadeBaynome(cbmod.getSelectedItem().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_cbmodActionPerformed

    private void gravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaActionPerformed
        if(txtcodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo Codigo");
            txtcodigo.requestFocus();
        }else
             if(txtnome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo nome");
            txtnome.requestFocus();
        }else
              if(txtdata.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo Data de Nascimento");
            txtdata.requestFocus();
        }else
              if(txtcont.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo Contacto");
            txtcont.requestFocus();
        }else
              if(txtmorada.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo Morada");
            txtmorada.requestFocus();
        }else
             if(txtnum.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"preencha o campo numero do documento");
            txtnum.requestFocus();
        }else
                 if(flag==1){
                     tr.setCodigo(Integer.parseInt(txtcodigo.getText()));
                     tr.setNome(txtnome.getText());
                     tr.setData(txtdata.getText());
                     tr.setMorada(txtmorada.getText());
                     tr.setSexo(rbmasc.isSelected()?rbmasc.getText():rbfem.getText());
                     tr.setEscalao(verifica((String)cbesc.getSelectedItem()));
                     tr.setModalidade(verificas((String)cbmod.getSelectedItem()));
                     tr.setContacto(Integer.parseInt(txtcont.getText()));
                     tr.setNrdoc(txtnum.getText());
                     ct.gravar(tr);
                      txtcodigo.setEnabled(false);
                    txtnome.setEnabled(false);
                    txtdata.setEnabled(false);
                   txtmorada.setEnabled(false);
                   txtcont.setEnabled(false);
                   rbmasc.setEnabled(false);
                   rbfem.setEnabled(false);
                   txtnum.setEnabled(false);
                   cbesc.setEnabled(false);
                   cbmod.setEnabled(false);
                  grava.setEnabled(false);
                 cancela.setEnabled(false);
                 novo.setEnabled(true);
                      txtcodigo.setText("");
                      txtcont.setText("");
                       txtdata.setText("");
                       txtmorada.setText("");
                        txtnome.setText("");
                        txtnum.setText("");
                        rbmasc.setSelected(false);
                        rbfem.setSelected(false);
                 }else{
                     tr.setCodigo(Integer.parseInt(txtcodigo.getText()));
                     tr.setNome(txtnome.getText());
                     tr.setData(txtdata.getText());
                     tr.setMorada(txtmorada.getText());
                     tr.setSexo(rbmasc.isSelected()?rbmasc.getText():rbfem.getText());
                     tr.setEscalao(verifica((String)cbesc.getSelectedItem()));
                     tr.setModalidade(verificas((String)cbmod.getSelectedItem()));
                     tr.setContacto(Integer.parseInt(txtcont.getText()));
                     tr.setNrdoc(txtnum.getText());
                     ct.editar(tr);
                     txtcodigo.setEnabled(false);
                    txtnome.setEnabled(false);
                    txtdata.setEnabled(false);
                   txtmorada.setEnabled(false);
                   txtcont.setEnabled(false);
                   rbmasc.setEnabled(false);
                   rbfem.setEnabled(false);
                   txtnum.setEnabled(false);
                   cbesc.setEnabled(false);
                   cbmod.setEnabled(false);
                  grava.setEnabled(false);
                 cancela.setEnabled(false);
                 novo.setEnabled(true);
                      txtcodigo.setText("");
                      txtcont.setText("");
                       txtdata.setText("");
                       txtmorada.setText("");
                        txtnome.setText("");
                        txtnum.setText("");
                        rbmasc.setSelected(false);
                        rbfem.setSelected(false);
                        
                 }
    }//GEN-LAST:event_gravaActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        txtcodigo.setEnabled(false);
                    txtnome.setEnabled(false);
                    txtdata.setEnabled(false);
                   txtmorada.setEnabled(false);
                   txtcont.setEnabled(false);
                   rbmasc.setEnabled(false);
                   rbfem.setEnabled(false);
                   txtnum.setEnabled(false);
                   cbesc.setEnabled(false);
                   cbmod.setEnabled(false);
                  grava.setEnabled(false);
                 cancela.setEnabled(false);
                 novo.setEnabled(true);
                      txtcodigo.setText("");
                      txtcont.setText("");
                       txtdata.setText("");
                       txtmorada.setText("");
                        txtnome.setText("");
                        txtnum.setText("");
                        rbmasc.setSelected(false);
                        rbfem.setSelected(false);
    }//GEN-LAST:event_cancelaActionPerformed


    
     public void carregarEscalao(){
      try {
            ResultSet rs = ct.escalao();
           rs.beforeFirst();
          
           
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                esca.setCodigo(rs.getInt("codigoE"));
                esca.setNome(rs.getString("nome"));
                try{
                    cbesc.addItem((String)(Object)(esca.getNome()));
                }catch(NullPointerException np){
                    
                }
                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro no preenchimento do combo box");
            ex.printStackTrace();
              
        }   
    }
 public void carregarmodalidade(){
      try {
            ResultSet rs = ct.Modalidade();
           rs.beforeFirst();
          
           
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                mods.setCodigo(rs.getInt("codigoM"));
                mods.setNome(rs.getString("nome"));
                try{
                    cbmod.addItem((String)(Object)(mods.getNome()));
                }catch(NullPointerException np){
                    
                }
                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro no preenchimento do combo box");
            ex.printStackTrace();
              
        }   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancela;
    private javax.swing.JComboBox<String> cbesc;
    private javax.swing.JComboBox<String> cbmod;
    private javax.swing.JDesktopPane deskt;
    private javax.swing.JButton grava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton novo;
    private javax.swing.JRadioButton rbfem;
    private javax.swing.JRadioButton rbmasc;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtmorada;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
