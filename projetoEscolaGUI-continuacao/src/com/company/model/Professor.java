package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private int cpf;
    private int rg;
    private String nome;
    private String endereco;
    private String email;
    private int telefone;
    private String turmas_emds = "não";
    private String turmas_emia = "não";
    private String turmas_eminfo = "não";
    private String turmas_emad = "não";

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTurmas_emds() {
        return turmas_emds;
    }

    public void setTurmas_emds(String turmas_emds) {
        this.turmas_emds = turmas_emds;
    }

    public String getTurmas_emia() {
        return turmas_emia;
    }

    public void setTurmas_emia(String turmas_emia) {
        this.turmas_emia = turmas_emia;
    }

    public String getTurmas_eminfo() {
        return turmas_eminfo;
    }

    public void setTurmas_eminfo(String turmas_eminfo) {
        this.turmas_eminfo = turmas_eminfo;
    }

    public String getTurmas_emad() {
        return turmas_emad;
    }

    public void setTurmas_emad(String turmas_emad) {
        this.turmas_emad = turmas_emad;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf=" + cpf +
                ", rg=" + rg +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ", turmas a lecionar:" +
                "  emds='" + turmas_emds + '\'' +
                ", emia='" + turmas_emia + '\'' +
                ", eminfo='" + turmas_eminfo + '\'' +
                ", emad='" + turmas_emad + '\'' +
                '}';
    }
}
