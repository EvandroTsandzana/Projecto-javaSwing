/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModAtleta;
import Modelobeans.ModEscalao;
import Modelobeans.Modalidade;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.ContAtleta;

/**
 *
 * @author Evandro
 */
public class InternalAtleta extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
ContAtleta conta=new ContAtleta();
ModEscalao atl=new  ModEscalao();
ModAtleta atleta=new ModAtleta();
Modalidade at=new  Modalidade();
int flag=0;
private File imagem;
    /**
     * Creates new form InternalAtleta
     */
    public InternalAtleta() {
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desq = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbfem = new javax.swing.JRadioButton();
        rbmasc = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtmorada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbmod = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbesc = new javax.swing.JComboBox<>();
        txtalt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new JPanelGradient();
        btnovo = new javax.swing.JButton();
        btgravar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        desq.setBackground(new java.awt.Color(51, 51, 51));
        desq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setBackground(new java.awt.Color(51, 51, 51));
        foto.setForeground(new java.awt.Color(51, 51, 51));
        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pho.png"))); // NOI18N
        foto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        foto.setEnabled(false);
        foto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fotoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoMouseClicked(evt);
            }
        });
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 34, 238, 310));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, 23));

        txtcod.setBackground(new java.awt.Color(204, 204, 204));
        txtcod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcod.setForeground(new java.awt.Color(0, 0, 0));
        txtcod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcod.setEnabled(false);
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel1.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 180, -1));

        txtnome.setBackground(new java.awt.Color(204, 204, 204));
        txtnome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnome.setForeground(new java.awt.Color(0, 0, 0));
        txtnome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtnome.setEnabled(false);
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 48, 20));

        rbfem.setBackground(new java.awt.Color(204, 204, 204));
        rbfem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbfem.setForeground(new java.awt.Color(0, 0, 0));
        rbfem.setText("Femenino");
        rbfem.setEnabled(false);
        jPanel1.add(rbfem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, 30));

        rbmasc.setBackground(new java.awt.Color(204, 204, 204));
        rbmasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbmasc.setForeground(new java.awt.Color(0, 0, 0));
        rbmasc.setText("Masculino");
        rbmasc.setEnabled(false);
        jPanel1.add(rbmasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 98, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data de Nascimento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 210, 28));

        txtdata.setBackground(new java.awt.Color(204, 204, 204));
        txtdata.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdata.setForeground(new java.awt.Color(0, 0, 0));
        txtdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtdata.setEnabled(false);
        jPanel1.add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 240, 29));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero do Documento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 155, 26));

        txtnum.setBackground(new java.awt.Color(204, 204, 204));
        txtnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnum.setForeground(new java.awt.Color(0, 0, 0));
        txtnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtnum.setEnabled(false);
        jPanel1.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contactos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 160, 26));

        txtcont.setBackground(new java.awt.Color(204, 204, 204));
        txtcont.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcont.setForeground(new java.awt.Color(0, 0, 0));
        txtcont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtcont.setEnabled(false);
        jPanel1.add(txtcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 240, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Morada");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 110, 25));

        txtmorada.setBackground(new java.awt.Color(204, 204, 204));
        txtmorada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtmorada.setForeground(new java.awt.Color(0, 0, 0));
        txtmorada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtmorada.setEnabled(false);
        jPanel1.add(txtmorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 240, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Modalidade");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 220, 25));

        cbmod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbmod.setForeground(new java.awt.Color(0, 0, 0));
        cbmod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmod.setEnabled(false);
        cbmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmodActionPerformed(evt);
            }
        });
        jPanel1.add(cbmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 31));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Escalao");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 147, 25));

        cbesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbesc.setForeground(new java.awt.Color(0, 0, 0));
        cbesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbesc.setEnabled(false);
        cbesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbescActionPerformed(evt);
            }
        });
        jPanel1.add(cbesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 230, 30));

        txtalt.setBackground(new java.awt.Color(204, 204, 204));
        txtalt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtalt.setForeground(new java.awt.Color(0, 0, 0));
        txtalt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtalt.setEnabled(false);
        txtalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaltActionPerformed(evt);
            }
        });
        jPanel1.add(txtalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 310, 230, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Altura");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 20));

        txtpeso.setBackground(new java.awt.Color(204, 204, 204));
        txtpeso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpeso.setForeground(new java.awt.Color(0, 0, 0));
        txtpeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtpeso.setEnabled(false);
        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });
        jPanel1.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 240, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Peso");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 126, 20));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 230, 1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 240, 1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 240, 1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 230, 1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 240, 1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 240, 1));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 240, 1));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 230, 1));

        desq.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 850, 450));

        btnovo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btgravar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btgravar.setText("Gravar");
        btgravar.setEnabled(false);
        btgravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgravarActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btgravar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btgravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        desq.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 450));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Table Tennis_48px.png"))); // NOI18N
        jLabel8.setText("Sport Gerentior");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro do Atleta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 418, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        desq.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1164, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desq)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desq)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private int verifica(String dado){
     conex.Conexao();
        ResultSet rs = conta.escalao();
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
        ResultSet rs = conta.Modalidade();
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
    
    
    public File selecionarImagen(){
     JFileChooser imag=new JFileChooser();
     FileNameExtensionFilter filtro=new  FileNameExtensionFilter("imagens em JPG e PNG","JPG","PNG");
     imag.addChoosableFileFilter(filtro);
     imag.setAcceptAllFileFilterUsed(false);
     imag.setDialogType(JFileChooser.OPEN_DIALOG);
     imag.setCurrentDirectory(new File("E:"));
     imag.showOpenDialog(this);
     
     return imag.getSelectedFile();
 
 }
    
private byte[] getImagem(){
     boolean isPng=false;
     if(imagem!=null){
         isPng=imagem.getName().endsWith("png");
         try{
             BufferedImage image=ImageIO.read(imagem);
             ByteArrayOutputStream out=new ByteArrayOutputStream();
             int type=BufferedImage.TYPE_INT_RGB;
             if(isPng){
                 type=BufferedImage.BITMASK;
             }
             BufferedImage novaImage=new BufferedImage(foto.getWidth() -5,foto.getHeight() -10, type);
             Graphics2D g=novaImage.createGraphics();
             g.setComposite(AlphaComposite.Src);
             g.drawImage(image,0, 0,foto.getWidth() -5,foto.getHeight() -100,null );
             if(isPng){
                 ImageIO.write(novaImage,"png",out);
                 
             }else{
                 ImageIO.write(novaImage,"JPG",out);
             }
             out.flush();
             byte[] byteArry=out.toByteArray();
             out.close();
             return byteArry;
             
         }catch(IOException ex){
             ex.printStackTrace();
         }
     }
     return null;
 }    
    
    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void cbescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbescActionPerformed
      try {
            ResultSet rs = conta.escalaoBaynome(cbesc.getSelectedItem().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_cbescActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
       flag=1;
       btgravar.setEnabled(true);
       btcancelar.setEnabled(true);
       btnovo.setEnabled(false);
       txtcod.setEnabled(true);
       txtnome.setEnabled(true);
       txtdata.setEnabled(true);
       rbfem.setEnabled(true);
       rbmasc.setEnabled(true);
       txtmorada.setEnabled(true);
       txtcont.setEnabled(true);
       txtnum.setEnabled(true);
       txtpeso.setEnabled(true);
       txtalt.setEnabled(true);
       cbesc.setEnabled(true);
       cbmod.setEnabled(true);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
      btgravar.setEnabled(false);
       btcancelar.setEnabled(false);
       btnovo.setEnabled(true);
       txtcod.setEnabled(false);
       txtnome.setEnabled(false);
       txtdata.setEnabled(false);
       rbfem.setEnabled(false);
       rbmasc.setEnabled(false);
       txtmorada.setEnabled(false);
       txtcont.setEnabled(false);
       txtnum.setEnabled(false);
       txtpeso.setEnabled(false);
       txtalt.setEnabled(false);
       cbesc.setEnabled(false);
       cbmod.setEnabled(false);
       txtcod.setText("");
       txtnome.setText("");
       txtdata.setText("");
       txtcont.setText("");
       txtmorada.setText("");
       txtnum.setText("");
       txtalt.setText("");
       txtpeso.setText("");
      
    }//GEN-LAST:event_btcancelarActionPerformed

    private void cbmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmodActionPerformed
         try {
               ResultSet rs = conta. ModalidadeBaynome(cbmod.getSelectedItem().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cbmodActionPerformed

    private void btgravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgravarActionPerformed
      if(txtcod.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo Codigo primeiro");
          txtcod.requestFocus();
      }else
           if(txtnome.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo nome primeiro");
          txtnome.requestFocus();
      }else
           if(txtdata.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo Data de nascimeto primeiro");
          txtdata.requestFocus();
      }else
          if(txtnum.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo Numero do documento primeiro");
          txtnum.requestFocus();
      }else
          if(txtcont.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo Contactos primeiro");
          txtcont.requestFocus();
      }else
          if(txtmorada.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo Morada primeiro");
          txtmorada.requestFocus();
      }else
               if(txtalt.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo altura primeiro");
          txtalt.requestFocus();
      }else
           if(txtpeso.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Preencha o campo peso primeiro");
          txtpeso.requestFocus();
      }else
          
               if(flag==1){
                   atleta.setCodigo(Integer.parseInt(txtcod.getText()));
                   atleta.setNome(txtnome.getText());
                   atleta.setEscalao(verifica((String)cbesc.getSelectedItem()));
                   atleta.setModalidade(verificas((String)cbmod.getSelectedItem()));
                   atleta.setDatanasce(txtdata.getText());
                   atleta.setContacto(Integer.parseInt(txtcont.getText()));
                   atleta.setNrdoc(txtnum.getText());
                   atleta.setMorada(txtmorada.getText());
                   atleta.setAltura(Double.parseDouble(txtalt.getText()));
                   atleta.setPeso(Double.parseDouble(txtpeso.getText()));
                    atleta.setSexo(rbmasc.isSelected()?rbmasc.getText():rbfem.getText());
                    if(imagem!=null){
                   atleta.setImagen(getImagem());
                conta.save(atleta);
                   btgravar.setEnabled(false);
       btcancelar.setEnabled(false);
       btnovo.setEnabled(true);
       txtcod.setEnabled(false);
       txtnome.setEnabled(false);
       txtdata.setEnabled(false);
       rbfem.setEnabled(false);
       rbmasc.setEnabled(false);
       txtmorada.setEnabled(false);
       txtcont.setEnabled(false);
       txtnum.setEnabled(false);
       txtpeso.setEnabled(false);
       txtalt.setEnabled(false);
       cbesc.setEnabled(false);
       cbmod.setEnabled(false);
       txtcod.setText("");
       txtnome.setText("");
       txtdata.setText("");
       txtcont.setText("");
       txtmorada.setText("");
       txtnum.setText("");
       txtalt.setText("");
       txtpeso.setText("");
       JLabel j=null;
       foto.setIcon((Icon) j);
               }
               }
    }//GEN-LAST:event_btgravarActionPerformed

    private void AbrirImagem(Object source){
    if(source instanceof File){
    ImageIcon Icon=new ImageIcon(imagem.getAbsolutePath());
    Icon.setImage(Icon.getImage().getScaledInstance(foto.getWidth()-5,foto.getHeight()-10, 100));
    foto.setIcon(Icon);
}else if(source instanceof byte[]){
    ImageIcon Icon=new ImageIcon(atleta.getImagen());
    Icon.setImage(Icon.getImage().getScaledInstance(foto.getWidth()-5,foto.getHeight()-10, 100));
    foto.setIcon(Icon);
}
}
    
    private void txtaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaltActionPerformed

    private void fotoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fotoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_fotoAncestorAdded

    private void fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoMouseClicked
        imagem= selecionarImagen();
       AbrirImagem(imagem);    
    }//GEN-LAST:event_fotoMouseClicked

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    
    
    public void carregarEscalao(){
      try {
            ResultSet rs = conta.escalao();
           rs.beforeFirst();
          
           
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                atl.setCodigo(rs.getInt("codigoE"));
                atl.setNome(rs.getString("nome"));
                try{
                    cbesc.addItem((String)(Object)(atl.getNome()));
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
            ResultSet rs = conta.Modalidade();
           rs.beforeFirst();
          
           
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                at.setCodigo(rs.getInt("codigoM"));
                at.setNome(rs.getString("nome"));
                try{
                    cbmod.addItem((String)(Object)(at.getNome()));
                }catch(NullPointerException np){
                    
                }
                
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro no preenchimento do combo box");
            ex.printStackTrace();
              
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btgravar;
    private javax.swing.JButton btnovo;
    private javax.swing.JComboBox<String> cbesc;
    private javax.swing.JComboBox<String> cbmod;
    private javax.swing.JDesktopPane desq;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton rbfem;
    private javax.swing.JRadioButton rbmasc;
    private javax.swing.JTextField txtalt;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtmorada;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
