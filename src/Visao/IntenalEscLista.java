/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModEscalao;
import Modelobeans.ModeloTable;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.ContEscalao;

/**
 *
 * @author Evandro
 */
public class IntenalEscLista extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
ModEscalao mod=new ModEscalao();
ContEscalao esc=new ContEscalao();
    /**
     * Creates new form IntenalEscLista
     */
    public IntenalEscLista() {
        initComponents();
        //((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        preencherTabela("Select *from escalao order by CodigoE");
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
       String[] colunas=new String[]{"Codigo","Nome","dias de treino","Tempo de treino"};
       conex.Conexao();
       conex.executeSql(sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("CodigoE"),conex.rs.getString("nome"),conex.rs.getString("diastreino"),conex.rs.getString("tempo")});
           }while(conex.rs.next());
       }catch(SQLException ex){
           //JOptionPane.showMessageDialog(rootPane,"Procure outro escalao");
       }
       ModeloTable modelo=new ModeloTable(dados,colunas);
       tbdados.setModel(modelo);
       tbdados.getColumnModel().getColumn(0).setPreferredWidth(180);
       tbdados.getColumnModel().getColumn(0).setResizable(false);
       tbdados.getColumnModel().getColumn(1).setPreferredWidth(305);
       tbdados.getColumnModel().getColumn(1).setResizable(false);
       tbdados.getColumnModel().getColumn(2).setPreferredWidth(310);
       tbdados.getColumnModel().getColumn(2).setResizable(false);
       tbdados.getColumnModel().getColumn(3).setPreferredWidth(310);
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

        dp = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        btvisualizar = new javax.swing.JButton();
        btremove = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btpes = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

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

        btvisualizar.setBackground(new java.awt.Color(153, 153, 153));
        btvisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btvisualizar.setText("Visualizar");
        btvisualizar.setBorder(null);
        btvisualizar.setEnabled(false);
        btvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvisualizarActionPerformed(evt);
            }
        });

        btremove.setBackground(new java.awt.Color(153, 153, 153));
        btremove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btremove.setText("Remover");
        btremove.setBorder(null);
        btremove.setEnabled(false);
        btremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoveActionPerformed(evt);
            }
        });

        bteditar.setBackground(new java.awt.Color(153, 153, 153));
        bteditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bteditar.setText("Editar");
        bteditar.setBorder(null);
        bteditar.setEnabled(false);
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btcancelar.setBackground(new java.awt.Color(153, 153, 153));
        btcancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btcancelar.setText("Cancelar");
        btcancelar.setBorder(null);
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btpes.setBackground(new java.awt.Color(153, 153, 153));
        btpes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btpes.setText("Pesquisar");
        btpes.setBorder(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btremove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btpes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btpes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btvisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btremove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        dp.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoveActionPerformed
    int resposta=0;
   String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    resposta=JOptionPane.showConfirmDialog(rootPane,"Deseja realmente remover esse dado?");
    if(resposta==JOptionPane.YES_OPTION){
        mod.setNome(nome);
     esc.remover(mod);
             preencherTabela("Select *from escalao order by codigoE");    
    }
    }//GEN-LAST:event_btremoveActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
    String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
   conex.Conexao();
    conex.executeSql("select *from escalao where nome='"+nome+"'");
    InternalEscalao rt=new InternalEscalao();    
    dp.add(rt);
    rt.show();
    try{
        conex.rs.first();
        rt.getcod().setText(String.valueOf(conex.rs.getInt("CodigoE")));
        rt.getTxtescalao().setText(conex.rs.getString("Nome"));
       rt.getdia().setText(conex.rs.getString("diastreino"));
       rt.gettp().setText(conex.rs.getString("tempo"));
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
    }
    rt.getbtnovo().setEnabled(false);
    rt.getgravar().setEnabled(true);
    rt.getcancelar().setEnabled(true);
    rt.getTxtescalao().setEnabled(true);
    rt.getdia().setEnabled(true);
    rt.gettp().setEnabled(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void tbdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdadosMouseClicked
     btvisualizar.setEnabled(true);
     bteditar.setEnabled(true);
     btcancelar.setEnabled(true);
     btremove.setEnabled(true);
    }//GEN-LAST:event_tbdadosMouseClicked

    private void btvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvisualizarActionPerformed
     telaescalao te=new telaescalao();
                te.setVisible(true);
                 String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    conex.Conexao();
    conex.executeSql("select *from escalao where nome='"+nome+"'");
    try{
        conex.rs.first();
        te.gett().setText(String.valueOf(conex.rs.getInt("codigoE")));
        te.getnome().setText(conex.rs.getString("Nome"));
        te.getdias().setText(conex.rs.getString("diastreino"));
        te.gethr().setText(conex.rs.getString("tempo"));
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
    }
    }//GEN-LAST:event_btvisualizarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        btvisualizar.setEnabled(false);
     bteditar.setEnabled(false);
     btcancelar.setEnabled(false);
     btremove.setEnabled(false);
        preencherTabela("Select *from escalao order by CodigoE");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btpes;
    private javax.swing.JButton btremove;
    private javax.swing.JButton btvisualizar;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
