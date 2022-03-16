/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModeloTable;
import Modelobeans.beans_user;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.Daouser;

/**
 *
 * @author Evandro
 */
public class InternaListUser extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
beans_user se=new beans_user();
Daouser er=new Daouser();

    /**
     * Creates new form InternaListUser
     */
    public InternaListUser() {
        initComponents();
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
          preencherTabela("Select *from usuario order by codigoU");
          designerTa();
    }
    
     private void designerTa(){
        tbdados.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        tbdados.getTableHeader().setOpaque(false);
        tbdados.getTableHeader().setBackground(new Color(51,51,51));
        tbdados.getTableHeader().setForeground(new Color(255,255,255));
        tbdados.setRowHeight(25);
    }

     public void preencherTabela(String sql){
       ArrayList dados=new ArrayList();
       String[] colunas=new String[]{"Codigo","Usuario","Tipo","Senha"};
       conex.Conexao();
     conex.executeSql(sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("CodigoU"),conex.rs.getString("nome"),conex.rs.getString("tipo"),conex.rs.getString("senha")});
           }while(conex.rs.next());
       }catch(SQLException ex){
           //JOptionPane.showMessageDialog(rootPane,"erro ao preencher arraylist"+ex);
       }
      ModeloTable modelo=new ModeloTable(dados,colunas);
     tbdados.setModel(modelo);
       tbdados.getColumnModel().getColumn(0).setPreferredWidth(160);
       tbdados.getColumnModel().getColumn(0).setResizable(false);
       tbdados.getColumnModel().getColumn(1).setPreferredWidth(320);
       tbdados.getColumnModel().getColumn(1).setResizable(false);
       tbdados.getColumnModel().getColumn(2).setPreferredWidth(310);
       tbdados.getColumnModel().getColumn(2).setResizable(false);
       tbdados.getColumnModel().getColumn(3).setPreferredWidth(305);
       tbdados.getColumnModel().getColumn(3).setResizable(false);
       tbdados.getTableHeader().setReorderingAllowed(false);
       tbdados.setAutoResizeMode(tbdados.AUTO_RESIZE_OFF);
       tbdados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       conex.Desconectar();
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desp = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        btcancelar = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btremover = new javax.swing.JButton();
        btviualizar = new javax.swing.JButton();

        desp.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jButton1.setText("Pesquisar");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        tbdados.setBackground(new java.awt.Color(255, 255, 255));
        tbdados.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbdados.setForeground(new java.awt.Color(0, 0, 0));
        tbdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbdados.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbdados.setRowHeight(25);
        tbdados.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tbdados.setShowVerticalLines(false);
        tbdados.getTableHeader().setReorderingAllowed(false);
        tbdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdados);

        btcancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        bteditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bteditar.setText("Editar");
        bteditar.setEnabled(false);
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btremover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btremover.setText("Remover");
        btremover.setEnabled(false);
        btremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverActionPerformed(evt);
            }
        });

        btviualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btviualizar.setText("Visualizar");
        btviualizar.setEnabled(false);
        btviualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(562, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btviualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btremover, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelar)
                    .addComponent(bteditar)
                    .addComponent(btremover)
                    .addComponent(btviualizar))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        desp.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout despLayout = new javax.swing.GroupLayout(desp);
        desp.setLayout(despLayout);
        despLayout.setHorizontalGroup(
            despLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 124, Short.MAX_VALUE))
        );
        despLayout.setVerticalGroup(
            despLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
      btcancelar.setEnabled(false);
      bteditar.setEnabled(false);
      btremover.setEnabled(false);
      btviualizar.setEnabled(false);
        preencherTabela("Select *from usuario order by codigoU");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdadosMouseClicked
      btcancelar.setEnabled(true);
      bteditar.setEnabled(true);
      btremover.setEnabled(true);
      btviualizar.setEnabled(true);
    }//GEN-LAST:event_tbdadosMouseClicked

    private void btremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverActionPerformed
     int resposta=0;
   String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    resposta=JOptionPane.showConfirmDialog(rootPane,"Deseja realmente remover esse dado?");
    if(resposta==JOptionPane.YES_OPTION){
        se.setNome(nome);
        er.remover(se);
             preencherTabela("Select *from usuario order by codigoU");    
    }
    }//GEN-LAST:event_btremoverActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
      String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
   conex.Conexao();
    conex.executeSql("select *from usuario where nome='"+nome+"'");
    InternalUsuario rt=new InternalUsuario();    
    desp.add(rt);
    rt.show();
    try{
        conex.rs.first();
        rt.getCodigo().setText(String.valueOf(conex.rs.getInt("CodigoU")));
        rt.getUser().setText(conex.rs.getString("Nome"));
       rt.getTipo().setSelectedItem(conex.rs.getString("tipo"));
       rt.getsenha().setText(conex.rs.getString("Senha"));
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
    }
    rt.getCancelar().setEnabled(true);
    rt.getGravar().setEnabled(true);
    rt.getNovo().setEnabled(false);
    rt.getUser().setEnabled(true);
    rt.getsenha().setEnabled(true);
    rt.getTipo().setEnabled(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btviualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviualizarActionPerformed
     telauser tu=new telauser();
     tu.setVisible(true);
        String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    conex.Conexao();
    conex.executeSql("select *from usuario where nome='"+nome+"'");
    try{
        conex.rs.first();
        tu.getCod().setText(String.valueOf(conex.rs.getInt("codigoU")));
        tu.getuser().setText(conex.rs.getString("Nome"));
        tu.getTipo().setText(conex.rs.getString("tipo"));
        tu.getSenha().setText(conex.rs.getString("senha"));
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
    }
    btcancelar.setEnabled(false);
      bteditar.setEnabled(false);
      btremover.setEnabled(false);
      btviualizar.setEnabled(false);
       preencherTabela("Select *from usuario order by codigoU");
    }//GEN-LAST:event_btviualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btremover;
    private javax.swing.JButton btviualizar;
    private javax.swing.JDesktopPane desp;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
