/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import javax.swing.*;
import javax.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelobeans.ModEscalao;
import Modelobeans.Modalidade;
import Modelobeans.ModCalendario;
import java.sql.PreparedStatement;
/**
 *
 * @author Evandro
 */
public class Contcalendario {
    ConexaoBD conex=new ConexaoBD();
    ModCalendario canl=new ModCalendario();
    ModEscalao esc=new ModEscalao();
    Modalidade mod=new Modalidade();
    
    public void gravar(ModCalendario canl){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("insert into calendario(jogo,Jornada,campo,data,modalidade,escalao)  values('"+canl.getJogo()+"','"+canl.getJornada()+"','"
                    +canl.getCampo()+"','"+canl.getDatahorario()+"','"+canl.getModalidade()+"','"+canl.getEscalao()+"')");
            stm.execute();
             JOptionPane.showMessageDialog(null,"inserido");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro na insercao\n"+ex.getMessage());
        }
    }
    public ResultSet escalao(){
        conex.Conexao();
        ResultSet escalao=null;
        try{
            PreparedStatement stm=conex.con.prepareStatement("select *from escalao");
            escalao=stm.executeQuery();
            
        }catch(SQLException ex){
            
        }
        return escalao;
    }
     public ResultSet escalaoBaynome(String escalao){
       conex.Conexao();
       ResultSet escbay=null;
      try{
     PreparedStatement stm=conex.con.prepareStatement("Select *From escalao where nome=");
     stm.setString(1,escalao);
     escbay=stm.executeQuery();
  }catch(SQLException ex){
      
  }
      return escbay;
}
    public ResultSet Modalidade(){
        conex.Conexao();
        ResultSet modalidade=null;
        try{
            PreparedStatement stm=conex.con.prepareStatement("select *from Modalidade");
            modalidade=stm.executeQuery();
            
        }catch(SQLException ex){
            
        }
        return modalidade;
    }
     public ResultSet ModalidadeBaynome(String Modalidade){
       conex.Conexao();
       ResultSet Moda=null;
      try{
     PreparedStatement stm=conex.con.prepareStatement("Select *From Modalidade where nome=");
     stm.setString(1,Modalidade);
     Moda=stm.executeQuery();
  }catch(SQLException ex){
      
  }
      return Moda;
}
     public ModCalendario buscaCalendario(ModCalendario cal){
        conex.Conexao();
        conex.executeSql("select *from calendario where jornada like'%"+cal.getPesquisar()+"%'");
        try{
            conex.rs.first();
             cal.setJogo(conex.rs.getString("Jogo"));
            cal.setJornada(conex.rs.getString("Jornada"));
            cal.setCampo(conex.rs.getString("campo"));
            cal.setDatahorario(conex.rs.getString("data"));
            cal.setModalidade(conex.rs.getInt("modalidade"));
            cal.setEscalao(conex.rs.getInt("escalao"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return cal;
    }
      public void remover(ModCalendario cal){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from calendario where jogo=? ");
            stm.setString(1,cal.getJogo());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover dados\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
      public void editar(ModCalendario cal){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update calendario set jogo=?,campo=?,data=?,modalidade=?,escalao=? where jornada=?");
             stm.setString(1,cal.getJogo());
             stm.setString(2,cal.getCampo());
             stm.setString(3,cal.getDatahorario());
             stm.setInt(4, cal.getModalidade());
             stm.setInt(5, cal.getEscalao());
             stm.setString(6, cal.getJornada());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados editados com sucesso");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao editar dados:\n"+ex.getMessage());
            
            }
        
        conex.Desconectar();
                }
}
