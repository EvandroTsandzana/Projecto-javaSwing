/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelobeans;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTable extends AbstractTableModel {
    private ArrayList Linhas=null;
    private String[] colunas=null;
    
    public ModeloTable(ArrayList lin,String[] col){
    setLinhas(lin);
    setColunas(col);
    }

    /**
     * @return the Linhas
     */
    public ArrayList getLinhas() {
        return Linhas;
    }

    /**
     * @param Linhas the Linhas to set
     */
    public void setLinhas(ArrayList Linhas) {
        this.Linhas = Linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return Linhas.size();
    }
    public String getColumnName(int numcol){
        return colunas[numcol];
    }
    public Object getValueAt(int numlin,int numcol){
        Object[]Linhas=(Object[])getLinhas().get(numlin);
        return Linhas[numcol];
    }
        public boolean isCellEditatable(int rowIndex,int columnIndex){
        return false;
    }
    public Object getSelecionado(int rowIndex){
        return Linhas.get(rowIndex);
    }
    public void refreshData(List<ModAtleta> novoAtleta){
        this.Linhas=(ArrayList) novoAtleta;
        fireTableDataChanged();
    }
    public void limpar(){
        Linhas.clear();
        fireTableDataChanged();
    }
    public boolean isEmpty(){
        return Linhas.isEmpty();
    }
    
}
