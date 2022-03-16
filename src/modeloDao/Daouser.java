/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import Modelobeans.ModCalendario;
import Modelobeans.ModEscalao;
import Modelobeans.beans_user;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import java.sql.ResultSet;


public class Daouser {
 
     ConexaoBD conex=new ConexaoBD();
    beans_user user=new beans_user();
   
    
    public void gravar(beans_user users){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("insert into usuario(nome,tipo,senha)  values(?,?,?)");
            stm.setString(1,users.getNome());
            stm.setString(2,users.getTipo());
            stm.setString(3,users.getSenha());
            stm.execute();
            JOptionPane.showMessageDialog(null,"inserido");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro na insercao\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
    public beans_user buscaUser(beans_user user){
      conex.Conexao();
        conex.executeSql("select *from usuario where nome like'%"+user.getPesquisar()+"%'");
        try{
            conex.rs.first();
            user.setCodigo(conex.rs.getInt("codigoU"));
            user.setNome(conex.rs.getString("nome"));
            user.setTipo(conex.rs.getString("tipo"));
            user.setSenha(conex.rs.getString("senha"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados:\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return user;
    }
    public ResultSet carregauser(){
     conex.Conexao();
     ResultSet user=null;
        try{
             PreparedStatement stm=conex.con.prepareStatement("Select *from usuario");
             user=stm.executeQuery();
              }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao preencher a tabela\n"+ex.getMessage());
    }
        conex.Desconectar();
        return user;
}
     public void alterar(beans_user use){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update usuario set nome=?,tipo=?,senha=? where codigoU=?");
             stm.setString(1,use.getNome());
             stm.setString(2,use.getTipo());
             stm.setString(3, use.getSenha());
             stm.setInt(4, use.getCodigo());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados editados com sucesso");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao editar dados:\n"+ex.getMessage());
            
            }
        
        conex.Desconectar();
      }
     
     
     public void remover(beans_user user){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from usuario where nome=? ");
            stm.setString(1,user.getNome());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover dados\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
}
     
