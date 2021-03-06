/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelobeans.ModCalendario;
import Modelobeans.ModeloTable;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modeloConection.ConexaoBD;
import modeloDao.Contcalendario;

/**
 *
 * @author Evandro
 */
public class InternaListCalendario extends javax.swing.JInternalFrame {
ConexaoBD conex=new ConexaoBD();
ModCalendario cale=new ModCalendario();
Contcalendario cal=new Contcalendario();


    /**
     * Creates new form InternaListCalendario
     */
    public InternaListCalendario() {
        initComponents();
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        this.preencher("Select *from Calendario order by Jornada ");
        designerTa();
    }
    
    
     private void designerTa(){
        tbdados.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        tbdados.getTableHeader().setOpaque(false);
        tbdados.getTableHeader().setBackground(new Color(51,51,51));
        tbdados.getTableHeader().setForeground(new Color(255,255,255));
        tbdados.setRowHeight(25);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        depes = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        btcancelar = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btremove = new javax.swing.JButton();
        btvisualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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

        btremove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btremove.setText("Remover");
        btremove.setEnabled(false);
        btremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoveActionPerformed(evt);
            }
        });

        btvisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btvisualizar.setText("Visualizar");
        btvisualizar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btvisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btremove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bteditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btvisualizar)
                    .addComponent(btremove)
                    .addComponent(bteditar)
                    .addComponent(btcancelar))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        depes.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout depesLayout = new javax.swing.GroupLayout(depes);
        depes.setLayout(depesLayout);
        depesLayout.setHorizontalGroup(
            depesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        depesLayout.setVerticalGroup(
            depesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(depes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depes)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencher(String n){
      ArrayList dados=new ArrayList();
       String[] colunas=new String[]{"Jogo","Jornada","Campo","Data","Modalidade","Escalao"};
       conex.Conexao();
       conex.executeSql(n);
       try{
           conex.rs.first();
           do{
               dados.add(new Object[]{conex.rs.getString("jogo"),conex.rs.getString("Jornada"),conex.rs.getString("Campo"),conex.rs.getString("data"),conex.rs.getInt("Modalidade"),conex.rs.getInt("Escalao")});
           }while(conex.rs.next());
       }catch(SQLException ex){
         //  JOptionPane.showMessageDialog(rootPane,"Procure outro escalao\n"+ex.getMessage());
       }
       ModeloTable modelo=new ModeloTable(dados,colunas);
       tbdados.setModel(modelo);
       tbdados.getColumnModel().getColumn(0).setPreferredWidth(300);
       tbdados.getColumnModel().getColumn(0).setResizable(false);
       tbdados.getColumnModel().getColumn(1).setPreferredWidth(150);
       tbdados.getColumnModel().getColumn(1).setResizable(false);
       tbdados.getColumnModel().getColumn(2).setPreferredWidth(300);
       tbdados.getColumnModel().getColumn(2).setResizable(false);
       tbdados.getColumnModel().getColumn(3).setPreferredWidth(200);
       tbdados.getColumnModel().getColumn(3).setResizable(false);
       tbdados.getColumnModel().getColumn(4).setPreferredWidth(90);
       tbdados.getColumnModel().getColumn(4).setResizable(false);
       tbdados.getColumnModel().getColumn(5).setPreferredWidth(70);
       tbdados.getColumnModel().getColumn(5).setResizable(false);
       tbdados.getTableHeader().setReorderingAllowed(false);
       tbdados.setAutoResizeMode(tbdados.AUTO_RESIZE_OFF);
       tbdados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       conex.Desconectar();  
    }
    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
      btcancelar.setEnabled(false);
      bteditar.setEnabled(false);
      btremove.setEnabled(false);
      btvisualizar.setEnabled(false);
     preencher("Select *from Calendario order by Jornada ");
    }//GEN-LAST:event_btcancelarActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
   
    }//GEN-LAST:event_bteditarActionPerformed

    private void tbdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdadosMouseClicked
       btcancelar.setEnabled(true);
      bteditar.setEnabled(true);
      btremove.setEnabled(true);
      btvisualizar.setEnabled(true);
    }//GEN-LAST:event_tbdadosMouseClicked

    private void btremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoveActionPerformed
      int resposta=0;
   String nome=""+tbdados.getValueAt(tbdados.getSelectedRow(),1);
    resposta=JOptionPane.showConfirmDialog( null,"Deseja realmente remover esse dado?");
    if(resposta==JOptionPane.YES_OPTION){
     cale.setJogo(nome);
     cal.remover(cale);
       btvisualizar.setEnabled(false);
      btcancelar.setEnabled(false);
     btremove.setEnabled(false);
      bteditar.setEnabled(false);
       preencher("Select *from Calendario order by Jornada ");
    }
    }//GEN-LAST:event_btremoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btremove;
    private javax.swing.JButton btvisualizar;
    private javax.swing.JDesktopPane depes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
