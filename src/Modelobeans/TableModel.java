 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelobeans;

import java.util.List;
import Modelobeans.ModAtleta;
import javax.swing.table.AbstractTableModel;
//import modeloConection.ConexaoBD;

public class TableModel extends AbstractTableModel {
    public static final long serialVersionUID=-1324567823435L;  
    private List<ModAtleta> Lista;
    private String[] colunas={"Nome","codigo","sexo","data","Morada","Encarregado","Contacto","Escalao","Modalidade","altura","Peso","posicao"};
    
  // public TableAtleta(){
       
   //}
    
    public TableModel(List<ModAtleta> lista){
        this.Lista=lista;
    }

    @Override
    public int getRowCount() {
      return Lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return String.class;
    } 
    public void setValuet(Object avalue,int rowIndex,int columnIndex){
        ModAtleta mod=Lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                mod.setCodigo(Integer.parseInt(avalue.toString()));
                break;
            case 1:
                mod.setNome(avalue.toString());
                break;
            case 2:
                mod.setSexo(avalue.toString());
                break;
            case 3:
                mod.setDatanasce(avalue.toString());
                break;
            case 4:
                mod.setMorada(avalue.toString());
                break;
            case 5:
     mod.setContacto(Long.parseLong(avalue.toString()));
                break;
            case 6:
                 mod.setEscalao(Integer.parseInt(avalue.toString()));
                break;
            case 7:
                 mod.setModalidade(Integer.parseInt(avalue.toString()));
                break;
            default:
                System.err.println("Indice de colunas Invalido");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     ModAtleta modSelecionado=Lista.get(rowIndex);
     Object valueObject=null;
     
     switch(columnIndex){
         case 0:
             valueObject = modSelecionado.getCodigo();
             break;
         case 1:
             valueObject = modSelecionado.getNome();
             break;
         case 2:
             valueObject = modSelecionado.getSexo();
             break;
         case 3:
            valueObject = modSelecionado.getDatanasce();
            break;
         case 4:
                valueObject = modSelecionado.getNrdoc();
             break;
         case 5:
             valueObject = modSelecionado.getMorada();
             break;
         case 6:
          valueObject = modSelecionado.getContacto();
             break;
         case 7:
             valueObject = modSelecionado.getEscalao();
             break;
         case 8:
              valueObject = modSelecionado.getModalidade();
             break;
         default:
             
     }
     
     return valueObject;
    }
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex){
        return false;
    }
    public Object getSelecionado(int rowIndex){
        return Lista.get(rowIndex);
    }
    public void refreshData(List<ModAtleta> novoAtleta){
        this.Lista=novoAtleta;
        fireTableDataChanged();
    }
    public void limpar(){
        Lista.clear();
        fireTableDataChanged();
    }
    public boolean isEmpty(){
        return Lista.isEmpty();
    }
    
}
