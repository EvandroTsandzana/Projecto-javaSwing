/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import Modelobeans.beans_treinador;
import java.sql.SQLException;
import javax.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class ContTreinador {
    ConexaoBD conex=new ConexaoBD();
    beans_treinador tre=new beans_treinador();
    
    public void gravar(beans_treinador tre){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("insert into treinador(codigoT,nome,sexo,data,morada,contacto,nrdoc,escalao,modalidade) values('"+tre.getCodigo()+"','"
            +tre.getNome()+"','"+tre.getSexo()+"','"+tre.getData()+"','"+tre.getMorada()+"','"+tre.getContacto()+"','"
            +tre.getNrdoc()+"','"+tre.getEscalao()+"','"+tre.getModalidade()+"')");
            stm.execute();
            JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados"+ex.getMessage());
        }
        conex.Desconectar();
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
     PreparedStatement stm=conex.con.prepareStatement("Select *From escalao where nome=?");
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
      public beans_treinador buscatreinador(beans_treinador tre){
        conex.Conexao();
        conex.executeSql("select *from treinador where nome like'%"+tre.getPesquisar()+"%'");
        try{
            conex.rs.first();
            tre.setCodigo(conex.rs.getInt("codigoT"));
            tre.setNome(conex.rs.getString("nome"));
            tre.setSexo(conex.rs.getString("sexo"));
            tre.setData(conex.rs.getString("data"));
            tre.setMorada(conex.rs.getString("morada"));
            tre.setContacto(conex.rs.getInt("contacto"));
            tre.setNrdoc(conex.rs.getString("nrdoc"));
            tre.setModalidade(conex.rs.getInt("modalidade"));
            tre.setEscalao(conex.rs.getInt("escalao"));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return tre;
      }
      public void editar(beans_treinador tre){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update treinador set nome=?,sexo=?,data=?,morada=?,contacto=?,nrdoc=?,Escalao=?,modalidade=?  where codigoT=?");
             stm.setString(1,tre.getNome());
             stm.setString(2,tre.getSexo());
             stm.setString(3,tre.getData());
             stm.setString(4,tre.getMorada());
             stm.setInt(5,tre.getContacto());
             stm.setString(6,tre.getNrdoc());
             stm.setInt(7,tre.getEscalao());
             stm.setInt(8,tre.getModalidade());
             stm.setInt(9, tre.getCodigo());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados editados com sucesso");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao editar dados:\n"+ex.getMessage());
            
            }
        
        conex.Desconectar();
}
       public void remover(beans_treinador tre){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from treinador where nome=? ");
            stm.setString(1,tre.getNome());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover dados\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
    }
