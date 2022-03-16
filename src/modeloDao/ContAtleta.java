/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;
import modeloConection.ConexaoBD;
import javax.sql.*;
import java.sql.PreparedStatement;
import Modelobeans.ModAtleta;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ContAtleta {
 ConexaoBD conex=new ConexaoBD();
 ModAtleta Atl=new ModAtleta();

  public void save(ModAtleta Atl){
       conex.Conexao();
      try{
     PreparedStatement stm=conex.con.prepareStatement("insert into atleta (CodigoA,Nome,imagen,sexo,datanasce,nrdoc,morada,contacto,EscalaoID,modalidadeID,altura,peso) values (?,?,?,?,?,?,?,?,?,?,?,?)");
     stm.setInt(1,Atl.getCodigo());
     stm.setString(2,Atl.getNome());
     stm.setBytes(3,Atl.getImagen());
     stm.setString(4,Atl.getSexo());
     stm.setString(5,Atl.getDatanasce());
     stm.setString(6,Atl.getNrdoc());
     stm.setString(7,Atl.getMorada());
     stm.setLong(8,Atl.getContacto());
     stm.setInt(9,Atl.getEscalao());
     stm.setInt(10,Atl.getModalidade());
     stm.setDouble(11,Atl.getAltura());
     stm.setDouble(12,Atl.getPeso());
     stm.execute();
        JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null,"erro ao inserir os dados"+ex.getMessage());
        }
      conex.Desconectar();

      }
  public void remover(ModAtleta atl){
  conex.Conexao();
  try{
      PreparedStatement stm=conex.con.prepareStatement("DELETE FROM atleta where CodigoA=?");
      stm.setInt(1,atl.getCodigo());
      stm.execute();
    JOptionPane.showMessageDialog(null,"dados removidos");  
  }catch(SQLException ex){
      JOptionPane.showMessageDialog(null,"erro ao remover os dados"+ex.getMessage());
  }
  }
  public void editar(ModAtleta atl){
      conex.Conexao();
      try{
          PreparedStatement stm=conex.con.prepareStatement("Update atleta set nome=? , sexo=? ,datanasce=? ,nrdoc=? , morada=?  , contacto=? , EscalaoID=? , modalidadeID=? , altura=? , peso=? ,  where codigoA=? ");
          stm.setString(1,atl.getNome());
          //stm.setBytes(2,atl.getImagen());
          stm.setString(2,atl.getSexo());
          stm.setString(3,atl.getDatanasce());
          stm.setString(4,atl.getNrdoc());
          stm.setString(5,atl.getMorada());
          stm.setLong(6,atl.getContacto());
          stm.setInt(7,atl.getEscalao());
          stm.setInt(8,atl.getModalidade());
          stm.setDouble(9,atl.getAltura());
          stm.setDouble(10,atl.getPeso());
          stm.setInt(11,atl.getCodigo());
          stm.execute();
           JOptionPane.showMessageDialog(null,"dados alterados");  
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"erro ao alterar os dados"+ex.getMessage());
      }
      conex.Desconectar();
  }
 /* public List<ModAtleta> Listar(){
      conex.Conexao();
      List<ModAtleta> lista=new ArrayList<ModAtleta>();
      try{
           PreparedStatement stm=conex.con.prepareStatement("select *FROM atleta");
          ResultSet rs=stm.executeQuery();
          
          while(rs.next()){
              ModAtleta atl=new ModAtleta();
              atl.setCodigo(rs.getInt("codigoA"));
              atl.setNome(rs.getString("nome"));
             // atl.setImagen(rs.getBytes("imagen"));
              atl.setSexo(rs.getString("sexo"));
              atl.setDatanasce(rs.getString("datanasce"));
              atl.setIdentidade(rs.getString("identidde"));
              atl.setNrdoc(rs.getInt("nrdoc"));
              atl.setMorada(rs.getString("morada"));
              atl.setEncarregado(rs.getString("Encarregado"));
              atl.setContacto(rs.getInt("contacto"));
              atl.setEscalao(rs.getInt("escalaoID"));
              atl.setModalidade(rs.getInt("modalidadeID"));
              atl.setAltura(rs.getDouble("altura"));
              atl.setPeso(rs.getDouble("peso"));
              atl.setPosicao(rs.getString("posicao"));
              
              lista.add(atl);
              
          }
      }catch(SQLException ex){
          
      }

      return lista;
  }*/
   public ResultSet escalao(){
        conex.Conexao();
        ResultSet escalao=null;
        try{
            PreparedStatement stm=conex.con.prepareStatement("select *from escalao");
            escalao=stm.executeQuery();
      //  JOptionPane.showMessageDialog(null,"selecionado"); 
        }catch(SQLException ex){
//JOptionPane.showMessageDialog(null,"selecionado\n"+ex.getMessage()); 
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

}
