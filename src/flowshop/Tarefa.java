/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowshop;

/**
 *
 * @author wylgn
 */
public class Tarefa {
    public int tempo;
    public String nome;
    public String [] maquinas;

    public Tarefa() {
    }

    public Tarefa(int tempo, String nome, String[] maquinas) {
        this.tempo = tempo;
        this.nome = nome;
        this.maquinas = maquinas;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(String[] maquinas) {
        this.maquinas = maquinas;
    }
    
    
}
