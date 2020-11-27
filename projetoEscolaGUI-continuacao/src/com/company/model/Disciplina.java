package com.company.model;

public class Disciplina {

    private int ID;
    private String nome;
    private String descricao;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", descricao: '" + descricao + '\'' +
                '}';
    }
}
