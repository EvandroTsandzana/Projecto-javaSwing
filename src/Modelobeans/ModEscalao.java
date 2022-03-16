/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelobeans;
public class ModEscalao {
private int codigo;
private String nome;
private String diastreino;
private String tempo;
private String Pesquisar;


    public ModEscalao() {
    }

    public ModEscalao(int codigo, String nome, String diastreino, String tempo, String Pesquisar) {
        this.codigo = codigo;
        this.nome = nome;
        this.diastreino = diastreino;
        this.tempo = tempo;
        this.Pesquisar = Pesquisar;
    }



    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the diastreino
     */
    public String getDiastreino() {
        return diastreino;
    }

    /**
     * @param diastreino the diastreino to set
     */
    public void setDiastreino(String diastreino) {
        this.diastreino = diastreino;
    }

    /**
     * @return the tempo
     */
    public String getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the Pesquisar
     */
    public String getPesquisar() {
        return Pesquisar;
    }

    /**
     * @param Pesquisar the Pesquisar to set
     */
    public void setPesquisar(String Pesquisar) {
        this.Pesquisar = Pesquisar;
    }


}
