/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelobeans;

import java.sql.ResultSet;
import Modelobeans.Modalidade;
import modeloDao.ContModalidade;
import modeloConection.ConexaoBD;

/**
 *
 * @author Evandro
 */
public class Modalidade {
  private int codigo;
 private String nome;
 private int escalao;
 private String pesquisar;

    /**

     * @return the condigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param condigo the condigo to set
     */
    public void setCodigo(int condigo) {
        this.codigo = condigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the escalao
     */
    public int getEscalao() {
        return escalao;
    }

    /**
     * @param escalao the escalao to set
     */
    public void setEscalao(int escalao) {
        this.escalao = escalao;
    }

    /**
     * @return the pesquisar
     */
    public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
   
 
}
