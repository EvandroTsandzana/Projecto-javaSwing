/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author Evandro
 */
import Modelobeans.beans_user;
//import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import modeloConection.ConexaoBD;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Acessar {
    ConexaoBD conex=new ConexaoBD();
    
    
    public ResultSet carrega(){
        conex.Conexao();
        ResultSet p=null;
        try{
             PreparedStatement stm=conex.con.prepareStatement("Select nome from usuario");
              p=stm.executeQuery();
    if(p.next()){
            
              //  tela.setVisible(true);
    }else{
        FrmPrincipal pri=new FrmPrincipal();
        pri.setVisible(true);
    }
        }catch(SQLException r){
           JOptionPane.showMessageDialog(null,r.getMessage());
        }
        return p;
    } 
  
}