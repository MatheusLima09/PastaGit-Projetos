package com.company.model;

public class Disciplina {

    private int ID;
    private String nome;
    private String descricao;
    private String curso_emds = "não";;
    private String curso_emia = "não";
    private String curso_eminfo = "não";
    private String curso_emad = "não";

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

    public String getCurso_emds() {
        return curso_emds;
    }

    public void setCurso_emds(String curso_emds) {
        this.curso_emds = curso_emds;
    }

    public String getCurso_emia() {
        return curso_emia;
    }

    public void setCurso_emia(String curso_emia) {
        this.curso_emia = curso_emia;
    }

    public String getCurso_eminfo() {
        return curso_eminfo;
    }

    public void setCurso_eminfo(String curso_eminfo) {
        this.curso_eminfo = curso_eminfo;
    }

    public String getCurso_emad() {
        return curso_emad;
    }

    public void setCurso_emad(String curso_emad) {
        this.curso_emad = curso_emad;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                " cursos que terão essa matéria:" +
                " emds='" + curso_emds + '\'' +
                ", emia='" + curso_emia + '\'' +
                ", eminfo='" + curso_eminfo + '\'' +
                ", emad='" + curso_emad + '\'' +
                ", descricao: '" + descricao + '\'' +
                '}';
    }
}
