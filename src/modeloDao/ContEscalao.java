/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import javax.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Modelobeans.ModEscalao;
import java.sql.SQLException;
import javax.swing.*;
public class ContEscalao {
    ConexaoBD conex=new ConexaoBD();
    ModEscalao Esc=new ModEscalao();
    
    public void save(ModEscalao Esc){
        conex.Conexao();
        try{
        /* PreparedStatement psmt=conex.con.prepareStatement("insert into escalao (Nome,diastreino,tempo) values(?,?,?)");
        psmt.setString(Esc.getNome());
        psmt.setString(Esc.getDiastreino());
        psmt.setString(Esc.getTempo());
        psmt.execute();*/
        PreparedStatement stm=conex.con.prepareStatement("insert into escalao (Nome,diastreino,tempo) values('"+Esc.getNome()+"','"+Esc.getDiastreino()+"','"+
                Esc.getTempo()+"')");
        stm.execute();
        
        JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados"+ex.getMessage());
        }
        conex.Desconectar();
    }
    public ResultSet carregaEscalao(){
     conex.Conexao();
     ResultSet escalao=null;
        try{
             PreparedStatement stm=conex.con.prepareStatement("Select *from escalao");
             escalao=stm.executeQuery();
            //JOptionPane.showMessageDialog(null,"Erro do driver");
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao preencher a tabela\n"+ex.getMessage());
    }
        return escalao;
}
    public void remover(ModEscalao esc){
        conex.Conexao();
        try{
            PreparedStatement stm=conex.con.prepareStatement("delete from escalao where nome=? ");
            stm.setString(1,esc.getNome());
            stm.execute();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao remover dados\n"+ex.getMessage());
        }
        conex.Desconectar();
    }
    public ModEscalao buscaEscalao(ModEscalao mod){
        conex.Conexao();
        conex.executeSql("select *from escalao where nome like'%"+mod.getPesquisar()+"%'");
        try{
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigoE"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setDiastreino(conex.rs.getString("diastreino"));
            mod.setTempo(conex.rs.getString("tempo"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao buscar os dados\n"+ex.getMessage());
            
        }
        
        conex.Desconectar();
        return mod;
    }
    public void editar(ModEscalao mod){
        conex.Conexao();
        try{
             PreparedStatement stm=conex.con.prepareStatement("update escalao set nome=?,diastreino=?,tempo=? where codigoE=?");
             stm.setString(1,mod.getNome());
             stm.setString(2,mod.getDiastreino());
             stm.setString(3, mod.getTempo());
             stm.setInt(4, mod.getCodigo());
             stm.execute();
             JOptionPane.showMessageDialog(null,"dados editados com sucesso");
    }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"erro ao editar dados:\n"+ex.getMessage());
            
            }
        
        conex.Desconectar();
    }
}