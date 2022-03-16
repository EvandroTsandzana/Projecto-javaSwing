/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import Modelobeans.Ficha;
import java.sql.PreparedStatement;
import javax.sql.*;
import javax.swing.*;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Evandro
 */
public class ContFicha {
    ConexaoBD conex=new ConexaoBD();
    Ficha fic=new Ficha();
    
    public void gravar(Ficha fic){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("insert into ficha(codigo,nome,nrjogos,escalao,modalidade,pos,golosM,golosS,nump,cartaoA,cartaoV,ano)  values(?,?,?,?,?,?,?,?,?,?,?,?)"); 
            stm.setInt(1,fic.getCodigo());
            stm.setString(2,fic.getNome());
            stm.setInt(3,fic.getNrjogos());
            stm.setInt(4,fic. getEscalao());
            stm.setInt(5,fic. getModalidade());
            stm.setString(6,fic. getPos());
            stm.setInt(7,fic.getGolosM());
            stm.setInt(8,fic.getGolosS());
            stm.setInt(9,fic. getNump());
            stm.setInt(10,fic.getCartaoA());
            stm.setInt(11,fic.getCartaoV());
            stm.setInt(12,fic.getAno());
            stm.execute();
            JOptionPane.showMessageDialog(null,"inserido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao inserir\n"+ex.getMessage());
        }
    }
    public Ficha BuscaFicha(Ficha fic){
        conex.Conexao();
        conex.executeSql("select *from ficha where nome like'%"+fic.getPesquisar()+"%'");
        try{
            conex.rs.first();
            fic.setCodigo(conex.rs.getInt("codigo"));
            fic.setNome(conex.rs.getString("nome"));
            fic.setNrjogos(conex.rs.getInt("nrjogos"));
            fic.setEscalao(conex.rs.getInt("escalao"));
            fic.setModalidade(conex.rs.getInt("modalidade"));
            fic.setPos(conex.rs.getString("pos"));
            fic.setGolosM(conex.rs.getInt("golosM"));
            fic.setGolosS(conex.rs.getInt("golosS"));
            fic.setNump(conex.rs.getInt("nump"));
            fic.setCartaoA(conex.rs.getInt("cartaoA"));
            fic.setCartaoV(conex.rs.getInt("cartaoV"));
            fic.setAno(conex.rs.getInt("ano"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return fic;
    }
     public void editar(Ficha fic){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update ficha set nome=?, Nrjogos=?,Escalao=?,modalidade=?,pos=?,golosM=? , golosS=?,nump=? , cartaoA=?  , cartaoV=? , ano=?  where codigo=?");
             stm.setString(1,fic.getNome());
             stm.setInt(2,fic.getNrjogos());
             stm.setInt(3,fic. getEscalao());
            stm.setInt(4,fic. getModalidade());
            stm.setString(5,fic. getPos());
             stm.setInt(6,fic.getGolosM());
             stm.setInt(7,fic.getGolosS());
              stm.setInt(8,fic. getNump());
             stm.setInt(9,fic.getCartaoA());
             stm.setInt(10,fic.getCartaoV());
             stm.setInt(11,fic.getAno());
              stm.setInt(12,fic.getCodigo());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados editados com sucesso");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao editar dados:\n"+ex.getMessage());
            
            }
        
        conex.Desconectar();
    }
      public void remover(Ficha fic){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from ficha where nome=? ");
            stm.setString(1,fic.getNome());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover o dado\n"+ex.getMessage());
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
}
