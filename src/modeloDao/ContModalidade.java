/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import java.sql.ResultSet;
import java.sql.*;
import javax.sql.*;
import java.sql.PreparedStatement;
import Modelobeans.Modalidade;
import java.sql.SQLException;
import javax.swing.*;
public class ContModalidade {
  ConexaoBD conex=new ConexaoBD(); 
  Modalidade moda=new Modalidade();
 
  public void save(Modalidade moda){
       conex.Conexao();
      try{
     PreparedStatement stm=conex.con.prepareStatement("insert into modalidade (Nome,EscalaoID) values('"+moda.getNome()+"','"+moda.getEscalao()+"')");
        stm.execute();
        
        JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados"+ex.getMessage());
        }
      conex.Desconectar();
        
      }
  
  public ResultSet carregaEscalao(){
     conex.Conexao();
     ResultSet esca=null;
      try{
     PreparedStatement stm=conex.con.prepareStatement("select *from escalao");
     esca=stm.executeQuery();
   //  JOptionPane.showMessageDialog(null,"erro do driver");
  }catch(SQLException  ex){
      JOptionPane.showMessageDialog(null,"erro nomanuseamento da Base de dados\n"+ex.getMessage());
  }
      return esca;
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
  public String Baynome(int escalao){
      String nome = "";
      try{
        conex.executeSql("Select nome From escalao where codigoE=" + escalao + "");
        conex.rs.first();
        nome = conex.rs.getString("Nome");
        return nome;
  }catch(SQLException ex){
      
  }
      return nome;
}
  public ResultSet nome(int codigo){
      conex.Conexao();
      ResultSet cod=null;
      try{
          PreparedStatement stm=conex.con.prepareStatement("Select nome from escalao where codigoE=? ");
          stm.setInt(1, codigo);
          cod=stm.executeQuery();
      }catch(SQLException ex){
      }
      return cod;
  }
  public Modalidade buscaModalidade(Modalidade mod){
        conex.Conexao();
        conex.executeSql("select *from modalidade where nome like'%"+mod.getPesquisar()+"%'");
        try{
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigoM"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setEscalao(conex.rs.getInt("escalaoID"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return mod;
    }
   public void editar(Modalidade mod){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update modalidade set nome=?,EscalaoID=? where codigoM=?");
             stm.setString(1,mod.getNome());
             stm.setInt(2,mod.getEscalao());
             stm.setInt(3, mod.getCodigo());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados alterados");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao alteraar os dados:\n"+ex.getMessage());
            }
        conex.Desconectar();
}
    public void remover(Modalidade mod){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from Modalidade where CodigoM=? ");
            stm.setInt(1,mod.getCodigo());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover dados\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
}