/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.Ficha;
import Modelobeans.ModeloTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.ContFicha;

/**
 *
 * @author Evandro
 */
public class InternalistFicha extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
Ficha fc=new Ficha();
ContFicha cf=new ContFicha();
    /**
     * Creates new form InternalistFicha
     */
    public InternalistFicha() {
        initComponents();
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
         preencherTabela("Select *from ficha order by codigo");
         designerTa();
    }
    
     private void designerTa(){
        tbdados.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        tbdados.getTableHeader().setOpaque(false);
        tbdados.getTableHeader().setBackground(new Color(51,51,51));
        tbdados.getTableHeader().setForeground(new Color(255,255,255));
        tbdados.setRowHeight(25);
    }
    
    class JPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
           Graphics2D g2d=(Graphics2D) g;
           int width=getWidth();
           int Height=getHeight();
           
           Color color1=new Color(51,51,51);
           Color color2=new Color(187,187,187);
           GradientPaint gp=new GradientPaint(0,0,color1,180,Height,color2);
           g2d.setPaint(gp);
           g2d.fillRect(0,0, width, Height);
    }
    }
     
     public void preencherTabela(String sql){
       ArrayList dados=new ArrayList();
       String[] colunas=new String[]{"Codigo","Nome","Nr de Jogos","Escalao","Modalidade","Posicao","Golos Marcados","Golos Sofridos","numero Pontos","Cartao Amarelo","Cartao Vermelho","Ano"};
       conex.Conexao();
       conex.executeSql(sql);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getInt("Codigo"),conex.rs.getString("nome"),conex.rs.getInt("Nrjogos"),conex.rs.getInt("escalao"),conex.rs.getInt("modalidade"),conex.rs.getString("pos"),conex.rs.getInt("golosM"),conex.rs.getInt("golosS"),conex.rs.getInt("nump"),conex.rs.getInt("cartaoA"),conex.rs.getInt("cartaoV"),conex.rs.getInt("Ano")});
           }while(conex.rs.next());
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(rootPane,"erro ao preencher arraylist"+ex.getMessage());
       }
       ModeloTable modelo=new ModeloTable(dados,colunas);
       tbdados.setModel(modelo);
       tbdados.getColumnModel().getColumn(0).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(0).setResizable(false);
       tbdados.getColumnModel().getColumn(1).setPreferredWidth(150);
       tbdados.getColumnModel().getColumn(1).setResizable(false);
       tbdados.getColumnModel().getColumn(2).setPreferredWidth(80);
       tbdados.getColumnModel().getColumn(2).setResizable(false);
        tbdados.getColumnModel().getColumn(3).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(3).setResizable(false);
        tbdados.getColumnModel().getColumn(4).setPreferredWidth(60);
       tbdados.getColumnModel().getColumn(4).setResizable(false);
       tbdados.getColumnModel().getColumn(5).setPreferredWidth(85);
       tbdados.getColumnModel().getColumn(5).setResizable(false);
       tbdados.getColumnModel().getColumn(6).setPreferredWidth(85);
       tbdados.getColumnModel().getColumn(6).setResizable(false);
       tbdados.getColumnModel().getColumn(7).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(7).setResizable(false);
        tbdados.getColumnModel().getColumn(8).setPreferredWidth(96);
       tbdados.getColumnModel().getColumn(8).setResizable(false);
       tbdados.getColumnModel().getColumn(9).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(9).setResizable(false);
       tbdados.getColumnModel().getColumn(10).setPreferredWidth(100);
       tbdados.getColumnModel().getColumn(10).setResizable(false);
        tbdados.getColumnModel().getColumn(11).setPreferredWidth(95);
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

        desa = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btremover = new javax.swing.JButton();
        btvisualizar = new javax.swing.JButton();

        desa.setBackground(new java.awt.Color(102, 102, 102));

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

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Pesuisar");

        btcancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(0, 0, 0));
        btcancelar.setText("Cancelar");
        btcancelar.setEnabled(false);
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        bteditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bteditar.setForeground(new java.awt.Color(0, 0, 0));
        bteditar.setText("Editar");
        bteditar.setEnabled(false);
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btremover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btremover.setForeground(new java.awt.Color(0, 0, 0));
        btremover.setText("Remover");
        btremover.setEnabled(false);
        btremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverActionPerformed(evt);
            }
        });

        btvisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btvisualizar.setForeground(new java.awt.Color(0, 0, 0));
        btvisualizar.setText("Visualizar");
        btvisualizar.setEnabled(false);

        desa.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(btcancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(bteditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(btremover, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desa.setLayer(btvisualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desaLayout = new javax.swing.GroupLayout(desa);
        desa.setLayout(desaLayout);
        desaLayout.setHorizontalGroup(
            desaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(desaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desaLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desaLayout.createSequentialGroup()
                        .addComponent(btvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btremover, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        desaLayout.setVerticalGroup(
            desaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(desaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(desaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(desaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelar)
                    .addComponent(bteditar)
                    .addComponent(btremover)
                    .addComponent(btvisualizar))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desa)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desa)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdadosMouseClicked
     btcancelar.setEnabled(true);
     bteditar.setEnabled(true);
     btremover.setEnabled(true);
     btvisualizar.setEnabled(true);
    }//GEN-LAST:event_tbdadosMouseClicked

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        btcancelar.setEnabled(false);
     bteditar.setEnabled(false);
     btremover.setEnabled(false);
     btvisualizar.setEnabled(false);
     preencherTabela("Select *from ficha order by codigo");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverActionPerformed
      int resposta=0;
        String nom=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
        resposta=JOptionPane.showConfirmDialog(rootPane,"Deseja realmente remover esse dado?");
        if(resposta==JOptionPane.YES_OPTION){
           fc.setNome(nom);
           cf.remover(fc);
          preencherTabela("Select *from ficha order by codigo");
        }
         btcancelar.setEnabled(false);
     bteditar.setEnabled(false);
     btremover.setEnabled(false);
     btvisualizar.setEnabled(false);
    }//GEN-LAST:event_btremoverActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
      String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
        conex.Conexao();
        conex.executeSql("select *from ficha where nome='"+nome+"'");
        InternalFicha rt=new InternalFicha();
        desa.add(rt);
        rt.show();
        try{
            conex.rs.first();
            rt.cod().setText(String.valueOf(conex.rs.getInt("codigo")));
            rt.nome().setText(conex.rs.getString("nome"));
            rt.cartA().setText(String.valueOf(conex.rs.getInt("cartaoA")));
            rt.cartV().setText(String.valueOf(conex.rs.getInt("cartaoV")));
            rt.golM().setText(String.valueOf(conex.rs.getInt("GolosM")));
            rt.golS().setText(String.valueOf(conex.rs.getInt("GolosS")));
            rt.nump().setText(String.valueOf(conex.rs.getInt("Nump")));
            rt.num().setText(String.valueOf(conex.rs.getInt("nrjogos")));
            rt.pos().setText(conex.rs.getString("pos"));
            rt.ano().setText(String.valueOf(conex.rs.getInt("ano")));
            int a,p;
            a=conex.rs.getInt("Escalao");
            p=conex.rs.getInt("modalidade");
            conex.executeSql("Select nome From escalao where codigoE=" + a + "");
        conex.rs.first();
        rt.esc().setSelectedItem(conex.rs.getString("Nome"));
        conex.executeSql("Select nome From modalidade where codigoM=" + p + "");
        conex.rs.first();
        rt.mod().setSelectedItem(conex.rs.getString("Nome"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao selecionar os dados\n"+ex.getMessage());
        }
        rt.novo().setEnabled(false);
        rt.grava().setEnabled(true);
        rt.cancela().setEnabled(true);
        rt.cod().setEnabled(true);
        rt.nome().setEnabled(true);
        rt.esc().setEnabled(true);
        rt.mod().setEnabled(true);
        rt.pos().setEnabled(true);
        rt.ano().setEnabled(true);
        rt.cartA().setEnabled(true);
        rt.cartV().setEnabled(true);
        rt.golM().setEnabled(true);
        rt.golS().setEnabled(true);
        rt.num().setEnabled(true);
        rt.nump().setEnabled(true);
        
    }//GEN-LAST:event_bteditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btremover;
    private javax.swing.JButton btvisualizar;
    private javax.swing.JDesktopPane desa;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
