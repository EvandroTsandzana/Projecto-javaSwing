/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Evandro
 */
public class ConexaoBD {
    public PreparedStatement stm;
    public ResultSet rs;
    private String driver="com.mysql.jdbc.driver";
    private String caminho="Jdbc:mysql://localHost:3306/academia";
    private String usuario="root";
    private String senha="";
    public Connection con;
 
    public void Conexao(){
        try{
            System.setProperty("jdbc.drivers",driver);
            con=DriverManager.getConnection(caminho,usuario,senha);
          JOptionPane.showMessageDialog(null,"Conexao Efectuada com sucesso");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao conectar a base de dados:\n"+ex.getMessage());
        }
    }
    public void executeSql(String sql){
        try{
         stm=(PreparedStatement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=stm.executeQuery(sql);
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"Erro ao executar sql:\n"+ex.getMessage());  
        }
    }
    
    public void Desconectar(){
        try{
            con.close();
            //JOptionPane.showMessageDialog(null,"base de dados desconectada");
        }catch (Exception ex){
         JOptionPane.showMessageDialog(null,"erro ao desconectar a base de dados:\n"+ex.getMessage());   
        }
}

   
}