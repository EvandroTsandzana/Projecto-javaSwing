/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModeloTable;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;

/**
 *
 * @author Evandro
 */
public class InternalAtletalist extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
    /**
     * Creates new form InternalAtletalist
     */
    public InternalAtletalist() {
        initComponents();
         setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
         preencherTabela("Select * from atleta order by codigoA");
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
       String[] colunas=new String[]{"Codigo","Nome","Sexo","data nascimeto","Nr documento","Morada","Contacto","Escalao","Modalidade","Altura","peso","fotografia"};
       conex.Conexao();
       conex.executeSql(sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("CodigoA"),conex.rs.getString("nome"),conex.rs.getString("sexo"),conex.rs.getString("datanasce"),conex.rs.getInt("nrdoc"),conex.rs.getString("morada"),conex.rs.getInt("contacto"),conex.rs.getInt("EscalaoID"),conex.rs.getInt("modalidadeID"),conex.rs.getDouble("altura"),conex.rs.getDouble("peso"),conex.rs.getString("Imagen")});
           }while(conex.rs.next());
       }catch(SQLException ex){
          // JOptionPane.showMessageDialog(rootPane,"erro ao preencher arraylist"+ex);
       }
       ModeloTable modelo=new ModeloTable(dados,colunas);
       tbdados.setModel(modelo);
       tbdados.getColumnModel().getColumn(0).setPreferredWidth(70);
       tbdados.getColumnModel().getColumn(0).setResizable(false);
       tbdados.getColumnModel().getColumn(1).setPreferredWidth(200);
       tbdados.getColumnModel().getColumn(1).setResizable(false);
       tbdados.getColumnModel().getColumn(2).setPreferredWidth(80);
       tbdados.getColumnModel().getColumn(2).setResizable(false);
       tbdados.getColumnModel().getColumn(3).setPreferredWidth(100);
       tbdados.getColumnModel().getColumn(3).setResizable(false);
       tbdados.getColumnModel().getColumn(4).setPreferredWidth(100);
       tbdados.getColumnModel().getColumn(4).setResizable(false);
       tbdados.getColumnModel().getColumn(5).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(5).setResizable(false);
       tbdados.getColumnModel().getColumn(6).setPreferredWidth(100);
       tbdados.getColumnModel().getColumn(6).setResizable(false);
       tbdados.getColumnModel().getColumn(7).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(7).setResizable(false);
       tbdados.getColumnModel().getColumn(8).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(8).setResizable(false);
       tbdados.getColumnModel().getColumn(9).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(9).setResizable(false);
       tbdados.getColumnModel().getColumn(10).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(10).setResizable(false);
         tbdados.getColumnModel().getColumn(11).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(11).setResizable(false);
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btvisualizar = new javax.swing.JButton();

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

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
        tbdados.setToolTipText("");
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

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Pesquisar");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Editar");
        jButton3.setEnabled(false);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Remover");
        jButton4.setEnabled(false);

        btvisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btvisualizar.setText("Visualizar");
        btvisualizar.setEnabled(false);
        btvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvisualizarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btvisualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btvisualizar)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setBounds(0, 0, 1100, 645);
    }// </editor-fold>//GEN-END:initComponents

    private void btvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvisualizarActionPerformed
    telaAtleta te=new telaAtleta();
    te.setVisible(true);
        String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    conex.Conexao();
    conex.executeSql("select *from atleta where nome='"+nome+"'");
    try{
        conex.rs.first();
        te.getFoto().setText(String.valueOf(conex.rs.getByte("imagem")));
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
    }
    }//GEN-LAST:event_btvisualizarActionPerformed

    private void tbdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdadosMouseClicked
      btvisualizar.setEnabled(true);
    }//GEN-LAST:event_tbdadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btvisualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
